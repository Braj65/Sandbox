package com.amzn.model.crawler.commpacks.response;

import org.apache.axis2.databinding.ADBBean;

import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookupResponse;

public class NodeLookupResponseHolder implements IResponseHolder{
    
    private BrowseNodeLookupResponse lookupResp=null;
    
    public NodeLookupResponseHolder(ADBBean resp){
	lookupResp=(BrowseNodeLookupResponse) resp;
    }
    
    public BrowseNodeLookupResponse getLookupResp(){
	return lookupResp;
    }
    
    public void setLookupResp(BrowseNodeLookupResponse resp){
	lookupResp=resp;
    }
    
    public String getParentNodeId(){
	return lookupResp.getBrowseNodes()[0].getBrowseNode()[0]
		.getAncestors().getBrowseNode()[0].getBrowseNodeId();
    }
}
