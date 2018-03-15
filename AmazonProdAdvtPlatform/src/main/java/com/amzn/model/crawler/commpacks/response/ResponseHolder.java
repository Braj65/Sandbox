package com.amzn.model.crawler.commpacks.response;

import java.util.HashMap;

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
    private ResponseItem respItem;
    
    private HashMap<String, ResponseItem> itemSet=new HashMap<String, ResponseItem>(); 

    public ResponseHolder(ADBBean itemSearchResp) {
	resp=(ItemSearchResponse) itemSearchResp;
	respItem=new ResponseItem();
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

    public HashMap<String, ResponseItem> parseForItems() {
	itemsOfResp=resp.getItems();
	for(Items_type3 currItemList:itemsOfResp){
	    if(currItemList.getItem()==null)
		return itemSet;
	    for(Item_type3 currItem:currItemList.getItem()){
		respItem.populate(currItem);
		if(respItem.OLowNewPrice!=null){
		    respItem.price=respItem.OLowNewPrice.getFormattedPrice();
		}else if(respItem.VLowSalePrice!=null){
		    respItem.price=respItem.VLowSalePrice.toString();
		}else if(respItem.VLowPrice!=null){
		    respItem.price=respItem.VLowPrice.toString();
		}
		itemSet.put(respItem.ASIN, respItem);
	    }
	}
	return itemSet;
    }

}
