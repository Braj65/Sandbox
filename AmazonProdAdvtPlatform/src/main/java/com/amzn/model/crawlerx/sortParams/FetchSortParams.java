package com.amzn.model.crawlerx.sortParams;

import java.rmi.RemoteException;

import com.amzn.model.crawlerx.commpacks.RequestHolder;
import com.amzn.model.crawlerx.commpacks.ResponseHolder;
import com.amzn.model.crawlerx.stub.StubFactory;

public class FetchSortParams {
    private RequestHolder request=null;
    private String[] sortParams=null;
    private ResponseHolder response=null;
    
    public FetchSortParams(){
	request=new RequestHolder();
    }
    
    public String[] getSortingParams(){
	try {
	    response=StubFactory.getStubInstance().itemSearch(request);
	} catch (RemoteException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
}
