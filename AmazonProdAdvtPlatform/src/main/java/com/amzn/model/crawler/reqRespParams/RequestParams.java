package com.amzn.model.crawler.reqRespParams;

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
}
