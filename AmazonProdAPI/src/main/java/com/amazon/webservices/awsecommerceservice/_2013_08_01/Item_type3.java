/**
 * Item_type3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package com.amazon.webservices.awsecommerceservice._2013_08_01;


/**
 *  Item_type3 bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Item_type3 implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Item_type3
       Namespace URI = http://webservices.amazon.com/AWSECommerceService/2013-08-01
       Namespace Prefix = ns1
     */

    /**
     * field for ASIN
     */
    protected java.lang.String localASIN;

    /**
     * field for ParentASIN
     */
    protected java.lang.String localParentASIN;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localParentASINTracker = false;

    /**
     * field for Errors
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Errors_type0 localErrors;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localErrorsTracker = false;

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
     * field for ItemLinks
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.ItemLinks_type0 localItemLinks;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localItemLinksTracker = false;

    /**
     * field for SalesRank
     */
    protected java.lang.String localSalesRank;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSalesRankTracker = false;

    /**
     * field for SmallImage
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Image localSmallImage;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSmallImageTracker = false;

    /**
     * field for MediumImage
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Image localMediumImage;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMediumImageTracker = false;

    /**
     * field for LargeImage
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Image localLargeImage;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLargeImageTracker = false;

    /**
     * field for ImageSets
     * This was an Array!
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.ImageSets_type0[] localImageSets;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localImageSetsTracker = false;

    /**
     * field for ItemAttributes
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.ItemAttributes_type0 localItemAttributes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localItemAttributesTracker = false;

    /**
     * field for VariationAttributes
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.VariationAttributes_type0 localVariationAttributes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localVariationAttributesTracker = false;

    /**
     * field for RelatedItems
     * This was an Array!
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItems_type0[] localRelatedItems;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRelatedItemsTracker = false;

    /**
     * field for Collections
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Collections_type0 localCollections;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCollectionsTracker = false;

    /**
     * field for Subjects
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Subjects_type0 localSubjects;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSubjectsTracker = false;

    /**
     * field for OfferSummary
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.OfferSummary_type0 localOfferSummary;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOfferSummaryTracker = false;

    /**
     * field for Offers
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Offers_type0 localOffers;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOffersTracker = false;

    /**
     * field for RentalOffers
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.RentalOffers_type0 localRentalOffers;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRentalOffersTracker = false;

    /**
     * field for VariationSummary
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.VariationSummary_type0 localVariationSummary;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localVariationSummaryTracker = false;

    /**
     * field for Variations
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Variations_type0 localVariations;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localVariationsTracker = false;

    /**
     * field for CustomerReviews
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.CustomerReviews_type0 localCustomerReviews;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCustomerReviewsTracker = false;

    /**
     * field for EditorialReviews
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.EditorialReviews_type0 localEditorialReviews;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEditorialReviewsTracker = false;

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
     * field for Accessories
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Accessories_type0 localAccessories;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAccessoriesTracker = false;

    /**
     * field for Tracks
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Tracks_type0 localTracks;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTracksTracker = false;

    /**
     * field for BrowseNodes
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodes_type0 localBrowseNodes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBrowseNodesTracker = false;

    /**
     * field for AlternateVersions
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.AlternateVersions_type0 localAlternateVersions;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAlternateVersionsTracker = false;

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
        this.localASIN = param;
    }

    public boolean isParentASINSpecified() {
        return localParentASINTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getParentASIN() {
        return localParentASIN;
    }

    /**
     * Auto generated setter method
     * @param param ParentASIN
     */
    public void setParentASIN(java.lang.String param) {
        localParentASINTracker = param != null;

        this.localParentASIN = param;
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

    public boolean isItemLinksSpecified() {
        return localItemLinksTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.ItemLinks_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.ItemLinks_type0 getItemLinks() {
        return localItemLinks;
    }

    /**
     * Auto generated setter method
     * @param param ItemLinks
     */
    public void setItemLinks(
        com.amazon.webservices.awsecommerceservice._2013_08_01.ItemLinks_type0 param) {
        localItemLinksTracker = param != null;

        this.localItemLinks = param;
    }

    public boolean isSalesRankSpecified() {
        return localSalesRankTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSalesRank() {
        return localSalesRank;
    }

    /**
     * Auto generated setter method
     * @param param SalesRank
     */
    public void setSalesRank(java.lang.String param) {
        localSalesRankTracker = param != null;

        this.localSalesRank = param;
    }

    public boolean isSmallImageSpecified() {
        return localSmallImageTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Image
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Image getSmallImage() {
        return localSmallImage;
    }

    /**
     * Auto generated setter method
     * @param param SmallImage
     */
    public void setSmallImage(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Image param) {
        localSmallImageTracker = param != null;

        this.localSmallImage = param;
    }

    public boolean isMediumImageSpecified() {
        return localMediumImageTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Image
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Image getMediumImage() {
        return localMediumImage;
    }

    /**
     * Auto generated setter method
     * @param param MediumImage
     */
    public void setMediumImage(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Image param) {
        localMediumImageTracker = param != null;

        this.localMediumImage = param;
    }

    public boolean isLargeImageSpecified() {
        return localLargeImageTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Image
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Image getLargeImage() {
        return localLargeImage;
    }

    /**
     * Auto generated setter method
     * @param param LargeImage
     */
    public void setLargeImage(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Image param) {
        localLargeImageTracker = param != null;

        this.localLargeImage = param;
    }

    public boolean isImageSetsSpecified() {
        return localImageSetsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.ImageSets_type0[]
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.ImageSets_type0[] getImageSets() {
        return localImageSets;
    }

    /**
     * validate the array for ImageSets
     */
    protected void validateImageSets(
        com.amazon.webservices.awsecommerceservice._2013_08_01.ImageSets_type0[] param) {
    }

    /**
     * Auto generated setter method
     * @param param ImageSets
     */
    public void setImageSets(
        com.amazon.webservices.awsecommerceservice._2013_08_01.ImageSets_type0[] param) {
        validateImageSets(param);

        localImageSetsTracker = param != null;

        this.localImageSets = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param com.amazon.webservices.awsecommerceservice._2013_08_01.ImageSets_type0
     */
    public void addImageSets(
        com.amazon.webservices.awsecommerceservice._2013_08_01.ImageSets_type0 param) {
        if (localImageSets == null) {
            localImageSets = new com.amazon.webservices.awsecommerceservice._2013_08_01.ImageSets_type0[] {
                    
                };
        }

        //update the setting tracker
        localImageSetsTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localImageSets);
        list.add(param);
        this.localImageSets = (com.amazon.webservices.awsecommerceservice._2013_08_01.ImageSets_type0[]) list.toArray(new com.amazon.webservices.awsecommerceservice._2013_08_01.ImageSets_type0[list.size()]);
    }

    public boolean isItemAttributesSpecified() {
        return localItemAttributesTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.ItemAttributes_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.ItemAttributes_type0 getItemAttributes() {
        return localItemAttributes;
    }

    /**
     * Auto generated setter method
     * @param param ItemAttributes
     */
    public void setItemAttributes(
        com.amazon.webservices.awsecommerceservice._2013_08_01.ItemAttributes_type0 param) {
        localItemAttributesTracker = param != null;

        this.localItemAttributes = param;
    }

    public boolean isVariationAttributesSpecified() {
        return localVariationAttributesTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.VariationAttributes_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.VariationAttributes_type0 getVariationAttributes() {
        return localVariationAttributes;
    }

    /**
     * Auto generated setter method
     * @param param VariationAttributes
     */
    public void setVariationAttributes(
        com.amazon.webservices.awsecommerceservice._2013_08_01.VariationAttributes_type0 param) {
        localVariationAttributesTracker = param != null;

        this.localVariationAttributes = param;
    }

    public boolean isRelatedItemsSpecified() {
        return localRelatedItemsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItems_type0[]
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItems_type0[] getRelatedItems() {
        return localRelatedItems;
    }

    /**
     * validate the array for RelatedItems
     */
    protected void validateRelatedItems(
        com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItems_type0[] param) {
    }

    /**
     * Auto generated setter method
     * @param param RelatedItems
     */
    public void setRelatedItems(
        com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItems_type0[] param) {
        validateRelatedItems(param);

        localRelatedItemsTracker = param != null;

        this.localRelatedItems = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItems_type0
     */
    public void addRelatedItems(
        com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItems_type0 param) {
        if (localRelatedItems == null) {
            localRelatedItems = new com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItems_type0[] {
                    
                };
        }

        //update the setting tracker
        localRelatedItemsTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localRelatedItems);
        list.add(param);
        this.localRelatedItems = (com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItems_type0[]) list.toArray(new com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItems_type0[list.size()]);
    }

    public boolean isCollectionsSpecified() {
        return localCollectionsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Collections_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Collections_type0 getCollections() {
        return localCollections;
    }

    /**
     * Auto generated setter method
     * @param param Collections
     */
    public void setCollections(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Collections_type0 param) {
        localCollectionsTracker = param != null;

        this.localCollections = param;
    }

    public boolean isSubjectsSpecified() {
        return localSubjectsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Subjects_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Subjects_type0 getSubjects() {
        return localSubjects;
    }

    /**
     * Auto generated setter method
     * @param param Subjects
     */
    public void setSubjects(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Subjects_type0 param) {
        localSubjectsTracker = param != null;

        this.localSubjects = param;
    }

    public boolean isOfferSummarySpecified() {
        return localOfferSummaryTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.OfferSummary_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.OfferSummary_type0 getOfferSummary() {
        return localOfferSummary;
    }

    /**
     * Auto generated setter method
     * @param param OfferSummary
     */
    public void setOfferSummary(
        com.amazon.webservices.awsecommerceservice._2013_08_01.OfferSummary_type0 param) {
        localOfferSummaryTracker = param != null;

        this.localOfferSummary = param;
    }

    public boolean isOffersSpecified() {
        return localOffersTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Offers_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Offers_type0 getOffers() {
        return localOffers;
    }

    /**
     * Auto generated setter method
     * @param param Offers
     */
    public void setOffers(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Offers_type0 param) {
        localOffersTracker = param != null;

        this.localOffers = param;
    }

    public boolean isRentalOffersSpecified() {
        return localRentalOffersTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.RentalOffers_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.RentalOffers_type0 getRentalOffers() {
        return localRentalOffers;
    }

    /**
     * Auto generated setter method
     * @param param RentalOffers
     */
    public void setRentalOffers(
        com.amazon.webservices.awsecommerceservice._2013_08_01.RentalOffers_type0 param) {
        localRentalOffersTracker = param != null;

        this.localRentalOffers = param;
    }

    public boolean isVariationSummarySpecified() {
        return localVariationSummaryTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.VariationSummary_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.VariationSummary_type0 getVariationSummary() {
        return localVariationSummary;
    }

    /**
     * Auto generated setter method
     * @param param VariationSummary
     */
    public void setVariationSummary(
        com.amazon.webservices.awsecommerceservice._2013_08_01.VariationSummary_type0 param) {
        localVariationSummaryTracker = param != null;

        this.localVariationSummary = param;
    }

    public boolean isVariationsSpecified() {
        return localVariationsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Variations_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Variations_type0 getVariations() {
        return localVariations;
    }

    /**
     * Auto generated setter method
     * @param param Variations
     */
    public void setVariations(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Variations_type0 param) {
        localVariationsTracker = param != null;

        this.localVariations = param;
    }

    public boolean isCustomerReviewsSpecified() {
        return localCustomerReviewsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.CustomerReviews_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.CustomerReviews_type0 getCustomerReviews() {
        return localCustomerReviews;
    }

    /**
     * Auto generated setter method
     * @param param CustomerReviews
     */
    public void setCustomerReviews(
        com.amazon.webservices.awsecommerceservice._2013_08_01.CustomerReviews_type0 param) {
        localCustomerReviewsTracker = param != null;

        this.localCustomerReviews = param;
    }

    public boolean isEditorialReviewsSpecified() {
        return localEditorialReviewsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.EditorialReviews_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.EditorialReviews_type0 getEditorialReviews() {
        return localEditorialReviews;
    }

    /**
     * Auto generated setter method
     * @param param EditorialReviews
     */
    public void setEditorialReviews(
        com.amazon.webservices.awsecommerceservice._2013_08_01.EditorialReviews_type0 param) {
        localEditorialReviewsTracker = param != null;

        this.localEditorialReviews = param;
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

    public boolean isAccessoriesSpecified() {
        return localAccessoriesTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Accessories_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Accessories_type0 getAccessories() {
        return localAccessories;
    }

    /**
     * Auto generated setter method
     * @param param Accessories
     */
    public void setAccessories(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Accessories_type0 param) {
        localAccessoriesTracker = param != null;

        this.localAccessories = param;
    }

    public boolean isTracksSpecified() {
        return localTracksTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Tracks_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Tracks_type0 getTracks() {
        return localTracks;
    }

    /**
     * Auto generated setter method
     * @param param Tracks
     */
    public void setTracks(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Tracks_type0 param) {
        localTracksTracker = param != null;

        this.localTracks = param;
    }

    public boolean isBrowseNodesSpecified() {
        return localBrowseNodesTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodes_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodes_type0 getBrowseNodes() {
        return localBrowseNodes;
    }

    /**
     * Auto generated setter method
     * @param param BrowseNodes
     */
    public void setBrowseNodes(
        com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodes_type0 param) {
        localBrowseNodesTracker = param != null;

        this.localBrowseNodes = param;
    }

    public boolean isAlternateVersionsSpecified() {
        return localAlternateVersionsTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.AlternateVersions_type0
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.AlternateVersions_type0 getAlternateVersions() {
        return localAlternateVersions;
    }

    /**
     * Auto generated setter method
     * @param param AlternateVersions
     */
    public void setAlternateVersions(
        com.amazon.webservices.awsecommerceservice._2013_08_01.AlternateVersions_type0 param) {
        localAlternateVersionsTracker = param != null;

        this.localAlternateVersions = param;
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
                    namespacePrefix + ":Item_type3", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Item_type3", xmlWriter);
            }
        }

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

        if (localParentASINTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "ParentASIN", xmlWriter);

            if (localParentASIN == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ParentASIN cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localParentASIN);
            }

            xmlWriter.writeEndElement();
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

        if (localItemLinksTracker) {
            if (localItemLinks == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ItemLinks cannot be null!!");
            }

            localItemLinks.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "ItemLinks"), xmlWriter);
        }

        if (localSalesRankTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "SalesRank", xmlWriter);

            if (localSalesRank == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "SalesRank cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSalesRank);
            }

            xmlWriter.writeEndElement();
        }

        if (localSmallImageTracker) {
            if (localSmallImage == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SmallImage cannot be null!!");
            }

            localSmallImage.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "SmallImage"), xmlWriter);
        }

        if (localMediumImageTracker) {
            if (localMediumImage == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "MediumImage cannot be null!!");
            }

            localMediumImage.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "MediumImage"), xmlWriter);
        }

        if (localLargeImageTracker) {
            if (localLargeImage == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "LargeImage cannot be null!!");
            }

            localLargeImage.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "LargeImage"), xmlWriter);
        }

        if (localImageSetsTracker) {
            if (localImageSets != null) {
                for (int i = 0; i < localImageSets.length; i++) {
                    if (localImageSets[i] != null) {
                        localImageSets[i].serialize(new javax.xml.namespace.QName(
                                "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                "ImageSets"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "ImageSets cannot be null!!");
            }
        }

        if (localItemAttributesTracker) {
            if (localItemAttributes == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ItemAttributes cannot be null!!");
            }

            localItemAttributes.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "ItemAttributes"), xmlWriter);
        }

        if (localVariationAttributesTracker) {
            if (localVariationAttributes == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "VariationAttributes cannot be null!!");
            }

            localVariationAttributes.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "VariationAttributes"), xmlWriter);
        }

        if (localRelatedItemsTracker) {
            if (localRelatedItems != null) {
                for (int i = 0; i < localRelatedItems.length; i++) {
                    if (localRelatedItems[i] != null) {
                        localRelatedItems[i].serialize(new javax.xml.namespace.QName(
                                "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                "RelatedItems"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "RelatedItems cannot be null!!");
            }
        }

        if (localCollectionsTracker) {
            if (localCollections == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Collections cannot be null!!");
            }

            localCollections.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "Collections"), xmlWriter);
        }

        if (localSubjectsTracker) {
            if (localSubjects == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Subjects cannot be null!!");
            }

            localSubjects.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "Subjects"), xmlWriter);
        }

        if (localOfferSummaryTracker) {
            if (localOfferSummary == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "OfferSummary cannot be null!!");
            }

            localOfferSummary.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "OfferSummary"), xmlWriter);
        }

        if (localOffersTracker) {
            if (localOffers == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Offers cannot be null!!");
            }

            localOffers.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "Offers"), xmlWriter);
        }

        if (localRentalOffersTracker) {
            if (localRentalOffers == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "RentalOffers cannot be null!!");
            }

            localRentalOffers.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "RentalOffers"), xmlWriter);
        }

        if (localVariationSummaryTracker) {
            if (localVariationSummary == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "VariationSummary cannot be null!!");
            }

            localVariationSummary.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "VariationSummary"), xmlWriter);
        }

        if (localVariationsTracker) {
            if (localVariations == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Variations cannot be null!!");
            }

            localVariations.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "Variations"), xmlWriter);
        }

        if (localCustomerReviewsTracker) {
            if (localCustomerReviews == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "CustomerReviews cannot be null!!");
            }

            localCustomerReviews.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "CustomerReviews"), xmlWriter);
        }

        if (localEditorialReviewsTracker) {
            if (localEditorialReviews == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "EditorialReviews cannot be null!!");
            }

            localEditorialReviews.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "EditorialReviews"), xmlWriter);
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

        if (localAccessoriesTracker) {
            if (localAccessories == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Accessories cannot be null!!");
            }

            localAccessories.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "Accessories"), xmlWriter);
        }

        if (localTracksTracker) {
            if (localTracks == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Tracks cannot be null!!");
            }

            localTracks.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "Tracks"), xmlWriter);
        }

        if (localBrowseNodesTracker) {
            if (localBrowseNodes == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "BrowseNodes cannot be null!!");
            }

            localBrowseNodes.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "BrowseNodes"), xmlWriter);
        }

        if (localAlternateVersionsTracker) {
            if (localAlternateVersions == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "AlternateVersions cannot be null!!");
            }

            localAlternateVersions.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "AlternateVersions"), xmlWriter);
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
        public static Item_type3 parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Item_type3 object = new Item_type3();

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

                        if (!"Item_type3".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Item_type3) com.amazon.webservices.awsecommerceservice._2013_08_01.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list10 = new java.util.ArrayList();

                java.util.ArrayList list13 = new java.util.ArrayList();

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
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "ParentASIN").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "ParentASIN").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "ParentASIN" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setParentASIN(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "ItemLinks").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "ItemLinks").equals(
                            reader.getName())) {
                    object.setItemLinks(com.amazon.webservices.awsecommerceservice._2013_08_01.ItemLinks_type0.Factory.parse(
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
                            "SalesRank").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "SalesRank").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "SalesRank" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSalesRank(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "SmallImage").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "SmallImage").equals(
                            reader.getName())) {
                    object.setSmallImage(com.amazon.webservices.awsecommerceservice._2013_08_01.Image.Factory.parse(
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
                            "MediumImage").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "MediumImage").equals(
                            reader.getName())) {
                    object.setMediumImage(com.amazon.webservices.awsecommerceservice._2013_08_01.Image.Factory.parse(
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
                            "LargeImage").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "LargeImage").equals(
                            reader.getName())) {
                    object.setLargeImage(com.amazon.webservices.awsecommerceservice._2013_08_01.Image.Factory.parse(
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
                            "ImageSets").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "ImageSets").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    list10.add(com.amazon.webservices.awsecommerceservice._2013_08_01.ImageSets_type0.Factory.parse(
                            reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone10 = false;

                    while (!loopDone10) {
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
                            loopDone10 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                        "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                        "ImageSets").equals(reader.getName())) {
                                list10.add(com.amazon.webservices.awsecommerceservice._2013_08_01.ImageSets_type0.Factory.parse(
                                        reader));
                            } else {
                                loopDone10 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setImageSets((com.amazon.webservices.awsecommerceservice._2013_08_01.ImageSets_type0[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            com.amazon.webservices.awsecommerceservice._2013_08_01.ImageSets_type0.class,
                            list10));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "ItemAttributes").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "ItemAttributes").equals(
                            reader.getName())) {
                    object.setItemAttributes(com.amazon.webservices.awsecommerceservice._2013_08_01.ItemAttributes_type0.Factory.parse(
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
                            "VariationAttributes").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "VariationAttributes").equals(
                            reader.getName())) {
                    object.setVariationAttributes(com.amazon.webservices.awsecommerceservice._2013_08_01.VariationAttributes_type0.Factory.parse(
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
                            "RelatedItems").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "RelatedItems").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    list13.add(com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItems_type0.Factory.parse(
                            reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone13 = false;

                    while (!loopDone13) {
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
                            loopDone13 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                        "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                        "RelatedItems").equals(reader.getName())) {
                                list13.add(com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItems_type0.Factory.parse(
                                        reader));
                            } else {
                                loopDone13 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setRelatedItems((com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItems_type0[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            com.amazon.webservices.awsecommerceservice._2013_08_01.RelatedItems_type0.class,
                            list13));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "Collections").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Collections").equals(
                            reader.getName())) {
                    object.setCollections(com.amazon.webservices.awsecommerceservice._2013_08_01.Collections_type0.Factory.parse(
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
                            "Subjects").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Subjects").equals(
                            reader.getName())) {
                    object.setSubjects(com.amazon.webservices.awsecommerceservice._2013_08_01.Subjects_type0.Factory.parse(
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
                            "OfferSummary").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "OfferSummary").equals(
                            reader.getName())) {
                    object.setOfferSummary(com.amazon.webservices.awsecommerceservice._2013_08_01.OfferSummary_type0.Factory.parse(
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
                            "Offers").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Offers").equals(
                            reader.getName())) {
                    object.setOffers(com.amazon.webservices.awsecommerceservice._2013_08_01.Offers_type0.Factory.parse(
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
                            "RentalOffers").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "RentalOffers").equals(
                            reader.getName())) {
                    object.setRentalOffers(com.amazon.webservices.awsecommerceservice._2013_08_01.RentalOffers_type0.Factory.parse(
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
                            "VariationSummary").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "VariationSummary").equals(
                            reader.getName())) {
                    object.setVariationSummary(com.amazon.webservices.awsecommerceservice._2013_08_01.VariationSummary_type0.Factory.parse(
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
                            "Variations").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Variations").equals(
                            reader.getName())) {
                    object.setVariations(com.amazon.webservices.awsecommerceservice._2013_08_01.Variations_type0.Factory.parse(
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
                            "CustomerReviews").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "CustomerReviews").equals(
                            reader.getName())) {
                    object.setCustomerReviews(com.amazon.webservices.awsecommerceservice._2013_08_01.CustomerReviews_type0.Factory.parse(
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
                            "EditorialReviews").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "EditorialReviews").equals(
                            reader.getName())) {
                    object.setEditorialReviews(com.amazon.webservices.awsecommerceservice._2013_08_01.EditorialReviews_type0.Factory.parse(
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
                            "Accessories").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Accessories").equals(
                            reader.getName())) {
                    object.setAccessories(com.amazon.webservices.awsecommerceservice._2013_08_01.Accessories_type0.Factory.parse(
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
                            "Tracks").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Tracks").equals(
                            reader.getName())) {
                    object.setTracks(com.amazon.webservices.awsecommerceservice._2013_08_01.Tracks_type0.Factory.parse(
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
                            "BrowseNodes").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "BrowseNodes").equals(
                            reader.getName())) {
                    object.setBrowseNodes(com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodes_type0.Factory.parse(
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
                            "AlternateVersions").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "AlternateVersions").equals(
                            reader.getName())) {
                    object.setAlternateVersions(com.amazon.webservices.awsecommerceservice._2013_08_01.AlternateVersions_type0.Factory.parse(
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
