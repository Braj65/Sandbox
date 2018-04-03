package com.amzn.model.crawler.commpacks.response;

import org.apache.axis2.databinding.ADBBean;

import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookupResponse;

public class NodeLookupResponseHolder extends ResponseHolder{
    
    private BrowseNodeLookupResponse lookupResp;
    
    public NodeLookupResponseHolder(ADBBean resp){
	super(resp);
	lookupResp=(BrowseNodeLookupResponse) resp;
    }
    
    

}
