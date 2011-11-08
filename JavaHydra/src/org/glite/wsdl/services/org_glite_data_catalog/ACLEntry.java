/**
 * ACLEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.glite.wsdl.services.org_glite_data_catalog;

public class ACLEntry  implements java.io.Serializable {
    private org.glite.wsdl.services.org_glite_data_catalog.Perm principalPerm;

    private java.lang.String principal;

    public ACLEntry() {
    }

    public ACLEntry(
           org.glite.wsdl.services.org_glite_data_catalog.Perm principalPerm,
           java.lang.String principal) {
           this.principalPerm = principalPerm;
           this.principal = principal;
    }


    /**
     * Gets the principalPerm value for this ACLEntry.
     * 
     * @return principalPerm
     */
    public org.glite.wsdl.services.org_glite_data_catalog.Perm getPrincipalPerm() {
        return principalPerm;
    }


    /**
     * Sets the principalPerm value for this ACLEntry.
     * 
     * @param principalPerm
     */
    public void setPrincipalPerm(org.glite.wsdl.services.org_glite_data_catalog.Perm principalPerm) {
        this.principalPerm = principalPerm;
    }


    /**
     * Gets the principal value for this ACLEntry.
     * 
     * @return principal
     */
    public java.lang.String getPrincipal() {
        return principal;
    }


    /**
     * Sets the principal value for this ACLEntry.
     * 
     * @param principal
     */
    public void setPrincipal(java.lang.String principal) {
        this.principal = principal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ACLEntry)) return false;
        ACLEntry other = (ACLEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.principalPerm==null && other.getPrincipalPerm()==null) || 
             (this.principalPerm!=null &&
              this.principalPerm.equals(other.getPrincipalPerm()))) &&
            ((this.principal==null && other.getPrincipal()==null) || 
             (this.principal!=null &&
              this.principal.equals(other.getPrincipal())));
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
        if (getPrincipalPerm() != null) {
            _hashCode += getPrincipalPerm().hashCode();
        }
        if (getPrincipal() != null) {
            _hashCode += getPrincipal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ACLEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "ACLEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("principalPerm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "principalPerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "Perm"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("principal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "principal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
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
