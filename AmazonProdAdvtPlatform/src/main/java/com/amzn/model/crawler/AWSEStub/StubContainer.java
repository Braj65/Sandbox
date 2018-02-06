package com.amzn.model.crawler.AWSEStub;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.HTTPConstants;

import com.amazon.stubs.AWSECommerceServiceStub;

public class StubContainer {
    protected static final StubContainer INSTANCE=new StubContainer();
    private static final String ACCESSKEY="AWSAccessKeyId";
    private AWSECommerceServiceStub stub=null;
    
    
    
    private StubContainer(){
	try {
	    stub=new AWSECommerceServiceStub();
	    stub._getServiceClient().getOptions().setProperty(
		    HTTPConstants.CHUNKED, "false");
//	    getChild("AWSAccessKeyId")
	} catch (AxisFault e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}	
    }
    
    private OMElement getChild(String localName, String nameSpaceURI, String prefix){
	return OMAbstractFactory.getOMFactory().createOMElement(localName, nameSpaceURI, prefix);
    }
}
