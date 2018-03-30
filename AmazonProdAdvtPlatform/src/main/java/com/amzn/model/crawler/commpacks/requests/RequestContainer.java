package com.amzn.model.crawler.commpacks.requests;

import org.apache.axis2.databinding.types.PositiveInteger;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest;
import com.amzn.model.crawler.stub.AWESProperty;
import com.amzn.model.nodesToBeCrawled.nodes.nodeEntity.INodeStats;

public class RequestContainer {
    
    private final Integer ITEM_PAGE_START_FOR_PRECREATE=1, ITEM_PAGE_END_FOR_PRECREATE=10;
    
    private INodeStats incomingNode;
    public String[] responseGroup;
    //unwise to save sort params in RequestPool and share between polled requestcontainers
    //need to save here. When releasing container back to pool, the pool need to collect the
    //sort param from the container and store with itself
    public String[] sortParams;
    
    private ItemSearchRequest srchRequest;
    private ItemSearchRequest srchReqArr[]=new ItemSearchRequest[ITEM_PAGE_END_FOR_PRECREATE];
    private ItemSearch srchReqContainer;

    public RequestContainer(){
	srchReqContainer=new ItemSearch();
    }
    
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
	return this;
    }
    
    public RequestContainer loadResponseGroup(String[] respGrp){
	this.responseGroup=respGrp;
	return this;
    }
    
    public RequestContainer setSortParamInSrhcReq(String sortParam){
	srchRequest.setSort(sortParam);
	return this;
    }
    
    public void setSortParam(String[] sortParams){
	this.sortParams=sortParams;
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
