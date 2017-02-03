/**
 * CartItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package com.amazon.webservices.awsecommerceservice._2013_08_01;


/**
 *  CartItem bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class CartItem implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = CartItem
       Namespace URI = http://webservices.amazon.com/AWSECommerceService/2013-08-01
       Namespace Prefix = ns1
     */

    /**
     * field for CartItemId
     */
    protected java.lang.String localCartItemId;

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
     * field for SellerNickname
     */
    protected java.lang.String localSellerNickname;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSellerNicknameTracker = false;

    /**
     * field for Quantity
     */
    protected java.lang.String localQuantity;

    /**
     * field for Title
     */
    protected java.lang.String localTitle;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTitleTracker = false;

    /**
     * field for ProductGroup
     */
    protected java.lang.String localProductGroup;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localProductGroupTracker = false;

    /**
     * field for MetaData
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.MetaData_type1 localMetaData;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMetaDataTracker = false;

    /**
     * field for Price
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Price localPrice;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPriceTracker = false;

    /**
     * field for ItemTotal
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Price localItemTotal;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localItemTotalTracker = false;

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCartItemId() {
        return localCartItemId;
    }

    /**
     * Auto generated setter method
     * @param param CartItemId
     */
    public void setCartItemId(java.lang.String param) {
        this.localCartItemId = param;
    }

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

    public boolean isSellerNicknameSpecified() {
        return localSellerNicknameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSellerNickname() {
        return localSellerNickname;
    }

    /**
     * Auto generated setter method
     * @param param SellerNickname
     */
    public void setSellerNickname(java.lang.String param) {
        localSellerNicknameTracker = param != null;

        this.localSellerNickname = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getQuantity() {
        return localQuantity;
    }

    /**
     * Auto generated setter method
     * @param param Quantity
     */
    public void setQuantity(java.lang.String param) {
        this.localQuantity = param;
    }

    public boolean isTitleSpecified() {
        return localTitleTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTitle() {
        return localTitle;
    }

    /**
     * Auto generated setter method
     * @param param Title
     */
    public void setTitle(java.lang.String param) {
        localTitleTracker = param != null;

        this.localTitle = param;
    }

    public boolean isProductGroupSpecified() {
        return localProductGroupTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getProductGroup() {
        return localProductGroup;
    }

    /**
     * Auto generated setter method
     * @param param ProductGroup
     */
    public void setProductGroup(java.lang.String param) {
        localProductGroupTracker = param != null;

        this.localProductGroup = param;
    }

    public boolean isMetaDataSpecified() {
        return localMetaDataTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.MetaData_type1
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.MetaData_type1 getMetaData() {
        return localMetaData;
    }

    /**
     * Auto generated setter method
     * @param param MetaData
     */
    public void setMetaData(
        com.amazon.webservices.awsecommerceservice._2013_08_01.MetaData_type1 param) {
        localMetaDataTracker = param != null;

        this.localMetaData = param;
    }

    public boolean isPriceSpecified() {
        return localPriceTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Price
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Price getPrice() {
        return localPrice;
    }

    /**
     * Auto generated setter method
     * @param param Price
     */
    public void setPrice(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Price param) {
        localPriceTracker = param != null;

        this.localPrice = param;
    }

    public boolean isItemTotalSpecified() {
        return localItemTotalTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Price
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Price getItemTotal() {
        return localItemTotal;
    }

    /**
     * Auto generated setter method
     * @param param ItemTotal
     */
    public void setItemTotal(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Price param) {
        localItemTotalTracker = param != null;

        this.localItemTotal = param;
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
                    namespacePrefix + ":CartItem", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "CartItem", xmlWriter);
            }
        }

        namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
        writeStartElement(null, namespace, "CartItemId", xmlWriter);

        if (localCartItemId == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                "CartItemId cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localCartItemId);
        }

        xmlWriter.writeEndElement();

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

        if (localSellerNicknameTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "SellerNickname", xmlWriter);

            if (localSellerNickname == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "SellerNickname cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSellerNickname);
            }

            xmlWriter.writeEndElement();
        }

        namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
        writeStartElement(null, namespace, "Quantity", xmlWriter);

        if (localQuantity == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                "Quantity cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localQuantity);
        }

        xmlWriter.writeEndElement();

        if (localTitleTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Title", xmlWriter);

            if (localTitle == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Title cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTitle);
            }

            xmlWriter.writeEndElement();
        }

        if (localProductGroupTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "ProductGroup", xmlWriter);

            if (localProductGroup == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ProductGroup cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localProductGroup);
            }

            xmlWriter.writeEndElement();
        }

        if (localMetaDataTracker) {
            if (localMetaData == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "MetaData cannot be null!!");
            }

            localMetaData.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "MetaData"), xmlWriter);
        }

        if (localPriceTracker) {
            if (localPrice == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Price cannot be null!!");
            }

            localPrice.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "Price"), xmlWriter);
        }

        if (localItemTotalTracker) {
            if (localItemTotal == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ItemTotal cannot be null!!");
            }

            localItemTotal.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "ItemTotal"), xmlWriter);
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
        public static CartItem parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            CartItem object = new CartItem();

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

                        if (!"CartItem".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (CartItem) com.amazon.webservices.awsecommerceservice._2013_08_01.ExtensionMapper.getTypeObject(nsUri,
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
                            "CartItemId").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "CartItemId").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "CartItemId" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCartItemId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

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
                            "SellerNickname").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "SellerNickname").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "SellerNickname" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSellerNickname(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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

                    object.setQuantity(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "Title").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Title").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Title" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTitle(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "ProductGroup").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "ProductGroup").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "ProductGroup" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setProductGroup(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "MetaData").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "MetaData").equals(
                            reader.getName())) {
                    object.setMetaData(com.amazon.webservices.awsecommerceservice._2013_08_01.MetaData_type1.Factory.parse(
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
                            "Price").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Price").equals(
                            reader.getName())) {
                    object.setPrice(com.amazon.webservices.awsecommerceservice._2013_08_01.Price.Factory.parse(
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
                            "ItemTotal").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "ItemTotal").equals(
                            reader.getName())) {
                    object.setItemTotal(com.amazon.webservices.awsecommerceservice._2013_08_01.Price.Factory.parse(
                            reader));

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
