package com.amzn.model.crawler.sortParamBased;

import org.apache.axis2.databinding.types.PositiveInteger;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Items_type3;

import junit.framework.Assert;

public abstract class AbstractSortApplied {
    
    private ItemSearchRequest itemSrchParamsReq=null;
    private ItemSearchRequest[] itemSrchParamsReqArr=null;
    private final static int cntOfAllowedReq=2;
    
    public AbstractSortApplied(){
	itemSrchParamsReq=new ItemSearchRequest();
	itemSrchParamsReqArr=new ItemSearchRequest[cntOfAllowedReq];
    }
    
    public void gamesSearchRequest(){
	itemSrchParamsReq.setSearchIndex(RequestParams.getSearchIndex());
	itemSrchParamsReq.setBrowseNode(RequestParams.getBrowseNodeIs());
	itemSrchParamsReq.setItemPage(new PositiveInteger(Integer.toString(pageNum)));
	itemSrchParamsReq.setResponseGroup(ResponseParams.getRespParams());
    }
    
    public void applySortParam(){
	itemSrchParamsReq.setSort(sortParam);
    }
    
    public void loadItemSearchArr(){
	itemSrchParamsReqArr[pageNum%2]=itemSrchParamsReq;
    }
    
    public ItemSearchRequest[] getReqArr(){
	return itemSrchParamsReqArr;
    }
    
    public void validateResponsePagesCount(Items_type3[] items){
	boolean flag=false;
	for(int i=0;i<items.length;i++){
	    flag=flag || items[i].getTotalPages().compareTo(itemSrchParamsReqArr[i].getItemPage())!=0;
	}
	if(!flag)
	    throw new RuntimeException("Error in class Abstractsort applied. Mismatch in"
	    	+ "page counts between request sent and response received");
    }
}
