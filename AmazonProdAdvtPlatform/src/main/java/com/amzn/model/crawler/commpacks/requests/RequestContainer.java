package com.amzn.model.crawler.commpacks.requests;

import org.apache.axis2.databinding.ADBBean;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemLookup;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemLookupRequest;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest;
import com.amzn.model.crawler.stub.AWESProperty;
import com.amzn.model.nodesToBeCrawled.nodes.nodeEntity.NodeStats;

public class RequestContainer {
    
    private final Integer ITEM_PAGE_START_FOR_PRECREATE=1, ITEM_PAGE_END_FOR_PRECREATE=10;
    
    public RequestParameter reqParameters;
    private NodeStats incomingNode;
    
    private ItemSearchRequest srchReq;
    private ItemSearchRequest srchReqArr[]=new ItemSearchRequest[ITEM_PAGE_END_FOR_PRECREATE];
    private ItemSearch srchReqContainer=new ItemSearch();
    
    ItemLookupRequest lookReq=new ItemLookupRequest();
    
    
    public void createItemSrchRepo(){
	int currentPage=ITEM_PAGE_START_FOR_PRECREATE;
	while(currentPage<=ITEM_PAGE_END_FOR_PRECREATE){
	    srchReq=new ItemSearchRequest();
	    srchReqArr[currentPage-1]=srchReq;
	    currentPage++;
	}
	srchReqContainer.setAssociateTag(AWESProperty.Value.ASSOCIATE_TAG.getString());
    }
    
    public void loadNodeStats(NodeStats stats){
	incomingNode=stats;
	reqParameters.setNodeStats(stats);
    }
    
    public void loadEachReqWithSortParam(String sortParam){
	for(ItemSearchRequest srchReq:srchReqArr){
	    srchReq.setSort(sortParam);
	}
    }
    
    public ItemSearch getWrappedReq(int pageNum){
	srchReqContainer.setRequest(new ItemSearchRequest[]{srchReqArr[pageNum-1], srchReqArr[pageNum]});
	return srchReqContainer;
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
	reqParameters.setRespGrp(respGrp);
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
