/**
 * MetadataCatalogSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.glite.wsdl.services.org_glite_data_catalog_service_meta;

public class MetadataCatalogSoapBindingStub extends org.apache.axis.client.Stub implements org.glite.wsdl.services.org_glite_data_catalog_service_meta.MetadataCatalog {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[20];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createEntry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "entries"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_tns1_StringPair"), org.glite.wsdl.services.org_glite_data_catalog.StringPair[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.ExistsException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "ExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.NotExistsException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "NotExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InvalidArgumentException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InternalException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InternalException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeEntry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_soapenc_string"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.NotExistsException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "NotExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InternalException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InternalException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attributeNames"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_soapenc_string"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_tns1_Attribute"));
        oper.setReturnClass(org.glite.wsdl.services.org_glite_data_catalog.Attribute[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getAttributesReturn"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.NotExistsException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "NotExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InternalException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InternalException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("query");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_soapenc_string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "queryReturn"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InvalidArgumentException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InternalException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InternalException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_tns1_Attribute"), org.glite.wsdl.services.org_glite_data_catalog.Attribute[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.NotExistsException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "NotExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InvalidArgumentException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InternalException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InternalException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("clearAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attributeNames"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_soapenc_string"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.NotExistsException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "NotExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InternalException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InternalException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_tns1_Attribute"));
        oper.setReturnClass(org.glite.wsdl.services.org_glite_data_catalog.Attribute[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listAttributesReturn"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.NotExistsException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "NotExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InternalException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InternalException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVersion");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getVersionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSchemaVersion");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getSchemaVersionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInterfaceVersion");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getInterfaceVersionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceMetadata");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getServiceMetadataReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createSchema");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "schemaName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_tns1_Attribute"), org.glite.wsdl.services.org_glite_data_catalog.Attribute[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.ExistsException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "ExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InvalidArgumentException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InternalException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InternalException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addSchemaAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "schemaName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_tns1_Attribute"), org.glite.wsdl.services.org_glite_data_catalog.Attribute[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.ExistsException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "ExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.NotExistsException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "NotExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InvalidArgumentException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InternalException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InternalException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeSchemaAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "schemaName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attributeNames"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_soapenc_string"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.NotExistsException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "NotExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InternalException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InternalException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("dropSchema");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "schemaName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.NotExistsException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "NotExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InternalException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InternalException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listSchemas");
        oper.setReturnType(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_soapenc_string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listSchemasReturn"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InternalException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InternalException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSchema");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "schemaName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_tns1_Attribute"));
        oper.setReturnClass(org.glite.wsdl.services.org_glite_data_catalog.Attribute[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "describeSchemaReturn"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.NotExistsException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "NotExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InternalException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InternalException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkPermission");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_soapenc_string"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "perm"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "Perm"), org.glite.wsdl.services.org_glite_data_catalog.Perm.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InternalException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InternalException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPermission");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_soapenc_string"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_tns1_PermissionEntry"));
        oper.setReturnClass(org.glite.wsdl.services.org_glite_data_catalog.PermissionEntry[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getPermissionReturn"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.NotExistsException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "NotExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InvalidArgumentException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InternalException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InternalException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setPermission");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "permissions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_tns1_PermissionEntry"), org.glite.wsdl.services.org_glite_data_catalog.PermissionEntry[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.NotExistsException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "NotExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InvalidArgumentException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "fault"),
                      "org.glite.wsdl.services.org_glite_data_catalog.InternalException",
                      new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InternalException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    public MetadataCatalogSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public MetadataCatalogSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public MetadataCatalogSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_soapenc_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_tns1_Attribute");
            cachedSerQNames.add(qName);
            cls = org.glite.wsdl.services.org_glite_data_catalog.Attribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "Attribute");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_tns1_PermissionEntry");
            cachedSerQNames.add(qName);
            cls = org.glite.wsdl.services.org_glite_data_catalog.PermissionEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "PermissionEntry");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "ArrayOf_tns1_StringPair");
            cachedSerQNames.add(qName);
            cls = org.glite.wsdl.services.org_glite_data_catalog.StringPair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "StringPair");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "ACLEntry");
            cachedSerQNames.add(qName);
            cls = org.glite.wsdl.services.org_glite_data_catalog.ACLEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "Attribute");
            cachedSerQNames.add(qName);
            cls = org.glite.wsdl.services.org_glite_data_catalog.Attribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "AuthorizationException");
            cachedSerQNames.add(qName);
            cls = org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "BasicPermission");
            cachedSerQNames.add(qName);
            cls = org.glite.wsdl.services.org_glite_data_catalog.BasicPermission.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "CatalogException");
            cachedSerQNames.add(qName);
            cls = org.glite.wsdl.services.org_glite_data_catalog.CatalogException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "ExistsException");
            cachedSerQNames.add(qName);
            cls = org.glite.wsdl.services.org_glite_data_catalog.ExistsException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InternalException");
            cachedSerQNames.add(qName);
            cls = org.glite.wsdl.services.org_glite_data_catalog.InternalException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "InvalidArgumentException");
            cachedSerQNames.add(qName);
            cls = org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "NotExistsException");
            cachedSerQNames.add(qName);
            cls = org.glite.wsdl.services.org_glite_data_catalog.NotExistsException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "Perm");
            cachedSerQNames.add(qName);
            cls = org.glite.wsdl.services.org_glite_data_catalog.Perm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "Permission");
            cachedSerQNames.add(qName);
            cls = org.glite.wsdl.services.org_glite_data_catalog.Permission.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "PermissionEntry");
            cachedSerQNames.add(qName);
            cls = org.glite.wsdl.services.org_glite_data_catalog.PermissionEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "StringPair");
            cachedSerQNames.add(qName);
            cls = org.glite.wsdl.services.org_glite_data_catalog.StringPair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void createEntry(org.glite.wsdl.services.org_glite_data_catalog.StringPair[] entries) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.ExistsException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException, org.glite.wsdl.services.org_glite_data_catalog.InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "createEntry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {entries});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.ExistsException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.ExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InternalException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void removeEntry(java.lang.String[] items) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "removeEntry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {items});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InternalException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.glite.wsdl.services.org_glite_data_catalog.Attribute[] getAttributes(java.lang.String item, java.lang.String[] attributeNames) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "getAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {item, attributeNames});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.glite.wsdl.services.org_glite_data_catalog.Attribute[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.glite.wsdl.services.org_glite_data_catalog.Attribute[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.glite.wsdl.services.org_glite_data_catalog.Attribute[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InternalException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] query(java.lang.String query, java.lang.String type, int limit, int offset) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException, org.glite.wsdl.services.org_glite_data_catalog.InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "query"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, type, new java.lang.Integer(limit), new java.lang.Integer(offset)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InternalException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setAttributes(java.lang.String item, org.glite.wsdl.services.org_glite_data_catalog.Attribute[] attributes) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException, org.glite.wsdl.services.org_glite_data_catalog.InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "setAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {item, attributes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InternalException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void clearAttributes(java.lang.String item, java.lang.String[] attributeNames) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "clearAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {item, attributeNames});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InternalException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.glite.wsdl.services.org_glite_data_catalog.Attribute[] listAttributes(java.lang.String item) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "listAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.glite.wsdl.services.org_glite_data_catalog.Attribute[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.glite.wsdl.services.org_glite_data_catalog.Attribute[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.glite.wsdl.services.org_glite_data_catalog.Attribute[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InternalException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getVersion() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "getVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String getSchemaVersion() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "getSchemaVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String getInterfaceVersion() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "getInterfaceVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String getServiceMetadata(java.lang.String key) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "getServiceMetadata"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {key});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void createSchema(java.lang.String schemaName, org.glite.wsdl.services.org_glite_data_catalog.Attribute[] attributes) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.ExistsException, org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException, org.glite.wsdl.services.org_glite_data_catalog.InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "createSchema"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {schemaName, attributes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.ExistsException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.ExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InternalException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addSchemaAttributes(java.lang.String schemaName, org.glite.wsdl.services.org_glite_data_catalog.Attribute[] attributes) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.ExistsException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException, org.glite.wsdl.services.org_glite_data_catalog.InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "addSchemaAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {schemaName, attributes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.ExistsException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.ExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InternalException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void removeSchemaAttributes(java.lang.String schemaName, java.lang.String[] attributeNames) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "removeSchemaAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {schemaName, attributeNames});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InternalException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void dropSchema(java.lang.String schemaName) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "dropSchema"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {schemaName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InternalException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] listSchemas() throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "listSchemas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InternalException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.glite.wsdl.services.org_glite_data_catalog.Attribute[] describeSchema(java.lang.String schemaName) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "describeSchema"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {schemaName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.glite.wsdl.services.org_glite_data_catalog.Attribute[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.glite.wsdl.services.org_glite_data_catalog.Attribute[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.glite.wsdl.services.org_glite_data_catalog.Attribute[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InternalException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void checkPermission(java.lang.String[] items, org.glite.wsdl.services.org_glite_data_catalog.Perm perm) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "checkPermission"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {items, perm});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InternalException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.glite.wsdl.services.org_glite_data_catalog.PermissionEntry[] getPermission(java.lang.String[] items) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException, org.glite.wsdl.services.org_glite_data_catalog.InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "getPermission"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {items});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.glite.wsdl.services.org_glite_data_catalog.PermissionEntry[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.glite.wsdl.services.org_glite_data_catalog.PermissionEntry[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.glite.wsdl.services.org_glite_data_catalog.PermissionEntry[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InternalException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setPermission(org.glite.wsdl.services.org_glite_data_catalog.PermissionEntry[] permissions) throws java.rmi.RemoteException, org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException, org.glite.wsdl.services.org_glite_data_catalog.NotExistsException, org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException, org.glite.wsdl.services.org_glite_data_catalog.InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog.service.meta", "setPermission"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {permissions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.NotExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InvalidArgumentException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.glite.wsdl.services.org_glite_data_catalog.InternalException) {
              throw (org.glite.wsdl.services.org_glite_data_catalog.InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
