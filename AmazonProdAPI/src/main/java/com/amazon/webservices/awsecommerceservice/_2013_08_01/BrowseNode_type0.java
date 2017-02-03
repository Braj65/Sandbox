/**
 * BrowseNode_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package com.amazon.webservices.awsecommerceservice._2013_08_01;


/**
 *  BrowseNode_type0 bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class BrowseNode_type0 implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = BrowseNode_type0
       Namespace URI = http://webservices.amazon.com/AWSECommerceService/2013-08-01
       Namespace Prefix = ns1
     */

    /**
     * field for BrowseNodeId
     */
    protected java.lang.String localBrowseNodeId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBrowseNodeIdTracker = false;

    /**
     * field for Name
     */
    protected java.lang.String localName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNameTracker = false;

    /**
     * field for IsCategoryRoot
     */
    protected boolean localIsCategoryRoot;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIsCategoryRootTracker = false;

    /**
     * field for Properties
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Properties_type0 localProperties;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPropertiesTracker = false;

    /**
     * field for Children
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Children_type0 localChildren;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localChildrenTracker = false;

    /**
     * field for Ancestors
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Ancestors_type0 localAncestors;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAncestorsTracker = false;

    /**
     * field for TopSellers
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.TopSellers_type0 localTopSellers;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTopSellersTracker = false;

    /**
     * field for NewReleases
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.NewReleases_type0 localNewReleases;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNewReleasesTracker = false;

    /**
     * field for TopItemSet
     * This was an Array!
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.TopItemSet_type0[] localTopItemSet;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTopItemSetTracker = false;

    public boolean isBrowseNodeIdSpecified() {
        return localBrowseNodeIdTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getBrowseNodeId() {
        return localBrowseNodeId;
    }

    /**
     * Auto generated setter method
     * @param param BrowseNodeId
     */
    public void setBrowseNodeId(java.lang.String param) {
        localBrowseNodeIdTracker = param != null;

        this.localBrowseNodeId = param;
    }

    public boolean isNameSpecified() {
        return localNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getName() {
        return localName;
    }

    /**
     * Auto generated setter method
     * @param param Name
     */
    public void setName(java.lang.String param) {
        localNameTracker = param != null;

        this.localName = param;
    }

    public boolean isIsCategoryRootSpecified() {
        return localIsCategoryRootTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getIsCategoryRoot() {
        return localIsCategoryRoot;
    }

    /**
     * Auto generated setter method
     * @param param IsCategoryRoot
     */
    public void setIsCategoryRoot(boolean param) {
        // setting primitive attribute tracker to true
        localIsCategoryRootTracker = true;

        this.localIsCategoryRoot = param;
    }

    public boolean isPropertiesSpecified() {
        return localPropertiesTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Properties_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Properties_type0 getProperties() {
        return localProperties;
    }

    /**
     * Auto generated setter method
     * @param param Properties
     */
    public void setProperties(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Properties_type0 param) {
        localPropertiesTracker = param != null;

        this.localProperties = param;
    }

    public boolean isChildrenSpecified() {
        return localChildrenTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Children_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Children_type0 getChildren() {
        return localChildren;
    }

    /**
     * Auto generated setter method
     * @param param Children
     */
    public void setChildren(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Children_type0 param) {
        localChildrenTracker = param != null;

        this.localChildren = param;
    }

    public boolean isAncestorsSpecified() {
        return localAncestorsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Ancestors_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Ancestors_type0 getAncestors() {
        return localAncestors;
    }

    /**
     * Auto generated setter method
     * @param param Ancestors
     */
    public void setAncestors(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Ancestors_type0 param) {
        localAncestorsTracker = param != null;

        this.localAncestors = param;
    }

    public boolean isTopSellersSpecified() {
        return localTopSellersTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.TopSellers_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.TopSellers_type0 getTopSellers() {
        return localTopSellers;
    }

    /**
     * Auto generated setter method
     * @param param TopSellers
     */
    public void setTopSellers(
        com.amazon.webservices.awsecommerceservice._2013_08_01.TopSellers_type0 param) {
        localTopSellersTracker = param != null;

        this.localTopSellers = param;
    }

    public boolean isNewReleasesSpecified() {
        return localNewReleasesTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.NewReleases_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.NewReleases_type0 getNewReleases() {
        return localNewReleases;
    }

    /**
     * Auto generated setter method
     * @param param NewReleases
     */
    public void setNewReleases(
        com.amazon.webservices.awsecommerceservice._2013_08_01.NewReleases_type0 param) {
        localNewReleasesTracker = param != null;

        this.localNewReleases = param;
    }

    public boolean isTopItemSetSpecified() {
        return localTopItemSetTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.TopItemSet_type0[]
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.TopItemSet_type0[] getTopItemSet() {
        return localTopItemSet;
    }

    /**
     * validate the array for TopItemSet
     */
    protected void validateTopItemSet(
        com.amazon.webservices.awsecommerceservice._2013_08_01.TopItemSet_type0[] param) {
    }

    /**
     * Auto generated setter method
     * @param param TopItemSet
     */
    public void setTopItemSet(
        com.amazon.webservices.awsecommerceservice._2013_08_01.TopItemSet_type0[] param) {
        validateTopItemSet(param);

        localTopItemSetTracker = param != null;

        this.localTopItemSet = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param com.amazon.webservices.awsecommerceservice._2013_08_01.TopItemSet_type0
     */
    public void addTopItemSet(
        com.amazon.webservices.awsecommerceservice._2013_08_01.TopItemSet_type0 param) {
        if (localTopItemSet == null) {
            localTopItemSet = new com.amazon.webservices.awsecommerceservice._2013_08_01.TopItemSet_type0[] {
                    
                };
        }

        //update the setting tracker
        localTopItemSetTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localTopItemSet);
        list.add(param);
        this.localTopItemSet = (com.amazon.webservices.awsecommerceservice._2013_08_01.TopItemSet_type0[]) list.toArray(new com.amazon.webservices.awsecommerceservice._2013_08_01.TopItemSet_type0[list.size()]);
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName,
        final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, parentQName));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
            xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":BrowseNode_type0", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "BrowseNode_type0", xmlWriter);
            }
        }

        if (localBrowseNodeIdTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "BrowseNodeId", xmlWriter);

            if (localBrowseNodeId == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "BrowseNodeId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localBrowseNodeId);
            }

            xmlWriter.writeEndElement();
        }

        if (localNameTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Name", xmlWriter);

            if (localName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Name cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localName);
            }

            xmlWriter.writeEndElement();
        }

        if (localIsCategoryRootTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "IsCategoryRoot", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "IsCategoryRoot cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localIsCategoryRoot));
            }

            xmlWriter.writeEndElement();
        }

        if (localPropertiesTracker) {
            if (localProperties == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Properties cannot be null!!");
            }

            localProperties.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "Properties"), xmlWriter);
        }

        if (localChildrenTracker) {
            if (localChildren == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Children cannot be null!!");
            }

            localChildren.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "Children"), xmlWriter);
        }

        if (localAncestorsTracker) {
            if (localAncestors == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Ancestors cannot be null!!");
            }

            localAncestors.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "Ancestors"), xmlWriter);
        }

        if (localTopSellersTracker) {
            if (localTopSellers == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "TopSellers cannot be null!!");
            }

            localTopSellers.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "TopSellers"), xmlWriter);
        }

        if (localNewReleasesTracker) {
            if (localNewReleases == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "NewReleases cannot be null!!");
            }

            localNewReleases.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "NewReleases"), xmlWriter);
        }

        if (localTopItemSetTracker) {
            if (localTopItemSet != null) {
                for (int i = 0; i < localTopItemSet.length; i++) {
                    if (localTopItemSet[i] != null) {
                        localTopItemSet[i].serialize(new javax.xml.namespace.QName(
                                "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                "TopItemSet"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "TopItemSet cannot be null!!");
            }
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01")) {
            return "ns1";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
        java.lang.String namespace, java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
        java.lang.String namespace, java.lang.String attName,
        java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
        java.lang.String attName, java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
        java.lang.String attName, javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static BrowseNode_type0 parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            BrowseNode_type0 object = new BrowseNode_type0();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                    ":") + 1);

                        if (!"BrowseNode_type0".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (BrowseNode_type0) com.amazon.webservices.awsecommerceservice._2013_08_01.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list9 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "BrowseNodeId").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "BrowseNodeId").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "BrowseNodeId" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setBrowseNodeId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "Name").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Name").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Name" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "IsCategoryRoot").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "IsCategoryRoot").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "IsCategoryRoot" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setIsCategoryRoot(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "Properties").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Properties").equals(
                            reader.getName())) {
                    object.setProperties(com.amazon.webservices.awsecommerceservice._2013_08_01.Properties_type0.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "Children").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Children").equals(
                            reader.getName())) {
                    object.setChildren(com.amazon.webservices.awsecommerceservice._2013_08_01.Children_type0.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "Ancestors").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Ancestors").equals(
                            reader.getName())) {
                    object.setAncestors(com.amazon.webservices.awsecommerceservice._2013_08_01.Ancestors_type0.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "TopSellers").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "TopSellers").equals(
                            reader.getName())) {
                    object.setTopSellers(com.amazon.webservices.awsecommerceservice._2013_08_01.TopSellers_type0.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "NewReleases").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "NewReleases").equals(
                            reader.getName())) {
                    object.setNewReleases(com.amazon.webservices.awsecommerceservice._2013_08_01.NewReleases_type0.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "TopItemSet").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "TopItemSet").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    list9.add(com.amazon.webservices.awsecommerceservice._2013_08_01.TopItemSet_type0.Factory.parse(
                            reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone9 = false;

                    while (!loopDone9) {
                        // We should be at the end element, but make sure
                        while (!reader.isEndElement())
                            reader.next();

                        // Step out of this element
                        reader.next();

                        // Step to next element event.
                        while (!reader.isStartElement() &&
                                !reader.isEndElement())
                            reader.next();

                        if (reader.isEndElement()) {
                            //two continuous end elements means we are exiting the xml structure
                            loopDone9 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                        "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                        "TopItemSet").equals(reader.getName())) {
                                list9.add(com.amazon.webservices.awsecommerceservice._2013_08_01.TopItemSet_type0.Factory.parse(
                                        reader));
                            } else {
                                loopDone9 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setTopItemSet((com.amazon.webservices.awsecommerceservice._2013_08_01.TopItemSet_type0[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            com.amazon.webservices.awsecommerceservice._2013_08_01.TopItemSet_type0.class,
                            list9));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()) {
                    // 2 - A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
