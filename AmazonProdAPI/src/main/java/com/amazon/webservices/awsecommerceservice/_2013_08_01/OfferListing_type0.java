/**
 * OfferListing_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package com.amazon.webservices.awsecommerceservice._2013_08_01;


/**
 *  OfferListing_type0 bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class OfferListing_type0 implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = OfferListing_type0
       Namespace URI = http://webservices.amazon.com/AWSECommerceService/2013-08-01
       Namespace Prefix = ns1
     */

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
     * field for PricePerUnit
     */
    protected java.lang.String localPricePerUnit;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPricePerUnitTracker = false;

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
     * field for SalePrice
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Price localSalePrice;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSalePriceTracker = false;

    /**
     * field for AmountSaved
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Price localAmountSaved;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAmountSavedTracker = false;

    /**
     * field for PercentageSaved
     */
    protected org.apache.axis2.databinding.types.NonNegativeInteger localPercentageSaved;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPercentageSavedTracker = false;

    /**
     * field for Availability
     */
    protected java.lang.String localAvailability;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAvailabilityTracker = false;

    /**
     * field for AvailabilityAttributes
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.AvailabilityAttributes_type0 localAvailabilityAttributes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAvailabilityAttributesTracker = false;

    /**
     * field for IsEligibleForSuperSaverShipping
     */
    protected boolean localIsEligibleForSuperSaverShipping;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIsEligibleForSuperSaverShippingTracker = false;

    /**
     * field for IsEligibleForPrimeFreeDigitalVideo
     */
    protected boolean localIsEligibleForPrimeFreeDigitalVideo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIsEligibleForPrimeFreeDigitalVideoTracker = false;

    /**
     * field for IsEligibleForPrime
     */
    protected boolean localIsEligibleForPrime;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIsEligibleForPrimeTracker = false;

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

    public boolean isPricePerUnitSpecified() {
        return localPricePerUnitTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPricePerUnit() {
        return localPricePerUnit;
    }

    /**
     * Auto generated setter method
     * @param param PricePerUnit
     */
    public void setPricePerUnit(java.lang.String param) {
        localPricePerUnitTracker = param != null;

        this.localPricePerUnit = param;
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

    public boolean isSalePriceSpecified() {
        return localSalePriceTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Price
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Price getSalePrice() {
        return localSalePrice;
    }

    /**
     * Auto generated setter method
     * @param param SalePrice
     */
    public void setSalePrice(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Price param) {
        localSalePriceTracker = param != null;

        this.localSalePrice = param;
    }

    public boolean isAmountSavedSpecified() {
        return localAmountSavedTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Price
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Price getAmountSaved() {
        return localAmountSaved;
    }

    /**
     * Auto generated setter method
     * @param param AmountSaved
     */
    public void setAmountSaved(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Price param) {
        localAmountSavedTracker = param != null;

        this.localAmountSaved = param;
    }

    public boolean isPercentageSavedSpecified() {
        return localPercentageSavedTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.NonNegativeInteger
     */
    public org.apache.axis2.databinding.types.NonNegativeInteger getPercentageSaved() {
        return localPercentageSaved;
    }

    /**
     * Auto generated setter method
     * @param param PercentageSaved
     */
    public void setPercentageSaved(
        org.apache.axis2.databinding.types.NonNegativeInteger param) {
        localPercentageSavedTracker = param != null;

        this.localPercentageSaved = param;
    }

    public boolean isAvailabilitySpecified() {
        return localAvailabilityTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAvailability() {
        return localAvailability;
    }

    /**
     * Auto generated setter method
     * @param param Availability
     */
    public void setAvailability(java.lang.String param) {
        localAvailabilityTracker = param != null;

        this.localAvailability = param;
    }

    public boolean isAvailabilityAttributesSpecified() {
        return localAvailabilityAttributesTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.AvailabilityAttributes_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.AvailabilityAttributes_type0 getAvailabilityAttributes() {
        return localAvailabilityAttributes;
    }

    /**
     * Auto generated setter method
     * @param param AvailabilityAttributes
     */
    public void setAvailabilityAttributes(
        com.amazon.webservices.awsecommerceservice._2013_08_01.AvailabilityAttributes_type0 param) {
        localAvailabilityAttributesTracker = param != null;

        this.localAvailabilityAttributes = param;
    }

    public boolean isIsEligibleForSuperSaverShippingSpecified() {
        return localIsEligibleForSuperSaverShippingTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getIsEligibleForSuperSaverShipping() {
        return localIsEligibleForSuperSaverShipping;
    }

    /**
     * Auto generated setter method
     * @param param IsEligibleForSuperSaverShipping
     */
    public void setIsEligibleForSuperSaverShipping(boolean param) {
        // setting primitive attribute tracker to true
        localIsEligibleForSuperSaverShippingTracker = true;

        this.localIsEligibleForSuperSaverShipping = param;
    }

    public boolean isIsEligibleForPrimeFreeDigitalVideoSpecified() {
        return localIsEligibleForPrimeFreeDigitalVideoTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getIsEligibleForPrimeFreeDigitalVideo() {
        return localIsEligibleForPrimeFreeDigitalVideo;
    }

    /**
     * Auto generated setter method
     * @param param IsEligibleForPrimeFreeDigitalVideo
     */
    public void setIsEligibleForPrimeFreeDigitalVideo(boolean param) {
        // setting primitive attribute tracker to true
        localIsEligibleForPrimeFreeDigitalVideoTracker = true;

        this.localIsEligibleForPrimeFreeDigitalVideo = param;
    }

    public boolean isIsEligibleForPrimeSpecified() {
        return localIsEligibleForPrimeTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getIsEligibleForPrime() {
        return localIsEligibleForPrime;
    }

    /**
     * Auto generated setter method
     * @param param IsEligibleForPrime
     */
    public void setIsEligibleForPrime(boolean param) {
        // setting primitive attribute tracker to true
        localIsEligibleForPrimeTracker = true;

        this.localIsEligibleForPrime = param;
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
                    namespacePrefix + ":OfferListing_type0", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "OfferListing_type0", xmlWriter);
            }
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

        if (localPricePerUnitTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "PricePerUnit", xmlWriter);

            if (localPricePerUnit == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "PricePerUnit cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPricePerUnit);
            }

            xmlWriter.writeEndElement();
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

        if (localSalePriceTracker) {
            if (localSalePrice == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SalePrice cannot be null!!");
            }

            localSalePrice.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "SalePrice"), xmlWriter);
        }

        if (localAmountSavedTracker) {
            if (localAmountSaved == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "AmountSaved cannot be null!!");
            }

            localAmountSaved.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "AmountSaved"), xmlWriter);
        }

        if (localPercentageSavedTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "PercentageSaved", xmlWriter);

            if (localPercentageSaved == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "PercentageSaved cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localPercentageSaved));
            }

            xmlWriter.writeEndElement();
        }

        if (localAvailabilityTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Availability", xmlWriter);

            if (localAvailability == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Availability cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localAvailability);
            }

            xmlWriter.writeEndElement();
        }

        if (localAvailabilityAttributesTracker) {
            if (localAvailabilityAttributes == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "AvailabilityAttributes cannot be null!!");
            }

            localAvailabilityAttributes.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "AvailabilityAttributes"), xmlWriter);
        }

        if (localIsEligibleForSuperSaverShippingTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace,
                "IsEligibleForSuperSaverShipping", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "IsEligibleForSuperSaverShipping cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localIsEligibleForSuperSaverShipping));
            }

            xmlWriter.writeEndElement();
        }

        if (localIsEligibleForPrimeFreeDigitalVideoTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace,
                "IsEligibleForPrimeFreeDigitalVideo", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "IsEligibleForPrimeFreeDigitalVideo cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localIsEligibleForPrimeFreeDigitalVideo));
            }

            xmlWriter.writeEndElement();
        }

        if (localIsEligibleForPrimeTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "IsEligibleForPrime", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "IsEligibleForPrime cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localIsEligibleForPrime));
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
        public static OfferListing_type0 parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            OfferListing_type0 object = new OfferListing_type0();

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

                        if (!"OfferListing_type0".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (OfferListing_type0) com.amazon.webservices.awsecommerceservice._2013_08_01.ExtensionMapper.getTypeObject(nsUri,
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
                            "PricePerUnit").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "PricePerUnit").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "PricePerUnit" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPricePerUnit(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "SalePrice").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "SalePrice").equals(
                            reader.getName())) {
                    object.setSalePrice(com.amazon.webservices.awsecommerceservice._2013_08_01.Price.Factory.parse(
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
                            "AmountSaved").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "AmountSaved").equals(
                            reader.getName())) {
                    object.setAmountSaved(com.amazon.webservices.awsecommerceservice._2013_08_01.Price.Factory.parse(
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
                            "PercentageSaved").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "PercentageSaved").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "PercentageSaved" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPercentageSaved(org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
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
                            "Availability").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Availability").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Availability" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAvailability(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "AvailabilityAttributes").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "AvailabilityAttributes").equals(reader.getName())) {
                    object.setAvailabilityAttributes(com.amazon.webservices.awsecommerceservice._2013_08_01.AvailabilityAttributes_type0.Factory.parse(
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
                            "IsEligibleForSuperSaverShipping").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "IsEligibleForSuperSaverShipping").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " +
                            "IsEligibleForSuperSaverShipping" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setIsEligibleForSuperSaverShipping(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
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
                            "IsEligibleForPrimeFreeDigitalVideo").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "IsEligibleForPrimeFreeDigitalVideo").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " +
                            "IsEligibleForPrimeFreeDigitalVideo" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setIsEligibleForPrimeFreeDigitalVideo(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
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
                            "IsEligibleForPrime").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "IsEligibleForPrime").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "IsEligibleForPrime" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setIsEligibleForPrime(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
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
