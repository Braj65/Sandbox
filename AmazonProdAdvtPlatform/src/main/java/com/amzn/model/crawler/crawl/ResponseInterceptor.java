package com.amzn.model.crawler.crawl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Items_type3;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Price;
import com.amzn.model.products.Product;
import com.amzn.model.products.ProductList;

public class ResponseInterceptor {
    BatchExecutor executor=null;
    Items_type3[] itemsFromResponse=null;
    //For unique ASIN
    HashSet<String> set=new HashSet<String>();
    //List of products
//    List<Product> productList=new ArrayList<Product>();
    ProductList prodListHolder=null;
    
    public ResponseInterceptor(BatchExecutor executor){
	this.executor=executor;
	itemsFromResponse=executor.getResponse().getItems();
	prodListHolder=new ProductList();
    }
    
    public void getErrorsInResponse(){
	System.out.println(executor.getResponse()
		.getOperationRequest().getErrors().getError()[0].getMessage());
    }
    
    public void validateResponsePagesCount(){
	executor.validateResponsePagesCount();
    }
    
    public void interceptItems(){
	Price p;
	//Need the logic for keeping unique ASINs
	for(Items_type3 parentItem: itemsFromResponse){
	    if(parentItem.getItem()==null)
		return;
	    for(Item_type3 childItem:parentItem.getItem()){
		if(ifUniqueASIN(childItem.getASIN())){
		    set.add(childItem.getASIN());
		    prodListHolder.addToList(childItem);
		}		    
	    }
	}
    }
    
    public boolean ifUniqueASIN(String ASIN){
	return set.contains(ASIN);
    }

}
