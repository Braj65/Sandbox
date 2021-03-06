package com.amzn.model.crawler.stub;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axis2.databinding.ADBBean;
import org.apache.axis2.transport.http.HTTPConstants;

import com.amazon.stubs.AWSECommerceServiceStub;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amzn.model.crawler.commpacks.response.IResponseHolder;
import com.amzn.model.crawler.commpacks.response.NullResponseHolder;

import pack.test.SignedRequestsHelper;

public abstract class AbsStubContainer implements IStubContainer{
    protected static final NullStubContainer NULLINSTANCE = new NullStubContainer();
    protected AWSECommerceServiceStub stub = null;

    protected AbsStubContainer() {	
	try {
	    String timeStamp=SignedRequestsHelper.soapTimestamp();
	    stub = new AWSECommerceServiceStub();
	    stub._getServiceClient().getOptions().setProperty(HTTPConstants.CHUNKED, "false");
	    stub._getServiceClient()
		    .addHeader(getChild("AWSAccessKeyId", "http://security.amazonaws.com/doc/2007-01-01/", "aws",
			    AWESProperty.Value.AWS_ACCESS_KEY_ID.getString()));
	    
	    stub._getServiceClient().addHeader(getChild("Timestamp", "http://security.amazonaws.com/doc/2007-01-01/", "aws",
		    timeStamp));
	    
	    addStubOperation(timeStamp);
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
    
    protected abstract void addStubOperation(String timeStamp) throws Exception;
    
    protected OMElement getChild(String localName, String nameSpaceURI, String prefix, String key) {
	OMElement hdChild = OMAbstractFactory.getOMFactory().createOMElement(localName, nameSpaceURI, prefix);
	hdChild.setText(key);
	return hdChild;
    }

    public static class NullStubContainer extends AbsStubContainer {
	
	@Override
	protected void addStubOperation(String timeStamp) throws Exception {}

	@Override
	public IResponseHolder executeOperation(ADBBean sarchReq) {return null;}
	
    }
}
