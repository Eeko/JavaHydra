package org.glite.data.hydra.javacli.core;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
/**
 * Class to keep track of the settings of given Hydra Setup and interact with HydraServers as single entity.
 * @author ekorhone
 *
 */
public class HydraSettings {
	
	private ArrayList<HydraConnection> endpoints;
	private String userid;
	/**
	 * The Constructor. Reads UserId from the Systems username property.
	 * Also stores the endpoints as an array 
	 */
	public HydraSettings() {
		this.endpoints = new ArrayList<HydraConnection>();
		this.userid = System.getProperty("user.name"); // uses unix user name as default
	}
	
	/**
	 * Add a individual HydraConnection to the settings-instance
	 * @param hc The established HydraConnection to be added
	 */
	public void addConnectionToSettings(HydraConnection hc) {
		this.endpoints.add(hc);
	}
	
	/**
	 * Lists the endpoints in an arrayList
	 * @return The HydraConnections of current settings instance
	 */
	public ArrayList<HydraConnection> getEndpointsArray() {
		return this.endpoints;
	}
	
	/**
	 * List Endpoints of settings-instance
	 * @return returns the endpoints in HydraConnection[] array
	 */
	
	public HydraConnection[] getEndpoints() {
		HydraConnection[] returnpoints = new HydraConnection[this.endpoints.size()];
		for (int i = 0; i < this.endpoints.size(); i++) {
			returnpoints[i] = this.endpoints.get(i);
		}
		return returnpoints;
	}
	/**
	 * Sets the current userid of settings-instance. Eg. username or derived hash from certificate
	 * @param userid
	 */
	public void setUserId(String userid) {
		this.userid = userid;
	}
	
	/**
	 * Returns the userid attached to this settings-instance
	 * @return
	 */
	public String getUserId() {
		return this.userid;
	}
	
	/**
	 * Simple, dumb parser to read a predefined settings.xml file.
	 * Does a bad job on distincting specifically hydra-services.
	 * 
	 * @param filename
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	public void readHydraSettingsXml(File filename) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		//Using factory get an instance of document builder
		DocumentBuilder db = dbf.newDocumentBuilder();
		//parse using builder to get DOM representation of the XML file
		Document dom = db.parse(filename);
		Element docEle = dom.getDocumentElement();
		// <service>
		NodeList nl = docEle.getElementsByTagName("service");
		
		// parse endpoints
		// UGLY. There has to be a better way to parse XML...
		if(nl != null && nl.getLength() > 0) {
			for(int i = 0 ; i < nl.getLength();i++) {
				Element el = (Element)nl.item(i);
				// <service name="name-of-server">
				String serviceName = el.getAttribute("name");
				NodeList params = el.getElementsByTagName("endpoint");
				
				String endpoint = null;
				// so far in this level...
				// <service name="hydra-server">
				//   <parameters>
				//     <endpoint>...
				if(params != null && params.getLength() > 0) {
					endpoint = params.item(0).getTextContent();
					//System.out.println(endpoint);
				}
				//System.out.println(serviceName);
				HydraConnection hc = new HydraConnection(endpoint, serviceName, null);
				this.endpoints.add(hc);
			}
		}
	}
}
