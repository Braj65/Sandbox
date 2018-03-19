package com.amzn.model.crawler.sortedCrawl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.amzn.model.crawler.commpacks.requests.IRequestHolder;
import com.amzn.model.crawler.commpacks.requests.RequestContainer;
import com.amzn.model.crawler.commpacks.response.ResponseHolder;
import com.amzn.model.crawler.commpacks.response.ResponseItem;
import com.amzn.model.crawler.stub.StubFactory;

public class AbstractSortCrawl {
    private IRequestHolder request;
    private ResponseHolder response;
    private List<IRequestHolder> failedRequests=new ArrayList<IRequestHolder>();
    
    private HashMap<String, ResponseItem> result=new HashMap<String, ResponseItem>();
     
    private static final Integer PAGECOUNT=10;
    
    /*public HashMap<String, ResponseItem> crawl(IRequestHolder request){
	for(int i=1;i<=PAGECOUNT/2;i++){
	    try{
		response=StubFactory.getStubInstance("ItemSearch").executeOperation(request);
		result=response.parseForItems();
	    }catch(Exception e){
		failedRequests.add(request);
	    }
	}
	return result;
<<<<<<< Updated upstream
=======
    }*/
    
    private RequestContainer reqHolder;
    private Integer ACTUAL_PAGE_END=10;
    
    public AbstractSortCrawl(RequestContainer reqCont){
	reqHolder=reqCont;
    }
    
    public void crawl(){
	for(int currPageCount=1;currPageCount<ACTUAL_PAGE_END;currPageCount+=2){
	    try {
		Thread.sleep(2000);
	    } catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	    }
	    try {
		StubFactory.getStubInstance("ItemSearch").executeOperation(reqHolder.getSrchReqContainer(currPageCount));
	    } catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
	if(ACTUAL_PAGE_END%2!=0){
	    try {
		StubFactory.getStubInstance("ItemSearch").executeOperation(reqHolder.getSingleReqLoadedContainer(ACTUAL_PAGE_END-1));
	    } catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
	try {
		Thread.sleep(1000);
	    } catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	    }
    }
    
    //Populate actual page count
    public void populateActualPageCount(){
	

    }    
}
