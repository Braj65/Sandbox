/**
 * Cart_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package com.amazon.webservices.awsecommerceservice._2013_08_01;


/**
 *  Cart_type0 bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Cart_type0 implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Cart_type0
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
     * field for CartId
     */
    protected java.lang.String localCartId;

    /**
     * field for HMAC
     */
    protected java.lang.String localHMAC;

    /**
     * field for URLEncodedHMAC
     */
    protected java.lang.String localURLEncodedHMAC;

    /**
     * field for PurchaseURL
     */
    protected java.lang.String localPurchaseURL;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPurchaseURLTracker = false;

    /**
     * field for MobileCartURL
     */
    protected java.lang.String localMobileCartURL;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMobileCartURLTracker = false;

    /**
     * field for SubTotal
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Price localSubTotal;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSubTotalTracker = false;

    /**
     * field for CartItems
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.CartItems_type0 localCartItems;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCartItemsTracker = false;

    /**
     * field for SavedForLaterItems
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.SavedForLaterItems_type0 localSavedForLaterItems;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSavedForLaterItemsTracker = false;

    /**
     * field for SimilarProducts
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarProducts_type0 localSimilarProducts;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSimilarProductsTracker = false;

    /**
     * field for TopSellers
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.TopSellers_type0 localTopSellers;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTopSellersTracker = false;

    /**
     * field for NewReleases
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.NewReleases_type0 localNewReleases;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNewReleasesTracker = false;

    /**
     * field for SimilarViewedProducts
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarViewedProducts_type0 localSimilarViewedProducts;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSimilarViewedProductsTracker = false;

    /**
     * field for OtherCategoriesSimilarProducts
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.OtherCategoriesSimilarProducts_type0 localOtherCategoriesSimilarProducts;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOtherCategoriesSimilarProductsTracker = false;

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

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCartId() {
        return localCartId;
    }

    /**
     * Auto generated setter method
     * @param param CartId
     */
    public void setCartId(java.lang.String param) {
        this.localCartId = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getHMAC() {
        return localHMAC;
    }

    /**
     * Auto generated setter method
     * @param param HMAC
     */
    public void setHMAC(java.lang.String param) {
        this.localHMAC = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getURLEncodedHMAC() {
        return localURLEncodedHMAC;
    }

    /**
     * Auto generated setter method
     * @param param URLEncodedHMAC
     */
    public void setURLEncodedHMAC(java.lang.String param) {
        this.localURLEncodedHMAC = param;
    }

    public boolean isPurchaseURLSpecified() {
        return localPurchaseURLTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPurchaseURL() {
        return localPurchaseURL;
    }

    /**
     * Auto generated setter method
     * @param param PurchaseURL
     */
    public void setPurchaseURL(java.lang.String param) {
        localPurchaseURLTracker = param != null;

        this.localPurchaseURL = param;
    }

    public boolean isMobileCartURLSpecified() {
        return localMobileCartURLTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMobileCartURL() {
        return localMobileCartURL;
    }

    /**
     * Auto generated setter method
     * @param param MobileCartURL
     */
    public void setMobileCartURL(java.lang.String param) {
        localMobileCartURLTracker = param != null;

        this.localMobileCartURL = param;
    }

    public boolean isSubTotalSpecified() {
        return localSubTotalTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Price
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Price getSubTotal() {
        return localSubTotal;
    }

    /**
     * Auto generated setter method
     * @param param SubTotal
     */
    public void setSubTotal(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Price param) {
        localSubTotalTracker = param != null;

        this.localSubTotal = param;
    }

    public boolean isCartItemsSpecified() {
        return localCartItemsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.CartItems_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.CartItems_type0 getCartItems() {
        return localCartItems;
    }

    /**
     * Auto generated setter method
     * @param param CartItems
     */
    public void setCartItems(
        com.amazon.webservices.awsecommerceservice._2013_08_01.CartItems_type0 param) {
        localCartItemsTracker = param != null;

        this.localCartItems = param;
    }

    public boolean isSavedForLaterItemsSpecified() {
        return localSavedForLaterItemsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.SavedForLaterItems_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.SavedForLaterItems_type0 getSavedForLaterItems() {
        return localSavedForLaterItems;
    }

    /**
     * Auto generated setter method
     * @param param SavedForLaterItems
     */
    public void setSavedForLaterItems(
        com.amazon.webservices.awsecommerceservice._2013_08_01.SavedForLaterItems_type0 param) {
        localSavedForLaterItemsTracker = param != null;

        this.localSavedForLaterItems = param;
    }

    public boolean isSimilarProductsSpecified() {
        return localSimilarProductsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarProducts_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarProducts_type0 getSimilarProducts() {
        return localSimilarProducts;
    }

    /**
     * Auto generated setter method
     * @param param SimilarProducts
     */
    public void setSimilarProducts(
        com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarProducts_type0 param) {
        localSimilarProductsTracker = param != null;

        this.localSimilarProducts = param;
    }

    public boolean isTopSellersSpecified() {
        return localTopSellersTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.TopSellers_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.TopSellers_type0 getTopSellers() {
        return localTopSellers;
    }

    /**
     * Auto generated setter method
     * @param param TopSellers
     */
    public void setTopSellers(
        com.amazon.webservices.awsecommerceservice._2013_08_01.TopSellers_type0 param) {
        localTopSellersTracker = param != null;

        this.localTopSellers = param;
    }

    public boolean isNewReleasesSpecified() {
        return localNewReleasesTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.NewReleases_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.NewReleases_type0 getNewReleases() {
        return localNewReleases;
    }

    /**
     * Auto generated setter method
     * @param param NewReleases
     */
    public void setNewReleases(
        com.amazon.webservices.awsecommerceservice._2013_08_01.NewReleases_type0 param) {
        localNewReleasesTracker = param != null;

        this.localNewReleases = param;
    }

    public boolean isSimilarViewedProductsSpecified() {
        return localSimilarViewedProductsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarViewedProducts_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarViewedProducts_type0 getSimilarViewedProducts() {
        return localSimilarViewedProducts;
    }

    /**
     * Auto generated setter method
     * @param param SimilarViewedProducts
     */
    public void setSimilarViewedProducts(
        com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarViewedProducts_type0 param) {
        localSimilarViewedProductsTracker = param != null;

        this.localSimilarViewedProducts = param;
    }

    public boolean isOtherCategoriesSimilarProductsSpecified() {
        return localOtherCategoriesSimilarProductsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.OtherCategoriesSimilarProducts_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.OtherCategoriesSimilarProducts_type0 getOtherCategoriesSimilarProducts() {
        return localOtherCategoriesSimilarProducts;
    }

    /**
     * Auto generated setter method
     * @param param OtherCategoriesSimilarProducts
     */
    public void setOtherCategoriesSimilarProducts(
        com.amazon.webservices.awsecommerceservice._2013_08_01.OtherCategoriesSimilarProducts_type0 param) {
        localOtherCategoriesSimilarProductsTracker = param != null;

        this.localOtherCategoriesSimilarProducts = param;
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
                    namespacePrefix + ":Cart_type0", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Cart_type0", xmlWriter);
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

        namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
        writeStartElement(null, namespace, "CartId", xmlWriter);

        if (localCartId == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                "CartId cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localCartId);
        }

        xmlWriter.writeEndElement();

        namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
        writeStartElement(null, namespace, "HMAC", xmlWriter);

        if (localHMAC == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                "HMAC cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localHMAC);
        }

        xmlWriter.writeEndElement();

        namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
        writeStartElement(null, namespace, "URLEncodedHMAC", xmlWriter);

        if (localURLEncodedHMAC == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                "URLEncodedHMAC cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localURLEncodedHMAC);
        }

        xmlWriter.writeEndElement();

        if (localPurchaseURLTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "PurchaseURL", xmlWriter);

            if (localPurchaseURL == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "PurchaseURL cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPurchaseURL);
            }

            xmlWriter.writeEndElement();
        }

        if (localMobileCartURLTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "MobileCartURL", xmlWriter);

            if (localMobileCartURL == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "MobileCartURL cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localMobileCartURL);
            }

            xmlWriter.writeEndElement();
        }

        if (localSubTotalTracker) {
            if (localSubTotal == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SubTotal cannot be null!!");
            }

            localSubTotal.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "SubTotal"), xmlWriter);
        }

        if (localCartItemsTracker) {
            if (localCartItems == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "CartItems cannot be null!!");
            }

            localCartItems.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "CartItems"), xmlWriter);
        }

        if (localSavedForLaterItemsTracker) {
            if (localSavedForLaterItems == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SavedForLaterItems cannot be null!!");
            }

            localSavedForLaterItems.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "SavedForLaterItems"), xmlWriter);
        }

        if (localSimilarProductsTracker) {
            if (localSimilarProducts == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SimilarProducts cannot be null!!");
            }

            localSimilarProducts.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "SimilarProducts"), xmlWriter);
        }

        if (localTopSellersTracker) {
            if (localTopSellers == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "TopSellers cannot be null!!");
            }

            localTopSellers.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "TopSellers"), xmlWriter);
        }

        if (localNewReleasesTracker) {
            if (localNewReleases == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "NewReleases cannot be null!!");
            }

            localNewReleases.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "NewReleases"), xmlWriter);
        }

        if (localSimilarViewedProductsTracker) {
            if (localSimilarViewedProducts == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SimilarViewedProducts cannot be null!!");
            }

            localSimilarViewedProducts.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "SimilarViewedProducts"), xmlWriter);
        }

        if (localOtherCategoriesSimilarProductsTracker) {
            if (localOtherCategoriesSimilarProducts == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "OtherCategoriesSimilarProducts cannot be null!!");
            }

            localOtherCategoriesSimilarProducts.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "OtherCategoriesSimilarProducts"), xmlWriter);
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
        public static Cart_type0 parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Cart_type0 object = new Cart_type0();

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

                        if (!"Cart_type0".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Cart_type0) com.amazon.webservices.awsecommerceservice._2013_08_01.ExtensionMapper.getTypeObject(nsUri,
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
                            "CartId").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "CartId").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "CartId" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCartId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "HMAC").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "HMAC").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "HMAC" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setHMAC(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "URLEncodedHMAC").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "URLEncodedHMAC").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "URLEncodedHMAC" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setURLEncodedHMAC(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "PurchaseURL").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "PurchaseURL").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "PurchaseURL" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPurchaseURL(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "MobileCartURL").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "MobileCartURL").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "MobileCartURL" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMobileCartURL(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "SubTotal").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "SubTotal").equals(
                            reader.getName())) {
                    object.setSubTotal(com.amazon.webservices.awsecommerceservice._2013_08_01.Price.Factory.parse(
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
                            "CartItems").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "CartItems").equals(
                            reader.getName())) {
                    object.setCartItems(com.amazon.webservices.awsecommerceservice._2013_08_01.CartItems_type0.Factory.parse(
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
                            "SavedForLaterItems").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "SavedForLaterItems").equals(
                            reader.getName())) {
                    object.setSavedForLaterItems(com.amazon.webservices.awsecommerceservice._2013_08_01.SavedForLaterItems_type0.Factory.parse(
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
                            "SimilarProducts").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "SimilarProducts").equals(
                            reader.getName())) {
                    object.setSimilarProducts(com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarProducts_type0.Factory.parse(
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
                            "TopSellers").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "TopSellers").equals(
                            reader.getName())) {
                    object.setTopSellers(com.amazon.webservices.awsecommerceservice._2013_08_01.TopSellers_type0.Factory.parse(
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
                            "NewReleases").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "NewReleases").equals(
                            reader.getName())) {
                    object.setNewReleases(com.amazon.webservices.awsecommerceservice._2013_08_01.NewReleases_type0.Factory.parse(
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
                            "SimilarViewedProducts").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "SimilarViewedProducts").equals(reader.getName())) {
                    object.setSimilarViewedProducts(com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarViewedProducts_type0.Factory.parse(
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
                            "OtherCategoriesSimilarProducts").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "OtherCategoriesSimilarProducts").equals(
                            reader.getName())) {
                    object.setOtherCategoriesSimilarProducts(com.amazon.webservices.awsecommerceservice._2013_08_01.OtherCategoriesSimilarProducts_type0.Factory.parse(
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
