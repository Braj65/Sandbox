package com.amazon.driver;

import java.util.HashSet;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axis2.transport.http.HTTPConstants;

import com.amazon.driver.keys.AWSKeys;
import com.amazon.stubs.AWSECommerceServiceStub;

import pack.test.SignedRequestsHelper;

public class AbstractDriver {
    
    private static final String AWS_ACCESS_KEY_ID = AWSKeys.AWS_ACCESS_KEY_ID.toString();
    private static final String AWS_SECRET_KEY = AWSKeys.AWS_SECRET_KEY.toString();
    public static AWSECommerceServiceStub stub = null;
    public static HashSet<String> uniq = null;
    
    
    public AbstractDriver(String operation){
	if(stub==null){
	    try{
		stub = new AWSECommerceServiceStub();
		stub._getServiceClient().getOptions().setProperty(HTTPConstants.CHUNKED, "false");
		OMFactory omFactory = OMAbstractFactory.getOMFactory();
		String timestamp = SignedRequestsHelper.soapTimestamp();
		OMElement hdChild1 = omFactory.createOMElement("AWSAccessKeyId",
			"http://security.amazonaws.com/doc/2007-01-01/", "aws");
		hdChild1.setText(AWS_ACCESS_KEY_ID);
		OMElement hdChild2 = omFactory.createOMElement("Timestamp", "http://security.amazonaws.com/doc/2007-01-01/",
			    "aws");
		hdChild2.setText(timestamp);
		SignedRequestsHelper helper = SignedRequestsHelper.getInstance(AWS_SECRET_KEY);
		OMElement hdChild3 = omFactory.createOMElement("Signature", "http://security.amazonaws.com/doc/2007-01-01/",
			    "aws");
		hdChild3.setText(helper.sign(operation, timestamp));
		stub._getServiceClient().addHeader(hdChild1);
		stub._getServiceClient().addHeader(hdChild2);
		stub._getServiceClient().addHeader(hdChild3);
		uniq = new HashSet<String>();
	    }catch(Exception e){
		e.printStackTrace();
	    }	    
	}    
    }
    
    /*public AWSECommerceServiceStub getStub(){
	if(stub==null){
	    new AbstractDriver();
	}
	return stub;
    }*/
    
    public org.apache.axis2.databinding.ADBBean getTestObject(
	        java.lang.Class type) throws java.lang.Exception {
	        return (org.apache.axis2.databinding.ADBBean) type.newInstance();
    }

    /*public Ps4GamesDriver() {
	try {
	    stub = new AWSECommerceServiceStub();
	    stub._getServiceClient().getOptions().setProperty(HTTPConstants.CHUNKED, "false");
	    OMFactory omFactory = OMAbstractFactory.getOMFactory();
	    String timestamp = SignedRequestsHelper.soapTimestamp();
	    OMElement hdChild1 = omFactory.createOMElement("AWSAccessKeyId",
		    "http://security.amazonaws.com/doc/2007-01-01/", "aws");
	    hdChild1.setText("AKIAIKBQ6A3OURFXMVPQ");
	    OMElement hdChild2 = omFactory.createOMElement("Timestamp", "http://security.amazonaws.com/doc/2007-01-01/",
		    "aws");
	    hdChild2.setText(timestamp);
	    SignedRequestsHelper helper = SignedRequestsHelper.getInstance(AWS_SECRET_KEY);
	    OMElement hdChild3 = omFactory.createOMElement("Signature", "http://security.amazonaws.com/doc/2007-01-01/",
		    "aws");
	    hdChild3.setText(helper.sign("ItemSearch", timestamp));
	    stub._getServiceClient().addHeader(hdChild1);
	    stub._getServiceClient().addHeader(hdChild2);
	    stub._getServiceClient().addHeader(hdChild3);
	    uniq = new HashSet<String>();
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }*/    

}
