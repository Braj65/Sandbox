/**
 * ItemSearchRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package com.amazon.webservices.awsecommerceservice._2013_08_01;


/**
 *  ItemSearchRequest bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ItemSearchRequest implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = ItemSearchRequest
       Namespace URI = http://webservices.amazon.com/AWSECommerceService/2013-08-01
       Namespace Prefix = ns1
     */

    /**
     * field for Actor
     */
    protected java.lang.String localActor;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localActorTracker = false;

    /**
     * field for Artist
     */
    protected java.lang.String localArtist;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localArtistTracker = false;

    /**
     * field for Availability
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.Availability_type1 localAvailability;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAvailabilityTracker = false;

    /**
     * field for AudienceRating
     * This was an Array!
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.AudienceRating_type0[] localAudienceRating;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAudienceRatingTracker = false;

    /**
     * field for Author
     */
    protected java.lang.String localAuthor;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAuthorTracker = false;

    /**
     * field for Brand
     */
    protected java.lang.String localBrand;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBrandTracker = false;

    /**
     * field for BrowseNode
     */
    protected java.lang.String localBrowseNode;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBrowseNodeTracker = false;

    /**
     * field for Composer
     */
    protected java.lang.String localComposer;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localComposerTracker = false;

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
     * field for Conductor
     */
    protected java.lang.String localConductor;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localConductorTracker = false;

    /**
     * field for Director
     */
    protected java.lang.String localDirector;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDirectorTracker = false;

    /**
     * field for ItemPage
     */
    protected org.apache.axis2.databinding.types.PositiveInteger localItemPage;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localItemPageTracker = false;

    /**
     * field for Keywords
     */
    protected java.lang.String localKeywords;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localKeywordsTracker = false;

    /**
     * field for Manufacturer
     */
    protected java.lang.String localManufacturer;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localManufacturerTracker = false;

    /**
     * field for MaximumPrice
     */
    protected org.apache.axis2.databinding.types.NonNegativeInteger localMaximumPrice;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMaximumPriceTracker = false;

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
     * field for MinimumPrice
     */
    protected org.apache.axis2.databinding.types.NonNegativeInteger localMinimumPrice;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMinimumPriceTracker = false;

    /**
     * field for MinPercentageOff
     */
    protected org.apache.axis2.databinding.types.NonNegativeInteger localMinPercentageOff;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMinPercentageOffTracker = false;

    /**
     * field for MusicLabel
     */
    protected java.lang.String localMusicLabel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMusicLabelTracker = false;

    /**
     * field for Orchestra
     */
    protected java.lang.String localOrchestra;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOrchestraTracker = false;

    /**
     * field for Power
     */
    protected java.lang.String localPower;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPowerTracker = false;

    /**
     * field for Publisher
     */
    protected java.lang.String localPublisher;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPublisherTracker = false;

    /**
     * field for RelatedItemPage
     */
    protected com.amazon.webservices.awsecommerceservice._2013_08_01.PositiveIntegerOrAll localRelatedItemPage;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRelatedItemPageTracker = false;

    /**
     * field for RelationshipType
     * This was an Array!
     */
    protected java.lang.String[] localRelationshipType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRelationshipTypeTracker = false;

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
     * field for SearchIndex
     */
    protected java.lang.String localSearchIndex;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSearchIndexTracker = false;

    /**
     * field for Sort
     */
    protected java.lang.String localSort;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSortTracker = false;

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
     * field for ReleaseDate
     */
    protected java.lang.String localReleaseDate;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReleaseDateTracker = false;

    /**
     * field for IncludeReviewsSummary
     */
    protected java.lang.String localIncludeReviewsSummary;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIncludeReviewsSummaryTracker = false;

    /**
     * field for TruncateReviewsAt
     */
    protected org.apache.axis2.databinding.types.NonNegativeInteger localTruncateReviewsAt;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTruncateReviewsAtTracker = false;

    public boolean isActorSpecified() {
        return localActorTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getActor() {
        return localActor;
    }

    /**
     * Auto generated setter method
     * @param param Actor
     */
    public void setActor(java.lang.String param) {
        localActorTracker = param != null;

        this.localActor = param;
    }

    public boolean isArtistSpecified() {
        return localArtistTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getArtist() {
        return localArtist;
    }

    /**
     * Auto generated setter method
     * @param param Artist
     */
    public void setArtist(java.lang.String param) {
        localArtistTracker = param != null;

        this.localArtist = param;
    }

    public boolean isAvailabilitySpecified() {
        return localAvailabilityTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.Availability_type1
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.Availability_type1 getAvailability() {
        return localAvailability;
    }

    /**
     * Auto generated setter method
     * @param param Availability
     */
    public void setAvailability(
        com.amazon.webservices.awsecommerceservice._2013_08_01.Availability_type1 param) {
        localAvailabilityTracker = param != null;

        this.localAvailability = param;
    }

    public boolean isAudienceRatingSpecified() {
        return localAudienceRatingTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.AudienceRating_type0[]
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.AudienceRating_type0[] getAudienceRating() {
        return localAudienceRating;
    }

    /**
     * validate the array for AudienceRating
     */
    protected void validateAudienceRating(
        com.amazon.webservices.awsecommerceservice._2013_08_01.AudienceRating_type0[] param) {
    }

    /**
     * Auto generated setter method
     * @param param AudienceRating
     */
    public void setAudienceRating(
        com.amazon.webservices.awsecommerceservice._2013_08_01.AudienceRating_type0[] param) {
        validateAudienceRating(param);

        localAudienceRatingTracker = param != null;

        this.localAudienceRating = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param com.amazon.webservices.awsecommerceservice._2013_08_01.AudienceRating_type0
     */
    public void addAudienceRating(
        com.amazon.webservices.awsecommerceservice._2013_08_01.AudienceRating_type0 param) {
        if (localAudienceRating == null) {
            localAudienceRating = new com.amazon.webservices.awsecommerceservice._2013_08_01.AudienceRating_type0[] {
                    
                };
        }

        //update the setting tracker
        localAudienceRatingTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localAudienceRating);
        list.add(param);
        this.localAudienceRating = (com.amazon.webservices.awsecommerceservice._2013_08_01.AudienceRating_type0[]) list.toArray(new com.amazon.webservices.awsecommerceservice._2013_08_01.AudienceRating_type0[list.size()]);
    }

    public boolean isAuthorSpecified() {
        return localAuthorTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAuthor() {
        return localAuthor;
    }

    /**
     * Auto generated setter method
     * @param param Author
     */
    public void setAuthor(java.lang.String param) {
        localAuthorTracker = param != null;

        this.localAuthor = param;
    }

    public boolean isBrandSpecified() {
        return localBrandTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getBrand() {
        return localBrand;
    }

    /**
     * Auto generated setter method
     * @param param Brand
     */
    public void setBrand(java.lang.String param) {
        localBrandTracker = param != null;

        this.localBrand = param;
    }

    public boolean isBrowseNodeSpecified() {
        return localBrowseNodeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getBrowseNode() {
        return localBrowseNode;
    }

    /**
     * Auto generated setter method
     * @param param BrowseNode
     */
    public void setBrowseNode(java.lang.String param) {
        localBrowseNodeTracker = param != null;

        this.localBrowseNode = param;
    }

    public boolean isComposerSpecified() {
        return localComposerTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getComposer() {
        return localComposer;
    }

    /**
     * Auto generated setter method
     * @param param Composer
     */
    public void setComposer(java.lang.String param) {
        localComposerTracker = param != null;

        this.localComposer = param;
    }

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

    public boolean isConductorSpecified() {
        return localConductorTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getConductor() {
        return localConductor;
    }

    /**
     * Auto generated setter method
     * @param param Conductor
     */
    public void setConductor(java.lang.String param) {
        localConductorTracker = param != null;

        this.localConductor = param;
    }

    public boolean isDirectorSpecified() {
        return localDirectorTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDirector() {
        return localDirector;
    }

    /**
     * Auto generated setter method
     * @param param Director
     */
    public void setDirector(java.lang.String param) {
        localDirectorTracker = param != null;

        this.localDirector = param;
    }

    public boolean isItemPageSpecified() {
        return localItemPageTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.PositiveInteger
     */
    public org.apache.axis2.databinding.types.PositiveInteger getItemPage() {
        return localItemPage;
    }

    /**
     * Auto generated setter method
     * @param param ItemPage
     */
    public void setItemPage(
        org.apache.axis2.databinding.types.PositiveInteger param) {
        localItemPageTracker = param != null;

        this.localItemPage = param;
    }

    public boolean isKeywordsSpecified() {
        return localKeywordsTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getKeywords() {
        return localKeywords;
    }

    /**
     * Auto generated setter method
     * @param param Keywords
     */
    public void setKeywords(java.lang.String param) {
        localKeywordsTracker = param != null;

        this.localKeywords = param;
    }

    public boolean isManufacturerSpecified() {
        return localManufacturerTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getManufacturer() {
        return localManufacturer;
    }

    /**
     * Auto generated setter method
     * @param param Manufacturer
     */
    public void setManufacturer(java.lang.String param) {
        localManufacturerTracker = param != null;

        this.localManufacturer = param;
    }

    public boolean isMaximumPriceSpecified() {
        return localMaximumPriceTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.NonNegativeInteger
     */
    public org.apache.axis2.databinding.types.NonNegativeInteger getMaximumPrice() {
        return localMaximumPrice;
    }

    /**
     * Auto generated setter method
     * @param param MaximumPrice
     */
    public void setMaximumPrice(
        org.apache.axis2.databinding.types.NonNegativeInteger param) {
        localMaximumPriceTracker = param != null;

        this.localMaximumPrice = param;
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

    public boolean isMinimumPriceSpecified() {
        return localMinimumPriceTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.NonNegativeInteger
     */
    public org.apache.axis2.databinding.types.NonNegativeInteger getMinimumPrice() {
        return localMinimumPrice;
    }

    /**
     * Auto generated setter method
     * @param param MinimumPrice
     */
    public void setMinimumPrice(
        org.apache.axis2.databinding.types.NonNegativeInteger param) {
        localMinimumPriceTracker = param != null;

        this.localMinimumPrice = param;
    }

    public boolean isMinPercentageOffSpecified() {
        return localMinPercentageOffTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.NonNegativeInteger
     */
    public org.apache.axis2.databinding.types.NonNegativeInteger getMinPercentageOff() {
        return localMinPercentageOff;
    }

    /**
     * Auto generated setter method
     * @param param MinPercentageOff
     */
    public void setMinPercentageOff(
        org.apache.axis2.databinding.types.NonNegativeInteger param) {
        localMinPercentageOffTracker = param != null;

        this.localMinPercentageOff = param;
    }

    public boolean isMusicLabelSpecified() {
        return localMusicLabelTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMusicLabel() {
        return localMusicLabel;
    }

    /**
     * Auto generated setter method
     * @param param MusicLabel
     */
    public void setMusicLabel(java.lang.String param) {
        localMusicLabelTracker = param != null;

        this.localMusicLabel = param;
    }

    public boolean isOrchestraSpecified() {
        return localOrchestraTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getOrchestra() {
        return localOrchestra;
    }

    /**
     * Auto generated setter method
     * @param param Orchestra
     */
    public void setOrchestra(java.lang.String param) {
        localOrchestraTracker = param != null;

        this.localOrchestra = param;
    }

    public boolean isPowerSpecified() {
        return localPowerTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPower() {
        return localPower;
    }

    /**
     * Auto generated setter method
     * @param param Power
     */
    public void setPower(java.lang.String param) {
        localPowerTracker = param != null;

        this.localPower = param;
    }

    public boolean isPublisherSpecified() {
        return localPublisherTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPublisher() {
        return localPublisher;
    }

    /**
     * Auto generated setter method
     * @param param Publisher
     */
    public void setPublisher(java.lang.String param) {
        localPublisherTracker = param != null;

        this.localPublisher = param;
    }

    public boolean isRelatedItemPageSpecified() {
        return localRelatedItemPageTracker;
    }

    /**
     * Auto generated getter method
     * @return com.amazon.webservices.awsecommerceservice._2013_08_01.PositiveIntegerOrAll
     */
    public com.amazon.webservices.awsecommerceservice._2013_08_01.PositiveIntegerOrAll getRelatedItemPage() {
        return localRelatedItemPage;
    }

    /**
     * Auto generated setter method
     * @param param RelatedItemPage
     */
    public void setRelatedItemPage(
        com.amazon.webservices.awsecommerceservice._2013_08_01.PositiveIntegerOrAll param) {
        localRelatedItemPageTracker = param != null;

        this.localRelatedItemPage = param;
    }

    public boolean isRelationshipTypeSpecified() {
        return localRelationshipTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String[]
     */
    public java.lang.String[] getRelationshipType() {
        return localRelationshipType;
    }

    /**
     * validate the array for RelationshipType
     */
    protected void validateRelationshipType(java.lang.String[] param) {
    }

    /**
     * Auto generated setter method
     * @param param RelationshipType
     */
    public void setRelationshipType(java.lang.String[] param) {
        validateRelationshipType(param);

        localRelationshipTypeTracker = param != null;

        this.localRelationshipType = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param java.lang.String
     */
    public void addRelationshipType(java.lang.String param) {
        if (localRelationshipType == null) {
            localRelationshipType = new java.lang.String[] {  };
        }

        //update the setting tracker
        localRelationshipTypeTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localRelationshipType);
        list.add(param);
        this.localRelationshipType = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
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

    public boolean isSearchIndexSpecified() {
        return localSearchIndexTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSearchIndex() {
        return localSearchIndex;
    }

    /**
     * Auto generated setter method
     * @param param SearchIndex
     */
    public void setSearchIndex(java.lang.String param) {
        localSearchIndexTracker = param != null;

        this.localSearchIndex = param;
    }

    public boolean isSortSpecified() {
        return localSortTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSort() {
        return localSort;
    }

    /**
     * Auto generated setter method
     * @param param Sort
     */
    public void setSort(java.lang.String param) {
        localSortTracker = param != null;

        this.localSort = param;
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

    public boolean isReleaseDateSpecified() {
        return localReleaseDateTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getReleaseDate() {
        return localReleaseDate;
    }

    /**
     * Auto generated setter method
     * @param param ReleaseDate
     */
    public void setReleaseDate(java.lang.String param) {
        localReleaseDateTracker = param != null;

        this.localReleaseDate = param;
    }

    public boolean isIncludeReviewsSummarySpecified() {
        return localIncludeReviewsSummaryTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getIncludeReviewsSummary() {
        return localIncludeReviewsSummary;
    }

    /**
     * Auto generated setter method
     * @param param IncludeReviewsSummary
     */
    public void setIncludeReviewsSummary(java.lang.String param) {
        localIncludeReviewsSummaryTracker = param != null;

        this.localIncludeReviewsSummary = param;
    }

    public boolean isTruncateReviewsAtSpecified() {
        return localTruncateReviewsAtTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.NonNegativeInteger
     */
    public org.apache.axis2.databinding.types.NonNegativeInteger getTruncateReviewsAt() {
        return localTruncateReviewsAt;
    }

    /**
     * Auto generated setter method
     * @param param TruncateReviewsAt
     */
    public void setTruncateReviewsAt(
        org.apache.axis2.databinding.types.NonNegativeInteger param) {
        localTruncateReviewsAtTracker = param != null;

        this.localTruncateReviewsAt = param;
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
                    namespacePrefix + ":ItemSearchRequest", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "ItemSearchRequest", xmlWriter);
            }
        }

        if (localActorTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Actor", xmlWriter);

            if (localActor == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Actor cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localActor);
            }

            xmlWriter.writeEndElement();
        }

        if (localArtistTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Artist", xmlWriter);

            if (localArtist == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Artist cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localArtist);
            }

            xmlWriter.writeEndElement();
        }

        if (localAvailabilityTracker) {
            if (localAvailability == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Availability cannot be null!!");
            }

            localAvailability.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "Availability"), xmlWriter);
        }

        if (localAudienceRatingTracker) {
            if (localAudienceRating != null) {
                for (int i = 0; i < localAudienceRating.length; i++) {
                    if (localAudienceRating[i] != null) {
                        localAudienceRating[i].serialize(new javax.xml.namespace.QName(
                                "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                "AudienceRating"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "AudienceRating cannot be null!!");
            }
        }

        if (localAuthorTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Author", xmlWriter);

            if (localAuthor == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Author cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localAuthor);
            }

            xmlWriter.writeEndElement();
        }

        if (localBrandTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Brand", xmlWriter);

            if (localBrand == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Brand cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localBrand);
            }

            xmlWriter.writeEndElement();
        }

        if (localBrowseNodeTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "BrowseNode", xmlWriter);

            if (localBrowseNode == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "BrowseNode cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localBrowseNode);
            }

            xmlWriter.writeEndElement();
        }

        if (localComposerTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Composer", xmlWriter);

            if (localComposer == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Composer cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localComposer);
            }

            xmlWriter.writeEndElement();
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

        if (localConductorTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Conductor", xmlWriter);

            if (localConductor == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Conductor cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localConductor);
            }

            xmlWriter.writeEndElement();
        }

        if (localDirectorTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Director", xmlWriter);

            if (localDirector == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Director cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDirector);
            }

            xmlWriter.writeEndElement();
        }

        if (localItemPageTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "ItemPage", xmlWriter);

            if (localItemPage == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ItemPage cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localItemPage));
            }

            xmlWriter.writeEndElement();
        }

        if (localKeywordsTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Keywords", xmlWriter);

            if (localKeywords == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Keywords cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localKeywords);
            }

            xmlWriter.writeEndElement();
        }

        if (localManufacturerTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Manufacturer", xmlWriter);

            if (localManufacturer == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Manufacturer cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localManufacturer);
            }

            xmlWriter.writeEndElement();
        }

        if (localMaximumPriceTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "MaximumPrice", xmlWriter);

            if (localMaximumPrice == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "MaximumPrice cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMaximumPrice));
            }

            xmlWriter.writeEndElement();
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

        if (localMinimumPriceTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "MinimumPrice", xmlWriter);

            if (localMinimumPrice == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "MinimumPrice cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMinimumPrice));
            }

            xmlWriter.writeEndElement();
        }

        if (localMinPercentageOffTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "MinPercentageOff", xmlWriter);

            if (localMinPercentageOff == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "MinPercentageOff cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMinPercentageOff));
            }

            xmlWriter.writeEndElement();
        }

        if (localMusicLabelTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "MusicLabel", xmlWriter);

            if (localMusicLabel == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "MusicLabel cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localMusicLabel);
            }

            xmlWriter.writeEndElement();
        }

        if (localOrchestraTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Orchestra", xmlWriter);

            if (localOrchestra == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Orchestra cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localOrchestra);
            }

            xmlWriter.writeEndElement();
        }

        if (localPowerTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Power", xmlWriter);

            if (localPower == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Power cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPower);
            }

            xmlWriter.writeEndElement();
        }

        if (localPublisherTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Publisher", xmlWriter);

            if (localPublisher == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Publisher cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPublisher);
            }

            xmlWriter.writeEndElement();
        }

        if (localRelatedItemPageTracker) {
            if (localRelatedItemPage == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "RelatedItemPage cannot be null!!");
            }

            localRelatedItemPage.serialize(new javax.xml.namespace.QName(
                    "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                    "RelatedItemPage"), xmlWriter);
        }

        if (localRelationshipTypeTracker) {
            if (localRelationshipType != null) {
                namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";

                for (int i = 0; i < localRelationshipType.length; i++) {
                    if (localRelationshipType[i] != null) {
                        writeStartElement(null, namespace, "RelationshipType",
                            xmlWriter);

                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                localRelationshipType[i]));

                        xmlWriter.writeEndElement();
                    } else {
                        // we have to do nothing since minOccurs is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "RelationshipType cannot be null!!");
            }
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

        if (localSearchIndexTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "SearchIndex", xmlWriter);

            if (localSearchIndex == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "SearchIndex cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSearchIndex);
            }

            xmlWriter.writeEndElement();
        }

        if (localSortTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "Sort", xmlWriter);

            if (localSort == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Sort cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSort);
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

        if (localReleaseDateTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "ReleaseDate", xmlWriter);

            if (localReleaseDate == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ReleaseDate cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localReleaseDate);
            }

            xmlWriter.writeEndElement();
        }

        if (localIncludeReviewsSummaryTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "IncludeReviewsSummary",
                xmlWriter);

            if (localIncludeReviewsSummary == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "IncludeReviewsSummary cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localIncludeReviewsSummary);
            }

            xmlWriter.writeEndElement();
        }

        if (localTruncateReviewsAtTracker) {
            namespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01";
            writeStartElement(null, namespace, "TruncateReviewsAt", xmlWriter);

            if (localTruncateReviewsAt == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "TruncateReviewsAt cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTruncateReviewsAt));
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
        public static ItemSearchRequest parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            ItemSearchRequest object = new ItemSearchRequest();

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

                        if (!"ItemSearchRequest".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (ItemSearchRequest) com.amazon.webservices.awsecommerceservice._2013_08_01.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list4 = new java.util.ArrayList();

                java.util.ArrayList list24 = new java.util.ArrayList();

                java.util.ArrayList list25 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "Actor").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Actor").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Actor" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setActor(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "Artist").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Artist").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Artist" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setArtist(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                    object.setAvailability(com.amazon.webservices.awsecommerceservice._2013_08_01.Availability_type1.Factory.parse(
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
                            "AudienceRating").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "AudienceRating").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    list4.add(com.amazon.webservices.awsecommerceservice._2013_08_01.AudienceRating_type0.Factory.parse(
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
                                        "AudienceRating").equals(
                                        reader.getName())) {
                                list4.add(com.amazon.webservices.awsecommerceservice._2013_08_01.AudienceRating_type0.Factory.parse(
                                        reader));
                            } else {
                                loopDone4 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setAudienceRating((com.amazon.webservices.awsecommerceservice._2013_08_01.AudienceRating_type0[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            com.amazon.webservices.awsecommerceservice._2013_08_01.AudienceRating_type0.class,
                            list4));
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
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Author" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAuthor(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "Brand").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Brand").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Brand" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setBrand(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "BrowseNode").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "BrowseNode").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "BrowseNode" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setBrowseNode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "Composer").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Composer").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Composer" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setComposer(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "Conductor").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Conductor").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Conductor" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setConductor(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "Director").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Director").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Director" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDirector(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "ItemPage").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "ItemPage").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "ItemPage" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setItemPage(org.apache.axis2.databinding.utils.ConverterUtil.convertToPositiveInteger(
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
                            "Keywords").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Keywords").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Keywords" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setKeywords(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "Manufacturer").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Manufacturer").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Manufacturer" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setManufacturer(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "MaximumPrice").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "MaximumPrice").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "MaximumPrice" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMaximumPrice(org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
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
                            "MinimumPrice").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "MinimumPrice").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "MinimumPrice" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMinimumPrice(org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
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
                            "MinPercentageOff").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "MinPercentageOff").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "MinPercentageOff" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMinPercentageOff(org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
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
                            "MusicLabel").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "MusicLabel").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "MusicLabel" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMusicLabel(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "Orchestra").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Orchestra").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Orchestra" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setOrchestra(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "Power").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Power").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Power" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPower(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "Publisher").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Publisher").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Publisher" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPublisher(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "RelatedItemPage").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "RelatedItemPage").equals(
                            reader.getName())) {
                    object.setRelatedItemPage(com.amazon.webservices.awsecommerceservice._2013_08_01.PositiveIntegerOrAll.Factory.parse(
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
                            "RelationshipType").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "RelationshipType").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    list24.add(reader.getElementText());

                    //loop until we find a start element that is not part of this array
                    boolean loopDone24 = false;

                    while (!loopDone24) {
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
                            loopDone24 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                        "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                        "RelationshipType").equals(
                                        reader.getName())) {
                                list24.add(reader.getElementText());
                            } else {
                                loopDone24 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setRelationshipType((java.lang.String[]) list24.toArray(
                            new java.lang.String[list24.size()]));
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
                    list25.add(reader.getElementText());

                    //loop until we find a start element that is not part of this array
                    boolean loopDone25 = false;

                    while (!loopDone25) {
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
                            loopDone25 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                        "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                                        "ResponseGroup").equals(
                                        reader.getName())) {
                                list25.add(reader.getElementText());
                            } else {
                                loopDone25 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setResponseGroup((java.lang.String[]) list25.toArray(
                            new java.lang.String[list25.size()]));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://webservices.amazon.com/AWSECommerceService/2013-08-01",
                            "SearchIndex").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "SearchIndex").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "SearchIndex" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSearchIndex(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "Sort").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "Sort").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Sort" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSort(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "ReleaseDate").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "ReleaseDate").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "ReleaseDate" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setReleaseDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "IncludeReviewsSummary").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "IncludeReviewsSummary").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "IncludeReviewsSummary" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setIncludeReviewsSummary(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "TruncateReviewsAt").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "TruncateReviewsAt").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "TruncateReviewsAt" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTruncateReviewsAt(org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
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
