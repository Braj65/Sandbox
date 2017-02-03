/**
 * CartAdd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package com.amazon.webservices.awsecommerceservice._2013_08_01;


/**
 *  CartAdd bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class CartAdd implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2013-08-01",
            "CartAdd", "ns1");

    /**
     * field for MarketplaceDomain
     */
    protected java.lang.String localMarketplaceDomain;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMarketplaceDomainTracker = false;

    /**
     * field for AWSAccessKeyId
     */
    protected java.lang.String localAWSAccessKeyId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAWSAccessKeyIdTracker = false;

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
     * field for Validate
     */
    protected java.lang.String localValidate;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localValidateTracker = false;

    /**
     * field for XMLEscaping
     */
    protected java.lang.String localXMLEscaping;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localXMLEscapingTracker = false;

    /**
     * field for Shared
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest localShared;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSharedTracker = false;

    /**
     * field for Request
     * This was an Array!
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest[] localRequest;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRequestTracker = false;

    public boolean isMarketplaceDomainSpecified() {
        return localMarketplaceDomainTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMarketplaceDomain() {
        return localMarketplaceDomain;
    }

    /**
     * Auto generated setter method
     * @param param MarketplaceDomain
     */
    public void setMarketplaceDomain(java.lang.String param) {
        localMarketplaceDomainTracker = param != null;

        this.localMarketplaceDomain = param;
    }

    public boolean isAWSAccessKeyIdSpecified() {
        return localAWSAccessKeyIdTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAWSAccessKeyId() {
        return localAWSAccessKeyId;
    }

    /**
     * Auto generated setter method
     * @param param AWSAccessKeyId
     */
    public void setAWSAccessKeyId(java.lang.String param) {
        localAWSAccessKeyIdTracker = param != null;

        this.localAWSAccessKeyId = param;
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

    public boolean isValidateSpecified() {
        return localValidateTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getValidate() {
        return localValidate;
    }

    /**
     * Auto generated setter method
     * @param param Validate
     */
    public void setValidate(java.lang.String param) {
        localValidateTracker = param != null;

        this.localValidate = param;
    }

    public boolean isXMLEscapingSpecified() {
        return localXMLEscapingTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getXMLEscaping() {
        return localXMLEscaping;
    }

    /**
     * Auto generated setter method
     * @param param XMLEscaping
     */
    public void setXMLEscaping(java.lang.String param) {
        localXMLEscapingTracker = param != null;

        this.localXMLEscaping = param;
    }

    public boolean isSharedSpecified() {
        return localSharedTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest getShared() {
        return localShared;
    }

    /**
     * Auto generated setter method
     * @param param Shared
     */
    public void setShared(
        com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest param) {
        localSharedTracker = param != null;

        this.localShared = param;
    }

    public boolean isRequestSpecified() {
        return localRequestTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest[]
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest[] getRequest() {
        return localRequest;
    }

    /**
     * validate the array for Request
     */
    protected void validateRequest(
        com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest[] param) {
    }

    /**
     * Auto generated setter method
     * @param param Request
     */
    public void setRequest(
        com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest[] param) {
        validateRequest(param);

        localRequestTracker = param != null;

        this.localRequest = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest
     */
    public void addRequest(
        com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest param) {
        if (localRequest == null) {
            localRequest = new com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest[] {
                    
                };
        }

        //update the setting tracker
        localRequestTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localRequest);
        list.add(param);
        this.localRequest = (com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest[]) list.toArray(new com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest[list.size()]);
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
                this, MY_QNAME));
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
                    namespacePrefix + ":CartAdd", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "CartAdd", xmlWriter);
            }
        }

        if (localMarketplaceDomainTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "MarketplaceDomain", xmlWriter);

            if (localMarketplaceDomain == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "MarketplaceDomain cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localMarketplaceDomain);
            }

            xmlWriter.writeEndElement();
        }

        if (localAWSAccessKeyIdTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "AWSAccessKeyId", xmlWriter);

            if (localAWSAccessKeyId == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "AWSAccessKeyId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localAWSAccessKeyId);
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

        if (localValidateTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Validate", xmlWriter);

            if (localValidate == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Validate cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localValidate);
            }

            xmlWriter.writeEndElement();
        }

        if (localXMLEscapingTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "XMLEscaping", xmlWriter);

            if (localXMLEscaping == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "XMLEscaping cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localXMLEscaping);
            }

            xmlWriter.writeEndElement();
        }

        if (localSharedTracker) {
            if (localShared == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Shared cannot be null!!");
            }

            localShared.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "Shared"), xmlWriter);
        }

        if (localRequestTracker) {
            if (localRequest != null) {
                for (int i = 0; i < localRequest.length; i++) {
                    if (localRequest[i] != null) {
                        localRequest[i].serialize(new javax.xml.namespace.QName(
                                "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                "Request"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "Request cannot be null!!");
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
        public static CartAdd parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            CartAdd object = new CartAdd();

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

                        if (!"CartAdd".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (CartAdd) com.amazon.webservices.awsecommerceservice._2013_08_01.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list7 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "MarketplaceDomain").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "MarketplaceDomain").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "MarketplaceDomain" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMarketplaceDomain(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "AWSAccessKeyId").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "AWSAccessKeyId").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "AWSAccessKeyId" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAWSAccessKeyId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "Validate").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Validate").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Validate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setValidate(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "XMLEscaping").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "XMLEscaping").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "XMLEscaping" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setXMLEscaping(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "Shared").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Shared").equals(
                            reader.getName())) {
                    object.setShared(com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest.Factory.parse(
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
                            "Request").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Request").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    list7.add(com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest.Factory.parse(
                            reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone7 = false;

                    while (!loopDone7) {
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
                            loopDone7 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                        "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                        "Request").equals(reader.getName())) {
                                list7.add(com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest.Factory.parse(
                                        reader));
                            } else {
                                loopDone7 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setRequest((com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            com.amazon.webservices.awsecommerceservice._2013_08_01.CartAddRequest.class,
                            list7));
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
