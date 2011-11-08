/**
 * Permission.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.glite.wsdl.services.org_glite_data_catalog;

public class Permission  extends org.glite.wsdl.services.org_glite_data_catalog.BasicPermission  implements java.io.Serializable {
    private org.glite.wsdl.services.org_glite_data_catalog.ACLEntry[] acl;

    public Permission() {
    }

    public Permission(
           java.lang.String userName,
           java.lang.String groupName,
           org.glite.wsdl.services.org_glite_data_catalog.Perm userPerm,
           org.glite.wsdl.services.org_glite_data_catalog.Perm groupPerm,
           org.glite.wsdl.services.org_glite_data_catalog.Perm otherPerm,
           org.glite.wsdl.services.org_glite_data_catalog.ACLEntry[] acl) {
        super(
            userName,
            groupName,
            userPerm,
            groupPerm,
            otherPerm);
        this.acl = acl;
    }


    /**
     * Gets the acl value for this Permission.
     * 
     * @return acl
     */
    public org.glite.wsdl.services.org_glite_data_catalog.ACLEntry[] getAcl() {
        return acl;
    }


    /**
     * Sets the acl value for this Permission.
     * 
     * @param acl
     */
    public void setAcl(org.glite.wsdl.services.org_glite_data_catalog.ACLEntry[] acl) {
        this.acl = acl;
    }

    public org.glite.wsdl.services.org_glite_data_catalog.ACLEntry getAcl(int i) {
        return this.acl[i];
    }

    public void setAcl(int i, org.glite.wsdl.services.org_glite_data_catalog.ACLEntry _value) {
        this.acl[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Permission)) return false;
        Permission other = (Permission) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.acl==null && other.getAcl()==null) || 
             (this.acl!=null &&
              java.util.Arrays.equals(this.acl, other.getAcl())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAcl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAcl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAcl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Permission.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "Permission"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "ACLEntry"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
