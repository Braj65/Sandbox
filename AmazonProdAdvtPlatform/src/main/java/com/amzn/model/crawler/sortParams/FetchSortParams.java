package com.amzn.model.crawler.sortParams;

import java.rmi.RemoteException;

import com.amzn.model.crawler.commpacks.ResponseHolder;
import com.amzn.model.crawler.commpacks.requests.IRequestHolder;
import com.amzn.model.crawler.commpacks.requests.RequestHolder;
import com.amzn.model.crawler.commpacks.requests.RequestHolderItemSearch;
import com.amzn.model.crawler.stub.StubFactory;

public class FetchSortParams {
    private IRequestHolder request=null;
    private String[] sortParams=null;
    private ResponseHolder response=null;
    
    public FetchSortParams(){
	request=new RequestHolderItemSearch();
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
