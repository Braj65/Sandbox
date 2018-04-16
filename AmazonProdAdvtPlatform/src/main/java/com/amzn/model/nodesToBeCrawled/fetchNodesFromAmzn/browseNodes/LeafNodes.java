package com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.browseNodes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.ILoadChildrenFromProp;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.LoadLeafChildren;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.loaderFactory.LoaderFactory;

public class LeafNodes {
    
    private String nodeName;
    private ILoadChildrenFromProp propertyLoader;
    
    public LeafNodes(String nodeName){
	this.nodeName=nodeName;
    }
    
    public void loadPropertyFile(){
	try{
	    propertyLoader=LoaderFactory.getPropLoader(nodeName+".properties");
	}catch(Exception e){
	    e.printStackTrace();
	    System.out.println("Going to initialize property file for "+nodeName+".properties"+" since "
	    	+ "it is not present may be due to the client from 'nodeFeedToBeCrawled' pack is "
	    	+ "not running. There we load the memory with propertfile of each type before starting "
	    	+ "to provide a constant stream of full node names and ids from property files");
	    propertyLoader=new LoadLeafChildren(nodeName+".properties");
	}
	finally{
	    persistExistingPropertyFileToDb();
	}
    }
    
    public void persistExistingPropertyFileToDb(){
	//We will write code about persisting to db in a later time. Currently we will write code
	//to create a copy of existing file with time stamp in file name
	DateFormat dateFormat=new SimpleDateFormat("dd_MM_yy-HH_mm");
	Date d=new Date();
	String newFileName=nodeName+dateFormat.format(d)+".properties";
	propertyLoader.createNewFile(newFileName);
    }
    
    public void writeToPropertyFile(String nodeId, String fullAncestorName){
	propertyLoader.writeToFile(fullAncestorName, nodeId);
    }

}
