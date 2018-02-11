package com.amzn.model.crawler.crawl;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchResponse;
import com.amzn.model.crawler.AWSEStub.AWESProperty;
import com.amzn.model.crawler.AWSEStub.StubFactory;
import com.amzn.model.crawler.sortParamBased.AbstractSortApplied;

public class BatchExecutor {
    private ItemSearchResponse resp=null;
    private ItemSearch itemSearchReq=null;
    private AbstractSortApplied batchSearchParams=null;
    
    public BatchExecutor(AbstractSortApplied batchSearchParams){
	this.batchSearchParams=batchSearchParams;
	itemSearchReq=new ItemSearch();
    }
    
    public void loadSearchReq(){
	itemSearchReq.setRequest(batchSearchParams.getReqArr());
	itemSearchReq.setAssociateTag(AWESProperty.Value.ASSOCIATE_TAG.getString());
	resp=StubFactory.getStubInstance().itemSearch(itemSearchReq);
    }
    
    public ItemSearchResponse getResponse(){
	return resp;
    }
    
    public void validateResponsePagesCount(){
	batchSearchParams.validateResponsePagesCount(resp.getItems());
    }
    
    
}
