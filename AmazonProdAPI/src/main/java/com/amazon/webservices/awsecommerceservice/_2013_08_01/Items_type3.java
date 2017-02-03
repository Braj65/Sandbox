/**
 * Items_type3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package com.amazon.webservices.awsecommerceservice._2013_08_01;


/**
 *  Items_type3 bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Items_type3 implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Items_type3
       Namespace URI = http://webservices.amazon.com/AWSECommerceService/2013-08-01
       Namespace Prefix = ns1
     */

    /**
     * field for Request
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Request_type0 localRequest;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRequestTracker = false;

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
     * field for Qid
     */
    protected java.lang.String localQid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localQidTracker = false;

    /**
     * field for EngineQuery
     */
    protected java.lang.String localEngineQuery;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEngineQueryTracker = false;

    /**
     * field for TotalResults
     */
    protected org.apache.axis2.databinding.types.NonNegativeInteger localTotalResults;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTotalResultsTracker = false;

    /**
     * field for TotalPages
     */
    protected org.apache.axis2.databinding.types.NonNegativeInteger localTotalPages;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTotalPagesTracker = false;

    /**
     * field for MoreSearchResultsUrl
     */
    protected java.lang.String localMoreSearchResultsUrl;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMoreSearchResultsUrlTracker = false;

    /**
     * field for SearchResultsMap
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.SearchResultsMap_type0 localSearchResultsMap;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSearchResultsMapTracker = false;

    /**
     * field for Item
     * This was an Array!
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3[] localItem;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localItemTracker = false;

    /**
     * field for SearchBinSets
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.SearchBinSets_type0 localSearchBinSets;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSearchBinSetsTracker = false;

    public boolean isRequestSpecified() {
        return localRequestTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Request_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Request_type0 getRequest() {
        return localRequest;
    }

    /**
     * Auto generated setter method
     * @param param Request
     */
    public void setRequest(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Request_type0 param) {
        localRequestTracker = param != null;

        this.localRequest = param;
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

    public boolean isQidSpecified() {
        return localQidTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getQid() {
        return localQid;
    }

    /**
     * Auto generated setter method
     * @param param Qid
     */
    public void setQid(java.lang.String param) {
        localQidTracker = param != null;

        this.localQid = param;
    }

    public boolean isEngineQuerySpecified() {
        return localEngineQueryTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEngineQuery() {
        return localEngineQuery;
    }

    /**
     * Auto generated setter method
     * @param param EngineQuery
     */
    public void setEngineQuery(java.lang.String param) {
        localEngineQueryTracker = param != null;

        this.localEngineQuery = param;
    }

    public boolean isTotalResultsSpecified() {
        return localTotalResultsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.NonNegativeInteger
     */
    public org.apache.axis2.databinding.types.NonNegativeInteger getTotalResults() {
        return localTotalResults;
    }

    /**
     * Auto generated setter method
     * @param param TotalResults
     */
    public void setTotalResults(
        org.apache.axis2.databinding.types.NonNegativeInteger param) {
        localTotalResultsTracker = param != null;

        this.localTotalResults = param;
    }

    public boolean isTotalPagesSpecified() {
        return localTotalPagesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.NonNegativeInteger
     */
    public org.apache.axis2.databinding.types.NonNegativeInteger getTotalPages() {
        return localTotalPages;
    }

    /**
     * Auto generated setter method
     * @param param TotalPages
     */
    public void setTotalPages(
        org.apache.axis2.databinding.types.NonNegativeInteger param) {
        localTotalPagesTracker = param != null;

        this.localTotalPages = param;
    }

    public boolean isMoreSearchResultsUrlSpecified() {
        return localMoreSearchResultsUrlTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMoreSearchResultsUrl() {
        return localMoreSearchResultsUrl;
    }

    /**
     * Auto generated setter method
     * @param param MoreSearchResultsUrl
     */
    public void setMoreSearchResultsUrl(java.lang.String param) {
        localMoreSearchResultsUrlTracker = param != null;

        this.localMoreSearchResultsUrl = param;
    }

    public boolean isSearchResultsMapSpecified() {
        return localSearchResultsMapTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.SearchResultsMap_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.SearchResultsMap_type0 getSearchResultsMap() {
        return localSearchResultsMap;
    }

    /**
     * Auto generated setter method
     * @param param SearchResultsMap
     */
    public void setSearchResultsMap(
        com.amazon.webservices.awsecommerceservice._2013_08_01.SearchResultsMap_type0 param) {
        localSearchResultsMapTracker = param != null;

        this.localSearchResultsMap = param;
    }

    public boolean isItemSpecified() {
        return localItemTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3[]
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3[] getItem() {
        return localItem;
    }

    /**
     * validate the array for Item
     */
    protected void validateItem(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3[] param) {
    }

    /**
     * Auto generated setter method
     * @param param Item
     */
    public void setItem(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3[] param) {
        validateItem(param);

        localItemTracker = param != null;

        this.localItem = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3
     */
    public void addItem(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3 param) {
        if (localItem == null) {
            localItem = new com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3[] {
                    
                };
        }

        //update the setting tracker
        localItemTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localItem);
        list.add(param);
        this.localItem = (com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3[]) list.toArray(new com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3[list.size()]);
    }

    public boolean isSearchBinSetsSpecified() {
        return localSearchBinSetsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.SearchBinSets_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.SearchBinSets_type0 getSearchBinSets() {
        return localSearchBinSets;
    }

    /**
     * Auto generated setter method
     * @param param SearchBinSets
     */
    public void setSearchBinSets(
        com.amazon.webservices.awsecommerceservice._2013_08_01.SearchBinSets_type0 param) {
        localSearchBinSetsTracker = param != null;

        this.localSearchBinSets = param;
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
                    namespacePrefix + ":Items_type3", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Items_type3", xmlWriter);
            }
        }

        if (localRequestTracker) {
            if (localRequest == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Request cannot be null!!");
            }

            localRequest.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "Request"), xmlWriter);
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

        if (localQidTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Qid", xmlWriter);

            if (localQid == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Qid cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localQid);
            }

            xmlWriter.writeEndElement();
        }

        if (localEngineQueryTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "EngineQuery", xmlWriter);

            if (localEngineQuery == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "EngineQuery cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localEngineQuery);
            }

            xmlWriter.writeEndElement();
        }

        if (localTotalResultsTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "TotalResults", xmlWriter);

            if (localTotalResults == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "TotalResults cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTotalResults));
            }

            xmlWriter.writeEndElement();
        }

        if (localTotalPagesTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "TotalPages", xmlWriter);

            if (localTotalPages == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "TotalPages cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTotalPages));
            }

            xmlWriter.writeEndElement();
        }

        if (localMoreSearchResultsUrlTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "MoreSearchResultsUrl", xmlWriter);

            if (localMoreSearchResultsUrl == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "MoreSearchResultsUrl cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localMoreSearchResultsUrl);
            }

            xmlWriter.writeEndElement();
        }

        if (localSearchResultsMapTracker) {
            if (localSearchResultsMap == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SearchResultsMap cannot be null!!");
            }

            localSearchResultsMap.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "SearchResultsMap"), xmlWriter);
        }

        if (localItemTracker) {
            if (localItem != null) {
                for (int i = 0; i < localItem.length; i++) {
                    if (localItem[i] != null) {
                        localItem[i].serialize(new javax.xml.namespace.QName(
                                "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                "Item"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "Item cannot be null!!");
            }
        }

        if (localSearchBinSetsTracker) {
            if (localSearchBinSets == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SearchBinSets cannot be null!!");
            }

            localSearchBinSets.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "SearchBinSets"), xmlWriter);
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
        public static Items_type3 parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Items_type3 object = new Items_type3();

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

                        if (!"Items_type3".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Items_type3) com.amazon.webservices.awsecommerceservice._2013_08_01.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list9 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "Request").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Request").equals(
                            reader.getName())) {
                    object.setRequest(com.amazon.webservices.awsecommerceservice._2013_08_01.Request_type0.Factory.parse(
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
                            "Qid").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Qid").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Qid" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setQid(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "EngineQuery").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "EngineQuery").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "EngineQuery" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setEngineQuery(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "TotalResults").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "TotalResults").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "TotalResults" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTotalResults(org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
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
                            "TotalPages").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "TotalPages").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "TotalPages" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTotalPages(org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
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
                            "MoreSearchResultsUrl").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "MoreSearchResultsUrl").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "MoreSearchResultsUrl" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMoreSearchResultsUrl(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "SearchResultsMap").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "SearchResultsMap").equals(
                            reader.getName())) {
                    object.setSearchResultsMap(com.amazon.webservices.awsecommerceservice._2013_08_01.SearchResultsMap_type0.Factory.parse(
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
                            "Item").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Item").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    list9.add(com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3.Factory.parse(
                            reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone9 = false;

                    while (!loopDone9) {
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
                            loopDone9 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                        "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                        "Item").equals(reader.getName())) {
                                list9.add(com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3.Factory.parse(
                                        reader));
                            } else {
                                loopDone9 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setItem((com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3.class,
                            list9));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "SearchBinSets").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "SearchBinSets").equals(
                            reader.getName())) {
                    object.setSearchBinSets(com.amazon.webservices.awsecommerceservice._2013_08_01.SearchBinSets_type0.Factory.parse(
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
