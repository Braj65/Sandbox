/**
 * SimilarityLookupRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package com.amazon.webservices.awsecommerceservice._2013_08_01;


/**
 *  SimilarityLookupRequest bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class SimilarityLookupRequest implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = SimilarityLookupRequest
       Namespace URI = http://webservices.amazon.com/AWSECommerceService/2013-08-01
       Namespace Prefix = ns1
     */

    /**
     * field for Condition
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Condition_type0 localCondition;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localConditionTracker = false;

    /**
     * field for ItemId
     * This was an Array!
     */
    protected java.lang.String[] localItemId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localItemIdTracker = false;

    /**
     * field for MerchantId
     */
    protected java.lang.String localMerchantId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMerchantIdTracker = false;

    /**
     * field for ResponseGroup
     * This was an Array!
     */
    protected java.lang.String[] localResponseGroup;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localResponseGroupTracker = false;

    /**
     * field for SimilarityType
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarityType_type1 localSimilarityType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSimilarityTypeTracker = false;

    public boolean isConditionSpecified() {
        return localConditionTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Condition_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Condition_type0 getCondition() {
        return localCondition;
    }

    /**
     * Auto generated setter method
     * @param param Condition
     */
    public void setCondition(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Condition_type0 param) {
        localConditionTracker = param != null;

        this.localCondition = param;
    }

    public boolean isItemIdSpecified() {
        return localItemIdTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String[]
     */
    public java.lang.String[] getItemId() {
        return localItemId;
    }

    /**
     * validate the array for ItemId
     */
    protected void validateItemId(java.lang.String[] param) {
    }

    /**
     * Auto generated setter method
     * @param param ItemId
     */
    public void setItemId(java.lang.String[] param) {
        validateItemId(param);

        localItemIdTracker = param != null;

        this.localItemId = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param java.lang.String
     */
    public void addItemId(java.lang.String param) {
        if (localItemId == null) {
            localItemId = new java.lang.String[] {  };
        }

        //update the setting tracker
        localItemIdTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localItemId);
        list.add(param);
        this.localItemId = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
    }

    public boolean isMerchantIdSpecified() {
        return localMerchantIdTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMerchantId() {
        return localMerchantId;
    }

    /**
     * Auto generated setter method
     * @param param MerchantId
     */
    public void setMerchantId(java.lang.String param) {
        localMerchantIdTracker = param != null;

        this.localMerchantId = param;
    }

    public boolean isResponseGroupSpecified() {
        return localResponseGroupTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String[]
     */
    public java.lang.String[] getResponseGroup() {
        return localResponseGroup;
    }

    /**
     * validate the array for ResponseGroup
     */
    protected void validateResponseGroup(java.lang.String[] param) {
    }

    /**
     * Auto generated setter method
     * @param param ResponseGroup
     */
    public void setResponseGroup(java.lang.String[] param) {
        validateResponseGroup(param);

        localResponseGroupTracker = param != null;

        this.localResponseGroup = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param java.lang.String
     */
    public void addResponseGroup(java.lang.String param) {
        if (localResponseGroup == null) {
            localResponseGroup = new java.lang.String[] {  };
        }

        //update the setting tracker
        localResponseGroupTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localResponseGroup);
        list.add(param);
        this.localResponseGroup = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
    }

    public boolean isSimilarityTypeSpecified() {
        return localSimilarityTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarityType_type1
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarityType_type1 getSimilarityType() {
        return localSimilarityType;
    }

    /**
     * Auto generated setter method
     * @param param SimilarityType
     */
    public void setSimilarityType(
        com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarityType_type1 param) {
        localSimilarityTypeTracker = param != null;

        this.localSimilarityType = param;
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
                    namespacePrefix + ":SimilarityLookupRequest", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "SimilarityLookupRequest", xmlWriter);
            }
        }

        if (localConditionTracker) {
            if (localCondition == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Condition cannot be null!!");
            }

            localCondition.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "Condition"), xmlWriter);
        }

        if (localItemIdTracker) {
            if (localItemId != null) {
                namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";

                for (int i = 0; i < localItemId.length; i++) {
                    if (localItemId[i] != null) {
                        writeStartElement(null, namespace, "ItemId", xmlWriter);

                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                localItemId[i]));

                        xmlWriter.writeEndElement();
                    } else {
                        // we have to do nothing since minOccurs is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "ItemId cannot be null!!");
            }
        }

        if (localMerchantIdTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "MerchantId", xmlWriter);

            if (localMerchantId == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "MerchantId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localMerchantId);
            }

            xmlWriter.writeEndElement();
        }

        if (localResponseGroupTracker) {
            if (localResponseGroup != null) {
                namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";

                for (int i = 0; i < localResponseGroup.length; i++) {
                    if (localResponseGroup[i] != null) {
                        writeStartElement(null, namespace, "ResponseGroup",
                            xmlWriter);

                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                localResponseGroup[i]));

                        xmlWriter.writeEndElement();
                    } else {
                        // we have to do nothing since minOccurs is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "ResponseGroup cannot be null!!");
            }
        }

        if (localSimilarityTypeTracker) {
            if (localSimilarityType == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SimilarityType cannot be null!!");
            }

            localSimilarityType.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "SimilarityType"), xmlWriter);
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
        public static SimilarityLookupRequest parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            SimilarityLookupRequest object = new SimilarityLookupRequest();

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

                        if (!"SimilarityLookupRequest".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (SimilarityLookupRequest) com.amazon.webservices.awsecommerceservice._2013_08_01.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list2 = new java.util.ArrayList();

                java.util.ArrayList list4 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "Condition").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Condition").equals(
                            reader.getName())) {
                    object.setCondition(com.amazon.webservices.awsecommerceservice._2013_08_01.Condition_type0.Factory.parse(
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
                            "ItemId").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "ItemId").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    list2.add(reader.getElementText());

                    //loop until we find a start element that is not part of this array
                    boolean loopDone2 = false;

                    while (!loopDone2) {
                        // Ensure we are at the EndElement
                        while (!reader.isEndElement()) {
                            reader.next();
                        }

                        // Step out of this element
                        reader.next();

                        // Step to next element event.
                        while (!reader.isStartElement() &&
                                !reader.isEndElement())
                            reader.next();

                        if (reader.isEndElement()) {
                            //two continuous end elements means we are exiting the xml structure
                            loopDone2 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                        "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                        "ItemId").equals(reader.getName())) {
                                list2.add(reader.getElementText());
                            } else {
                                loopDone2 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setItemId((java.lang.String[]) list2.toArray(
                            new java.lang.String[list2.size()]));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "MerchantId").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "MerchantId").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "MerchantId" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMerchantId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "ResponseGroup").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "ResponseGroup").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    list4.add(reader.getElementText());

                    //loop until we find a start element that is not part of this array
                    boolean loopDone4 = false;

                    while (!loopDone4) {
                        // Ensure we are at the EndElement
                        while (!reader.isEndElement()) {
                            reader.next();
                        }

                        // Step out of this element
                        reader.next();

                        // Step to next element event.
                        while (!reader.isStartElement() &&
                                !reader.isEndElement())
                            reader.next();

                        if (reader.isEndElement()) {
                            //two continuous end elements means we are exiting the xml structure
                            loopDone4 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                        "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                        "ResponseGroup").equals(
                                        reader.getName())) {
                                list4.add(reader.getElementText());
                            } else {
                                loopDone4 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setResponseGroup((java.lang.String[]) list4.toArray(
                            new java.lang.String[list4.size()]));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "SimilarityType").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "SimilarityType").equals(
                            reader.getName())) {
                    object.setSimilarityType(com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarityType_type1.Factory.parse(
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
