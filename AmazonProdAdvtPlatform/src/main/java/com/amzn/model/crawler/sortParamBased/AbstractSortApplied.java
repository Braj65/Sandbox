package com.amzn.model.crawler.sortParamBased;

import org.apache.axis2.databinding.types.PositiveInteger;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest;

public abstract class AbstractSortApplied {
    
    private ItemSearchRequest itemSrchParamsReq=null;
    private ItemSearchRequest[] itemSrchParamsReqArr=null;
    private final static int cntOfAllowedReq=2;
    
    public AbstractSortApplied(){
	itemSrchParamsReq=new ItemSearchRequest();
	itemSrchReqArr=new ItemSearchRequest[cntOfAllowedReq];
    }
    
    public void gamesSearchRequest(){
	itemSrchParamsReq.setSearchIndex(RequestParams.getSearchIndex());
	itemSrchParamsReq.setBrowseNode(RequestParams.getBrowseNodeIs());
	itemSrchParamsReq.setItemPage(new PositiveInteger(Integer.toString(pageNum)));
	itemSrchParamsReq.setResponseGroup(ResponseParams.getRespParams());
    }
    
    public void applySortParam(){
	itemSrchParamsReq.setSort(sortParam);
    }
    
    public void loadItemSearchArr(){
	itemSrchParamsReqArr[pageNum%2]=itemSrchReq;
    }
    
    public ItemSearchRequest[] getReqArr(){
	return itemSrchParamsReqArr;
    }
}
