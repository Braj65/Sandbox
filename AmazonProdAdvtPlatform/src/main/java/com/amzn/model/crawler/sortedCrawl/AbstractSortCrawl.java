package com.amzn.model.crawler.sortedCrawl;

import java.util.List;

import com.amzn.model.crawler.commpacks.ResponseHolder;
import com.amzn.model.crawler.commpacks.requests.RequestHolder;
import com.amzn.model.crawler.stub.StubFactory;

public class AbstractSortCrawl {
    private RequestHolder request;
    private ResponseHolder response;
    private List<RequestHolder> failedRequests;
     
    private static final Integer PAGECOUNT=10;
    
    public AbstractSortCrawl(RequestHolder request){
	for(int i=1;i<=PAGECOUNT/2;i++){
	    try{
		response=StubFactory.getStubInstance().itemSearch(request);
	    }catch(Exception e){
		failedRequests.add(request);
	    }
	}
    }

}
