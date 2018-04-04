package com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.request;

import java.util.List;

import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookup;
import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookupRequest;


//purge this class
public class BrowseNodeRequestContainer {
    
    public BrowseNodeLookupRequest bnodeLookupReq;
    public BrowseNodeLookup bnodeLookup;
    
    public BrowseNodeRequestContainer(){
	bnodeLookupReq=new BrowseNodeLookupRequest();
	bnodeLookup=new BrowseNodeLookup();
    }
    
    public void wrapLookupReqInLookup(){
	bnodeLookup.addRequest(bnodeLookupReq);
    }
    
    public void populateLookupReq(String parentNodeId){
	bnodeLookupReq.addBrowseNodeId(parentNodeId);
	bnodeLookupReq.addResponseGroup("BrowseNodeInfo");
    }
}