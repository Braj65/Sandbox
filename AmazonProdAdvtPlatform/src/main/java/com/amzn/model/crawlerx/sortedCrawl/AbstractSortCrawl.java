package com.amzn.model.crawlerx.sortedCrawl;

import java.util.List;

import com.amzn.model.crawlerx.commpacks.RequestHolder;
import com.amzn.model.crawlerx.commpacks.ResponseHolder;
import com.amzn.model.crawlerx.stub.StubFactory;

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
