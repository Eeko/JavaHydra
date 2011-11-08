/**
 * MetadataCatalogServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.glite.wsdl.services.org_glite_data_catalog_service_meta;

public class MetadataCatalogServiceLocator extends org.apache.axis.client.Service implements org.glite.wsdl.services.org_glite_data_catalog_service_meta.MetadataCatalogService {

    public MetadataCatalogServiceLocator() {
    }


    public MetadataCatalogServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MetadataCatalogServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MetadataCatalog
    // TODO: make this address dynamic
    private java.lang.String MetadataCatalog_address = null;

    public java.lang.String getMetadataCatalogAddress() {
        return MetadataCatalog_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MetadataCatalogWSDDServiceName = "MetadataCatalog";

    public java.lang.String getMetadataCatalogWSDDServiceName() {
        return MetadataCatalogWSDDServiceName;
    }

    public void setMetadataCatalogWSDDServiceName(java.lang.String name) {
        MetadataCatalogWSDDServiceName = name;
    }

    public org.glite.wsdl.services.org_glite_data_catalog_service_meta.MetadataCatalog getMetadataCatalog() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MetadataCatalog_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMetadataCatalog(endpoint);
    }

    public org.glite.wsdl.services.org_glite_data_catalog_service_meta.MetadataCatalog getMetadataCatalog(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.glite.wsdl.services.org_glite_data_catalog_service_meta.MetadataCatalogSoapBindingStub _stub = new org.glite.wsdl.services.org_glite_data_catalog_service_meta.MetadataCatalogSoapBindingStub(portAddress, this);
            _stub.setPortName(getMetadataCatalogWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMetadataCatalogEndpointAddress(java.lang.String address) {
        MetadataCatalog_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.glite.wsdl.services.org_glite_data_catalog_service_meta.MetadataCatalog.class.isAssignableFrom(serviceEndpointInterface)) {
                org.glite.wsdl.services.org_glite_data_catalog_service_meta.MetadataCatalogSoapBindingStub _stub = new org.glite.wsdl.services.org_glite_data_catalog_service_meta.MetadataCatalogSoapBindingStub(new java.net.URL(MetadataCatalog_address), this);
                _stub.setPortName(getMetadataCatalogWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MetadataCatalog".equals(inputPortName)) {
            return getMetadataCatalog();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "MetadataCatalogService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "MetadataCatalog"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MetadataCatalog".equals(portName)) {
            setMetadataCatalogEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
