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

public class StubContainer {
    protected static final StubContainer INSTANCE = new StubContainer();
    protected static final NullStubContainer NULLINSTANCE = INSTANCE.new NullStubContainer();
    private AWSECommerceServiceStub stub = null;
    private static final String ACCESSKEY = "AWSAccessKeyId";

    protected StubContainer() {
	try {
	    stub = new AWSECommerceServiceStub();
	} catch (AxisFault e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	stub._getServiceClient().getOptions().setProperty(HTTPConstants.CHUNKED, "false");
	// getChild("AWSAccessKeyId")
    }

    private OMElement getChild(String localName, String nameSpaceURI, String prefix) {
	return OMAbstractFactory.getOMFactory().createOMElement(localName, nameSpaceURI, prefix);
    }

    public ResponseHolder itemSearch(RequestHolder sarchReq) throws RemoteException {
	return new ResponseHolder(stub.itemSearch(sarchReq.getItemSearch()));
    }
    
    public class NullStubContainer extends StubContainer{
	public ResponseHolder itemSearch(RequestHolder searchReq){
	    return new NullResponseHolder(null);
	}
    }
}
