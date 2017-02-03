/**
 * RelatedItems_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package com.amazon.webservices.awsecommerceservice._2013_08_01;


/**
 *  RelatedItems_type0 bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class RelatedItems_type0 implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = RelatedItems_type0
       Namespace URI = http://webservices.amazon.com/AWSECommerceService/2013-08-01
       Namespace Prefix = ns1
     */

    /**
     * field for Relationship
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Relationship_type1 localRelationship;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRelationshipTracker = false;

    /**
     * field for RelationshipType
     */
    protected java.lang.String localRelationshipType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRelationshipTypeTracker = false;

    /**
     * field for RelatedItemCount
     */
    protected org.apache.axis2.databinding.types.NonNegativeInteger localRelatedItemCount;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRelatedItemCountTracker = false;

    /**
     * field for RelatedItemPageCount
     */
    protected org.apache.axis2.databinding.types.NonNegativeInteger localRelatedItemPageCount;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRelatedItemPageCountTracker = false;

    /**
     * field for RelatedItemPage
     */
    protected org.apache.axis2.databinding.types.NonNegativeInteger localRelatedItemPage;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRelatedItemPageTracker = false;

    /**
     * field for RelatedItem
     * This was an Array!
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItem_type0[] localRelatedItem;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRelatedItemTracker = false;

    public boolean isRelationshipSpecified() {
        return localRelationshipTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Relationship_type1
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Relationship_type1 getRelationship() {
        return localRelationship;
    }

    /**
     * Auto generated setter method
     * @param param Relationship
     */
    public void setRelationship(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Relationship_type1 param) {
        localRelationshipTracker = param != null;

        this.localRelationship = param;
    }

    public boolean isRelationshipTypeSpecified() {
        return localRelationshipTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRelationshipType() {
        return localRelationshipType;
    }

    /**
     * Auto generated setter method
     * @param param RelationshipType
     */
    public void setRelationshipType(java.lang.String param) {
        localRelationshipTypeTracker = param != null;

        this.localRelationshipType = param;
    }

    public boolean isRelatedItemCountSpecified() {
        return localRelatedItemCountTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.NonNegativeInteger
     */
    public org.apache.axis2.databinding.types.NonNegativeInteger getRelatedItemCount() {
        return localRelatedItemCount;
    }

    /**
     * Auto generated setter method
     * @param param RelatedItemCount
     */
    public void setRelatedItemCount(
        org.apache.axis2.databinding.types.NonNegativeInteger param) {
        localRelatedItemCountTracker = param != null;

        this.localRelatedItemCount = param;
    }

    public boolean isRelatedItemPageCountSpecified() {
        return localRelatedItemPageCountTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.NonNegativeInteger
     */
    public org.apache.axis2.databinding.types.NonNegativeInteger getRelatedItemPageCount() {
        return localRelatedItemPageCount;
    }

    /**
     * Auto generated setter method
     * @param param RelatedItemPageCount
     */
    public void setRelatedItemPageCount(
        org.apache.axis2.databinding.types.NonNegativeInteger param) {
        localRelatedItemPageCountTracker = param != null;

        this.localRelatedItemPageCount = param;
    }

    public boolean isRelatedItemPageSpecified() {
        return localRelatedItemPageTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.NonNegativeInteger
     */
    public org.apache.axis2.databinding.types.NonNegativeInteger getRelatedItemPage() {
        return localRelatedItemPage;
    }

    /**
     * Auto generated setter method
     * @param param RelatedItemPage
     */
    public void setRelatedItemPage(
        org.apache.axis2.databinding.types.NonNegativeInteger param) {
        localRelatedItemPageTracker = param != null;

        this.localRelatedItemPage = param;
    }

    public boolean isRelatedItemSpecified() {
        return localRelatedItemTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItem_type0[]
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItem_type0[] getRelatedItem() {
        return localRelatedItem;
    }

    /**
     * validate the array for RelatedItem
     */
    protected void validateRelatedItem(
        com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItem_type0[] param) {
    }

    /**
     * Auto generated setter method
     * @param param RelatedItem
     */
    public void setRelatedItem(
        com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItem_type0[] param) {
        validateRelatedItem(param);

        localRelatedItemTracker = param != null;

        this.localRelatedItem = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItem_type0
     */
    public void addRelatedItem(
        com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItem_type0 param) {
        if (localRelatedItem == null) {
            localRelatedItem = new com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItem_type0[] {
                    
                };
        }

        //update the setting tracker
        localRelatedItemTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localRelatedItem);
        list.add(param);
        this.localRelatedItem = (com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItem_type0[]) list.toArray(new com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItem_type0[list.size()]);
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
                    namespacePrefix + ":RelatedItems_type0", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "RelatedItems_type0", xmlWriter);
            }
        }

        if (localRelationshipTracker) {
            if (localRelationship == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Relationship cannot be null!!");
            }

            localRelationship.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "Relationship"), xmlWriter);
        }

        if (localRelationshipTypeTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "RelationshipType", xmlWriter);

            if (localRelationshipType == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "RelationshipType cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localRelationshipType);
            }

            xmlWriter.writeEndElement();
        }

        if (localRelatedItemCountTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "RelatedItemCount", xmlWriter);

            if (localRelatedItemCount == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "RelatedItemCount cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localRelatedItemCount));
            }

            xmlWriter.writeEndElement();
        }

        if (localRelatedItemPageCountTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "RelatedItemPageCount", xmlWriter);

            if (localRelatedItemPageCount == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "RelatedItemPageCount cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localRelatedItemPageCount));
            }

            xmlWriter.writeEndElement();
        }

        if (localRelatedItemPageTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "RelatedItemPage", xmlWriter);

            if (localRelatedItemPage == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "RelatedItemPage cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localRelatedItemPage));
            }

            xmlWriter.writeEndElement();
        }

        if (localRelatedItemTracker) {
            if (localRelatedItem != null) {
                for (int i = 0; i < localRelatedItem.length; i++) {
                    if (localRelatedItem[i] != null) {
                        localRelatedItem[i].serialize(new javax.xml.namespace.QName(
                                "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                "RelatedItem"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "RelatedItem cannot be null!!");
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
        public static RelatedItems_type0 parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            RelatedItems_type0 object = new RelatedItems_type0();

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

                        if (!"RelatedItems_type0".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (RelatedItems_type0) com.amazon.webservices.awsecommerceservice._2013_08_01.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list6 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "Relationship").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Relationship").equals(
                            reader.getName())) {
                    object.setRelationship(com.amazon.webservices.awsecommerceservice._2013_08_01.Relationship_type1.Factory.parse(
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
                            "RelationshipType").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "RelationshipType").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "RelationshipType" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRelationshipType(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "RelatedItemCount").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "RelatedItemCount").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "RelatedItemCount" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRelatedItemCount(org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
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
                            "RelatedItemPageCount").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "RelatedItemPageCount").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "RelatedItemPageCount" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRelatedItemPageCount(org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
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
                            "RelatedItemPage").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "RelatedItemPage").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "RelatedItemPage" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRelatedItemPage(org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
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
                            "RelatedItem").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "RelatedItem").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    list6.add(com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItem_type0.Factory.parse(
                            reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone6 = false;

                    while (!loopDone6) {
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
                            loopDone6 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                        "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                        "RelatedItem").equals(reader.getName())) {
                                list6.add(com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItem_type0.Factory.parse(
                                        reader));
                            } else {
                                loopDone6 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setRelatedItem((com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItem_type0[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItem_type0.class,
                            list6));
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
