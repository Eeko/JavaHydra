package org.glite.data.hydra.javacli.tests;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Map;

import org.glite.data.hydra.javacli.core.HydraCrypt;
import org.glite.data.hydra.javacli.core.HydraKey;
import org.junit.Test;


public class HydraCryptTest {
	/**
	 * Tests a simple random key generation, encrypting a secret message, 
	 * breaking the key with SSS, reconstructing the key and using
	 * the reconstructed key to open the encrypted message.
	 * @throws Exception
	 */
	@Test
	public void testEncryptDecrypt() throws Exception {
		
		// generates a key
		HydraKey hk1 = HydraKey.generateKey();
		//byte[] keybytes = hk1.getEncoded();
		byte[] plaintext = "This is a secret message".getBytes();
		
		byte[] ciphertext = HydraCrypt.encrypt(plaintext, hk1, "Blowfish");
		
		// splits the key
		
		Map<Integer, BigInteger> splitted_key = hk1.splitKey(3, 2);
		
		splitted_key.remove(2); // removes a key from the split
		assertEquals("we should now have two pieces of key to reconstruct the key", splitted_key.size(), 2);
		
		// reconstructs the key
		HydraKey hk2 = HydraKey.reconstructKey(splitted_key, 3, 2, null, "Blowfish");
		hk2 = hk2.padToLength(16);	// pad key to default length, 128 bits = 16 bytes
		//assertEquals("reconstructed key should match original generated key", keybytes, hk2.getEncoded());
		
		// decrypts the ciphertext
		byte[] reconstructed_plaintext = HydraCrypt.decrypt(ciphertext, hk2, "Blowfish");
		assertTrue("reconstruction should match byte-representation of plaintext", Arrays.equals(reconstructed_plaintext, plaintext));
		assertEquals("reconstructed text should match String-representation of plaintext", new String(reconstructed_plaintext), "This is a secret message");
		
	}
	/**
	 * Tests a file encryption and decryption
	 * @throws Exception
	 */
	@Test
	public void testFileEncrypt() throws Exception {
		HydraKey hk1 = HydraKey.generateKey();
		//System.out.println(System.getProperty("user.dir"));
		File openfile = new File("org.glite.data.hydra.javacli.tests/Secretmsg.txt");
		InputStream cipheredStream = HydraCrypt.encryptFile(openfile, hk1, "Blowfish");
		FileOutputStream output = new FileOutputStream("org.glite.data.hydra.javacli.tests/CryptedSecretMsg.txt");
		int cipherByte = -2;
		// writing byte at a time. bad.
		while (cipherByte != -1) {
			cipherByte = cipheredStream.read();
			if (cipherByte != -1)
				output.write(cipherByte);
		}
		output.close();
		
		// open the crypted message
		openfile = new File("org.glite.data.hydra.javacli.tests/CryptedSecretMsg.txt");
		InputStream decipheredStream = HydraCrypt.decryptFile(openfile, hk1, "Blowfish");
		output = new FileOutputStream("org.glite.data.hydra.javacli.tests/PlainSecretMsg.txt");
		
		cipherByte = -2;
		// writing byte at a time. bad.
		while (cipherByte != -1) {
			cipherByte = decipheredStream.read();
			if (cipherByte != -1)
				output.write(cipherByte);
		}
		output.close();
		
		
		// org.glite.data.hydra.javacli.tests part
		InputStream originalSecret = new FileInputStream("org.glite.data.hydra.javacli.tests/Secretmsg.txt");
		InputStream reconstructedSecret = new FileInputStream("org.glite.data.hydra.javacli.tests/PlainSecretMsg.txt");
		int originalchar = -2;
		int reconstructchar = -2;
		int errors = 0;
		while (originalchar != -1 || reconstructchar != -1) {
			originalchar = originalSecret.read();
			reconstructchar = reconstructedSecret.read();
			if (originalchar != reconstructchar)
				errors++;
		}
		assertEquals("Reconstruct should be identical to original", errors, 0);
		
		// delete the tempfiles
		openfile.delete();		// cryptedSecretMsg.txt
		openfile = new File("org.glite.data.hydra.javacli.tests/PlainSecretMsg.txt");
		openfile.delete();
		
	}

}
