package com.amzn.model.crawler;

import java.util.HashMap;
import java.util.Iterator;

import org.apache.axis2.databinding.types.PositiveInteger;

import com.amzn.model.crawler.commpacks.requests.RequestContainer;
import com.amzn.model.crawler.commpacks.response.ResponseItem;
import com.amzn.model.crawler.sortedCrawl.AbstractSortCrawl;

public class Client {
    
    public static void main(String[] args) {	
	RequestContainer reqContainer=new RequestContainer();
	//precreate start
	reqContainer.addResponseGroup(new String[] { "ItemAttributes", "Offers", "VariationSummary" });
	reqContainer.createItemSrchReqRepo();
	//precreate over
	reqContainer.addSrchIndexAndNodeIdToSrchReqs("VideoGames", "2591141031");
	AbstractSortCrawl crawl=new AbstractSortCrawl(reqContainer);
	
	crawl.crawl();
    }

}
