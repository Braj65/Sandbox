package com.amazon.driver.keys;

public enum AWSKeys {
    AWS_ACCESS_KEY_ID("AKIAJBRG4SMARCVPZXGQ"),
    AWS_SECRET_KEY("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");
    
    private String key;
    
    AWSKeys(String key){
	this.key=key;
    }
    
    public String toString(){
	return key;
    }
}
