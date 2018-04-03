package com.amzn.model.crawler.commpacks.response;

import java.util.List;

import org.apache.axis2.databinding.ADBBean;

import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookupResponse;
import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNode_type0;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Children_type0;
import com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.browseNodes.BrowseNode;

public class NodeLookupResponseHolder extends ResponseHolder{
    
    private BrowseNodeLookupResponse lookupResp;
    
    public NodeLookupResponseHolder(ADBBean resp){
	super(resp);
	lookupResp=(BrowseNodeLookupResponse) resp;
    }
    
    public BrowseNodeLookupResponse getLookupResp(){
	return lookupResp;
    }
    
    public void setResp(BrowseNodeLookupResponse resp){
	lookupResp=resp;
    }
}
