package com.amazon.driver;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.apache.axis2.databinding.types.PositiveInteger;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemAttributes_type0;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchResponse;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Items_type3;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Price;

public class Container extends AbstractDriver {

    ItemSearchRequest isReq = null;
    ItemSearchRequest[] itmSrchReqArr = new ItemSearchRequest[2];
    int cnt = 0;
    boolean readerFlag=true;
    public ArrayList<ItemSearch> failedItems=new ArrayList<ItemSearch>();
    
    public Container(String operation){
	super(operation);
    }
    

    public HashMap<String, ArrayList<String>> gamesSortedRelevance(HashSet<String> set,
	    HashMap<String, ArrayList<String>> map, HashMap<String, String> srchParams) {
	try {
	    
	    readerFlag=true;
	    for (int i = 1; i <= 10; i++) {
		isReq = new ItemSearchRequest();
		isReq.setSearchIndex(srchParams.get("searchIndex"));
		isReq.setBrowseNode(srchParams.get("browseNodeId"));
		isReq.setItemPage(new PositiveInteger(Integer.toString(i)));
		isReq.setResponseGroup(new String[] { "ItemAttributes", "Offers", "VariationSummary" });
		itmSrchReqArr[cnt] = isReq;
		if (cnt == 1) {
		    if(readerFlag==true){
//			Thread.sleep(1000);
			map = batch(set, map, itmSrchReqArr);
		    }
		    else
			break;
		    cnt = 0;
		} else {
		    ++cnt;
		}
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return map;
    }

    public HashMap<String, ArrayList<String>> gamesSorted(HashSet<String> set, HashMap<String, ArrayList<String>> map,
	    HashMap<String, String> srchParams, String sortParam) {
	try {
	    readerFlag=true;
	    for (int i = 1; i <= 10; i++) {
		isReq = new ItemSearchRequest();
		isReq.setSearchIndex(srchParams.get("searchIndex"));
		isReq.setBrowseNode(srchParams.get("browseNodeId"));
		isReq.setItemPage(new PositiveInteger(Integer.toString(i)));
		isReq.setResponseGroup(new String[] { "ItemAttributes", "Offers", "VariationSummary" });
		isReq.setSort(sortParam);
		itmSrchReqArr[cnt] = isReq;
		if (cnt == 1) {
		    if(readerFlag==true){
//			Thread.sleep(2000);
			map = batch(set, map, itmSrchReqArr);
		    }
		    else
			break;		    
		    cnt = 0;
		} else {
		    ++cnt;
		}
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return map;
    }
    
    
    public HashMap<String, ArrayList<String>> failedBatch(HashSet<String> set, HashMap<String, ArrayList<String>> map,
	    ItemSearch srchReq){
	ItemSearchResponse resp = null;
	Items_type3[] items =null;
	try{
	    
		Thread.sleep(500);
		resp=stub.itemSearch(srchReq);
		if (resp.getOperationRequest().getErrors() != null) {
			System.out.println(resp.getOperationRequest().getErrors().getError()[0].getMessage());
		    }
		items=resp.getItems();
		String ASIN="";
		if(items[0].getTotalPages().compareTo(srchReq.getRequest()[0].getItemPage())==0 ||
			items[1].getTotalPages().compareTo(srchReq.getRequest()[1].getItemPage())==0){
		    System.out.println(items[0].getTotalPages());
		    System.out.println(srchReq.getRequest()[0].getItemPage());
		    System.out.println(items[1].getTotalPages());
		    System.out.println(srchReq.getRequest()[1].getItemPage());
		}
		ArrayList<String> titlePrice = new ArrayList<String>();
		for (Items_type3 x : items) {
			if(x.getItem()==null){
			    return map;
			}
			for (Item_type3 y : x.getItem()) {
			    ASIN = y.getASIN();
			    if (!set.contains(ASIN)) {
				ItemAttributes_type0 iat = y.getItemAttributes();
				// String price =
				// y.getOfferSummary().getLowestNewPrice().getFormattedPrice();
				Price p = y.getOfferSummary().getLowestNewPrice();
				if (p != null) {
				    BigInteger price = p.getAmount();
				    titlePrice = new ArrayList<String>();
				    titlePrice.add(iat.getTitle());
				    titlePrice.add(price.toString());
				    map.put(ASIN, titlePrice);
				    set.add(ASIN);
				}else if(y.getVariationSummary()==null){
				    System.out.println();
				}
				else if(y.getVariationSummary().getLowestSalePrice()!=null){
				    BigInteger price=y.getVariationSummary().getLowestSalePrice().getAmount();
				    titlePrice = new ArrayList<String>();
				    titlePrice.add(iat.getTitle());
				    titlePrice.add(price.toString());
				    map.put(ASIN, titlePrice);
				    set.add(ASIN);
				}else if(y.getVariationSummary().getLowestPrice()!=null){
				    BigInteger price=y.getVariationSummary().getLowestPrice().getAmount();
				    titlePrice = new ArrayList<String>();
				    titlePrice.add(iat.getTitle());
				    titlePrice.add(price.toString());
				    map.put(ASIN, titlePrice);
				    set.add(ASIN);
				}else{
				    System.out.println();
				}
			    }
			}
		    }
	    
	}catch(Exception e){
	    e.printStackTrace();
	    if(e.getMessage().contains("NullPointerException")){
		System.out.println();
	    }
	}
	return map;
    }

    public HashMap<String, ArrayList<String>> batch(HashSet<String> set, HashMap<String, ArrayList<String>> map,
	    ItemSearchRequest[] batchReq) {
	ItemSearchResponse resp = null;
	Items_type3[] items =null;
	com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch itemSearch40=null;
	try {
	    itemSearch40 = (com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch) getTestObject(
		    com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch.class);
	    itemSearch40.setRequest(batchReq);
	    itemSearch40.setAssociateTag("isnnfoiwnit0d-21");
	    
	    Thread.sleep(500);

	    resp = stub.itemSearch(itemSearch40);

	    if (resp.getOperationRequest().getErrors() != null) {
		System.out.println(resp.getOperationRequest().getErrors().getError()[0].getMessage());
	    }
	    items = resp.getItems();
	    String ASIN = "";
	    if(items[0].getTotalPages().compareTo(batchReq[0].getItemPage())==0 ||
		    items[1].getTotalPages().compareTo(batchReq[1].getItemPage())==0){
		readerFlag=false;
	    }
	    
	    // HashMap<String, String> titlePrice=new HashMap<String, String>();
	    ArrayList<String> titlePrice = new ArrayList<String>();
	    // HashMap<String, HashMap<String, String>> asinTitlePrice=new
	    // HashMap<String, HashMap<String, String>>();
	    for (Items_type3 x : items) {
		if(x.getItem()==null){
		    return map;
		}
		for (Item_type3 y : x.getItem()) {
		    ASIN = y.getASIN();
		    if (!set.contains(ASIN)) {
			ItemAttributes_type0 iat = y.getItemAttributes();
			// String price =
			// y.getOfferSummary().getLowestNewPrice().getFormattedPrice();
			Price p = y.getOfferSummary().getLowestNewPrice();
			if (p != null) {
			    BigInteger price = p.getAmount();
			    titlePrice = new ArrayList<String>();
			    titlePrice.add(iat.getTitle());
			    titlePrice.add(price.toString());
			    map.put(ASIN, titlePrice);
			    set.add(ASIN);
			}else if(y.getVariationSummary().getLowestSalePrice()!=null){
			    BigInteger price=y.getVariationSummary().getLowestSalePrice().getAmount();
			    titlePrice = new ArrayList<String>();
			    titlePrice.add(iat.getTitle());
			    titlePrice.add(price.toString());
			    map.put(ASIN, titlePrice);
			    set.add(ASIN);
			}else if(y.getVariationSummary().getLowestPrice()!=null){
			    BigInteger price=y.getVariationSummary().getLowestPrice().getAmount();
			    titlePrice = new ArrayList<String>();
			    titlePrice.add(iat.getTitle());
			    titlePrice.add(price.toString());
			    map.put(ASIN, titlePrice);
			    set.add(ASIN);
			}else{
			    System.out.println();
			}
		    }
		}
	    }
	} catch (Exception e) {
	    // System.out.println(resp.getOperationRequest().getErrors().getError()[0].getMessage());
//	    e.printStackTrace();
	    failedItems.add(itemSearch40);
	    return map;
	}
	return map;
    }

    /*public static org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception {
	return (org.apache.axis2.databinding.ADBBean) type.newInstance();
    }*/

    public HashMap<String, ArrayList<String>> getMap(ArrayList<String> sortParams, HashMap<String, String> srchParams) {
	HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	map = gamesSortedRelevance(uniq, map, srchParams);

	for (String x : sortParams) {
	    map = gamesSorted(uniq, map, srchParams, x);
	}

	return map;

    }
    
    public String getSortingParams(String srchIndex, String browseNodeId){
	isReq = new ItemSearchRequest();
	isReq.setSearchIndex(srchIndex);
	isReq.setBrowseNode(browseNodeId);
	isReq.setItemPage(new PositiveInteger(Integer.toString(1)));
	isReq.setResponseGroup(new String[] { "ItemAttributes", "Offers" });
	isReq.setSort("XX");
	itmSrchReqArr[0] = isReq;
	ItemSearchResponse resp = null;
	try{
	    com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch itemSearch40 = (com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch) getTestObject(
		    com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch.class);  
	
	    itemSearch40.setRequest(itmSrchReqArr);
	    itemSearch40.setAssociateTag("isnnfoiwnit0d-21");
	    resp = stub.itemSearch(itemSearch40);
	
	    if(resp.getOperationRequest().getErrors()!=null){
		return resp.getOperationRequest().getErrors().getError()[0].getMessage();
	    }
	    return resp.getItems()[0].getRequest().getErrors().getError()[0].getMessage();
	}catch(Exception e){
	    e.printStackTrace();
	}
	return null;
    }

}
