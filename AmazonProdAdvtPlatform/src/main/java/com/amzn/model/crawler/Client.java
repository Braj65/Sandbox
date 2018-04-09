package com.amzn.model.crawler;

import java.rmi.RemoteException;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amzn.model.crawler.commpacks.requests.RequestContainer;
import com.amzn.model.crawler.commpacks.requests.RequestPool;
import com.amzn.model.crawler.commpacks.response.IResponseHolder;
import com.amzn.model.crawler.commpacks.response.ItemSearchResponseHolder;
import com.amzn.model.crawler.commpacks.response.ResponseHolder;
import com.amzn.model.crawler.stub.StubFactory;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity.AbstractNodeStats;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity.INodeStats;

public class Client {
    
    public static void main(String[] args) throws RemoteException, InterruptedException {	
	/*RequestContainer reqContainer=new RequestContainer();
	//precreate start
	reqContainer.addResponseGroup(new String[] { "ItemAttributes", "Offers", "VariationSummary" });
	reqContainer.createItemSrchReqRepo();
	//precreate over
	reqContainer.addSrchIndexAndNodeIdToSrchReqs("VideoGames", "2591141031");
	reqContainer.addSortParamToSrchReqs(null);
	AbstractSortCrawl crawl=new AbstractSortCrawl(reqContainer);
	
	crawl.crawl();*/
	
	INodeStats nodeStats=new AbstractNodeStats.Builder().setNodeId(Long.valueOf("2591141031"))
		.setSearchIndex("VideoGames")
		.build();
	
	//Create request container pool
	RequestPool reqPool=new RequestPool();
	reqPool.loadWithRequest();
	reqPool.initializeEachReqContainer();
	//
	//take one node stats and fetch one requestcontainer from the pool
	RequestContainer singleReq=reqPool.poll();
	//in the request container load each request with property itempage. After fetching end itempage
	//using the node stats
	singleReq.loadSrchIndexNodeid(nodeStats)
	.loadResponseGroup(new String[] { "ItemAttributes", "Offers", "VariationSummary" })
	.loadSearchRequests();
	int endPageVal=StubFactory.getStubInstance("ItemSearch")
		.executeOperation(singleReq.createAmznSrchReq())
		.convertToItemSearchResp()
		.getTotalPages()
		.intValue();
	
	if(endPageVal>10)
	    endPageVal=10;
	//fetch the sortparams and save with us
	String[] sortParams=reqPool.getSortParams(nodeStats.getSrchIndex());
	if(sortParams==null){
	IResponseHolder response=StubFactory.getStubInstance("ItemSearch")
		.executeOperation(singleReq.setSortParamInSrhcReq("XXX").createAmznSrchReq());
	
	ItemSearchResponseHolder itemSrchResp=response.convertToItemSearchResp();
	
	    if(itemSrchResp.getOpsErrors()!=null)
		sortParams=itemSrchResp.getSortParams();
	    else
		sortParams=itemSrchResp.getSortParamsFromItemOne();
	    singleReq.setSortParam(sortParams);
//	    reqPool.setSortParam(nodeStats.getSrchIndex(), sortParams);
	}
	    
	for(String sortParam:sortParams){
	    singleReq.loadEachReqWithSortParam(sortParam);
	    ItemSearch wrappedReq=null;
	    for(int pageNum=1;pageNum<endPageVal;pageNum+=2){
		try{
		    Thread.sleep(2000);
		    wrappedReq=singleReq.getWrappedReq(pageNum);
		    ResponseHolder resp=StubFactory.getStubInstance("ItemSearch")
			    .executeOperation(wrappedReq);
		    Thread.sleep(1000);
		}catch(Exception e){
		    e.printStackTrace();
		}
	    }
	    if(endPageVal%2!=0){
		wrappedReq=singleReq.getSingleReq(endPageVal);
		StubFactory.getStubInstance("ItemSearch")
		.executeOperation(wrappedReq);
	    }
	}
	
    }

}
