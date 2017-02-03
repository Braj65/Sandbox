package com.amazon.elastic.indexing;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.elasticsearch.action.index.IndexResponse;

import com.amazon.elastic.entity.RequestEntity;
import com.amazon.elastic.entity.SearchResult;
import com.amazon.prodbase.Categories;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AddDocs extends Create {

    ObjectMapper mapper = null;
    // HashMap<String, String> selectedItemsMap=new HashMap<String, String>();
    HashMap<String, ArrayList<String>> selectedItemsMap = new HashMap<String, ArrayList<String>>();
    public String indexMetaFile = "/indexmeta/LastIndexTypeMeta.properties";
    public String physicalLoc = "/src/main/resources";
    public String s = System.getProperty("user.dir");
    PropertiesConfiguration indexMeta = null;
    FileWriter fw = null;

    public AddDocs(Create c) {
	mapper = new ObjectMapper();
	try {
//	    indexMeta = new PropertiesConfiguration(s + physicalLoc + indexMetaFile);
	    fw = new FileWriter(s + physicalLoc + indexMetaFile);
	} catch (Exception e) {
	    e.printStackTrace();
	}

	this.indexName = c.indexName;
	this.typeName = c.typeName;
    }

    public void clearDiffCache() {
	selectedItemsMap.clear();
    }

    public void prepareDoc(HashMap<String, ArrayList<String>> map, Categories cat, PropertiesConfiguration indexMeta) {
	this.indexMeta=indexMeta;
	RequestEntity req = new RequestEntity();
	Set<String> s = map.keySet();
	Iterator<String> i = s.iterator();
	byte[] json = null;
	try {
	    while (i.hasNext()) {
		String k = i.next();
		req.setASIN(k);
		ArrayList<String> prc = map.get(k);
		// String[] x=(String[])prc.toArray();
		req.setTitle(prc.get(0));
		String price = prc.get(1);
		req = optiAlgo(req, Double.parseDouble(prc.get(1)) / 100, cat);
		json = mapper.writeValueAsBytes(req);
		addDoc(json, req.getASIN());
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public void addDoc(byte[] json, String asin) {
	IndexResponse resp = transClient.prepareIndex(indexName, typeName, asin).setSource(json).get();
    }

    public void checkDiscItems() {
	Set<String> keys = selectedItemsMap.keySet();
	Iterator<String> i = keys.iterator();
	while (i.hasNext()) {
	    ArrayList<String> asin = selectedItemsMap.get(i.next());
	    System.out.println(asin.get(0) + "-prev-" + asin.get(1) + "-curr-" + asin.get(2));
	}
    }

    public RequestEntity optiAlgo(RequestEntity req, double price, Categories cat) {
	String asin = req.getASIN();
	Search s = new Search();
	s.indexName = this.indexName;
	s.typeName = this.typeName;
	byte[] res = null;
	SearchResult prevRes = null;

	if (indexMeta.containsKey(cat.getFullName())) {
	    String[] prevInTp = indexMeta.getProperty(cat.getFullName()).toString().split("/");
	    if (!s.prevDocExists(prevInTp[0], prevInTp[1], asin))
		initializePrices(req, price);
	    else {
		res = s.prevDocVals(prevInTp[0], prevInTp[1], asin);
		try {
		    prevRes = mapper.readValue(res, SearchResult.class);
		    req.setCurrentPrice(price);
		    req.setMinPrice(price);
		    req.setAveragePrice((prevRes.getAveragePrice() * prevRes.getTimesCaptured() + price)
			    / (prevRes.getTimesCaptured() + 1));
		    req.setTimesCaptured(prevRes.getTimesCaptured() + 1);
		    checkDiscAddResult(prevRes, price, asin, req.getTitle());
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }

	} else {
	    initializePrices(req, price);
	}
	/*if (indexMeta.getProperty(cat.getFullName()) != null) {
	    if (!indexMeta.getProperty(cat.getFullName()).equals(indexName + "/" + typeName)) {
		try {
		    indexMeta.clearProperty(cat.getFullName());
		    indexMeta.save(fw);
		    indexMeta.setProperty(cat.getFullName(), indexName + "/" + typeName);
		    indexMeta.save(fw);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	} else {
	    indexMeta.setProperty(cat.getFullName(), indexName + "/" + typeName);
	    try {
		indexMeta.save(fw);
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}*/

	return req;

	/*
	 * if(s.prevDocExists(asin)){ res=s.prevDocVals(asin); try { prevRes =
	 * mapper.readValue(res, SearchResult.class); } catch (Exception e) { //
	 * TODO Auto-generated catch block e.printStackTrace(); }
	 * req.setCurrentPrice(price);
	 * 
	 * if(prevRes.getMinPrice()>price || price<prevRes.getCurrentPrice()){
	 * req.setMinPrice(price); checkDiscAddResult(prevRes, price,
	 * req.getASIN(), req.getTitle()); }else{
	 * req.setMinPrice(prevRes.getMinPrice()); } req.setAveragePrice(price);
	 * }else{ initializePrices(req, price); } return req;
	 */

    }

    public RequestEntity initializePrices(RequestEntity req, double price) {
	req.setCurrentPrice(price);
	req.setAveragePrice(price);
	req.setMinPrice(price);
	req.setTimesCaptured(1);
	return req;
    }

    public void checkDiscAddResult(SearchResult source, double curPrice, String asin, String title) {
	/*
	 * if(title.contains("NBA 2K17")){ System.out.println(); }
	 */
	ArrayList<String> x = new ArrayList<String>();

	if (((source.getCurrentPrice() - curPrice) / 100) >= 0.2) {
	    x.add(title);
	    x.add(String.valueOf(source.getCurrentPrice()));
	    x.add(String.valueOf(curPrice));
	    selectedItemsMap.put(asin, x);
	    // System.out.println(title+"-prev--"+source.getCurrentPrice()+"--curr--"+curPrice);
	}
	if (source.getMinPrice() > curPrice) {
	    x.add(title);
	    x.add(String.valueOf(source.getMinPrice()));
	    x.add(String.valueOf(curPrice));
	    selectedItemsMap.put(asin, x);
	    // System.out.println(title+"-prev--"+source.getMinPrice()+"--curr--"+curPrice);
	}

	/*
	 * if(prevPrice<=100){ if((prevPrice-curPrice/100)>=0.2){ map.put(asin,
	 * title); } }else if(prevPrice<=500 && prevPrice>100){
	 * if((prevPrice-curPrice/100)>=0.2){ map.put(asin, title); } }else
	 * if(prevPrice<=1000 && prevPrice>500){
	 * if((prevPrice-curPrice/100)>=0.3){ map.put(asin, title); } }
	 */
    }

}
