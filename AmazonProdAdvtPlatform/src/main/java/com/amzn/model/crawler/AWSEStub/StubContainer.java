package com.amzn.model.crawler.AWSEStub;

import org.apache.axiom.om.OMFactory;
import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.HTTPConstants;

import com.amazon.stubs.AWSECommerceServiceStub;

public class StubContainer {
    protected static final StubContainer INSTANCE=new StubContainer();
    private AWSECommerceServiceStub stub=null;
    
    private StubContainer(){
	OMFactory omFactory=null;
	try {
	    stub=new AWSECommerceServiceStub();
	    stub._getServiceClient().getOptions().setProperty(
		    HTTPConstants.CHUNKED, "false");
	    
	    
	} catch (AxisFault e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
    }
}
