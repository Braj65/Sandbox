package com.amzn.model.products;

import java.math.BigInteger;

import com.amazon.webservices.awsecommerceservice._2013_08_01.Price;

public class Product {
    
    public String title, ASIN;
    public Price price;
    
    public Product(String ASIN, String title, Price price){
	this.ASIN=ASIN;
	this.title=title;
	this.price=price;	
    }
    
    public boolean equals(Object obj){
	if(!(obj instanceof Product))
	    return false;
	Product received=(Product) obj;
	return(this.ASIN.equals(received.ASIN));
    }
    
    public int hashCode(){
	return ASIN.hashCode();
    }
}
