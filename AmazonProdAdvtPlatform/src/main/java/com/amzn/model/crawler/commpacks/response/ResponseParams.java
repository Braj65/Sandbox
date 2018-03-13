package com.amzn.model.crawler.commpacks.response;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemAttributes_type0;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3;
import com.amazon.webservices.awsecommerceservice._2013_08_01.OfferSummary_type0;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Price;
import com.amazon.webservices.awsecommerceservice._2013_08_01.VariationSummary_type0;

public class ResponseParams {
    
    public String ASIN;
    public OfferSummary_type0 offer;
    public VariationSummary_type0 variations;
    public Price OLowNewPrice, VLowSalePrice, VLowPrice;
    public ItemAttributes_type0 itemAttribs;
    
    public void populate(Item_type3 currItem) {
	ASIN=currItem.getASIN();
	itemAttribs=currItem.getItemAttributes();
	offer=currItem.getOfferSummary();
	variations=currItem.getVariationSummary();
	OLowNewPrice=offer.getLowestNewPrice();
	VLowSalePrice=variations.getLowestSalePrice();
	VLowPrice=variations.getLowestPrice();
    }

}
