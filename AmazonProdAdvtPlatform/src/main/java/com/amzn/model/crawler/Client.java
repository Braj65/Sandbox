package com.amzn.model.crawler;

import java.util.HashMap;
import java.util.Iterator;

import org.apache.axis2.databinding.types.PositiveInteger;

import com.amzn.model.crawler.commpacks.requests.RequestContainer;
import com.amzn.model.crawler.commpacks.response.ResponseItem;
import com.amzn.model.crawler.sortedCrawl.AbstractSortCrawl;
import com.amzn.model.crawler.stub.StubFactory;

public class Client {
    
    public static void main(String[] args) {	
	RequestContainer reqContainer=new RequestContainer();
	//precreate start
	reqContainer.addResponseGroup(new String[] { "ItemAttributes", "Offers", "VariationSummary" });
	reqContainer.createItemSrchReqRepo();
	//precreate over
	reqContainer.addSrchIndexAndNodeIdToSrchReqs("VideoGames", "2591141031");
	reqContainer.addSortParamToSrchReqs(null);
	AbstractSortCrawl crawl=new AbstractSortCrawl(reqContainer);
	
	crawl.crawl();
	
	//Create request container pool
	RequestPool reqPool=new RequestPool();
	reqPool.loadWithRequests();
	//
	//take one node stats and fetch one requestcontainer from the pool
	RequestContainer singleReq=reqPool.poll();
	//in the request container load each request with property itempage. After fetching end itempage
	//using the node stats
	int endPageVal=singleReq.loadEachReqWithItemPage(nodeStats);
	//fetch the sortparams and save with us
	String[] sortParms=singleReq.getSortParams();
	
	for(String sortParam:sortParams){
	    singleReq.loadEachReqWithSortParam(sortParam);
	    ItemSearch wrappedReq=null;
	    for(int pageNum=1;pageNum<endPageVal;pageNum++){
		wrappedReq=singleReq.getWrappedReq(pageNum);
		StubFactory.getStubInstance("ItemSearch").executeOperation(wrappedReq);
	    }
	    if(endPageVal%2!=0){
		wrappedReq=singleReq.getSingleReq(endPageVal);
		StubFactory.getStubInstance("ItemSearch").executeOperation(wrappedReq);
	    }
	}
	
    }

}
