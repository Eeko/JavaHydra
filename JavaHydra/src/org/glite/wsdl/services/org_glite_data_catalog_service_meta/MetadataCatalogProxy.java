package org.glite.wsdl.services.org_glite_data_catalog_service_meta;

public class MetadataCatalogProxy implements org.glite.wsdl.services.org_glite_data_catalog_service_meta.MetadataCatalog {
  private String _endpoint = null;
  private org.glite.wsdl.services.org_glite_data_catalog_service_meta.MetadataCatalog metadataCatalog = null;
  
  public MetadataCatalogProxy() {
    _initMetadataCatalogProxy();
  }
  
  public MetadataCatalogProxy(String endpoint) {
    _endpoint = endpoint;
    _initMetadataCatalogProxy();
  }
  
  private void _initMetadataCatalogProxy() {
    try {
      metadataCatalog = (new org.glite.wsdl.services.org_glite_data_catalog_service_meta.MetadataCatalogServiceLocator()).getMetadataCatalog();
      if (metadataCatalog != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)metadataCatalog)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)metadataCatalog)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (metadataCatalog != null)
      ((javax.xml.rpc.Stub)metadataCatalog)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.glite.wsdl.services.org_glite_data_catalog_service_meta.MetadataCatalog getMetadataCatalog() {
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    return metadataCatalog;
  }
  
  public void createEntry(org.glite.wsdl.services.org_glite_data_catalog.StringPair[] entries) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.ExistsException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException, org.glite.wsdl.services.org_glite_data_catalog.InternalException{
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    metadataCatalog.createEntry(entries);
  }
  
  public void removeEntry(java.lang.String[] items) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InternalException{
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    metadataCatalog.removeEntry(items);
  }
  
  public org.glite.wsdl.services.org_glite_data_catalog.Attribute[] getAttributes(java.lang.String item, java.lang.String[] attributeNames) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InternalException{
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    return metadataCatalog.getAttributes(item, attributeNames);
  }
  
  public java.lang.String[] query(java.lang.String query, java.lang.String type, int limit, int offset) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException, org.glite.wsdl.services.org_glite_data_catalog.InternalException{
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    return metadataCatalog.query(query, type, limit, offset);
  }
  
  public void setAttributes(java.lang.String item, org.glite.wsdl.services.org_glite_data_catalog.Attribute[] attributes) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException, org.glite.wsdl.services.org_glite_data_catalog.InternalException{
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    metadataCatalog.setAttributes(item, attributes);
  }
  
  public void clearAttributes(java.lang.String item, java.lang.String[] attributeNames) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InternalException{
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    metadataCatalog.clearAttributes(item, attributeNames);
  }
  
  public org.glite.wsdl.services.org_glite_data_catalog.Attribute[] listAttributes(java.lang.String item) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InternalException{
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    return metadataCatalog.listAttributes(item);
  }
  
  public java.lang.String getVersion() throws java.rmi.RemoteException{
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    return metadataCatalog.getVersion();
  }
  
  public java.lang.String getSchemaVersion() throws java.rmi.RemoteException{
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    return metadataCatalog.getSchemaVersion();
  }
  
  public java.lang.String getInterfaceVersion() throws java.rmi.RemoteException{
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    return metadataCatalog.getInterfaceVersion();
  }
  
  public java.lang.String getServiceMetadata(java.lang.String key) throws java.rmi.RemoteException{
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    return metadataCatalog.getServiceMetadata(key);
  }
  
  public void createSchema(java.lang.String schemaName, org.glite.wsdl.services.org_glite_data_catalog.Attribute[] attributes) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.ExistsException, org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException, org.glite.wsdl.services.org_glite_data_catalog.InternalException{
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    metadataCatalog.createSchema(schemaName, attributes);
  }
  
  public void addSchemaAttributes(java.lang.String schemaName, org.glite.wsdl.services.org_glite_data_catalog.Attribute[] attributes) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.ExistsException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException, org.glite.wsdl.services.org_glite_data_catalog.InternalException{
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    metadataCatalog.addSchemaAttributes(schemaName, attributes);
  }
  
  public void removeSchemaAttributes(java.lang.String schemaName, java.lang.String[] attributeNames) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InternalException{
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    metadataCatalog.removeSchemaAttributes(schemaName, attributeNames);
  }
  
  public void dropSchema(java.lang.String schemaName) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InternalException{
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    metadataCatalog.dropSchema(schemaName);
  }
  
  public java.lang.String[] listSchemas() throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.InternalException{
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    return metadataCatalog.listSchemas();
  }
  
  public org.glite.wsdl.services.org_glite_data_catalog.Attribute[] describeSchema(java.lang.String schemaName) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InternalException{
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    return metadataCatalog.describeSchema(schemaName);
  }
  
  public void checkPermission(java.lang.String[] items, org.glite.wsdl.services.org_glite_data_catalog.Perm perm) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.InternalException{
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    metadataCatalog.checkPermission(items, perm);
  }
  
  public org.glite.wsdl.services.org_glite_data_catalog.PermissionEntry[] getPermission(java.lang.String[] items) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException, org.glite.wsdl.services.org_glite_data_catalog.InternalException{
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    return metadataCatalog.getPermission(items);
  }
  
  public void setPermission(org.glite.wsdl.services.org_glite_data_catalog.PermissionEntry[] permissions) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException, org.glite.wsdl.services.org_glite_data_catalog.InternalException{
    if (metadataCatalog == null)
      _initMetadataCatalogProxy();
    metadataCatalog.setPermission(permissions);
  }
  
  
}