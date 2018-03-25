package com.amzn.model.crawler.commpacks.requests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RequestPool {
    
    public static final int POOLSIZE=10;
    List<RequestContainer> pool=new ArrayList<RequestContainer>();
    Map<String, String[]> sortParamRepo=new HashMap<String, String[]>();
    
    
    public void loadWithRequest(){
	int counter=0;
	while(counter++<POOLSIZE){
	    pool.add(new RequestContainer());
	}
    }
    
    public void initializeEachReqContainer(){
	for(RequestContainer reqCon:pool){
	    reqCon.createItemSrchRepo();
	}
    }
    
    public RequestContainer poll(){
	return pool.remove(0);
    }
    
    public void setSortParam(String srchIndex, String[] params){
	sortParamRepo.put(srchIndex, params);
    }
    
    public void getSortParam(String srchIndex){
	sortParamRepo.get(srchIndex);
    }

}
