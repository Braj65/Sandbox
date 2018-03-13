package com.amzn.model.crawler.sortedCrawl;

import java.util.List;

import com.amzn.model.crawler.commpacks.requests.IRequestHolder;
import com.amzn.model.crawler.commpacks.response.ResponseHolder;
import com.amzn.model.crawler.stub.StubFactory;

public class AbstractSortCrawl {
    private IRequestHolder request;
    private ResponseHolder response;
    private List<IRequestHolder> failedRequests;
     
    private static final Integer PAGECOUNT=10;
    
    public AbstractSortCrawl(IRequestHolder request){
	for(int i=1;i<=PAGECOUNT/2;i++){
	    try{
		response=StubFactory.getStubInstance("ItemSearch").executeOperation(request);
		response.parseForItems();
	    }catch(Exception e){
		failedRequests.add(request);
	    }
	}
    }

}
