package com.amzn.model.crawler.commpacks.requests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.axis2.databinding.types.PositiveInteger;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest;

public class RequestContainer {
    
    private final Integer ITEM_PAGE_START_FOR_PRECREATE=1, ITEM_PAGE_END_FOR_PRECREATE=10;
    
    private Map<String, String> strReqParams=new HashMap<String, String>();
    private Map<String, PositiveInteger> posIntReqParams=new HashMap<String, PositiveInteger>();
    private String[] responseGroup;
    
    private ItemSearchRequest srchReq;
    private ItemSearchRequest srchReqArr[]=new ItemSearchRequest[ITEM_PAGE_END_FOR_PRECREATE];
    public List<ItemSearchRequest[]> biGroupedList=new ArrayList<ItemSearchRequest[]>();
    
    public void createItemSrchReqRepo(){
	int currentPage=ITEM_PAGE_START_FOR_PRECREATE;
	while(currentPage<=ITEM_PAGE_END_FOR_PRECREATE){
	    srchReq=new ItemSearchRequest();
	    srchReq.setItemPage(new PositiveInteger(Integer.toString(currentPage++)));
	    srchReq.setResponseGroup(responseGroup);
	    srchReqArr[currentPage-1]=srchReq;
	}
	currentPage=ITEM_PAGE_START_FOR_PRECREATE;
    }
    
    public void loadItemSearchContainer(){
	for(int i=ITEM_PAGE_START_FOR_PRECREATE;i<=ITEM_PAGE_END_FOR_PRECREATE;i+=2){
	    ItemSearchRequest[] biGroupedArr={srchReqArr[i-1], srchReqArr[i]};
	    biGroupedList.add(biGroupedArr);
	}
    }
    
    public void addSrchIndexAndNodeIdToSrchReqs(String srchIndex, String nodeId){
	for(ItemSearchRequest[] srchReqArr:biGroupedList){
	    for(ItemSearchRequest srchReq:srchReqArr){
		srchReq.setSearchIndex(srchIndex);
		srchReq.setBrowseNode(nodeId);
	    }
	}
    }
    
    public void addSortParamToSrchReqs(String sortParam){
	for(ItemSearchRequest[] srchReqArr:biGroupedList){
	    for(ItemSearchRequest srchReq:srchReqArr){
		srchReq.setSort(sortParam);
	    }
	}
    }
}
