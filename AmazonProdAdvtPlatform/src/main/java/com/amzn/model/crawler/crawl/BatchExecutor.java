package com.amzn.model.crawler.crawl;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchResponse;
import com.amzn.model.crawler.AWSEStub.AWESProperty;
import com.amzn.model.crawler.AWSEStub.StubFactory;
import com.amzn.model.crawler.sortParamBased.AbstractSortApplied;

public class BatchExecutor {
    ItemSearchResponse resp=null;
    ItemSearch itemSearchReq=null;
    
    public BatchExecutor(){
	itemSearchReq=new ItemSearch();
    }
    
    public void loadSearchReq(AbstractSortApplied batchSearchParams){
	itemSearchReq.setRequest(batchSearchParams.getReqArr());
	itemSearchReq.setAssociateTag(AWESProperty.Value.ASSOCIATE_TAG.getString());
	resp=StubFactory.getStubInstance().itemSearch(itemSearchReq);
    }
    
    public void getErrorsInResponse(){
	System.out.println(resp.getOperationRequest().getErrors().getError()[0].getMessage());
    }
}
