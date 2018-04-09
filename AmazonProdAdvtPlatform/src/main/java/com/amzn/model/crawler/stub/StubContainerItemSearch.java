package com.amzn.model.crawler.stub;

import java.rmi.RemoteException;

import org.apache.axis2.databinding.ADBBean;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amzn.model.crawler.commpacks.response.IResponseHolder;
import com.amzn.model.crawler.commpacks.response.ItemSearchResponseHolder;

import pack.test.SignedRequestsHelper;

public class StubContainerItemSearch extends AbsStubContainer{
    protected static final AbsStubContainer ITEMSEARCHINSTANCE = new StubContainerItemSearch();
    public static final String OPERATION="ItemSearch";
    
    private StubContainerItemSearch(){
	super();
    }

    @Override
    protected void addStubOperation(String timeStamp) throws Exception {
	stub._getServiceClient().addHeader(getChild("Signature", "http://security.amazonaws.com/doc/2007-01-01/", "aws",
		    SignedRequestsHelper.getInstance(AWESProperty.Value.AWS_SECRET_KEY.getString())
		    .sign(OPERATION, timeStamp)));
    }

    @Override
    public IResponseHolder executeOperation(ADBBean searchReq) throws RemoteException {
	return new ItemSearchResponseHolder(stub.itemSearch((ItemSearch)searchReq));
    }
}
