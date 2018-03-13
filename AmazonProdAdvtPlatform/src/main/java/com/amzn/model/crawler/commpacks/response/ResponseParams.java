package com.amzn.model.crawler.commpacks.response;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemAttributes_type0;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Price;

public class ResponseParams {
    
    public String ASIN;
    public Price price;
    public ItemAttributes_type0 itemAttribs;
    
    public void populate(Item_type3 currItem) {
	
    }

}
