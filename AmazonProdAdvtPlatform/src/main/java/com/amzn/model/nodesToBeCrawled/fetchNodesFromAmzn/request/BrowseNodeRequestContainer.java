package com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.request;

import java.util.List;

import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookup;
import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookupRequest;
import com.amzn.model.crawler.stub.AWESProperty;


//purge this class
public class BrowseNodeRequestContainer {
    
    public BrowseNodeLookupRequest bnodeLookupReq;
    public BrowseNodeLookup bnodeLookup;
    
    public BrowseNodeRequestContainer(){
	bnodeLookupReq=new BrowseNodeLookupRequest();
	bnodeLookup=new BrowseNodeLookup();
	bnodeLookupReq.addResponseGroup("BrowseNodeInfo");
	bnodeLookup.setAssociateTag(AWESProperty.Value.ASSOCIATE_TAG.getString());
    }
    
    public void wrapLookupReqInLookup(){
	bnodeLookup.addRequest(bnodeLookupReq);
    }
    
    public void populateLookupReq(String parentNodeId){
	bnodeLookupReq.addBrowseNodeId(parentNodeId);
	bnodeLookupReq.addResponseGroup("BrowseNodeInfo");
    }
    
    public BrowseNodeRequestContainer addBrowseNodeId(String nodeId){
	bnodeLookupReq.addBrowseNodeId(nodeId);
	return this;
    }
    
    public BrowseNodeRequestContainer setShared(){
	bnodeLookup.setShared(bnodeLookupReq);
	return this;
    }
}