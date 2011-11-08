package org.glite.data.hydra.javacli.core;
import java.io.File;
import java.rmi.RemoteException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;
import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;
import org.glite.wsdl.services.org_glite_data_catalog.*;
import org.glite.wsdl.services.org_glite_data_catalog_service_meta.*;


/**
 * A class to work as an interface between the Hydra-webservice SOAP-interface and our
 * Java-client.
 * 
 * @author ekorhone
 *
 */
public class HydraConnection {

	/*
	 * Default schema for eds-hydra
	 * DROP TABLE IF EXISTS eds;
	 * CREATE TABLE eds (
	 * 	entry_id      INT NOT NULL PRIMARY KEY REFERENCES t_entry(entry_id),
  	 * 	edscipher     VARCHAR(50),
  	 * 	edskey        VARCHAR(200),
  	 * 	edsiv         VARCHAR(200),
  	 * 	edskeyinfo    VARCHAR(200),
  	 * 	edskeysneeded INT NOT NULL,
  	 * 	edskeyindex   INT NOT NULL
	 * );
	 * 
	 */
	private String schema;
	private String servername;
	private MetadataCatalogServiceLocator mdcsl;
	
	/**
	 * Constructor for HydraConnection
	 * 
	 * @param address e.g. "https://vtb-generic-70.cern.ch:8443/3/glite-data-hydra-service/services/Hydra"
	 * @param servernumber a number you want to give for this connection
	 * @param schema optional schema. Defaults to "eds" if given null
	 */
	public HydraConnection(String address, String servername, String schema) {
		this.mdcsl = new MetadataCatalogServiceLocator();
		
		// revert defaults if parameters null
		// if schema = null, revert to hydra-eds default "eds"
		if(schema == null) {
			this.schema = "eds";
		} else {
			this.schema = schema;
		}
		this.servername =servername;
		this.mdcsl.setMetadataCatalogWSDDServiceName(servername);
		// set metadatacatalog endpoint address. 
		// e.g. "https://vtb-generic-70.cern.ch:8443/3/glite-data-hydra-service/services/Hydra";
		mdcsl.setMetadataCatalogEndpointAddress(address);

		
	}
	
	/**
	 * Creates a new entry with generated syntax to a single HydraConnection entry
	 * 
	 * @param filename
	 * @param userid
	 * @param schema - Can be null. Defaults to "eds" -default
	 * @throws RemoteException
	 * @throws ServiceException
	 * @throws NoSuchAlgorithmException
	 */
	private void createEntry(File filename, String userid, String schema) throws RemoteException, ServiceException, NoSuchAlgorithmException {
		
		// creates a file-entry in format "filename" + "userid" + sha_hash(filename_and_path + userid)"
		// hash used to distinct similar named files in different paths
		// eg. foo.txtekorhone45a6f1907d...
		String file_entry = getEntryName(filename, userid);
		StringPair[] entries = {new StringPair(file_entry, this.schema)};
		this.mdcsl.getMetadataCatalog().createEntry(entries);
	}
	
	/**
	 * Removes a given entry from a single HydraConnection
	 * 
	 * @param filename
	 * @param userid
	 * @param schema
	 * @throws NoSuchAlgorithmException
	 * @throws AuthorizationException
	 * @throws NotExistsException
	 * @throws InternalException
	 * @throws RemoteException
	 * @throws ServiceException
	 */
	private void removeEntry(File filename, String userid) throws NoSuchAlgorithmException, AuthorizationException, NotExistsException, InternalException, RemoteException, ServiceException {
		String[] file_entry = {getEntryName(filename, userid)};
		this.mdcsl.getMetadataCatalog().removeEntry(file_entry);
	}
	
	/**
	 * Currently not used.
	 * 
	 * @return Returns the number given for this individual HydraConnection instance.
	 */
	private String getServerNumber() {
		return this.servername;
	}
	
	/*
	 * 	edscipher     VARCHAR(50),
	 * 	edskey        VARCHAR(200),
	 * 	edsiv         VARCHAR(200),
	 * 	edskeyinfo    VARCHAR(200),
	 * 	edskeysneeded INT NOT NULL,
	 * 	edskeyindex   INT NOT NULL
	 */
	
	/**
	 * Adds a HydraKey to a responding entry within this instance of HydraConnection
	 * 
	 * @param entryName - The Entryname for which to link the ket
	 * @param edsKey - The Slice of key to be stored
	 * @param edsCipher - The Algorithm/cipher intended to use with the key
	 * @param edsKeyInfo - Meta-information of the Key. E.g. Which client was used to generate the data
	 * @param edsIv - Initialization vector of the individual encryption. If the algorithm requires a random IV. 
	 * 	NOTE: THE IV IS NOT SPLIT WITH SSSS. ALL INSTANCES CONTAIN THE UNENCRYPTED, SAME IV.
	 * @param edsKeyIndex - The index of given key
	 * @param edsKeysNeeded - How many keys are needed to reconstruct.
	 * @throws AuthorizationException
	 * @throws NotExistsException
	 * @throws InvalidArgumentException
	 * @throws InternalException
	 * @throws RemoteException
	 * @throws ServiceException
	 */
	private void addHydraKeyToEntry(
			String entryName,
			String edsKey,
			String edsCipher,
			String edsKeyInfo,
			String edsIv,
			Integer edsKeyIndex,
			Integer edsKeysNeeded
			) throws AuthorizationException, NotExistsException, InvalidArgumentException, InternalException, RemoteException, ServiceException {
		
		// add attributes 
		/*
		 * 	edscipher     VARCHAR(50),
		 * 	edskey        VARCHAR(200),
		 * 	edsiv         VARCHAR(200),
		 * 	edskeyinfo    VARCHAR(200),
		 * 	edskeysneeded INT NOT NULL,
		 * 	edskeyindex   INT NOT NULL
		 */
		if (edsIv == null) {
			edsIv = "null";
		}
	
		Attribute[] attributes = {
				new Attribute("edscipher", edsCipher, "String"),
				new Attribute("edskey", edsKey, "String"),
				new Attribute("edskeyinfo", edsKeyInfo, "String"),
				new Attribute("edskeysneeded", edsKeysNeeded.toString(), "int"),
				new Attribute("edskeyindex", edsKeyIndex.toString(), "int"),
				new Attribute("edsiv", edsIv, "String")
		};
	
		this.mdcsl.getMetadataCatalog().setAttributes(entryName, attributes);
	}
	
	/**
	 * Gets the attributes as an Attribute[] list from given entry
	 * 
	 * @param entryname
	 * @return
	 * @throws AuthorizationException
	 * @throws NotExistsException
	 * @throws InternalException
	 * @throws RemoteException
	 * @throws ServiceException
	 */
	private Attribute[] getKeyAttributes(String entryname) throws AuthorizationException, NotExistsException, InternalException, RemoteException, ServiceException {
		return this.mdcsl.getMetadataCatalog().listAttributes(entryname);
	}
	
	/**
	 * A method to return the server version of this connection. Used for org.glite.data.hydra.javacli.tests-purposes
	 * @return The version of the hydra-server at endpoint
	 * @throws RemoteException
	 * @throws ServiceException
	 */
	public String getServerVersion() throws RemoteException, ServiceException {
		return this.mdcsl.getMetadataCatalog().getVersion();
	}
	
	
	/*
	 * STATIC METHODS
	 */
	
	
	/**
	 * Forms an Entry-name in syntax.
	 * @param filename
	 * @param userid
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String getEntryName(File filename, String userid) throws NoSuchAlgorithmException {
		String file_entry = filename.getName() + "" + userid + "" + HydraUtils.bytesToString(getHash(filename, userid));
		return file_entry;
	}

	/**
	 * Splits and Distributes a key to a set of Hydra-servers.
	 * 
	 * @param connections - An array of established connections.
	 * @param reconstruction_threshold - How many Slices do we need to reconstruct a key
	 * @param key - The HydraKey to be stored
	 * @param filename - The filename of the file for which we link the encryption key
	 * @param userid - A string representing a unique Hydra-Server user. For example, can be derived from the authentication certificate or VOMS virtual organization
	 * @throws AuthorizationException
	 * @throws NotExistsException
	 * @throws InvalidArgumentException
	 * @throws InternalException
	 * @throws RemoteException
	 * @throws ServiceException
	 * @throws NoSuchAlgorithmException
	 */
	public static void distributeKey(
			HydraConnection[] connections, 
			Integer reconstruction_threshold, 
			HydraKey key,
			File filename,
			String userid) throws AuthorizationException, NotExistsException, InvalidArgumentException, InternalException, RemoteException, ServiceException, NoSuchAlgorithmException {
		
		int number_of_connections = connections.length;

		// split the key
		Map<Integer, BigInteger> keySlices = key.splitKey(number_of_connections, reconstruction_threshold);
		String entryname = getEntryName(filename, userid);
		String iv = null;
		if (key.getInitializationVector() != null) {
			// convert to BigInteger-lookalike string to avoid storing weird characters in xml-file
			iv = (new BigInteger(key.getInitializationVector())).toString();
		}
		for (int i = 0; i < number_of_connections; i++) {
			
			connections[i].addHydraKeyToEntry(
					entryname, 
					keySlices.get(i + 1).toString(), // +1 because indexing of keys begins from 1. For some silly reason.
					key.getAlgorithm(), 
					"JHydraCliKey", 
					iv, 
					i + 1, 						// for same reason, + 1
					reconstruction_threshold
				);
		}
	}
	
	/**
	 * Creates corresponding entries to the servers indicated by connections
	 * This needs to be run before distributing keys to the entry
	 * 
	 * @param connections
	 * @param entryname
	 * @param schema
	 * @throws ServiceException 
	 * @throws NoSuchAlgorithmException 
	 * @throws RemoteException 
	 */
	public static void createEntries(HydraConnection[] connections, File filename, String userid, String schema) throws RemoteException, NoSuchAlgorithmException, ServiceException {
		if (schema == null) {
			schema = "eds";
		}
		for (int i = 0; i < connections.length; i++) { 
			connections[i].createEntry(filename, userid, schema); // creates an entry for file
			// TODO How to make sure a file does not get encrypted twice? (and thus, overwriting the original encryption key)
		}
	}
	
	public static void removeEntries(HydraConnection[] connections, File filename, String userid) throws AuthorizationException, InternalException, NoSuchAlgorithmException, RemoteException, ServiceException {
		for (int i = 0; i < connections.length; i++) { 
			connections[i].removeEntry(filename, userid);
		}
	}
	
	public static void forceRemoveEntries(HydraConnection[] connections, File filename, String userid) {
		for (int i = 0; i < connections.length; i++) { 
			try {
				connections[i].removeEntry(filename, userid);
			} catch (AuthorizationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotExistsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InternalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	/**
	 * Builds a HydraKey from given connection-endpoints and the metadata regarding filename and user
	 * TODO: Tests to make sure that the key reconstructs or does not after service-failures of individual Hydras
	 * 
	 * 
	 * @param connections
	 * @param filename
	 * @param userid
	 * @return HydraKey reconstructed
	 * @throws NoSuchAlgorithmException
	 * @throws RemoteException 
	 * @throws ServiceException 
	 */
	public static HydraKey gatherKey(
			HydraConnection[] connections,
			File filename, 
			String userid) throws NoSuchAlgorithmException, ServiceException, RemoteException {
		
		
		// keep track on exception count 
		// Throw certain kind of exception if SpecializedExceptionsAmoun == TotalAmountOfExceptions
		int exceptions = 0;
		int notExistExceptions = 0;
		int authorizationExceptions = 0;
		int internalExceptions = 0;
		int remoteExceptions = 0;
		int serviceExceptions = 0;
		
		Integer required_keyslices = null;
		int slices_gathered = 0;
		
		Integer n = null, k = null;
		String algorithm = null;
		
		String entryname = getEntryName(filename, userid);
		String iv = null;
		Map<Integer, BigInteger> gatheredKeySlices = new HashMap<Integer, BigInteger>();
		HydraKey hk = null;
		
		for (int i = 0; i < connections.length; i++) {
			try {
				Attribute[] sliceAttributes = connections[i].getKeyAttributes(entryname);
				
				/*  edscipher     VARCHAR(50),
				 * 	edskey        VARCHAR(200),
				 * 	edsiv         VARCHAR(200),
				 * 	edskeyinfo    VARCHAR(200),
				 * 	edskeysneeded INT NOT NULL,
				 * 	edskeyindex   INT NOT NULL
				 */
				Map<String, String> tempMapping = new HashMap<String, String>(); // ugly...
				for (Attribute a: sliceAttributes) {
					tempMapping.put(a.getName(),a.getValue());
				}
				Integer key = Integer.parseInt(tempMapping.get("edskeyindex")); //key 
				BigInteger value = new BigInteger(tempMapping.get("edskey")); // value
				gatheredKeySlices.put(key, value);
						

				if (required_keyslices == null )
					required_keyslices = Integer.parseInt(tempMapping.get("edskeysneeded"));
				if (algorithm == null || k == null || n == null) {
					algorithm = tempMapping.get("edscipher");
					n = connections.length;
					k = Integer.parseInt(tempMapping.get("edskeysneeded"));
				}
				
				// Get IV from store
				if (iv == null) {
					String iv_string = tempMapping.get("edsiv");
					if (iv_string != null || iv_string != "null") {
						iv = iv_string;
					}
				}
				slices_gathered++;

			} catch (AxisFault af) {
				// if we have an axisfault, we parse it accordingly.
				//System.out.println("AXISFAULT DETECTED");
				
				String faultname = af.getFaultDetails()[0].getLocalName();
				if(faultname.matches("NotExistsException")) {
					notExistExceptions++;
				} else if (faultname.matches("RemoteException")) {
					remoteExceptions++;
				} else if (faultname.matches("InternalException")) {
					internalExceptions++;
				} else if (faultname.matches("ServiceException")) {
					serviceExceptions++;
				} else if (faultname.matches("AuthorizationException")) {
					authorizationExceptions++;

				}
				exceptions++;
				//System.out.println(af.getFaultDetails()[0]);
			} catch (RemoteException e) {
				remoteExceptions++;
				exceptions++;
			
				e.printStackTrace();
			} catch (ServiceException e) {
				serviceExceptions++;
				exceptions++;
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// Check that if all exceptions are of same type, throw that exception.
		if (internalExceptions == exceptions && exceptions != 0) {
			throw new InternalException("All endpoints returned InternalException");
		} else if (notExistExceptions == exceptions && exceptions != 0) {
			throw new NotExistsException("All endpoints returned NotExistsException");
		} else if (authorizationExceptions == exceptions && exceptions != 0) {
			throw new AuthorizationException("All endpoints returned AuthorizationException");
		} else if (serviceExceptions == exceptions && exceptions != 0) {
			throw new ServiceException("All endpoints returned ServiceException");
		} else if (remoteExceptions == exceptions && exceptions != 0) {
			throw new RemoteException("All endpoints returned RemoteException");
		}
		
		
		// check that you have enough data for reconstruction
		if (required_keyslices != null && slices_gathered - exceptions >= required_keyslices) {
			hk = HydraKey.reconstructKey(gatheredKeySlices, n, k, null, algorithm);
			if (iv != null) {
				// Parse byte-array from BigInteger-represented String
				BigInteger ivBI = new BigInteger(iv);
				byte[] ivInBytes= ivBI.toByteArray();
				hk.setInitializationVector(ivInBytes);
			}
		} else {
			System.out.println("Too few slices available");
			// TODO Write your own exceptions
			//throw Exception("Too few")
			throw new InternalException("gatherKey Error. Check your connection settings.");
		}
		return hk;
	}
	
	/**
	 * A Helper method to get a hash from combination of filename and userid.
	 * Used to separate several similarly named files from a single author.
	 * 
	 * @param filename
	 * @param userid
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	private static byte[] getHash(File filename, String userid) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA");
		byte[] hash = md.digest((filename.toString() + userid).getBytes());
		return hash;
	}

	
}
