package com.amazon.driver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.amazon.prodbase.Categories;

public class Client {
    
    public static void main(String[] args) throws Exception {
	try{
	    Categories c=(Categories) Class.forName("categorybean.ClothingParams").newInstance();
	    System.out.println(c.getSrchIndex());
	    DateFormat dateFormat=new SimpleDateFormat("HH_mm");
		Date d=new Date();
		System.out.println("index_"+dateFormat.format(d));
	}catch(Exception e){
	    e.printStackTrace();
	}
	
    }

}
