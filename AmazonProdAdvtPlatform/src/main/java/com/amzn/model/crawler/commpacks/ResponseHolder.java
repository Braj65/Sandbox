package com.amzn.model.crawler.commpacks;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchResponse;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Items_type3;

public class ResponseHolder {
    private ItemSearchResponse resp=null;
    private Items_type3[] itemsOfResp=null;
    private Item_type3 itemOfItemTypes=null;
    

    public ResponseHolder(ItemSearchResponse itemSearch) {
	// TODO Auto-generated constructor stub
    }
    
    public void validateResponsePagesCount(RequestHolder request){
	boolean flag=false;
	for(int i=0;i<itemsOfResp.length;i++){
	    flag=flag || 
		    itemsOfResp[i].getTotalPages()
		    .compareTo(request.itemSrchParamsReqArr[i].getItemPage())!=0;
	}
	if(!flag)
	    throw new RuntimeException("Error in class Abstractsort applied. Mismatch in"
	    	+ "page counts between request sent and response received");
    }

}
