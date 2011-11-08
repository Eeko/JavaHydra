/**
 * Perm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.glite.wsdl.services.org_glite_data_catalog;

public class Perm  implements java.io.Serializable {
    private boolean permission;

    private boolean remove;

    private boolean read;

    private boolean write;

    private boolean list;

    private boolean execute;

    private boolean getMetadata;

    private boolean setMetadata;

    public Perm() {
    }

    public Perm(
           boolean permission,
           boolean remove,
           boolean read,
           boolean write,
           boolean list,
           boolean execute,
           boolean getMetadata,
           boolean setMetadata) {
           this.permission = permission;
           this.remove = remove;
           this.read = read;
           this.write = write;
           this.list = list;
           this.execute = execute;
           this.getMetadata = getMetadata;
           this.setMetadata = setMetadata;
    }


    /**
     * Gets the permission value for this Perm.
     * 
     * @return permission
     */
    public boolean isPermission() {
        return permission;
    }


    /**
     * Sets the permission value for this Perm.
     * 
     * @param permission
     */
    public void setPermission(boolean permission) {
        this.permission = permission;
    }


    /**
     * Gets the remove value for this Perm.
     * 
     * @return remove
     */
    public boolean isRemove() {
        return remove;
    }


    /**
     * Sets the remove value for this Perm.
     * 
     * @param remove
     */
    public void setRemove(boolean remove) {
        this.remove = remove;
    }


    /**
     * Gets the read value for this Perm.
     * 
     * @return read
     */
    public boolean isRead() {
        return read;
    }


    /**
     * Sets the read value for this Perm.
     * 
     * @param read
     */
    public void setRead(boolean read) {
        this.read = read;
    }


    /**
     * Gets the write value for this Perm.
     * 
     * @return write
     */
    public boolean isWrite() {
        return write;
    }


    /**
     * Sets the write value for this Perm.
     * 
     * @param write
     */
    public void setWrite(boolean write) {
        this.write = write;
    }


    /**
     * Gets the list value for this Perm.
     * 
     * @return list
     */
    public boolean isList() {
        return list;
    }


    /**
     * Sets the list value for this Perm.
     * 
     * @param list
     */
    public void setList(boolean list) {
        this.list = list;
    }


    /**
     * Gets the execute value for this Perm.
     * 
     * @return execute
     */
    public boolean isExecute() {
        return execute;
    }


    /**
     * Sets the execute value for this Perm.
     * 
     * @param execute
     */
    public void setExecute(boolean execute) {
        this.execute = execute;
    }


    /**
     * Gets the getMetadata value for this Perm.
     * 
     * @return getMetadata
     */
    public boolean isGetMetadata() {
        return getMetadata;
    }


    /**
     * Sets the getMetadata value for this Perm.
     * 
     * @param getMetadata
     */
    public void setGetMetadata(boolean getMetadata) {
        this.getMetadata = getMetadata;
    }


    /**
     * Gets the setMetadata value for this Perm.
     * 
     * @return setMetadata
     */
    public boolean isSetMetadata() {
        return setMetadata;
    }


    /**
     * Sets the setMetadata value for this Perm.
     * 
     * @param setMetadata
     */
    public void setSetMetadata(boolean setMetadata) {
        this.setMetadata = setMetadata;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Perm)) return false;
        Perm other = (Perm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.permission == other.isPermission() &&
            this.remove == other.isRemove() &&
            this.read == other.isRead() &&
            this.write == other.isWrite() &&
            this.list == other.isList() &&
            this.execute == other.isExecute() &&
            this.getMetadata == other.isGetMetadata() &&
            this.setMetadata == other.isSetMetadata();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isPermission() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRemove() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRead() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isWrite() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isList() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isExecute() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isGetMetadata() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSetMetadata() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Perm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "Perm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permission");
        elemField.setXmlName(new javax.xml.namespace.QName("", "permission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remove");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remove"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("read");
        elemField.setXmlName(new javax.xml.namespace.QName("", "read"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("write");
        elemField.setXmlName(new javax.xml.namespace.QName("", "write"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("execute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "execute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "getMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "setMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
