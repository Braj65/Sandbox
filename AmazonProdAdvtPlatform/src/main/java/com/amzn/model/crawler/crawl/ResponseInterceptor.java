package com.amzn.model.crawler.crawl;

import com.amazon.webservices.awsecommerceservice._2013_08_01.Items_type3;

public class ResponseInterceptor {
    BatchExecutor executor=null;
    Items_type3[] itemsFromResponse=null;
    
    public ResponseInterceptor(BatchExecutor executor){
	this.executor=executor;
	itemsFromResponse=executor.getResponse().getItems();
    }
    
    public void getErrorsInResponse(){
	System.out.println(executor.getResponse()
		.getOperationRequest().getErrors().getError()[0].getMessage());
    }
    
    public void validateResponsePagesCount(){
	executor.validateResponsePagesCount();
    }

}
