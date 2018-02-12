package com.amzn.model.crawler.reqRespParams;

import org.apache.axis2.databinding.types.PositiveInteger;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest;
import com.amzn.model.nodesToBeCrawled.nodes.nodeEntity.NodeStats;

public class RequestParams {
    //From AbstractsortApplied
    public ItemSearchRequest itemSrchParamsReq=null;
    public ItemSearchRequest[] itemSrchParamsReqArr=null;
    private final static int cntOfAllowedReq=2;
    //
    public NodeStats nodeToBeCrawled=null;
    //From Batchexecutor
    public ItemSearch itemSearchReq=null;
    
    public RequestParams(){
	//
	itemSrchParamsReq=new ItemSearchRequest();
	itemSrchParamsReqArr=new ItemSearchRequest[cntOfAllowedReq];
	//
	itemSearchReq=new ItemSearch();
    }
    
    public void loadItemSrchParams(){
	itemSrchParamsReq.setSearchIndex(RequestParams.getSearchIndex());
	itemSrchParamsReq.setBrowseNode(RequestParams.getBrowseNodeIs());
	itemSrchParamsReq.setItemPage(new PositiveInteger(Integer.toString(pageNum)));
	itemSrchParamsReq.setResponseGroup(ResponseParams.getRespParams());
    }
    
    public void loadItemSrchArr(){
	itemSrchParamsReqArr[pageNum%2]=itemSrchParamsReq;
    }
}
