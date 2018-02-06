package com.amzn.model.crawler.AWSEStub;

public class AWESProperty {
    private final static String slash=System.getProperty("file.separator");
    
    public enum Value{
	AWS_ACCESS_KEY_ID("Access_Key","AKIAJBRG4SMARCVPZXGQ"),
	AWS_SECRET_KEY("Secret_Key","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"),
	AWS_WSDL_DOC("Wsdl_Doc","http://security.amazonaws.com/doc/2007-01-01/");
	
	private final String property, defaultVal;
	private String value;
	private Value(String property, String defaultVal){
	    this.property=property;
	    this.defaultVal=defaultVal;
	}
	
	public String getString(){
	    if(value==null){
		if(defaultVal==null)
		    value=System.getProperty(property);
		else
		    value=System.getProperty(property, defaultVal);
	    }
	    return value;
	}
    }

}
