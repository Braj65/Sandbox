/**
 * Variations_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package com.amazon.webservices.awsecommerceservice._2013_08_01;


/**
 *  Variations_type0 bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Variations_type0 implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Variations_type0
       Namespace URI = http://webservices.amazon.com/AWSECommerceService/2013-08-01
       Namespace Prefix = ns1
     */

    /**
     * field for TotalVariations
     */
    protected org.apache.axis2.databinding.types.NonNegativeInteger localTotalVariations;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTotalVariationsTracker = false;

    /**
     * field for TotalVariationPages
     */
    protected org.apache.axis2.databinding.types.NonNegativeInteger localTotalVariationPages;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTotalVariationPagesTracker = false;

    /**
     * field for VariationDimensions
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.VariationDimensions_type0 localVariationDimensions;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localVariationDimensionsTracker = false;

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

    public boolean isTotalVariationsSpecified() {
        return localTotalVariationsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.NonNegativeInteger
     */
    public org.apache.axis2.databinding.types.NonNegativeInteger getTotalVariations() {
        return localTotalVariations;
    }

    /**
     * Auto generated setter method
     * @param param TotalVariations
     */
    public void setTotalVariations(
        org.apache.axis2.databinding.types.NonNegativeInteger param) {
        localTotalVariationsTracker = param != null;

        this.localTotalVariations = param;
    }

    public boolean isTotalVariationPagesSpecified() {
        return localTotalVariationPagesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.NonNegativeInteger
     */
    public org.apache.axis2.databinding.types.NonNegativeInteger getTotalVariationPages() {
        return localTotalVariationPages;
    }

    /**
     * Auto generated setter method
     * @param param TotalVariationPages
     */
    public void setTotalVariationPages(
        org.apache.axis2.databinding.types.NonNegativeInteger param) {
        localTotalVariationPagesTracker = param != null;

        this.localTotalVariationPages = param;
    }

    public boolean isVariationDimensionsSpecified() {
        return localVariationDimensionsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.VariationDimensions_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.VariationDimensions_type0 getVariationDimensions() {
        return localVariationDimensions;
    }

    /**
     * Auto generated setter method
     * @param param VariationDimensions
     */
    public void setVariationDimensions(
        com.amazon.webservices.awsecommerceservice._2013_08_01.VariationDimensions_type0 param) {
        localVariationDimensionsTracker = param != null;

        this.localVariationDimensions = param;
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
                    namespacePrefix + ":Variations_type0", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Variations_type0", xmlWriter);
            }
        }

        if (localTotalVariationsTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "TotalVariations", xmlWriter);

            if (localTotalVariations == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "TotalVariations cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTotalVariations));
            }

            xmlWriter.writeEndElement();
        }

        if (localTotalVariationPagesTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "TotalVariationPages", xmlWriter);

            if (localTotalVariationPages == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "TotalVariationPages cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTotalVariationPages));
            }

            xmlWriter.writeEndElement();
        }

        if (localVariationDimensionsTracker) {
            if (localVariationDimensions == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "VariationDimensions cannot be null!!");
            }

            localVariationDimensions.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "VariationDimensions"), xmlWriter);
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
        public static Variations_type0 parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            Variations_type0 object = new Variations_type0();

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

                        if (!"Variations_type0".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Variations_type0) com.amazon.webservices.awsecommerceservice._2013_08_01.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list4 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "TotalVariations").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "TotalVariations").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "TotalVariations" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTotalVariations(org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
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
                            "TotalVariationPages").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "TotalVariationPages").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "TotalVariationPages" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTotalVariationPages(org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
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
                            "VariationDimensions").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "VariationDimensions").equals(
                            reader.getName())) {
                    object.setVariationDimensions(com.amazon.webservices.awsecommerceservice._2013_08_01.VariationDimensions_type0.Factory.parse(
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
                    list4.add(com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3.Factory.parse(
                            reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone4 = false;

                    while (!loopDone4) {
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
                            loopDone4 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                        "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                        "Item").equals(reader.getName())) {
                                list4.add(com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3.Factory.parse(
                                        reader));
                            } else {
                                loopDone4 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setItem((com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3.class,
                            list4));
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
