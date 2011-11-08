package org.glite.data.hydra.javacli.tests;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;

import javax.crypto.SecretKey;

import org.glite.data.hydra.javacli.core.HydraFileHandler;
import org.glite.data.hydra.javacli.core.HydraKey;
import org.junit.Test;


public class HydraFileHandlerTest {

	@Test
	public void test() 
			throws 	NoSuchAlgorithmException, 
					KeyStoreException, 
					CertificateException, 
					IOException, 
					UnrecoverableEntryException {
		HydraKey hk = HydraKey.generateKey();
		HydraFileHandler.saveSingleKeyToFile(hk, new File("org.glite.data.hydra.javacli.tests/keystore.ks"), "password".toCharArray(), null);
		
		// loads the key to a SecretKey
		
		SecretKey loadedKey = HydraFileHandler.loadSingleKeyFromFile(new File("org.glite.data.hydra.javacli.tests/keystore.ks"), "password".toCharArray(), null);
		
		assertEquals("reconstructed key should match old one", new String(loadedKey.getEncoded()), new String(hk.getEncoded()));
		
	}

}
