package com.amazon.elastic.getDiscDocs;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.unit.Fuzziness;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;

import com.amazon.elastic.entity.SearchResult;
import com.amazon.elastic.form.ElasticForm;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GetDiscDocs{
    public static void main(String[] args) throws Exception {
	GetDiscDocs d=new GetDiscDocs();
	d.getItems();
    }
    
    public void getItems() throws Exception{
	ObjectMapper map=new ObjectMapper();
	SearchResult prevRes=null;
	String index="index_27_03_17";
	String type="Grocery&GourmetFoods";
	String type2="Clothing&Accessories";
//	String type2="Clothing&Accessories_05_39";
	String type3="VideoGames";
	TransportClient transClient=ElasticForm.getElasticClient();
//	GetResponse get=transClient.prepareGet(index, type, "_search").get();
	/*SearchResponse srch=transClient.prepareSearch(index)
		.setTypes(type2).setQuery(QueryBuilders.matchAllQuery())
		.setSize(1000).execute().actionGet();*/
	//Video Games.Categories.PlayStation 4.Games
	//Grocery & Gourmet Foods.Products.Sauces & Cooking Pastes.Table Sauces
	//Clothing & Accessories.Categories.Women.Western Wear
	//Clothing & Accessories.Categories.Women.Ethnic Wear
	//Clothing & Accessories.Categories.Women.Western Wear.Shirts, Tops & Tees
	
	SearchResponse srch=transClient.prepareSearch(index)
		.setTypes(type3).setQuery(QueryBuilders.prefixQuery("category","Video Games.Categories.PlayStation 4.Games"))
		.setSize(1000).execute().actionGet();
	for(SearchHit hit:srch.getHits()){
	    prevRes=map.readValue(hit.getSourceAsString(), SearchResult.class);
//	    System.out.println(prevRes.getTitle()+"--"+prevRes.getCurrentPrice());
	    
	    if(prevRes.getCategory()!=null){
		System.out.println(prevRes.getTitle()+" ASIN-"+prevRes.getASIN());
		System.out.println("Current -- "+prevRes.getCurrentPrice());
		System.out.println("Average -- "+prevRes.getAveragePrice());	    
		System.out.println("Min -- "+prevRes.getMinPrice());
	    }else{
		System.out.println("-------------------------"+prevRes.getTitle()+"-----------------------------");
	    }
	}
	
    }

}
