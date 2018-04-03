package com.amzn.model.crawler.commpacks.response;

import org.apache.axis2.databinding.ADBBean;

public class ResponseHolder {
    
    private ADBBean responseObj;
    
    public ResponseHolder(ADBBean resp){
	responseObj=resp;
    }
    
    public ItemSearchResponseHolder convertToItemSearchResp(){
	return new ItemSearchResponseHolder(responseObj);
    }
    
    public NodeLookupResponseHolder convertToNodeLookupResp(){
	return new NodeLookupResponseHolder(responseObj);
    }

}
