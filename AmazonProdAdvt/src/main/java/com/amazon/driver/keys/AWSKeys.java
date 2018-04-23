package com.amazon.driver.keys;

public enum AWSKeys {
    AWS_ACCESS_KEY_ID("AKIAJBXXQMJM7ZVB3DLQ"),
    AWS_SECRET_KEY("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");
    
    private String key;
    
    AWSKeys(String key){
	this.key=key;
    }
    
    public String toString(){
	return key;
    }
}
