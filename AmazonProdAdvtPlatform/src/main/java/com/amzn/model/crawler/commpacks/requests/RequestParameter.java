package com.amzn.model.crawler.commpacks.requests;

import java.util.HashMap;
import java.util.Map;

import org.apache.axis2.databinding.types.PositiveInteger;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest;
import com.amzn.model.nodesToBeCrawled.nodes.nodeEntity.NodeStats;

public class RequestParameter {
    
    public Map<String, String> strReqParams=new HashMap<String, String>();
    public Map<String, PositiveInteger> posIntReqParams=new HashMap<String, PositiveInteger>();
    public String[] responseGroup;
    
    public RequestParameter(String[] respGrp){
	responseGroup=respGrp;
    }
    
    public void fetchItemPageCnt(NodeStats nodeStat){
	ItemSearchRequest srchRequest=new ItemSearchRequest();
	srchRequest.setSearchIndex(nodeStat.getSearchIndex());
	strReqParams.put("srchIndex", nodeStat.getSearchIndex());
	srchRequest.setBrowseNode(nodeStat.getNodeId().toString());
	srchRequest.setItemPage(new PositiveInteger(Integer.toString(1)));
    }
    
    public void fetchSortParams(){
	
    }
    
    public void loadSrchIndex(String srchIndex){
	
    }
    
    public void loadNodeId(String nodeId){
	
    }
}
