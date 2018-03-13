package com.amzn.model.crawler.stub;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axis2.transport.http.HTTPConstants;

import com.amazon.stubs.AWSECommerceServiceStub;
import com.amzn.model.crawler.commpacks.requests.IRequestHolder;
import com.amzn.model.crawler.commpacks.response.NullResponseHolder;
import com.amzn.model.crawler.commpacks.response.ResponseHolder;

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
	public ResponseHolder itemSearch(IRequestHolder searchReq) {
	    return new NullResponseHolder(null);
	}

	@Override
	protected void addStubOperation(String timeStamp) throws Exception {}

	@Override
	public ResponseHolder executeOperation(IRequestHolder sarchReq) {return null;}
	
    }
}
