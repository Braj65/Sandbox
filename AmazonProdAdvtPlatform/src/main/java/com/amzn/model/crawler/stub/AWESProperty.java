package com.amzn.model.crawler.stub;

public class AWESProperty {
    
    public enum Value{
	AWS_ACCESS_KEY_ID("Access_Key","AKIAJLICBVBSGNV5NAKA"),
	AWS_SECRET_KEY("Secret_Key","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"),
	AWS_WSDL_DOC("Wsdl_Doc","http://security.amazonaws.com/doc/2007-01-01/"),
	ASSOCIATE_TAG("Associate_Tag","isnnfoiwnit0d-21");
	
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
