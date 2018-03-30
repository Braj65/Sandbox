package com.amzn.model.crawler.commpacks.requests;

import java.rmi.RemoteException;

import org.apache.axis2.databinding.ADBBean;
import org.apache.axis2.databinding.types.PositiveInteger;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest;
import com.amzn.model.crawler.commpacks.response.ResponseHolder;
import com.amzn.model.crawler.stub.AWESProperty;
import com.amzn.model.crawler.stub.StubFactory;
import com.amzn.model.nodesToBeCrawled.nodes.nodeEntity.INodeStats;
import com.amzn.model.nodesToBeCrawled.nodes.nodeEntity.NodeStats;

public class RequestContainer {
    
    private final Integer ITEM_PAGE_START_FOR_PRECREATE=1, ITEM_PAGE_END_FOR_PRECREATE=10;
    
    public RequestParameter reqParameters;
    private INodeStats incomingNode;
    public String[] responseGroup;
    
    private ItemSearchRequest srchRequest;
    private ItemSearchRequest srchReqArr[]=new ItemSearchRequest[ITEM_PAGE_END_FOR_PRECREATE];
    private ItemSearch srchReqContainer;

    public RequestContainer(){
	reqParameters=new RequestParameter();
	srchReqContainer=new ItemSearch();
    }
    //STARTS
    public ItemSearch createAmznSrchReq(){
	if(srchRequest==null){
	    srchRequest=new ItemSearchRequest();
	    srchRequest.setSearchIndex(incomingNode.getSrchIndex());
	    srchRequest.setBrowseNode(incomingNode.getNodeId().toString());
	    srchRequest.setItemPage(new PositiveInteger(Integer.toString(1)));
	    srchRequest.setResponseGroup(responseGroup);
	    //
	    srchReqContainer.addRequest(srchRequest);
//	    srchReqContainer.setAssociateTag(AWESProperty.Value.ASSOCIATE_TAG.getString());
	}
	return srchReqContainer;
    }
    
    public RequestContainer setSortParam(String sortParam){
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
    //ENDS
    public void createItemSrchRepo(){
	int currentPage=ITEM_PAGE_START_FOR_PRECREATE;
	while(currentPage<=ITEM_PAGE_END_FOR_PRECREATE){
	    srchReqArr[currentPage-1]=new ItemSearchRequest();
	    currentPage++;
	}
	srchReqContainer.setAssociateTag(AWESProperty.Value.ASSOCIATE_TAG.getString());
    }
    
    public ItemSearch getWrappedReq(int pageNum){
	srchReqArr[pageNum%10].setItemPage(new PositiveInteger(new Integer(pageNum).toString()));
	srchReqArr[(pageNum+1)%10].setItemPage(new PositiveInteger(new Integer(pageNum+1).toString()));
	srchReqContainer.setRequest(new ItemSearchRequest[]{srchReqArr[pageNum%10], srchReqArr[(pageNum+1)%10]});
	return srchReqContainer;
    }
    
    public RequestContainer loadSrchIndexNodeid(INodeStats stats){
	incomingNode=stats;
//	addSrchIndexAndNodeIdToSrchReqs();
	reqParameters.setNodeStats(stats);
	return this;
    }
    
    public RequestContainer loadResponseGroup(String[] respGrp){
	this.responseGroup=respGrp;
	/*for(ItemSearchRequest srchReq:srchReqArr){
	    srchReq.setResponseGroup(respGrp);
	}*/
	reqParameters.setRespGrp(respGrp);
	return this;
    }
    
    public void load(){
	for(ItemSearchRequest srchReq:srchReqArr){
	    srchReq.setSearchIndex(incomingNode.getSrchIndex());
	    srchReq.setBrowseNode(incomingNode.getNodeId().toString());
	    srchReq.setResponseGroup(responseGroup);
	}
    }
    
    public void loadEachReqWithSortParam(String sortParam){
	for(ItemSearchRequest srchReq:srchReqArr){
	    srchReq.setSort(sortParam);
	}
    }    
    
    public ItemSearch getSingleReq(int pageNum){
	srchReqContainer.setRequest(new ItemSearchRequest[]{srchReqArr[pageNum]});
	return srchReqContainer;
    }
}
