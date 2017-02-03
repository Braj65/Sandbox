package com.amazon.browsenodes;

import java.io.File;
import java.io.FileWriter;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.PropertiesConfigurationLayout;

import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookupRequest;

public class LeafNodes {
//    String leafNodeIds="/nodedetails/Clothing&Accessories.properties";
    String physicalLoc="/src/main/resources";
    String s=System.getProperty("user.dir");
    File f=null;
    PropertiesConfiguration leafConf=null;
    PropertiesConfigurationLayout layout=null;
    FileWriter fw=null;
    
    public LeafNodes(String propPath){
	try{
	    f=new File(s+physicalLoc+propPath);
	    leafConf=new PropertiesConfiguration(f);
	    layout=leafConf.getLayout();
	}catch(Exception e){
	    e.printStackTrace();
	}	
    }
    
    
    public void addProperty(String propName, String nodeId){
	
	if(leafConf.containsKey(propName)==false){
	    leafConf.setProperty(propName, nodeId);
	}else if(leafConf.getProperty(propName)!=nodeId){
	    leafConf.setProperty(propName, nodeId);
	}
    }
    
    public void saveProperty(){
	try{
//	    layout=leafConf.getLayout();
//	    layout.setComment(categoryName, categoryName);
	    fw=new FileWriter(f);
	    leafConf.save(fw);
	}catch(Exception e){
	    e.printStackTrace();
	}
	
    }
        

}
