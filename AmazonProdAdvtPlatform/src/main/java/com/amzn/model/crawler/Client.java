package com.amzn.model.crawler;

import java.util.HashMap;
import java.util.Iterator;

import org.apache.axis2.databinding.types.PositiveInteger;

import com.amzn.model.crawler.commpacks.requestParams.RequestParams;
import com.amzn.model.crawler.commpacks.requests.IRequestHolder;
import com.amzn.model.crawler.commpacks.requests.RequestContainer;
import com.amzn.model.crawler.commpacks.requests.RequestHolderItemSearch;
import com.amzn.model.crawler.commpacks.response.ResponseItem;
import com.amzn.model.crawler.sortedCrawl.AbstractSortCrawl;

public class Client {
    
    public static void main(String[] args) {
//	AbsStubContainer stub=StubFactory.getStubInstance("ItemSearch");
/*	RequestParams reqParams=new RequestParams();
	reqParams.setSrchIndex("VideoGames");
	reqParams.setBrowseNodeId("2591141031");
	reqParams.setResponseGroup(new String[] { "ItemAttributes", "Offers", "VariationSummary" });
	reqParams.setItemPageEnd(new PositiveInteger(Integer.toString(10)));
	reqParams.setItemPageStart(new PositiveInteger(Integer.toString(1)));
	//reqParams.setSortParam(sortParam);

	request.createItemSearchRequest();
	AbstractSortCrawl sortCrawl=new AbstractSortCrawl();
	HashMap<String, ResponseItem> result=sortCrawl.crawl(request);
	Iterator<String> iter=result.keySet().iterator();
	while(iter.hasNext()){
	    String ASIN=iter.next();
	    ResponseItem resp=result.get(ASIN);
	    System.out.println(resp.title);
	}*/
	
	RequestContainer reqContainer=new RequestContainer();
	//precreate start
	reqContainer.addResponseGroup(new String[] { "ItemAttributes", "Offers", "VariationSummary" });
	reqContainer.createItemSrchReqRepo();
	//precreate over
	reqContainer.addSrchIndexAndNodeIdToSrchReqs("VideoGames", "2591141031");
	AbstractSortCrawl crawl=new AbstractSortCrawl();
	
	crawl.crawl();
    }

}
