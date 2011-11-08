package org.glite.data.hydra.javacli.tests;

import static org.junit.Assert.*;
import org.apache.commons.httpclient.protocol.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Properties;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.ServiceException;

import org.glite.data.hydra.javacli.core.HydraAuth;
import org.glite.data.hydra.javacli.core.HydraConnection;
import org.glite.data.hydra.javacli.core.HydraCrypt;
import org.glite.data.hydra.javacli.core.HydraKey;
import org.glite.data.hydra.javacli.core.HydraSettings;
import org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException;
import org.glite.wsdl.services.org_glite_data_catalog.InternalException;
import org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException;
import org.glite.wsdl.services.org_glite_data_catalog.NotExistsException;
import org.junit.Test;
import org.xml.sax.SAXException;


/**
 * Test class for HydraConnection interfaces
 * Note, this org.glite.data.hydra.javacli.tests is hugely dependant on the model hydra-services.xml file with predefined endpoints.
 * And the certificates on org.glite.data.hydra.javacli.tests machine should be in order or stored in resources -folder.
 * @author ekorhone
 *
 */



public class HydraConnectionTest {
	
	public HydraSettings testSettings() {
		

		HydraSettings hs = new HydraSettings();
		
		try {
			hs.readHydraSettingsXml(new File("resources/hydra-services.xml"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Reading settings.xml should not fail");
		}
		int connection_amount = hs.getEndpointsArray().size();
		assertEquals("There should be 3 endpoints", connection_amount, 3);
		
		return hs;
	}

	@Test
	public void testConnection() {
		testAuthentication();
		HydraSettings hs = testSettings();
		for (int i = 0; i < hs.getEndpointsArray().size(); i++) {
			testVersion(hs.getEndpointsArray().get(i));
		}
		
	}
	
	@Test
	public void testAuthentication() {
		try {
			HydraAuth.readAuthKeyStoreFromFile(new File("resources/old_cert_and_key.p12"), ("testkey").toCharArray());
			HydraAuth.readTrustStoreFromFile(new File("resources/truststore.ts"), ("teststore").toCharArray());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Reading certs should not fail");
		}
	}
	
	public void testVersion(HydraConnection hc) {
		String serverVersion = null;
		try {
			serverVersion = hc.getServerVersion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Should get version of server at endpoint");
		} 
		
		assertEquals("Server version should be 1.x.x something", serverVersion.startsWith("1."), true );
	}
	
	@Test
	public void testKeyStorage() throws NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, AuthorizationException, NotExistsException, InvalidArgumentException, InternalException, RemoteException, ServiceException, InvalidAlgorithmParameterException {
		testAuthentication();	// setup the certificates
		HydraSettings hs = testSettings();	// setup the endpoints
		HydraKey original_key = HydraKey.generateKey();	// setup the original encryption key
		String original_plaintext = "This string should be encrypted.";	// setup a text to be encrypted
		File dummy_filename = new File("resources/dummy.txt");	// the HydraConnection -key notation requires filename and username
		String dummy_username = "JHydraConnectionTest";	// define a dummy-username for storing key.
		
		// encrypt the text
		byte[] crypted_text = HydraCrypt.encrypt(original_plaintext.getBytes(), original_key, "Blowfish");
		
		// store the key
		HydraConnection.createEntries(hs.getEndpoints(), dummy_filename, dummy_username, null);
		HydraConnection.distributeKey(hs.getEndpoints(), 2, original_key, dummy_filename, dummy_username);
		
		// reconstruct the key
		HydraKey reconstructed_key = HydraConnection.gatherKey(hs.getEndpoints(), dummy_filename, dummy_username);
		
		// reconstruct ciphertext
		byte[] decrypted_text = HydraCrypt.decrypt(crypted_text, reconstructed_key, "Blowfish");
		assertTrue("Decrypted text should match original", original_plaintext.matches(new String(decrypted_text)));
		
		// remove key entry
		HydraConnection.removeEntries(hs.getEndpoints(), dummy_filename, dummy_username);
	}
}
