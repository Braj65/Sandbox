package com.amzn.model.crawler.commpacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest;
import com.amzn.model.crawler.stub.AWESProperty;

public class RequestHolder {
    
    protected ItemSearchRequest itemSrchRequest=null;
    protected ItemSearchRequest[] itemSrchRequestArr=null;
    protected ItemSearch srchRequestContainer=null;
    protected RequestParams requestParams=null;
    //
    protected Stack<ItemSearchRequest[]> listReqArrBiGrouped=null;
    
    public RequestHolder(RequestParams requestParams){
	listReqArrBiGrouped=new Stack<ItemSearchRequest[]>();
	itemSrchRequestArr=new ItemSearchRequest[requestParams.getItemPageEnd().intValue()];
	srchRequestContainer=new ItemSearch();
    }
    
    public void createRequest(){
	requestParams.loadRequest(this);
	loadSrchReqArrList();
    }
    
    public void createRequestForFetchSortParams(){
	
    }
    
    public void loadSrchReqArrList(){
	for(int i=requestParams.getItemPageStart().intValue();i<requestParams.getItemPageEnd().intValue();
		i+=2){
	    ItemSearchRequest[] subArr={itemSrchRequestArr[i], itemSrchRequestArr[i+1]};
	    listReqArrBiGrouped.push(subArr);
	}
    }
    
    public ItemSearchRequest getSingleItemSearch(){
	return new ItemSearchRequest();
    }
    public ItemSearch getItemSearch(){
	srchRequestContainer.setRequest(listReqArrBiGrouped.pop());
	srchRequestContainer.setAssociateTag(AWESProperty.Value.ASSOCIATE_TAG.getString());
	return srchRequestContainer;
    }

}
