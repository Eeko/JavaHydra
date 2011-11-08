package org.glite.data.hydra.javacli.core;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;


/**
 * A class to handle the encryption operations.
 * @author ekorhone
 *
 */
public class HydraCrypt {
	/**
	 * Encrypts an array of bytes with a hydrakey
	 * 
	 * @param target the array of bytes to be encrypted
	 * @param key The key to be used
	 * @param transformation A transformation in JCE format
	 * @return The bytes in encrypted format
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 * @throws InvalidKeyException
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 */
	public static byte[] encrypt(byte[] target, HydraKey key, String transformation) 
			throws 	NoSuchAlgorithmException, 
					NoSuchPaddingException, 
					InvalidKeyException, 
					IllegalBlockSizeException, 
					BadPaddingException {
		Cipher cipher = Cipher.getInstance(transformation);
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] ciphertext = cipher.doFinal(target);
		
		// save IV to the encryption key
		byte[] iv = cipher.getIV();
		key.setInitializationVector(iv);
		
		return ciphertext;
	}
	
	/**
	 * 
	 * Decrypts an array of bytes with a hydrakey
	 * 
	 * @param target the array of bytes to be decrypted
	 * @param key The key to be used
	 * @param transformation A transformation in JCE format
	 * @return The decrypted bytes
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 * @throws InvalidKeyException
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 * @throws InvalidAlgorithmParameterException
	 */
	public static byte[] decrypt(byte[] target, HydraKey key, String transformation) 
			throws 	NoSuchAlgorithmException, 
					NoSuchPaddingException, 
					InvalidKeyException, 
					IllegalBlockSizeException, 
					BadPaddingException, InvalidAlgorithmParameterException {
		Cipher decipher = Cipher.getInstance(transformation);
		
		// Check that if key contains an IV, use it for initialization
		if (key.getInitializationVector() != null) {
			IvParameterSpec ivBytes = new IvParameterSpec(key.getInitializationVector());
			decipher.init(Cipher.DECRYPT_MODE, key, ivBytes);
		} else {
			decipher.init(Cipher.DECRYPT_MODE, key);
		}
		
		byte[] plaintext = decipher.doFinal(target);
		return plaintext;
	}

	// Encrypt & decrypt files
	
	/**
	 * Encrypts a file at given path with a HydraKey
	 * 
	 * @param target The file to be encrypted
	 * @param key The key to be used
	 * @param transformation The transformation used in JCE format
	 * @return An InputStream of encrypted file
	 * @throws FileNotFoundException
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 * @throws InvalidKeyException
	 */
	public static InputStream encryptFile(File target, HydraKey key, String transformation) 
			throws 	FileNotFoundException, 
					NoSuchAlgorithmException, 
					NoSuchPaddingException, 
					InvalidKeyException {
		// ByteArrayOutputStream returnvalue = new ByteArrayOutputStream();
		InputStream fileInput = new FileInputStream(target);
		
		
		
		Cipher cipher = Cipher.getInstance(transformation);
		cipher.init(Cipher.ENCRYPT_MODE, key);
		InputStream cipherInput = new CipherInputStream(fileInput, cipher);
		
		// save IV to the encryption key
		byte[] iv = cipher.getIV();
		key.setInitializationVector(iv);
		
		return cipherInput;
	}
	
	
	/**
	 * Decrypts a file at given path with HydraKey
	 * @param target The file to be decrypted
	 * @param key The key to be used
	 * @param transformation The transformation used in JCE format
	 * @return An InputStream of decrypted file
	 * @throws FileNotFoundException
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 * @throws InvalidKeyException
	 * @throws InvalidAlgorithmParameterException
	 */
	public static InputStream decryptFile(File target, HydraKey key, String transformation) 
			throws 	FileNotFoundException, 
					NoSuchAlgorithmException, 
					NoSuchPaddingException, 
					InvalidKeyException, 
					InvalidAlgorithmParameterException {
		// ByteArrayOutputStream returnvalue = new ByteArrayOutputStream();
		InputStream fileInput = new FileInputStream(target);
		Cipher decipher = Cipher.getInstance(transformation);
		
		// Check that if key contains an IV, use it for initialization
		if (key.getInitializationVector() != null) {
			IvParameterSpec ivBytes = new IvParameterSpec(key.getInitializationVector());
			decipher.init(Cipher.DECRYPT_MODE, key, ivBytes);
		} else {
			decipher.init(Cipher.DECRYPT_MODE, key);
		}
		InputStream cipherInput = new CipherInputStream(fileInput, decipher);
		
		return cipherInput;
	}
	

}
