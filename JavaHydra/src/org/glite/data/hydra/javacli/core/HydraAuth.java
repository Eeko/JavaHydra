package org.glite.data.hydra.javacli.core;

import java.io.File;
import java.io.IOException;

import org.glite.data.hydra.javacli.core.HydraUtils;


/**
 * A class containing helper methods to do 2-way authentication to a SSL-server.
 * Mostly related to reading and importing certificate files.
 * 
 * @author ekorhone
 *
 */
public class HydraAuth {
	
	
	/**
	 * A function to read the Hydra-server certificate from a given certificate file.
	 * This is needed, if the server-certificate is not imported to JVMs default store of trusted certificates.
	 * 
	 * @param filename The filename of certificate (currently Java KeyStore -files and PKCS12 files are supported)
	 * @param password The char[] of password needed to open the certificate file
	 * @throws IOException If the certificate file is not supported
	 */
	public static void readTrustStoreFromFile(File filename, char[] password) throws IOException {
		if (checkFileType(filename) != "jks") {
			System.setProperty("javax.net.ssl.trustStoreType", checkFileType(filename));
		}
		System.setProperty("javax.net.ssl.trustStore", filename.toString());
		System.setProperty("javax.net.ssl.trustStorePassword", new String(password));
	}
	
	/**
	 * Function to read 2-way Authentication key from a keystore file if it is not included within the JVM default keystores
	 * 
	 * @param filename The filename of certificate (currently Java KeyStore -files and PKCS12 files are supported)
	 * @param password The char[] of password needed to open the certificate file
	 * @throws IOException If the certificate file is not supported
	 */
	public static void readAuthKeyStoreFromFile(File filename, char[] password) throws IOException {
		if (checkFileType(filename) != "jks") {
			System.setProperty("javax.net.ssl.keyStoreType", checkFileType(filename));
		}
		System.setProperty("javax.net.ssl.keyStore", filename.toString());
		System.setProperty("javax.net.ssl.keyStorePassword", new String(password));
	}
	
	
	/**
	 * Helper to support multiple key-store formats (.p12 given default by Mozilla certificate export)
	 * 
	 * @param filename the filename of file to be checked
	 * @return a string-parameter valid for "System.setProperty("javax.net.ssl.keyStoreType", *parameter*)"
	 * @throws IOException If given filetype is not supported
	 */
	private static String checkFileType(File filename) throws IOException {
		String filetype = HydraUtils.extension(filename.toString());
		// support JKS stores from .jks and .ts filetypes out of the box
		if (filetype.matches("jks") || filetype.matches("ts") ){
			return "jks";
		} else if (filetype.matches("p12")) {
			return "pkcs12";
		} else {
			throw new java.io.IOException("Use .jks, .ts or .p12 file-extensions");
		}
		
	}
	
	

}


