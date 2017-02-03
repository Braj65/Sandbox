package com.amazon.elastic.indexing;

import org.elasticsearch.action.get.GetResponse;

public class Search extends Create{
    public GetResponse get=null;
    
    public boolean prevDocExists(String doc){
	String[] x=typeName.split("_");
	int hr=Integer.parseInt(x[1])-1;
//	typeName=x[0]+"_"+String.valueOf(hr);
	GetResponse getResp=transClient.prepareGet(indexName, x[0]+"_"+String.valueOf(hr), doc).get();
	return getResp.isExists();
    }
    
    public byte[] prevDocVals(String doc){
	String[] x=typeName.split("_");
	int hr=Integer.parseInt(x[1])-1;
//	typeName=x[0]+"_"+String.valueOf(hr);
	GetResponse getResp=transClient.prepareGet(indexName, x[0]+"_"+String.valueOf(hr), doc).get();
	return getResp.getSourceAsBytes();
    }
    
    public byte[] prevDocVals(String indexName, String typeName, String doc){
	get=transClient.prepareGet(indexName, typeName, doc).get();
	return get.getSourceAsBytes();
    }
    
    public boolean prevDocExists(String indexName, String typeName, String doc){
	get=transClient.prepareGet(indexName, typeName, doc).get();
	return get.isExists();
    }

}
