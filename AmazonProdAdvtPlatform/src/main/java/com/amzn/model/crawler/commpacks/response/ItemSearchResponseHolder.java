package com.amzn.model.crawler.commpacks.response;

import java.util.HashMap;

import org.apache.axis2.databinding.ADBBean;
import org.apache.axis2.databinding.types.NonNegativeInteger;

import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNode_type0;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Errors_type0;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchResponse;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Items_type3;

public class ItemSearchResponseHolder implements IResponseHolder{
    private ItemSearchResponse resp=null;
    private Items_type3[] itemsOfResp=null;
    private ResponseItem respItem;
    
    private HashMap<String, ResponseItem> itemSet=new HashMap<String, ResponseItem>();
    
    public static final NullResponseHolder NULLINSTANCE=new NullResponseHolder(null);

    public ItemSearchResponseHolder(ADBBean itemSearchResp) {
	resp=(ItemSearchResponse) itemSearchResp;
	respItem=new ResponseItem();
    }
    
    public Errors_type0 getOpsErrors(){
	return resp.getOperationRequest().getErrors();
    }

    public String[] getSortParams() {
	String params=resp.getOperationRequest().getErrors().getError()[0].getMessage();
	String removeQuotes=params.replaceAll("'", "");
	return removeQuotes.substring(params.indexOf("'"), params.lastIndexOf("'")+1).split(",");
    }

    public String[] getSortParamsFromItemOne() {
	String params=resp.getItems()[0].getRequest().getErrors().getError()[0].getMessage();
	String betweenQuotes=params.substring(params.indexOf("'"), params.lastIndexOf("'"));
	String removeQuotes=betweenQuotes.replaceAll("'", "");
	return removeQuotes.split(",");
    }
    
    public NonNegativeInteger getTotalPages(){
	return resp.getItems()[0].getTotalPages();
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
    
    public ADBBean getResponse(){
	return resp;
    }

    @Override
    public ADBBean getFirstChild() {
	return resp.getItems()[0];
    }

}
