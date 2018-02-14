package com.amzn.model.crawler.commpacks.requestParams;

import java.math.BigInteger;

import org.apache.axis2.databinding.types.PositiveInteger;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest;
import com.amzn.model.crawler.commpacks.requests.RequestHolderItemSearch;

public class RequestParams {
    
    private String srchIndex, browseNodeId, sortParam;
    private PositiveInteger itemPageStart, itemPageEnd;
    private String[] responseGroup;
    
    public void loadRequest(RequestHolderItemSearch request){
	ItemSearchRequest srchReq=null;
	itemPageStart=(PositiveInteger) itemPageStart.subtract(PositiveInteger.ONE);
	while(itemPageStart.compareTo(itemPageEnd.abs())!=1){
	    srchReq=request.getSingleItemSearch();
	    srchReq.setSearchIndex(srchIndex);
	    srchReq.setBrowseNode(browseNodeId);
	    srchReq.setItemPage(itemPageStart);
	    srchReq.setResponseGroup(responseGroup);
	    srchReq.setSort(getSortParam());
	    request.requestArr[itemPageStart.intValue()]=srchReq;
	    itemPageStart=(PositiveInteger) itemPageStart.add(PositiveInteger.ONE);
	}
    }
    
    public String getSrchIndex() {
        return srchIndex;
    }
    public void setSrchIndex(String srchIndex) {
        this.srchIndex = srchIndex;
    }
    public String getBrowseNodeId() {
        return browseNodeId;
    }
    public void setBrowseNodeId(String browseNodeId) {
        this.browseNodeId = browseNodeId;
    }
    public String getSortParam() {
        return sortParam;
    }
    public void setSortParam(String sortParam) {
        this.sortParam = sortParam;
    }
    public PositiveInteger getItemPageStart() {
        return itemPageStart;
    }
    public void setItemPageStart(PositiveInteger itemPageStart) {
        this.itemPageStart = itemPageStart;
    }
    
    public PositiveInteger getItemPageEnd() {
        return itemPageEnd;
    }
    public void setItemPageEnd(PositiveInteger itemPageEnd) {
        this.itemPageEnd = itemPageEnd;
    }
    public String[] getResponseGroup() {
        return responseGroup;
    }
    public void setResponseGroup(String[] responseGroup) {
        this.responseGroup = responseGroup;
    }
}
