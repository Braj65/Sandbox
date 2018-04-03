package com.amzn.model.crawler.commpacks.response;

import java.util.List;

import org.apache.axis2.databinding.ADBBean;

import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookupResponse;
import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNode_type0;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Children_type0;
import com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.browseNodes.BrowseNode;

public class NodeLookupResponseHolder extends ResponseHolder{
    
    private BrowseNodeLookupResponse lookupResp;
    private Children_type0 ifChildrenPresent;
    
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
    
    public NodeLookupResponseHolder ifChildrenPresent(){
	ifChildrenPresent=lookupResp.getBrowseNodes()[0].getBrowseNode()[0].getChildren();
	return this;
    }
    
    public BrowseNode_type0[] getChildren(){
	if(ifChildrenPresent!=null)
	    return ifChildrenPresent.getBrowseNode();
	return null;
    }
    
    public void createChildren(BrowseNode_type0[] children){
	if(children==null)
	    return;
	BrowseNode node=new BrowseNode(getParentNodeId());	
	for(BrowseNode_type0 child:children){
	    
	}
    }
    
    public String getParentNodeId(){
	return lookupResp.getBrowseNodes()[0].getBrowseNode()[0]
		.getAncestors().getBrowseNode()[0].getBrowseNodeId();
    }
}
