/**
 * BasicPermission.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.glite.wsdl.services.org_glite_data_catalog;

public class BasicPermission  implements java.io.Serializable {
    private java.lang.String userName;

    private java.lang.String groupName;

    private org.glite.wsdl.services.org_glite_data_catalog.Perm userPerm;

    private org.glite.wsdl.services.org_glite_data_catalog.Perm groupPerm;

    private org.glite.wsdl.services.org_glite_data_catalog.Perm otherPerm;

    public BasicPermission() {
    }

    public BasicPermission(
           java.lang.String userName,
           java.lang.String groupName,
           org.glite.wsdl.services.org_glite_data_catalog.Perm userPerm,
           org.glite.wsdl.services.org_glite_data_catalog.Perm groupPerm,
           org.glite.wsdl.services.org_glite_data_catalog.Perm otherPerm) {
           this.userName = userName;
           this.groupName = groupName;
           this.userPerm = userPerm;
           this.groupPerm = groupPerm;
           this.otherPerm = otherPerm;
    }


    /**
     * Gets the userName value for this BasicPermission.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this BasicPermission.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the groupName value for this BasicPermission.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this BasicPermission.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the userPerm value for this BasicPermission.
     * 
     * @return userPerm
     */
    public org.glite.wsdl.services.org_glite_data_catalog.Perm getUserPerm() {
        return userPerm;
    }


    /**
     * Sets the userPerm value for this BasicPermission.
     * 
     * @param userPerm
     */
    public void setUserPerm(org.glite.wsdl.services.org_glite_data_catalog.Perm userPerm) {
        this.userPerm = userPerm;
    }


    /**
     * Gets the groupPerm value for this BasicPermission.
     * 
     * @return groupPerm
     */
    public org.glite.wsdl.services.org_glite_data_catalog.Perm getGroupPerm() {
        return groupPerm;
    }


    /**
     * Sets the groupPerm value for this BasicPermission.
     * 
     * @param groupPerm
     */
    public void setGroupPerm(org.glite.wsdl.services.org_glite_data_catalog.Perm groupPerm) {
        this.groupPerm = groupPerm;
    }


    /**
     * Gets the otherPerm value for this BasicPermission.
     * 
     * @return otherPerm
     */
    public org.glite.wsdl.services.org_glite_data_catalog.Perm getOtherPerm() {
        return otherPerm;
    }


    /**
     * Sets the otherPerm value for this BasicPermission.
     * 
     * @param otherPerm
     */
    public void setOtherPerm(org.glite.wsdl.services.org_glite_data_catalog.Perm otherPerm) {
        this.otherPerm = otherPerm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BasicPermission)) return false;
        BasicPermission other = (BasicPermission) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            ((this.userPerm==null && other.getUserPerm()==null) || 
             (this.userPerm!=null &&
              this.userPerm.equals(other.getUserPerm()))) &&
            ((this.groupPerm==null && other.getGroupPerm()==null) || 
             (this.groupPerm!=null &&
              this.groupPerm.equals(other.getGroupPerm()))) &&
            ((this.otherPerm==null && other.getOtherPerm()==null) || 
             (this.otherPerm!=null &&
              this.otherPerm.equals(other.getOtherPerm())));
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
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        if (getUserPerm() != null) {
            _hashCode += getUserPerm().hashCode();
        }
        if (getGroupPerm() != null) {
            _hashCode += getGroupPerm().hashCode();
        }
        if (getOtherPerm() != null) {
            _hashCode += getOtherPerm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BasicPermission.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "BasicPermission"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPerm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userPerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "Perm"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupPerm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupPerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "Perm"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherPerm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otherPerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://glite.org/wsdl/services/org.glite.data.catalog", "Perm"));
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
