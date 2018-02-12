package com.amzn.model.crawler.sortParamBased;

import org.apache.axis2.databinding.types.PositiveInteger;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Items_type3;
import com.amzn.model.crawler.reqRespParams.RequestParams;

public abstract class AbstractSortApplied {
    
    private RequestParams requestParams;
    
    public AbstractSortApplied(){
	requestParams=new RequestParams();
    }
    
    public void gamesSearchRequest(){
	requestParams.itemSrchParamsReq.setSearchIndex(RequestParams.getSearchIndex());
	requestParams.itemSrchParamsReq.setBrowseNode(RequestParams.getBrowseNodeIs());
	requestParams.itemSrchParamsReq.setItemPage(new PositiveInteger(Integer.toString(pageNum)));
	requestParams.itemSrchParamsReq.setResponseGroup(ResponseParams.getRespParams());
    }
    
    public void applySortParam(){
	requestParams.itemSrchParamsReq.setSort(sortParam);
    }
    
    public void loadItemSearchArr(){
	requestParams.itemSrchParamsReqArr[pageNum%2]=requestParams.itemSrchParamsReq;
    }
    
    public ItemSearchRequest[] getReqArr(){
	return requestParams.itemSrchParamsReqArr;
    }
    
    public void validateResponsePagesCount(Items_type3[] items){
	boolean flag=false;
	for(int i=0;i<items.length;i++){
	    flag=flag || items[i].getTotalPages().compareTo(requestParams.itemSrchParamsReqArr[i].getItemPage())!=0;
	}
	if(!flag)
	    throw new RuntimeException("Error in class Abstractsort applied. Mismatch in"
	    	+ "page counts between request sent and response received");
    }
}
