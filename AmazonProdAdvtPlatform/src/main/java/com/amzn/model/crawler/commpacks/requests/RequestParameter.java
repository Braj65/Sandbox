package com.amzn.model.crawler.commpacks.requests;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import org.apache.axis2.databinding.types.PositiveInteger;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest;
import com.amzn.model.crawler.commpacks.response.ResponseHolder;
import com.amzn.model.crawler.stub.AWESProperty;
import com.amzn.model.crawler.stub.StubFactory;
import com.amzn.model.nodesToBeCrawled.nodes.nodeEntity.INodeStats;
import com.amzn.model.nodesToBeCrawled.nodes.nodeEntity.NodeStats;

public class RequestParameter {
    
    /*public Map<String, String> strReqParams=new HashMap<String, String>();
    public Map<String, PositiveInteger> posIntReqParams=new HashMap<String, PositiveInteger>();*/
    public String[] responseGroup;
    public INodeStats incomingNode;
    
    ItemSearchRequest srchRequest;
    
    public RequestParameter createAmznSrchReq(){
	if(srchRequest==null)
	    srchRequest=new ItemSearchRequest();
	return this;
    }
    
    public RequestParameter setSortParam(String sortParam){
	srchRequest.setSort(sortParam);
	return this;
    }
    
    public ResponseHolder dryRequestToFetchMeta(){
	srchRequest.setSearchIndex(incomingNode.getSrchIndex());
	srchRequest.setBrowseNode(incomingNode.getNodeId().toString());
	srchRequest.setItemPage(new PositiveInteger(Integer.toString(1)));
	srchRequest.setResponseGroup(responseGroup);
	/*ItemSearchRequest[] srchReqArr={srchRequest};*/
	ItemSearch itemSrch=new ItemSearch();
	itemSrch.addRequest(srchRequest);
	itemSrch.setAssociateTag(AWESProperty.Value.ASSOCIATE_TAG.getString());
	
	try {
	    return StubFactory.getStubInstance("ItemSearch").executeOperation(itemSrch);
	} catch (RemoteException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return ResponseHolder.NULLINSTANCE;
    }
    
    public void setRespGrp(String[] respGrp){
	responseGroup=respGrp;
    }
    
    public void setNodeStats(INodeStats stats){
	incomingNode=stats;
    }
    
    public void fetchSortParams(){
	
    }
    
    public void loadSrchIndex(String srchIndex){
	
    }
    
    public void loadNodeId(String nodeId){
	
    }
}
