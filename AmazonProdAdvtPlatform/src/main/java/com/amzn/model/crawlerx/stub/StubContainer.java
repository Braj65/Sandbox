package com.amzn.model.crawlerx.stub;

import java.rmi.RemoteException;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.HTTPConstants;

import com.amazon.stubs.AWSECommerceServiceStub;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchResponse;
import com.amzn.model.crawlerx.commpacks.NullResponseHolder;
import com.amzn.model.crawlerx.commpacks.RequestHolder;
import com.amzn.model.crawlerx.commpacks.ResponseHolder;

import pack.test.SignedRequestsHelper;

public abstract class StubContainer {
    protected static final StubContainer INSTANCE = new StubContainer();
    protected static final NullStubContainer NULLINSTANCE = INSTANCE.new NullStubContainer();
    protected AWSECommerceServiceStub stub = null;
    private static String operation = null;

    protected StubContainer() {	
	try {
	    String timeStamp=SignedRequestsHelper.soapTimestamp();
	    stub = new AWSECommerceServiceStub();
	    stub._getServiceClient().getOptions().setProperty(HTTPConstants.CHUNKED, "false");
	    stub._getServiceClient()
		    .addHeader(getChild("AWSAccessKeyId", "http://security.amazonaws.com/doc/2007-01-01/", "aws",
			    AWESProperty.Value.AWS_ACCESS_KEY_ID.getString()));
	    
	    stub._getServiceClient().addHeader(getChild("Timestamp", "http://security.amazonaws.com/doc/2007-01-01/", "aws",
		    timeStamp));

	    stub._getServiceClient().addHeader(getChild("Signature", "http://security.amazonaws.com/doc/2007-01-01/", "aws",
		    SignedRequestsHelper.getInstance(AWESProperty.Value.AWS_SECRET_KEY.getString())
		    .sign(operation, timeStamp)));
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
    
    protected abstract void addStubOperation(String timeStamp);

    private OMElement getChild(String localName, String nameSpaceURI, String prefix, String key) {
	OMElement hdChild = OMAbstractFactory.getOMFactory().createOMElement(localName, nameSpaceURI, prefix);
	hdChild.setText(key);
	return hdChild;
    }

    public ResponseHolder itemSearch(RequestHolder sarchReq) throws RemoteException {
	return new ResponseHolder(stub.itemSearch(sarchReq.getItemSearch()));
    }

    public class NullStubContainer extends StubContainer {
	public ResponseHolder itemSearch(RequestHolder searchReq) {
	    return new NullResponseHolder(null);
	}
    }
}
