/**
 * TopItem_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package com.amazon.webservices.awsecommerceservice._2013_08_01;


/**
 *  TopItem_type0 bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class TopItem_type0 implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = TopItem_type0
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
     * field for Title
     */
    protected java.lang.String localTitle;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTitleTracker = false;

    /**
     * field for DetailPageURL
     */
    protected java.lang.String localDetailPageURL;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDetailPageURLTracker = false;

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
     * field for Author
     * This was an Array!
     */
    protected java.lang.String[] localAuthor;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAuthorTracker = false;

    /**
     * field for Artist
     * This was an Array!
     */
    protected java.lang.String[] localArtist;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localArtistTracker = false;

    /**
     * field for Actor
     * This was an Array!
     */
    protected java.lang.String[] localActor;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localActorTracker = false;

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

    public boolean isDetailPageURLSpecified() {
        return localDetailPageURLTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDetailPageURL() {
        return localDetailPageURL;
    }

    /**
     * Auto generated setter method
     * @param param DetailPageURL
     */
    public void setDetailPageURL(java.lang.String param) {
        localDetailPageURLTracker = param != null;

        this.localDetailPageURL = param;
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

    public boolean isAuthorSpecified() {
        return localAuthorTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String[]
     */
    public java.lang.String[] getAuthor() {
        return localAuthor;
    }

    /**
     * validate the array for Author
     */
    protected void validateAuthor(java.lang.String[] param) {
    }

    /**
     * Auto generated setter method
     * @param param Author
     */
    public void setAuthor(java.lang.String[] param) {
        validateAuthor(param);

        localAuthorTracker = param != null;

        this.localAuthor = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param java.lang.String
     */
    public void addAuthor(java.lang.String param) {
        if (localAuthor == null) {
            localAuthor = new java.lang.String[] {  };
        }

        //update the setting tracker
        localAuthorTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localAuthor);
        list.add(param);
        this.localAuthor = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
    }

    public boolean isArtistSpecified() {
        return localArtistTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String[]
     */
    public java.lang.String[] getArtist() {
        return localArtist;
    }

    /**
     * validate the array for Artist
     */
    protected void validateArtist(java.lang.String[] param) {
    }

    /**
     * Auto generated setter method
     * @param param Artist
     */
    public void setArtist(java.lang.String[] param) {
        validateArtist(param);

        localArtistTracker = param != null;

        this.localArtist = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param java.lang.String
     */
    public void addArtist(java.lang.String param) {
        if (localArtist == null) {
            localArtist = new java.lang.String[] {  };
        }

        //update the setting tracker
        localArtistTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localArtist);
        list.add(param);
        this.localArtist = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
    }

    public boolean isActorSpecified() {
        return localActorTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String[]
     */
    public java.lang.String[] getActor() {
        return localActor;
    }

    /**
     * validate the array for Actor
     */
    protected void validateActor(java.lang.String[] param) {
    }

    /**
     * Auto generated setter method
     * @param param Actor
     */
    public void setActor(java.lang.String[] param) {
        validateActor(param);

        localActorTracker = param != null;

        this.localActor = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param java.lang.String
     */
    public void addActor(java.lang.String param) {
        if (localActor == null) {
            localActor = new java.lang.String[] {  };
        }

        //update the setting tracker
        localActorTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localActor);
        list.add(param);
        this.localActor = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
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
                    namespacePrefix + ":TopItem_type0", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "TopItem_type0", xmlWriter);
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

        if (localDetailPageURLTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "DetailPageURL", xmlWriter);

            if (localDetailPageURL == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "DetailPageURL cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDetailPageURL);
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

        if (localAuthorTracker) {
            if (localAuthor != null) {
                namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";

                for (int i = 0; i < localAuthor.length; i++) {
                    if (localAuthor[i] != null) {
                        writeStartElement(null, namespace, "Author", xmlWriter);

                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                localAuthor[i]));

                        xmlWriter.writeEndElement();
                    } else {
                        // we have to do nothing since minOccurs is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "Author cannot be null!!");
            }
        }

        if (localArtistTracker) {
            if (localArtist != null) {
                namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";

                for (int i = 0; i < localArtist.length; i++) {
                    if (localArtist[i] != null) {
                        writeStartElement(null, namespace, "Artist", xmlWriter);

                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                localArtist[i]));

                        xmlWriter.writeEndElement();
                    } else {
                        // we have to do nothing since minOccurs is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "Artist cannot be null!!");
            }
        }

        if (localActorTracker) {
            if (localActor != null) {
                namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";

                for (int i = 0; i < localActor.length; i++) {
                    if (localActor[i] != null) {
                        writeStartElement(null, namespace, "Actor", xmlWriter);

                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                localActor[i]));

                        xmlWriter.writeEndElement();
                    } else {
                        // we have to do nothing since minOccurs is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "Actor cannot be null!!");
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
        public static TopItem_type0 parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            TopItem_type0 object = new TopItem_type0();

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

                        if (!"TopItem_type0".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (TopItem_type0) com.amazon.webservices.awsecommerceservice._2013_08_01.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list5 = new java.util.ArrayList();

                java.util.ArrayList list6 = new java.util.ArrayList();

                java.util.ArrayList list7 = new java.util.ArrayList();

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
                            "DetailPageURL").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "DetailPageURL").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "DetailPageURL" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDetailPageURL(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "Author").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Author").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    list5.add(reader.getElementText());

                    //loop until we find a start element that is not part of this array
                    boolean loopDone5 = false;

                    while (!loopDone5) {
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
                            loopDone5 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                        "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                        "Author").equals(reader.getName())) {
                                list5.add(reader.getElementText());
                            } else {
                                loopDone5 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setAuthor((java.lang.String[]) list5.toArray(
                            new java.lang.String[list5.size()]));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "Artist").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Artist").equals(
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
                                        "Artist").equals(reader.getName())) {
                                list6.add(reader.getElementText());
                            } else {
                                loopDone6 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setArtist((java.lang.String[]) list6.toArray(
                            new java.lang.String[list6.size()]));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "Actor").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Actor").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    list7.add(reader.getElementText());

                    //loop until we find a start element that is not part of this array
                    boolean loopDone7 = false;

                    while (!loopDone7) {
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
                            loopDone7 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                        "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                        "Actor").equals(reader.getName())) {
                                list7.add(reader.getElementText());
                            } else {
                                loopDone7 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setActor((java.lang.String[]) list7.toArray(
                            new java.lang.String[list7.size()]));
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
