package com.amzn.model.products;

import java.util.ArrayList;
import java.util.List;

import com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Price;

public class ProductList {
    
    private List<Product> prodList=new ArrayList<Product>();
    
    public void addToList(Item_type3 product){
	Price prodPrice=null;;
	if(product.getOfferSummary().getLowestNewPrice()!=null){
	    prodPrice=product.getOfferSummary().getLowestNewPrice();
	}else if(product.getVariationSummary().getLowestSalePrice()!=null){
	    prodPrice=product.getVariationSummary().getLowestSalePrice();
	}else if(product.getVariationSummary().getLowestPrice()!=null){
	    prodPrice=product.getVariationSummary().getLowestPrice();
	}
	prodList.add(new Product(product.getASIN(), product.getItemAttributes().getTitle(),
		prodPrice));
    }
}
