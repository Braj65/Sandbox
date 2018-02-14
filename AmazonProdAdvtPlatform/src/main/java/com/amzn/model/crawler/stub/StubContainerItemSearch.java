package com.amzn.model.crawler.stub;

import java.rmi.RemoteException;

import com.amzn.model.crawler.commpacks.RequestHolder;
import com.amzn.model.crawler.commpacks.ResponseHolder;

import pack.test.SignedRequestsHelper;

public class StubContainerItemSearch extends StubContainer{
    protected static final StubContainer ITEMSEARCHINSTANCE = new StubContainerItemSearch();
    public static final String OPERATION="ItemSearch";

    @Override
    protected void addStubOperation(String timeStamp) throws Exception {
	stub._getServiceClient().addHeader(getChild("Signature", "http://security.amazonaws.com/doc/2007-01-01/", "aws",
		    SignedRequestsHelper.getInstance(AWESProperty.Value.AWS_SECRET_KEY.getString())
		    .sign(OPERATION, timeStamp)));	
    }

    @Override
    public ResponseHolder executeOperation(RequestHolder sarchReq) {
	return new ResponseHolder(stub.itemSearch(sarchReq.getItemSearch()));
    }
}
