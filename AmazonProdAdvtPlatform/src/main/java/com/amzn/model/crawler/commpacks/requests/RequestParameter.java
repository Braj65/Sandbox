package com.amzn.model.crawler.commpacks.requests;

import java.util.HashMap;
import java.util.Map;

import org.apache.axis2.databinding.types.PositiveInteger;

public class RequestParameter {
    
    public Map<String, String> strReqParams=new HashMap<String, String>();
    public Map<String, PositiveInteger> posIntReqParams=new HashMap<String, PositiveInteger>();
    public String[] responseGroup;
    
    public RequestParameter(String[] respGrp){
	responseGroup=respGrp;
    }
    
    public void fetchItemPageCnt(){
	
    }
    
    public void fetchSortParams(){
	
    }
    
    public void loadSrchIndex(String srchIndex){
	
    }
    
    public void loadNodeId(String nodeId){
	
    }
}
