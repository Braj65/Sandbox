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
//	itemPageStart=new PositiveInteger(itemPageStart.subtract(PositiveInteger.ONE).toString());
	while(itemPageStart.compareTo(itemPageEnd.abs())!=1){
	    srchReq=request.getSingleItemSearch();
	    srchReq.setSearchIndex(srchIndex);
	    srchReq.setBrowseNode(browseNodeId);
	    srchReq.setItemPage(itemPageStart);
	    srchReq.setResponseGroup(responseGroup);
	    srchReq.setSort(sortParam);
	    request.requestArr[itemPageStart.intValue()]=srchReq;
	    itemPageStart=new PositiveInteger(itemPageStart.add(PositiveInteger.ONE).toString());
	}
	resetItemPageStart();
    }
    
    public void resetItemPageStart(){
	itemPageStart=new PositiveInteger(Integer.toString(1));
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
    public void setItemPageEnd(PositiveInteger ten) {
        this.itemPageEnd = ten;
    }
    public String[] getResponseGroup() {
        return responseGroup;
    }
    public void setResponseGroup(String[] responseGroup) {
        this.responseGroup = responseGroup;
    }
}
