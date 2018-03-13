package com.amzn.model.crawler.commpacks.response;

import org.apache.axis2.databinding.ADBBean;

import com.amazon.webservices.awsecommerceservice._2013_08_01.Errors_type0;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchResponse;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Items_type3;
import com.amzn.model.crawler.commpacks.requests.IRequestHolder;

public class ResponseHolder {
    private ItemSearchResponse resp=null;
    private Items_type3[] itemsOfResp=null;
    private Item_type3 itemOfItemTypes=null;
    private ResponseParams respParams;
    
    

    public ResponseHolder(ADBBean itemSearch) {
	// TODO Auto-generated constructor stub
    }
    
    public void validateResponsePagesCount(IRequestHolder request){
	boolean flag=false;
	for(int i=0;i<itemsOfResp.length;i++){
	    flag=flag || 
		    itemsOfResp[i].getTotalPages()
		    .compareTo(((ItemSearchRequest)request.getReqArr()[i]).getItemPage())!=0;
	}
	if(!flag)
	    throw new RuntimeException("Error in class Abstractsort applied. Mismatch in"
	    	+ "page counts between request sent and response received");
    }
    
    public Errors_type0 getOpsErrors(){
	return resp.getOperationRequest().getErrors();
    }

    public String[] getSortParams() {
	String params=resp.getOperationRequest().getErrors().getError()[0].getMessage();
	params=params.replaceAll("'", "");
	return params.substring(params.indexOf("'"), params.lastIndexOf("'")+1).split(",");
    }

    public String[] getSortParamsFromItemOne() {
	String params=resp.getItems()[0].getRequest().getErrors().getError()[0].getMessage();
	params=params.replaceAll("'", "");
	return params.substring(params.indexOf("'"), params.lastIndexOf("'")+1).split(",");
    }

    public void parseForItems() {
	itemsOfResp=resp.getItems();
	for(Items_type3 currItemList:itemsOfResp){
	    if(currItemList.getItem()==null)
		return itemSet;
	    for(Item_type3 currItem:currItemList.getItem()){
		respParams.populate(currItem);
	    }
	}
    }

}
