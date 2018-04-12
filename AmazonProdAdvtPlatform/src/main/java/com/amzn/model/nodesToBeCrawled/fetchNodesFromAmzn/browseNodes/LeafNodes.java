package com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.browseNodes;

import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.ILoadChildrenFromProp;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.LoadLeafChildren;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.loaderFactory.LoaderFactory;

public class LeafNodes {
    
    private String nodeName;
    private ILoadChildrenFromProp propertyLoader;
    
    public LeafNodes(String nodeName){
	this.nodeName=nodeName+".properties";
	try{
	    propertyLoader=LoaderFactory.getPropLoader(nodeName);
	}catch(Exception e){
	    e.printStackTrace();
	    System.out.println("Going to initialize property file for "+nodeName+" since "
	    	+ "it is not present may be due to the client from 'nodeFeedToBeCrawled' pack is "
	    	+ "not running. There we load the memory with propertfile of each type before starting "
	    	+ "to provide a constant stream of full node names and ids from property files");
	    propertyLoader=new LoadLeafChildren(nodeName);
	}
    }
    
    public void persistExistingPropertyFileToDb(){
	//next task fit it at right place
    }
    
    public void writeToPropertyFile(String nodeId, String fullAncestorName){
	propertyLoader.writeToFile(fullAncestorName, nodeId);
    }

}
