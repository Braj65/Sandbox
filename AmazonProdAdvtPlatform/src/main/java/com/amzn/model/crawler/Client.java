package com.amzn.model.crawler;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amzn.model.crawler.commpacks.requests.RequestContainer;
import com.amzn.model.crawler.commpacks.requests.RequestPool;
import com.amzn.model.crawler.commpacks.response.ResponseHolder;
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
	reqPool.loadWithRequest();
	reqPool.initializeEachReqContainer();
	//
	//take one node stats and fetch one requestcontainer from the pool
	RequestContainer singleReq=reqPool.poll();
	//in the request container load each request with property itempage. After fetching end itempage
	//using the node stats
	singleReq.loadNodeStats(nodeStats);
	singleReq.addResponseGroup(new String[] { "ItemAttributes", "Offers", "VariationSummary" });
	int endPageVal=singleReq.reqParameters.createAmznSrchReq()
		.dryRequestToFetchMeta().getTotalPages().intValue();
	
	//fetch the sortparams and save with us
	String[] sortParams=reqPool.getSortParams(nodeStats.getSrchIndex());
	if(sortParams==null){
	ResponseHolder response=singleReq.reqParameters.createAmznSrchReq().setSortParam("XXX")
			.dryRequestToFetchMeta();
	    if(response.getOpsErrors()!=null)
		sortParams=response.getSortParams();
	    else
		sortParams=response.getSortParamsFromItemOne();
	    reqPool.setSortParam(nodeStats.getSrchIndex(), sortParams);
	}
	    
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
