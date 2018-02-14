package com.amzn.model.crawler;

import com.amzn.model.crawler.stub.StubFactory;

public class Client {
    
    public static void main(String[] args) {
	StubFactory.getStubInstance("ItemSearch");
    }

}
