package com.amazon.elastic.indexing;

import static org.elasticsearch.common.xcontent.XContentFactory.jsonBuilder;

import java.io.IOException;

import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsResponse;
import org.elasticsearch.action.admin.indices.exists.types.TypesExistsResponse;
import org.elasticsearch.action.admin.indices.mapping.put.PutMappingResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.xcontent.XContentBuilder;

import com.amazon.elastic.form.ElasticForm;

public class Create {
    public TransportClient transClient=null;
    public String indexName=null;
    public String typeName=null;
    public Create(){
	transClient=ElasticForm.getElasticClient();
    }
    public boolean ifIndexExists(String indexName){
	IndicesExistsResponse resp= transClient.admin().indices().prepareExists(indexName).get();
	return resp.isExists();
    }
    
    public boolean ifTypeExists(String indexName, String typeName){
	TypesExistsResponse resp=transClient.admin().indices().prepareTypesExists(indexName).setTypes(typeName).execute().actionGet();
	return resp.isExists();
    }
    
    public void createIndexMapping(String indexName, String typeName){
	this.indexName=indexName;
	this.typeName=typeName;
	if(!this.ifIndexExists(indexName) || !this.ifTypeExists(indexName, typeName)){
	    XContentBuilder mapping=null;
		try {
		    mapping = jsonBuilder().startObject()
		            .startObject(typeName)
		            .startObject("properties")
		            .startObject("ASIN").field("type", "string").field("index", "not_analyzed").endObject()
		            .startObject("Title").field("type", "string").field("index", "not_analyzed").endObject()
		            .startObject("averagePrice").field("type", "double").field("index", "not_analyzed").endObject()
		            .startObject("currentPrice").field("type", "double").field("index", "not_analyzed").endObject()
		            .startObject("minPrice").field("type", "double").field("index", "not_analyzed").endObject()
		            .startObject("timesCaptured").field("type","integer").field("index","not_analyzed").endObject()
		            .endObject()
		            .endObject()
		            .endObject();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		if(!this.ifIndexExists(indexName)){
		    transClient.admin().indices().create(new CreateIndexRequest(indexName)).actionGet();
		}		
		PutMappingResponse mapResponse = transClient.admin().indices().preparePutMapping(indexName).setType(typeName)
		        .setSource(mapping).execute().actionGet();
	}
    }
	
}
    
   
