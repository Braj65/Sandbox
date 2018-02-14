package com.amzn.model.crawler.commpacks.requests;

import org.apache.axis2.databinding.ADBBean;

import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookup;
import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookupRequest;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amzn.model.crawler.commpacks.requestParams.RequestParams;

public class RequestHolderBrowseNodeLookup extends AbsRequestHolder{
    
    public RequestHolderBrowseNodeLookup(RequestParams requestParams){
	this.requestParams=requestParams;
	request=new BrowseNodeLookupRequest();
	requestArr=new BrowseNodeLookupRequest[1];
	
    }
    
    public void createBrowseNodeRequest(){
	
    }

    @Override
    public ADBBean getReqContainer() {
	// TODO Auto-generated method stub
	return null;
    }
}
