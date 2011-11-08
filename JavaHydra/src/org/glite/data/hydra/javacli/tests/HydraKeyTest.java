/**
 * 
 */
package org.glite.data.hydra.javacli.tests;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;


import org.glite.data.hydra.javacli.core.HydraKey;
import org.junit.Test;


/**
 * @author ekorhone
 *
 */
public class HydraKeyTest {

	/**
	 * Tests generating a key, chopping it to pieces, and restructuring it
	 * @throws NoSuchAlgorithmException 
	 */
	@Test
	public void simpleTest() throws NoSuchAlgorithmException {
		
		HydraKey hk = HydraKey.generateKey();
		//BigInteger original_cheksum = hk.getKeyBI();
		Map<Integer, BigInteger> splitted_key = hk.splitKey(6, 2);
		
		// create a new hydrakey with same parameters
		Map<Integer, BigInteger> splitted_key2 = new HashMap<Integer, BigInteger>();
		splitted_key2.put(1, splitted_key.get(1));
		splitted_key2.put(2, splitted_key.get(2));
		// reconstruct key
		HydraKey hk2 = HydraKey.reconstructKey(splitted_key2, null, 2, null, null);
		assertEquals("The reconstructed key should be the same as  the original", hk.getKeyBI(), hk2.getKeyBI());
		assertNotSame("The keys should not be the same object",hk,hk2);
	}
	/**
	 * Test method for {@link org.glite.data.hydra.javacli.core.HydraKey#HydraKey(byte[], java.lang.String, java.math.BigInteger)}.
	 */
	@Test
	public void testHydraKey() {
		byte[] keyArray = {21, -79, -108, -50, 12, -6, -123, 10, -53, 84, 42, -41, -22, 33, 11, -76};
		HydraKey hk = new HydraKey(keyArray, "Testalgo", null, null, null);
		BigInteger[] defaults = {null, BigInteger.valueOf(3), BigInteger.valueOf(2)};
		assertEquals("invoking with null-arguments, the prime should be set default",hk.getParameters()[0],defaults[0]);
		assertEquals("invoking with null-arguments, n should be set default",hk.getParameters()[1],defaults[1]);
		assertEquals("invoking with null-arguments, k should be set default",hk.getParameters()[2],defaults[2]);
		assertEquals("the stored key should match with the original", new BigInteger(keyArray), new BigInteger(hk.getEncoded()));
	}
	/**
	 * A series of randomized tests that should produce a valid output
	 * @throws NoSuchAlgorithmException 
	 *
	 * 
	 */
	@Test
	public void stressTest1() throws NoSuchAlgorithmException {
		int testamount = 100000;		// a hardcoded variable to tell how many tests we want to run
		
		Random random = new Random();
		int success = 0;
		int broken_keys = 0;
		for (int i=0; i<testamount; i++) {
			
			int random_n = 3 + random.nextInt(9);		// generates random n between [3 - 12]
			int random_k = 1 + random.nextInt(random_n - 2);	// generates random k between [1 - 11]
			assertTrue("random n should be bigger than k", random_k < random_n);
			int random_length = random.nextInt(4) + 1;  // used to generate keys of [1-5] * 64 bytes
			
			//generateKey(String algorithm, int length, BigInteger prime, int n, int k)
			HydraKey hk = HydraKey.generateKey("Blowfish", 64 * random_length, null, random_n, random_k);
			Map<Integer, BigInteger> splitted_key = hk.splitKey(random_n, random_k);
			Map<Integer, BigInteger> splitted_key2 = new HashMap<Integer, BigInteger>();
			BigInteger original_sum = hk.getKeyBI();
			
			// make a random subset of the splitted key
			Set<Integer> keyset = splitted_key.keySet();
			List<Integer> keylist = new ArrayList<Integer>(keyset);
			Collections.shuffle(keylist);

			for (int j = 0; j < random_k; j++) {
				splitted_key2.put(keylist.get(j),splitted_key.get(keylist.get(j)));
			}
			// reconstruct the key
			HydraKey hk2 = HydraKey.reconstructKey(splitted_key2, null, random_k, null, null);
			

			if (original_sum.equals(hk2.getKeyBI())) {
				// increment success count if we have a match
				success++;
			} else {
				// reconstruct key with padding if we have no match.
				HydraKey hk3 = null;
				try {
					hk3 = hk2.padToLength(64 * random_length);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (original_sum.equals(hk3.getKeyBI())) {
					success++;
				} else {
					broken_keys++;
				}
				
			}
		}
		assertEquals("We should have correctly restructured every " + testamount + "keys", success, testamount);
		assertEquals("We should have 0 incorrectly restructured keys", broken_keys, 0);
	}


}
