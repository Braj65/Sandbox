/**
 * Offer_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package com.amazon.webservices.awsecommerceservice._2013_08_01;


/**
 *  Offer_type0 bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Offer_type0 implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Offer_type0
       Namespace URI = http://webservices.amazon.com/AWSECommerceService/2013-08-01
       Namespace Prefix = ns1
     */

    /**
     * field for Merchant
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Merchant_type0 localMerchant;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMerchantTracker = false;

    /**
     * field for OfferAttributes
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.OfferAttributes_type0 localOfferAttributes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOfferAttributesTracker = false;

    /**
     * field for OfferListing
     * This was an Array!
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.OfferListing_type0[] localOfferListing;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOfferListingTracker = false;

    /**
     * field for LoyaltyPoints
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.LoyaltyPoints_type0 localLoyaltyPoints;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLoyaltyPointsTracker = false;

    /**
     * field for Promotions
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Promotions_type0 localPromotions;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPromotionsTracker = false;

    public boolean isMerchantSpecified() {
        return localMerchantTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Merchant_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Merchant_type0 getMerchant() {
        return localMerchant;
    }

    /**
     * Auto generated setter method
     * @param param Merchant
     */
    public void setMerchant(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Merchant_type0 param) {
        localMerchantTracker = param != null;

        this.localMerchant = param;
    }

    public boolean isOfferAttributesSpecified() {
        return localOfferAttributesTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.OfferAttributes_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.OfferAttributes_type0 getOfferAttributes() {
        return localOfferAttributes;
    }

    /**
     * Auto generated setter method
     * @param param OfferAttributes
     */
    public void setOfferAttributes(
        com.amazon.webservices.awsecommerceservice._2013_08_01.OfferAttributes_type0 param) {
        localOfferAttributesTracker = param != null;

        this.localOfferAttributes = param;
    }

    public boolean isOfferListingSpecified() {
        return localOfferListingTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.OfferListing_type0[]
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.OfferListing_type0[] getOfferListing() {
        return localOfferListing;
    }

    /**
     * validate the array for OfferListing
     */
    protected void validateOfferListing(
        com.amazon.webservices.awsecommerceservice._2013_08_01.OfferListing_type0[] param) {
    }

    /**
     * Auto generated setter method
     * @param param OfferListing
     */
    public void setOfferListing(
        com.amazon.webservices.awsecommerceservice._2013_08_01.OfferListing_type0[] param) {
        validateOfferListing(param);

        localOfferListingTracker = param != null;

        this.localOfferListing = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param com.amazon.webservices.awsecommerceservice._2013_08_01.OfferListing_type0
     */
    public void addOfferListing(
        com.amazon.webservices.awsecommerceservice._2013_08_01.OfferListing_type0 param) {
        if (localOfferListing == null) {
            localOfferListing = new com.amazon.webservices.awsecommerceservice._2013_08_01.OfferListing_type0[] {
                    
                };
        }

        //update the setting tracker
        localOfferListingTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localOfferListing);
        list.add(param);
        this.localOfferListing = (com.amazon.webservices.awsecommerceservice._2013_08_01.OfferListing_type0[]) list.toArray(new com.amazon.webservices.awsecommerceservice._2013_08_01.OfferListing_type0[list.size()]);
    }

    public boolean isLoyaltyPointsSpecified() {
        return localLoyaltyPointsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.LoyaltyPoints_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.LoyaltyPoints_type0 getLoyaltyPoints() {
        return localLoyaltyPoints;
    }

    /**
     * Auto generated setter method
     * @param param LoyaltyPoints
     */
    public void setLoyaltyPoints(
        com.amazon.webservices.awsecommerceservice._2013_08_01.LoyaltyPoints_type0 param) {
        localLoyaltyPointsTracker = param != null;

        this.localLoyaltyPoints = param;
    }

    public boolean isPromotionsSpecified() {
        return localPromotionsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Promotions_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Promotions_type0 getPromotions() {
        return localPromotions;
    }

    /**
     * Auto generated setter method
     * @param param Promotions
     */
    public void setPromotions(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Promotions_type0 param) {
        localPromotionsTracker = param != null;

        this.localPromotions = param;
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
                    namespacePrefix + ":Offer_type0", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Offer_type0", xmlWriter);
            }
        }

        if (localMerchantTracker) {
            if (localMerchant == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Merchant cannot be null!!");
            }

            localMerchant.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "Merchant"), xmlWriter);
        }

        if (localOfferAttributesTracker) {
            if (localOfferAttributes == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "OfferAttributes cannot be null!!");
            }

            localOfferAttributes.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "OfferAttributes"), xmlWriter);
        }

        if (localOfferListingTracker) {
            if (localOfferListing != null) {
                for (int i = 0; i < localOfferListing.length; i++) {
                    if (localOfferListing[i] != null) {
                        localOfferListing[i].serialize(new javax.xml.namespace.QName(
                                "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                "OfferListing"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "OfferListing cannot be null!!");
            }
        }

        if (localLoyaltyPointsTracker) {
            if (localLoyaltyPoints == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "LoyaltyPoints cannot be null!!");
            }

            localLoyaltyPoints.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "LoyaltyPoints"), xmlWriter);
        }

        if (localPromotionsTracker) {
            if (localPromotions == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Promotions cannot be null!!");
            }

            localPromotions.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "Promotions"), xmlWriter);
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
        public static Offer_type0 parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Offer_type0 object = new Offer_type0();

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

                        if (!"Offer_type0".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Offer_type0) com.amazon.webservices.awsecommerceservice._2013_08_01.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list3 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "Merchant").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Merchant").equals(
                            reader.getName())) {
                    object.setMerchant(com.amazon.webservices.awsecommerceservice._2013_08_01.Merchant_type0.Factory.parse(
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
                            "OfferAttributes").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "OfferAttributes").equals(
                            reader.getName())) {
                    object.setOfferAttributes(com.amazon.webservices.awsecommerceservice._2013_08_01.OfferAttributes_type0.Factory.parse(
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
                            "OfferListing").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "OfferListing").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    list3.add(com.amazon.webservices.awsecommerceservice._2013_08_01.OfferListing_type0.Factory.parse(
                            reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone3 = false;

                    while (!loopDone3) {
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
                            loopDone3 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                        "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                        "OfferListing").equals(reader.getName())) {
                                list3.add(com.amazon.webservices.awsecommerceservice._2013_08_01.OfferListing_type0.Factory.parse(
                                        reader));
                            } else {
                                loopDone3 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setOfferListing((com.amazon.webservices.awsecommerceservice._2013_08_01.OfferListing_type0[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            com.amazon.webservices.awsecommerceservice._2013_08_01.OfferListing_type0.class,
                            list3));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "LoyaltyPoints").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "LoyaltyPoints").equals(
                            reader.getName())) {
                    object.setLoyaltyPoints(com.amazon.webservices.awsecommerceservice._2013_08_01.LoyaltyPoints_type0.Factory.parse(
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
                            "Promotions").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Promotions").equals(
                            reader.getName())) {
                    object.setPromotions(com.amazon.webservices.awsecommerceservice._2013_08_01.Promotions_type0.Factory.parse(
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
