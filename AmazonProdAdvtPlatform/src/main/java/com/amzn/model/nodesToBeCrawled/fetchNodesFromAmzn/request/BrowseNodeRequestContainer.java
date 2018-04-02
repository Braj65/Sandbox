package com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.request;

import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookup;
import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookupRequest;

public class BrowseNodeRequestContainer {
    
    protected BrowseNodeLookupRequest bnodeLookupReq;
    protected BrowseNodeLookup bnodeLookup;
    
    public BrowseNodeRequestContainer(){
	bnodeLookupReq=new BrowseNodeLookupRequest();
	bnodeLookup=new BrowseNodeLookup();
    }

}
