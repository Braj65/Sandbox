/**
 * OfferSummary_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package com.amazon.webservices.awsecommerceservice._2013_08_01;


/**
 *  OfferSummary_type0 bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class OfferSummary_type0 implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = OfferSummary_type0
       Namespace URI = http://webservices.amazon.com/AWSECommerceService/2013-08-01
       Namespace Prefix = ns1
     */

    /**
     * field for LowestNewPrice
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Price localLowestNewPrice;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLowestNewPriceTracker = false;

    /**
     * field for LowestUsedPrice
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Price localLowestUsedPrice;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLowestUsedPriceTracker = false;

    /**
     * field for LowestCollectiblePrice
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Price localLowestCollectiblePrice;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLowestCollectiblePriceTracker = false;

    /**
     * field for LowestRefurbishedPrice
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Price localLowestRefurbishedPrice;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLowestRefurbishedPriceTracker = false;

    /**
     * field for TotalNew
     */
    protected java.lang.String localTotalNew;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTotalNewTracker = false;

    /**
     * field for TotalUsed
     */
    protected java.lang.String localTotalUsed;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTotalUsedTracker = false;

    /**
     * field for TotalCollectible
     */
    protected java.lang.String localTotalCollectible;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTotalCollectibleTracker = false;

    /**
     * field for TotalRefurbished
     */
    protected java.lang.String localTotalRefurbished;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTotalRefurbishedTracker = false;

    public boolean isLowestNewPriceSpecified() {
        return localLowestNewPriceTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Price
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Price getLowestNewPrice() {
        return localLowestNewPrice;
    }

    /**
     * Auto generated setter method
     * @param param LowestNewPrice
     */
    public void setLowestNewPrice(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Price param) {
        localLowestNewPriceTracker = param != null;

        this.localLowestNewPrice = param;
    }

    public boolean isLowestUsedPriceSpecified() {
        return localLowestUsedPriceTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Price
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Price getLowestUsedPrice() {
        return localLowestUsedPrice;
    }

    /**
     * Auto generated setter method
     * @param param LowestUsedPrice
     */
    public void setLowestUsedPrice(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Price param) {
        localLowestUsedPriceTracker = param != null;

        this.localLowestUsedPrice = param;
    }

    public boolean isLowestCollectiblePriceSpecified() {
        return localLowestCollectiblePriceTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Price
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Price getLowestCollectiblePrice() {
        return localLowestCollectiblePrice;
    }

    /**
     * Auto generated setter method
     * @param param LowestCollectiblePrice
     */
    public void setLowestCollectiblePrice(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Price param) {
        localLowestCollectiblePriceTracker = param != null;

        this.localLowestCollectiblePrice = param;
    }

    public boolean isLowestRefurbishedPriceSpecified() {
        return localLowestRefurbishedPriceTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Price
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Price getLowestRefurbishedPrice() {
        return localLowestRefurbishedPrice;
    }

    /**
     * Auto generated setter method
     * @param param LowestRefurbishedPrice
     */
    public void setLowestRefurbishedPrice(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Price param) {
        localLowestRefurbishedPriceTracker = param != null;

        this.localLowestRefurbishedPrice = param;
    }

    public boolean isTotalNewSpecified() {
        return localTotalNewTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTotalNew() {
        return localTotalNew;
    }

    /**
     * Auto generated setter method
     * @param param TotalNew
     */
    public void setTotalNew(java.lang.String param) {
        localTotalNewTracker = param != null;

        this.localTotalNew = param;
    }

    public boolean isTotalUsedSpecified() {
        return localTotalUsedTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTotalUsed() {
        return localTotalUsed;
    }

    /**
     * Auto generated setter method
     * @param param TotalUsed
     */
    public void setTotalUsed(java.lang.String param) {
        localTotalUsedTracker = param != null;

        this.localTotalUsed = param;
    }

    public boolean isTotalCollectibleSpecified() {
        return localTotalCollectibleTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTotalCollectible() {
        return localTotalCollectible;
    }

    /**
     * Auto generated setter method
     * @param param TotalCollectible
     */
    public void setTotalCollectible(java.lang.String param) {
        localTotalCollectibleTracker = param != null;

        this.localTotalCollectible = param;
    }

    public boolean isTotalRefurbishedSpecified() {
        return localTotalRefurbishedTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTotalRefurbished() {
        return localTotalRefurbished;
    }

    /**
     * Auto generated setter method
     * @param param TotalRefurbished
     */
    public void setTotalRefurbished(java.lang.String param) {
        localTotalRefurbishedTracker = param != null;

        this.localTotalRefurbished = param;
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
                    namespacePrefix + ":OfferSummary_type0", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "OfferSummary_type0", xmlWriter);
            }
        }

        if (localLowestNewPriceTracker) {
            if (localLowestNewPrice == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "LowestNewPrice cannot be null!!");
            }

            localLowestNewPrice.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "LowestNewPrice"), xmlWriter);
        }

        if (localLowestUsedPriceTracker) {
            if (localLowestUsedPrice == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "LowestUsedPrice cannot be null!!");
            }

            localLowestUsedPrice.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "LowestUsedPrice"), xmlWriter);
        }

        if (localLowestCollectiblePriceTracker) {
            if (localLowestCollectiblePrice == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "LowestCollectiblePrice cannot be null!!");
            }

            localLowestCollectiblePrice.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "LowestCollectiblePrice"), xmlWriter);
        }

        if (localLowestRefurbishedPriceTracker) {
            if (localLowestRefurbishedPrice == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "LowestRefurbishedPrice cannot be null!!");
            }

            localLowestRefurbishedPrice.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "LowestRefurbishedPrice"), xmlWriter);
        }

        if (localTotalNewTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "TotalNew", xmlWriter);

            if (localTotalNew == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "TotalNew cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTotalNew);
            }

            xmlWriter.writeEndElement();
        }

        if (localTotalUsedTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "TotalUsed", xmlWriter);

            if (localTotalUsed == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "TotalUsed cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTotalUsed);
            }

            xmlWriter.writeEndElement();
        }

        if (localTotalCollectibleTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "TotalCollectible", xmlWriter);

            if (localTotalCollectible == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "TotalCollectible cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTotalCollectible);
            }

            xmlWriter.writeEndElement();
        }

        if (localTotalRefurbishedTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "TotalRefurbished", xmlWriter);

            if (localTotalRefurbished == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "TotalRefurbished cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTotalRefurbished);
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
        public static OfferSummary_type0 parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            OfferSummary_type0 object = new OfferSummary_type0();

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

                        if (!"OfferSummary_type0".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (OfferSummary_type0) com.amazon.webservices.awsecommerceservice._2013_08_01.ExtensionMapper.getTypeObject(nsUri,
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
                            "LowestNewPrice").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "LowestNewPrice").equals(
                            reader.getName())) {
                    object.setLowestNewPrice(com.amazon.webservices.awsecommerceservice._2013_08_01.Price.Factory.parse(
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
                            "LowestUsedPrice").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "LowestUsedPrice").equals(
                            reader.getName())) {
                    object.setLowestUsedPrice(com.amazon.webservices.awsecommerceservice._2013_08_01.Price.Factory.parse(
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
                            "LowestCollectiblePrice").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "LowestCollectiblePrice").equals(reader.getName())) {
                    object.setLowestCollectiblePrice(com.amazon.webservices.awsecommerceservice._2013_08_01.Price.Factory.parse(
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
                            "LowestRefurbishedPrice").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "LowestRefurbishedPrice").equals(reader.getName())) {
                    object.setLowestRefurbishedPrice(com.amazon.webservices.awsecommerceservice._2013_08_01.Price.Factory.parse(
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
                            "TotalNew").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "TotalNew").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "TotalNew" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTotalNew(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "TotalUsed").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "TotalUsed").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "TotalUsed" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTotalUsed(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "TotalCollectible").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "TotalCollectible").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "TotalCollectible" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTotalCollectible(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "TotalRefurbished").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "TotalRefurbished").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "TotalRefurbished" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTotalRefurbished(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
