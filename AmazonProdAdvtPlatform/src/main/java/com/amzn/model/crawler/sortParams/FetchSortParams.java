package com.amzn.model.crawler.sortParams;

import java.rmi.RemoteException;

import com.amzn.model.crawler.commpacks.ResponseHolder;
import com.amzn.model.crawler.commpacks.requests.RequestHolder;
import com.amzn.model.crawler.stub.StubFactory;

public class FetchSortParams {
    private RequestHolder request=null;
    private String[] sortParams=null;
    private ResponseHolder response=null;
    
    public FetchSortParams(){
	request=new RequestHolder();
    }
    
    public String[] getSortingParams(){
	try {
	    response=StubFactory.getStubInstance("ItemSearch").executeOperation(request);
	    if(response.getOpsErrors()!=null){
		return response.getParams();
	    }
	    return response.getParamsFromItemOne();
	} catch (RemoteException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return null;
    }
}
