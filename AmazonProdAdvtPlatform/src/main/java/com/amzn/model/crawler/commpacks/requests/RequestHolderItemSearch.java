package com.amzn.model.crawler.commpacks.requests;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.apache.axis2.databinding.ADBBean;

import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookup;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest;
import com.amzn.model.crawler.commpacks.requestParams.RequestParams;
import com.amzn.model.crawler.stub.AWESProperty;

public class RequestHolderItemSearch extends AbsRequestHolder {
    
    //
    protected LinkedList<ItemSearchRequest[]> listReqArrBiGrouped=null;
    
    public RequestHolderItemSearch(RequestParams requestParams){
	this.requestParams=requestParams;
	listReqArrBiGrouped=new LinkedList<ItemSearchRequest[]>();
	requestArr=new ItemSearchRequest[requestParams.getItemPageEnd().intValue()+1];
//	requestArr=new ItemSearchRequest[posIntReqParams.get("itemPageEnd").intValue()+1];
	requestContainer=new ItemSearch();
    }
    
    public void createItemSearchRequest(){
	requestParams.loadRequest(this);
	loadSrchReqArrList();
    }
    
    public void createRequestForFetchSortParams(){
	
    }
    
    public void loadSrchReqArrList(){
	for(int i=requestParams.getItemPageStart().intValue();i<=requestParams.getItemPageEnd().intValue();
		i+=2){
	    ItemSearchRequest[] subArr={(ItemSearchRequest) requestArr[i],
		    (ItemSearchRequest) requestArr[i+1]};
	    listReqArrBiGrouped.add(subArr);
	}
    }
    
    public ItemSearchRequest getSingleItemSearch(){
	return new ItemSearchRequest();
    }
    
    public ADBBean getReqContainer(){
	requestContainer.setRequest(listReqArrBiGrouped.getFirst());
	requestContainer.setAssociateTag(AWESProperty.Value.ASSOCIATE_TAG.getString());
	return requestContainer;
    }

    @Override
    public ADBBean[] getReqArr() {
	return requestArr;
    }
}
