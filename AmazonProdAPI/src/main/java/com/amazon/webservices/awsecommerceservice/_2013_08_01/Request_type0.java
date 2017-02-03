/**
 * Request_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package com.amazon.webservices.awsecommerceservice._2013_08_01;


/**
 *  Request_type0 bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Request_type0 implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Request_type0
       Namespace URI = http://webservices.amazon.com/AWSECommerceService/2013-08-01
       Namespace Prefix = ns1
     */

    /**
     * field for IsValid
     */
    protected java.lang.String localIsValid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIsValidTracker = false;

    /**
     * field for BrowseNodeLookupRequest
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookupRequest localBrowseNodeLookupRequest;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBrowseNodeLookupRequestTracker = false;

    /**
     * field for ItemSearchRequest
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest localItemSearchRequest;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localItemSearchRequestTracker = false;

    /**
     * field for ItemLookupRequest
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.ItemLookupRequest localItemLookupRequest;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localItemLookupRequestTracker = false;

    /**
     * field for SimilarityLookupRequest
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarityLookupRequest localSimilarityLookupRequest;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSimilarityLookupRequestTracker = false;

    /**
     * field for CartGetRequest
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.CartGetRequest localCartGetRequest;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCartGetRequestTracker = false;

    /**
     * field for CartAddRequest
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest localCartAddRequest;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCartAddRequestTracker = false;

    /**
     * field for CartCreateRequest
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.CartCreateRequest localCartCreateRequest;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCartCreateRequestTracker = false;

    /**
     * field for CartModifyRequest
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.CartModifyRequest localCartModifyRequest;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCartModifyRequestTracker = false;

    /**
     * field for CartClearRequest
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.CartClearRequest localCartClearRequest;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCartClearRequestTracker = false;

    /**
     * field for Errors
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Errors_type0 localErrors;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localErrorsTracker = false;

    public boolean isIsValidSpecified() {
        return localIsValidTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getIsValid() {
        return localIsValid;
    }

    /**
     * Auto generated setter method
     * @param param IsValid
     */
    public void setIsValid(java.lang.String param) {
        localIsValidTracker = param != null;

        this.localIsValid = param;
    }

    public boolean isBrowseNodeLookupRequestSpecified() {
        return localBrowseNodeLookupRequestTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookupRequest
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookupRequest getBrowseNodeLookupRequest() {
        return localBrowseNodeLookupRequest;
    }

    /**
     * Auto generated setter method
     * @param param BrowseNodeLookupRequest
     */
    public void setBrowseNodeLookupRequest(
        com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookupRequest param) {
        localBrowseNodeLookupRequestTracker = param != null;

        this.localBrowseNodeLookupRequest = param;
    }

    public boolean isItemSearchRequestSpecified() {
        return localItemSearchRequestTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest getItemSearchRequest() {
        return localItemSearchRequest;
    }

    /**
     * Auto generated setter method
     * @param param ItemSearchRequest
     */
    public void setItemSearchRequest(
        com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest param) {
        localItemSearchRequestTracker = param != null;

        this.localItemSearchRequest = param;
    }

    public boolean isItemLookupRequestSpecified() {
        return localItemLookupRequestTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.ItemLookupRequest
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.ItemLookupRequest getItemLookupRequest() {
        return localItemLookupRequest;
    }

    /**
     * Auto generated setter method
     * @param param ItemLookupRequest
     */
    public void setItemLookupRequest(
        com.amazon.webservices.awsecommerceservice._2013_08_01.ItemLookupRequest param) {
        localItemLookupRequestTracker = param != null;

        this.localItemLookupRequest = param;
    }

    public boolean isSimilarityLookupRequestSpecified() {
        return localSimilarityLookupRequestTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarityLookupRequest
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarityLookupRequest getSimilarityLookupRequest() {
        return localSimilarityLookupRequest;
    }

    /**
     * Auto generated setter method
     * @param param SimilarityLookupRequest
     */
    public void setSimilarityLookupRequest(
        com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarityLookupRequest param) {
        localSimilarityLookupRequestTracker = param != null;

        this.localSimilarityLookupRequest = param;
    }

    public boolean isCartGetRequestSpecified() {
        return localCartGetRequestTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.CartGetRequest
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.CartGetRequest getCartGetRequest() {
        return localCartGetRequest;
    }

    /**
     * Auto generated setter method
     * @param param CartGetRequest
     */
    public void setCartGetRequest(
        com.amazon.webservices.awsecommerceservice._2013_08_01.CartGetRequest param) {
        localCartGetRequestTracker = param != null;

        this.localCartGetRequest = param;
    }

    public boolean isCartAddRequestSpecified() {
        return localCartAddRequestTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest getCartAddRequest() {
        return localCartAddRequest;
    }

    /**
     * Auto generated setter method
     * @param param CartAddRequest
     */
    public void setCartAddRequest(
        com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest param) {
        localCartAddRequestTracker = param != null;

        this.localCartAddRequest = param;
    }

    public boolean isCartCreateRequestSpecified() {
        return localCartCreateRequestTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.CartCreateRequest
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.CartCreateRequest getCartCreateRequest() {
        return localCartCreateRequest;
    }

    /**
     * Auto generated setter method
     * @param param CartCreateRequest
     */
    public void setCartCreateRequest(
        com.amazon.webservices.awsecommerceservice._2013_08_01.CartCreateRequest param) {
        localCartCreateRequestTracker = param != null;

        this.localCartCreateRequest = param;
    }

    public boolean isCartModifyRequestSpecified() {
        return localCartModifyRequestTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.CartModifyRequest
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.CartModifyRequest getCartModifyRequest() {
        return localCartModifyRequest;
    }

    /**
     * Auto generated setter method
     * @param param CartModifyRequest
     */
    public void setCartModifyRequest(
        com.amazon.webservices.awsecommerceservice._2013_08_01.CartModifyRequest param) {
        localCartModifyRequestTracker = param != null;

        this.localCartModifyRequest = param;
    }

    public boolean isCartClearRequestSpecified() {
        return localCartClearRequestTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.CartClearRequest
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.CartClearRequest getCartClearRequest() {
        return localCartClearRequest;
    }

    /**
     * Auto generated setter method
     * @param param CartClearRequest
     */
    public void setCartClearRequest(
        com.amazon.webservices.awsecommerceservice._2013_08_01.CartClearRequest param) {
        localCartClearRequestTracker = param != null;

        this.localCartClearRequest = param;
    }

    public boolean isErrorsSpecified() {
        return localErrorsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Errors_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Errors_type0 getErrors() {
        return localErrors;
    }

    /**
     * Auto generated setter method
     * @param param Errors
     */
    public void setErrors(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Errors_type0 param) {
        localErrorsTracker = param != null;

        this.localErrors = param;
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
                    namespacePrefix + ":Request_type0", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Request_type0", xmlWriter);
            }
        }

        if (localIsValidTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "IsValid", xmlWriter);

            if (localIsValid == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "IsValid cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localIsValid);
            }

            xmlWriter.writeEndElement();
        }

        if (localBrowseNodeLookupRequestTracker) {
            if (localBrowseNodeLookupRequest == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "BrowseNodeLookupRequest cannot be null!!");
            }

            localBrowseNodeLookupRequest.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "BrowseNodeLookupRequest"), xmlWriter);
        }

        if (localItemSearchRequestTracker) {
            if (localItemSearchRequest == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ItemSearchRequest cannot be null!!");
            }

            localItemSearchRequest.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "ItemSearchRequest"), xmlWriter);
        }

        if (localItemLookupRequestTracker) {
            if (localItemLookupRequest == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ItemLookupRequest cannot be null!!");
            }

            localItemLookupRequest.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "ItemLookupRequest"), xmlWriter);
        }

        if (localSimilarityLookupRequestTracker) {
            if (localSimilarityLookupRequest == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SimilarityLookupRequest cannot be null!!");
            }

            localSimilarityLookupRequest.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "SimilarityLookupRequest"), xmlWriter);
        }

        if (localCartGetRequestTracker) {
            if (localCartGetRequest == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "CartGetRequest cannot be null!!");
            }

            localCartGetRequest.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "CartGetRequest"), xmlWriter);
        }

        if (localCartAddRequestTracker) {
            if (localCartAddRequest == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "CartAddRequest cannot be null!!");
            }

            localCartAddRequest.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "CartAddRequest"), xmlWriter);
        }

        if (localCartCreateRequestTracker) {
            if (localCartCreateRequest == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "CartCreateRequest cannot be null!!");
            }

            localCartCreateRequest.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "CartCreateRequest"), xmlWriter);
        }

        if (localCartModifyRequestTracker) {
            if (localCartModifyRequest == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "CartModifyRequest cannot be null!!");
            }

            localCartModifyRequest.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "CartModifyRequest"), xmlWriter);
        }

        if (localCartClearRequestTracker) {
            if (localCartClearRequest == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "CartClearRequest cannot be null!!");
            }

            localCartClearRequest.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "CartClearRequest"), xmlWriter);
        }

        if (localErrorsTracker) {
            if (localErrors == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Errors cannot be null!!");
            }

            localErrors.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "Errors"), xmlWriter);
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
        public static Request_type0 parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            Request_type0 object = new Request_type0();

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

                        if (!"Request_type0".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Request_type0) com.amazon.webservices.awsecommerceservice._2013_08_01.ExtensionMapper.getTypeObject(nsUri,
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
                            "IsValid").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "IsValid").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "IsValid" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setIsValid(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "BrowseNodeLookupRequest").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "BrowseNodeLookupRequest").equals(reader.getName())) {
                    object.setBrowseNodeLookupRequest(com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookupRequest.Factory.parse(
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
                            "ItemSearchRequest").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "ItemSearchRequest").equals(
                            reader.getName())) {
                    object.setItemSearchRequest(com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest.Factory.parse(
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
                            "ItemLookupRequest").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "ItemLookupRequest").equals(
                            reader.getName())) {
                    object.setItemLookupRequest(com.amazon.webservices.awsecommerceservice._2013_08_01.ItemLookupRequest.Factory.parse(
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
                            "SimilarityLookupRequest").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "SimilarityLookupRequest").equals(reader.getName())) {
                    object.setSimilarityLookupRequest(com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarityLookupRequest.Factory.parse(
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
                            "CartGetRequest").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "CartGetRequest").equals(
                            reader.getName())) {
                    object.setCartGetRequest(com.amazon.webservices.awsecommerceservice._2013_08_01.CartGetRequest.Factory.parse(
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
                            "CartAddRequest").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "CartAddRequest").equals(
                            reader.getName())) {
                    object.setCartAddRequest(com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest.Factory.parse(
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
                            "CartCreateRequest").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "CartCreateRequest").equals(
                            reader.getName())) {
                    object.setCartCreateRequest(com.amazon.webservices.awsecommerceservice._2013_08_01.CartCreateRequest.Factory.parse(
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
                            "CartModifyRequest").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "CartModifyRequest").equals(
                            reader.getName())) {
                    object.setCartModifyRequest(com.amazon.webservices.awsecommerceservice._2013_08_01.CartModifyRequest.Factory.parse(
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
                            "CartClearRequest").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "CartClearRequest").equals(
                            reader.getName())) {
                    object.setCartClearRequest(com.amazon.webservices.awsecommerceservice._2013_08_01.CartClearRequest.Factory.parse(
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
                            "Errors").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Errors").equals(
                            reader.getName())) {
                    object.setErrors(com.amazon.webservices.awsecommerceservice._2013_08_01.Errors_type0.Factory.parse(
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
