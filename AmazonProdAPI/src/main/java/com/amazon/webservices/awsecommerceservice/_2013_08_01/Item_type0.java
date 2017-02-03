/**
 * Item_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package com.amazon.webservices.awsecommerceservice._2013_08_01;


/**
 *  Item_type0 bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Item_type0 implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Item_type0
       Namespace URI = http://webservices.amazon.com/AWSECommerceService/2013-08-01
       Namespace Prefix = ns1
     */

    /**
     * field for ASIN
     */
    protected java.lang.String localASIN;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localASINTracker = false;

    /**
     * field for OfferListingId
     */
    protected java.lang.String localOfferListingId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOfferListingIdTracker = false;

    /**
     * field for Quantity
     */
    protected org.apache.axis2.databinding.types.PositiveInteger localQuantity;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localQuantityTracker = false;

    /**
     * field for AssociateTag
     */
    protected java.lang.String localAssociateTag;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAssociateTagTracker = false;

    /**
     * field for ListItemId
     */
    protected java.lang.String localListItemId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localListItemIdTracker = false;

    public boolean isASINSpecified() {
        return localASINTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getASIN() {
        return localASIN;
    }

    /**
     * Auto generated setter method
     * @param param ASIN
     */
    public void setASIN(java.lang.String param) {
        localASINTracker = param != null;

        this.localASIN = param;
    }

    public boolean isOfferListingIdSpecified() {
        return localOfferListingIdTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getOfferListingId() {
        return localOfferListingId;
    }

    /**
     * Auto generated setter method
     * @param param OfferListingId
     */
    public void setOfferListingId(java.lang.String param) {
        localOfferListingIdTracker = param != null;

        this.localOfferListingId = param;
    }

    public boolean isQuantitySpecified() {
        return localQuantityTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.PositiveInteger
     */
    public org.apache.axis2.databinding.types.PositiveInteger getQuantity() {
        return localQuantity;
    }

    /**
     * Auto generated setter method
     * @param param Quantity
     */
    public void setQuantity(
        org.apache.axis2.databinding.types.PositiveInteger param) {
        localQuantityTracker = param != null;

        this.localQuantity = param;
    }

    public boolean isAssociateTagSpecified() {
        return localAssociateTagTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAssociateTag() {
        return localAssociateTag;
    }

    /**
     * Auto generated setter method
     * @param param AssociateTag
     */
    public void setAssociateTag(java.lang.String param) {
        localAssociateTagTracker = param != null;

        this.localAssociateTag = param;
    }

    public boolean isListItemIdSpecified() {
        return localListItemIdTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getListItemId() {
        return localListItemId;
    }

    /**
     * Auto generated setter method
     * @param param ListItemId
     */
    public void setListItemId(java.lang.String param) {
        localListItemIdTracker = param != null;

        this.localListItemId = param;
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
                    namespacePrefix + ":Item_type0", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Item_type0", xmlWriter);
            }
        }

        if (localASINTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "ASIN", xmlWriter);

            if (localASIN == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ASIN cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localASIN);
            }

            xmlWriter.writeEndElement();
        }

        if (localOfferListingIdTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "OfferListingId", xmlWriter);

            if (localOfferListingId == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "OfferListingId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localOfferListingId);
            }

            xmlWriter.writeEndElement();
        }

        if (localQuantityTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Quantity", xmlWriter);

            if (localQuantity == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Quantity cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localQuantity));
            }

            xmlWriter.writeEndElement();
        }

        if (localAssociateTagTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "AssociateTag", xmlWriter);

            if (localAssociateTag == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "AssociateTag cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localAssociateTag);
            }

            xmlWriter.writeEndElement();
        }

        if (localListItemIdTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "ListItemId", xmlWriter);

            if (localListItemId == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ListItemId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localListItemId);
            }

            xmlWriter.writeEndElement();
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
        public static Item_type0 parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Item_type0 object = new Item_type0();

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

                        if (!"Item_type0".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Item_type0) com.amazon.webservices.awsecommerceservice._2013_08_01.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "ASIN").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "ASIN").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "ASIN" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setASIN(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "OfferListingId").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "OfferListingId").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "OfferListingId" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setOfferListingId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "Quantity").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Quantity").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Quantity" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setQuantity(org.apache.axis2.databinding.utils.ConverterUtil.convertToPositiveInteger(
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
                            "AssociateTag").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "AssociateTag").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "AssociateTag" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAssociateTag(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "ListItemId").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "ListItemId").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "ListItemId" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setListItemId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
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
