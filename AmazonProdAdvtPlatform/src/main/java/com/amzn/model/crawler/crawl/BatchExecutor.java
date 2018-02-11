package com.amzn.model.crawler.crawl;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchResponse;

public class BatchExecutor {
    ItemSearchResponse resp=null;
    ItemSearch itemSearchReq=null;
    
    public BatchExecutor(){
	itemSearchReq=new ItemSearch();
    }
    
    public void loadSearchReq(){
	
    }
}
