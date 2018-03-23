package com.amzn.model.crawler.commpacks.requests;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import org.apache.axis2.databinding.ADBBean;
import org.apache.axis2.databinding.types.PositiveInteger;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchResponse;
import com.amzn.model.crawler.commpacks.response.NullResponseHolder;
import com.amzn.model.crawler.commpacks.response.ResponseHolder;
import com.amzn.model.crawler.stub.AWESProperty;
import com.amzn.model.crawler.stub.StubFactory;
import com.amzn.model.nodesToBeCrawled.nodes.nodeEntity.NodeStats;

public class RequestContainer {
    
    private final Integer ITEM_PAGE_START_FOR_PRECREATE=1, ITEM_PAGE_END_FOR_PRECREATE=10;
    
    private RequestParameter reqParameters;
    private NodeStats incomingNode;
    
    private ItemSearchRequest srchReq;
    private ItemSearchRequest srchReqArr[]=new ItemSearchRequest[ITEM_PAGE_END_FOR_PRECREATE];
    private ItemSearch srchReqContainer=new ItemSearch();
    
    public RequestContainer(String[] respGrp){
	reqParameters=new RequestParameter(respGrp);
    }
    
    public void createItemSrchRepo(){
	int currentPage=ITEM_PAGE_START_FOR_PRECREATE;
	while(currentPage<=ITEM_PAGE_END_FOR_PRECREATE){
	    srchReq=new ItemSearchRequest();
	    srchReqArr[currentPage-1]=srchReq;
	    currentPage++;
	}
    }
    
    public void loadNodeStats(NodeStats stats){
	incomingNode=stats;
    }
    
    public int loadEachReqWithItemPage(NodeStats node){
	srchReqArr[0].setSearchIndex(node.getSearchIndex());
	srchReqArr[0].setBrowseNode(node.getNodeId().toString());
	srchReqArr[0].setItemPage(new PositiveInteger(Integer.toString(1)));
	
	return runRequest().getTotalPages().intValue();
    }
    
    public ResponseHolder runRequest(){	
	ItemSearchRequest[] singleReq={srchReqArr[0]};
	srchReqContainer.setRequest(singleReq);
	srchReqContainer.setAssociateTag(AWESProperty.Value.ASSOCIATE_TAG.getString());
	
	try {
	    return StubFactory.getStubInstance("ItemSearch").executeOperation(srchReqContainer);
	} catch (RemoteException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return ResponseHolder.NULLINSTANCE;
    }
    
    /*public void createItemSrchReqRepo(){
	int currentPage=ITEM_PAGE_START_FOR_PRECREATE;
	while(currentPage<=ITEM_PAGE_END_FOR_PRECREATE){
	    srchReq=new ItemSearchRequest();
	    srchReq.setItemPage(new PositiveInteger(Integer.toString(currentPage)));
	    srchReq.setResponseGroup(responseGroup);
	    srchReqArr[currentPage-1]=srchReq;
	    currentPage++;
	}
	currentPage=ITEM_PAGE_START_FOR_PRECREATE;
    }*/
    
    public void addResponseGroup(String[] respGrp){
	responseGroup=respGrp;
    }
    
    public void addSrchIndexAndNodeIdToSrchReqs(String srchIndex, String nodeId){
	for(ItemSearchRequest srchReq:srchReqArr){
	    srchReq.setSearchIndex(srchIndex);
	    srchReq.setBrowseNode(nodeId);
	}
    }
    
    public void addSortParamToSrchReqs(String sortParam){
	for(ItemSearchRequest srchReq:srchReqArr){
	    srchReq.setSort(sortParam);
	}
    }
    
    public ADBBean getSrchReqContainer(int reqPosition){
	srchReqContainer.setRequest(new ItemSearchRequest[]{srchReqArr[reqPosition-1], srchReqArr[reqPosition]});
	srchReqContainer.setAssociateTag(AWESProperty.Value.ASSOCIATE_TAG.getString());
	return srchReqContainer;
    }
    
    public ADBBean getSingleReqLoadedContainer(int reqPosition){
	srchReqContainer.setRequest(new ItemSearchRequest[]{srchReqArr[reqPosition]});
	srchReqContainer.setAssociateTag(AWESProperty.Value.ASSOCIATE_TAG.getString());
	return srchReqContainer;
    }
}
