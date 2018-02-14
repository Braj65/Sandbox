package com.amzn.model.crawler.stub;

import com.amzn.model.crawler.commpacks.RequestHolder;
import com.amzn.model.crawler.commpacks.ResponseHolder;

import pack.test.SignedRequestsHelper;

public class StubContainerNodeLookup extends StubContainer{
    protected static final StubContainer NODELOOKUPINSTANCE = new StubContainerNodeLookup();
    public static final String OPERATION="BrowseNodeLookup";

    @Override
    protected void addStubOperation(String timeStamp) throws Exception {
	stub._getServiceClient().addHeader(getChild("Signature", "http://security.amazonaws.com/doc/2007-01-01/", "aws",
		    SignedRequestsHelper.getInstance(AWESProperty.Value.AWS_SECRET_KEY.getString())
		    .sign(OPERATION, timeStamp)));	
    }
    
    @Override
    public ResponseHolder executeOperation(RequestHolder sarchReq) {
	return new ResponseHolder(stub.browseNodeLookup(searchReq.getBrowseNodeLookup()));
    }
}
