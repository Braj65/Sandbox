package com.amzn.model.crawler.sortParams;

import java.rmi.RemoteException;

import com.amzn.model.crawler.commpacks.requestParams.RequestParams;
import com.amzn.model.crawler.commpacks.requests.IRequestHolder;
import com.amzn.model.crawler.commpacks.requests.RequestHolderItemSearch;
import com.amzn.model.crawler.commpacks.response.ResponseHolder;
import com.amzn.model.crawler.stub.StubFactory;

public class FetchSortParams {
    private IRequestHolder request=null;
    private ResponseHolder response=null;
    
    public FetchSortParams(/*RequestParams requestParams*/){
	request=new RequestHolderItemSearch(/*requestParams*/);
    }
    
    public String[] getSortingParams(){
	try {
	    response=StubFactory.getStubInstance("ItemSearch").executeOperation(request);
	    if(response.getOpsErrors()!=null){
		return response.getSortParams();
	    }
	    return response.getSortParamsFromItemOne();
	} catch (RemoteException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return new String[0];
    }
}
