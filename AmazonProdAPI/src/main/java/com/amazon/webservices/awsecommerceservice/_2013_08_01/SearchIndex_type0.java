/**
 * SearchIndex_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package com.amazon.webservices.awsecommerceservice._2013_08_01;


/**
 *  SearchIndex_type0 bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class SearchIndex_type0 implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = SearchIndex_type0
       Namespace URI = http://webservices.amazon.com/AWSECommerceService/2013-08-01
       Namespace Prefix = ns1
     */

    /**
     * field for IndexName
     */
    protected java.lang.String localIndexName;

    /**
     * field for Results
     */
    protected org.apache.axis2.databinding.types.NonNegativeInteger localResults;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localResultsTracker = false;

    /**
     * field for Pages
     */
    protected org.apache.axis2.databinding.types.NonNegativeInteger localPages;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPagesTracker = false;

    /**
     * field for CorrectedQuery
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.CorrectedQuery_type0 localCorrectedQuery;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCorrectedQueryTracker = false;

    /**
     * field for RelevanceRank
     */
    protected org.apache.axis2.databinding.types.PositiveInteger localRelevanceRank;

    /**
     * field for ASIN
     * This was an Array!
     */
    protected java.lang.String[] localASIN;

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getIndexName() {
        return localIndexName;
    }

    /**
     * Auto generated setter method
     * @param param IndexName
     */
    public void setIndexName(java.lang.String param) {
        this.localIndexName = param;
    }

    public boolean isResultsSpecified() {
        return localResultsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.NonNegativeInteger
     */
    public org.apache.axis2.databinding.types.NonNegativeInteger getResults() {
        return localResults;
    }

    /**
     * Auto generated setter method
     * @param param Results
     */
    public void setResults(
        org.apache.axis2.databinding.types.NonNegativeInteger param) {
        localResultsTracker = param != null;

        this.localResults = param;
    }

    public boolean isPagesSpecified() {
        return localPagesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.NonNegativeInteger
     */
    public org.apache.axis2.databinding.types.NonNegativeInteger getPages() {
        return localPages;
    }

    /**
     * Auto generated setter method
     * @param param Pages
     */
    public void setPages(
        org.apache.axis2.databinding.types.NonNegativeInteger param) {
        localPagesTracker = param != null;

        this.localPages = param;
    }

    public boolean isCorrectedQuerySpecified() {
        return localCorrectedQueryTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.CorrectedQuery_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.CorrectedQuery_type0 getCorrectedQuery() {
        return localCorrectedQuery;
    }

    /**
     * Auto generated setter method
     * @param param CorrectedQuery
     */
    public void setCorrectedQuery(
        com.amazon.webservices.awsecommerceservice._2013_08_01.CorrectedQuery_type0 param) {
        localCorrectedQueryTracker = param != null;

        this.localCorrectedQuery = param;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.PositiveInteger
     */
    public org.apache.axis2.databinding.types.PositiveInteger getRelevanceRank() {
        return localRelevanceRank;
    }

    /**
     * Auto generated setter method
     * @param param RelevanceRank
     */
    public void setRelevanceRank(
        org.apache.axis2.databinding.types.PositiveInteger param) {
        this.localRelevanceRank = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String[]
     */
    public java.lang.String[] getASIN() {
        return localASIN;
    }

    /**
     * validate the array for ASIN
     */
    protected void validateASIN(java.lang.String[] param) {
        if ((param != null) && (param.length < 1)) {
            throw new java.lang.RuntimeException(
                "Input values do not follow defined XSD restrictions");
        }
    }

    /**
     * Auto generated setter method
     * @param param ASIN
     */
    public void setASIN(java.lang.String[] param) {
        validateASIN(param);

        this.localASIN = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param java.lang.String
     */
    public void addASIN(java.lang.String param) {
        if (localASIN == null) {
            localASIN = new java.lang.String[] {  };
        }

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localASIN);
        list.add(param);
        this.localASIN = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
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
                    namespacePrefix + ":SearchIndex_type0", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "SearchIndex_type0", xmlWriter);
            }
        }

        namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
        writeStartElement(null, namespace, "IndexName", xmlWriter);

        if (localIndexName == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                "IndexName cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localIndexName);
        }

        xmlWriter.writeEndElement();

        if (localResultsTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Results", xmlWriter);

            if (localResults == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Results cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localResults));
            }

            xmlWriter.writeEndElement();
        }

        if (localPagesTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Pages", xmlWriter);

            if (localPages == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Pages cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localPages));
            }

            xmlWriter.writeEndElement();
        }

        if (localCorrectedQueryTracker) {
            if (localCorrectedQuery == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "CorrectedQuery cannot be null!!");
            }

            localCorrectedQuery.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "CorrectedQuery"), xmlWriter);
        }

        namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
        writeStartElement(null, namespace, "RelevanceRank", xmlWriter);

        if (localRelevanceRank == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                "RelevanceRank cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localRelevanceRank));
        }

        xmlWriter.writeEndElement();

        if (localASIN != null) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";

            for (int i = 0; i < localASIN.length; i++) {
                if (localASIN[i] != null) {
                    writeStartElement(null, namespace, "ASIN", xmlWriter);

                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localASIN[i]));

                    xmlWriter.writeEndElement();
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "ASIN cannot be null!!");
                }
            }
        } else {
            throw new org.apache.axis2.databinding.ADBException(
                "ASIN cannot be null!!");
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
        public static SearchIndex_type0 parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            SearchIndex_type0 object = new SearchIndex_type0();

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

                        if (!"SearchIndex_type0".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (SearchIndex_type0) com.amazon.webservices.awsecommerceservice._2013_08_01.ExtensionMapper.getTypeObject(nsUri,
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
                            "IndexName").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "IndexName").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "IndexName" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setIndexName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "Results").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Results").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Results" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setResults(org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
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
                            "Pages").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Pages").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Pages" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPages(org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
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
                            "CorrectedQuery").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "CorrectedQuery").equals(
                            reader.getName())) {
                    object.setCorrectedQuery(com.amazon.webservices.awsecommerceservice._2013_08_01.CorrectedQuery_type0.Factory.parse(
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
                            "RelevanceRank").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "RelevanceRank").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "RelevanceRank" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRelevanceRank(org.apache.axis2.databinding.utils.ConverterUtil.convertToPositiveInteger(
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
                    // Process the array and step past its final element's end.
                    list6.add(reader.getElementText());

                    //loop until we find a start element that is not part of this array
                    boolean loopDone6 = false;

                    while (!loopDone6) {
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
                            loopDone6 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                        "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                        "ASIN").equals(reader.getName())) {
                                list6.add(reader.getElementText());
                            } else {
                                loopDone6 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setASIN((java.lang.String[]) list6.toArray(
                            new java.lang.String[list6.size()]));
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
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
