package com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.browseNodes;

import java.util.HashMap;
import java.util.Map;

import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNode_type0;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Children_type0;
import com.amzn.model.crawler.commpacks.response.NodeLookupResponseHolder;
import com.amzn.model.crawler.stub.StubFactory;
import com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.request.BrowseNodeRequestContainer;

public class NodesAndTheirParentsList {
    
    private NodeLookupResponseHolder responseHolder;
    private BrowseNodeRequestContainer reqCon;
    private CategoryNode leafNodeOperations;
    private Map<String, String> leafNodes=new HashMap<String, String>(); 
    
    public NodesAndTheirParentsList(BrowseNodeRequestContainer req, CategoryNode catNode){
	reqCon=req;
	leafNodeOperations=catNode;
    }
    
    @Deprecated
    public CategoryNode initializeLeafNode(){
	return new CategoryNode(
		getRootAncestor(responseHolder.getFirstChild()));
//		.loadPropertyFile();
    }
    
    public void loadChildren(NodeLookupResponseHolder resp){
	if(resp==null)
	    return;
	responseHolder=resp;
	createChildren(getChildren());
    }
    
    public Children_type0 ifChildrenPresent(){
	return responseHolder.getFirstChild().getChildren();
    }
    
    private BrowseNode_type0[] getChildren(){
	if(ifChildrenPresent()!=null)
	    return ifChildrenPresent().getBrowseNode();
	return null;
    }
    
    private void createChildren(BrowseNode_type0[] children){
	if(children==null){
	    flushFullHeir();	//create leaf child here use the ancestor, nodeid and ancestor-1 to save the property
	    return;
	}
	for(BrowseNode_type0 child:children){
	    reqCon.addBrowseNodeId(child.getBrowseNodeId()).setShared();
	    
	    responseHolder=retryRequetIfFailed(reqCon,5000);
	    this.loadChildren(responseHolder);
		
	}
	writeToPropertyFile();
    }
    
    private void writeToPropertyFile(){
	String ancestorName=getFullAncestor();
	String parentName=ancestorName.substring(0, ancestorName.lastIndexOf("."));
	leafNodeOperations.writeToPropertyFile(leafNodes.get(parentName), parentName)
		.savePropertyFile();
	leafNodes.remove(parentName);
    }
    
    private void flushFullHeir(){
	String nodeId=responseHolder.getFirstChild().getBrowseNodeId();
	String ancestorName=getFullAncestor();
	addToRepo(ancestorName.substring(0, ancestorName.lastIndexOf("."))
		, ancestorName+"="+nodeId);	
    }
    public void addToRepo(String key, String value){
	String newVal=value;
	if(leafNodes.containsKey(key)){
	    newVal=leafNodes.get(key)+"\n"+value;
	    leafNodes.put(key,"");
	}
	leafNodes.put(key, newVal);
    }
    
    private String getFullAncestor(){
	BrowseNode_type0 bnode=responseHolder.getFirstChild();
	String leafNodeName=responseHolder.getFirstChild().getName();
	
	while(bnode.getAncestors()!=null){
	    bnode=bnode.getAncestors().getBrowseNode()[0];
	    leafNodeName=bnode.getName()+"."+leafNodeName;
	}
	return leafNodeName;
    }
    
    @Deprecated
    public String getRootAncestor(BrowseNode_type0 bnode){
	BrowseNode_type0 ancestor=bnode;
	while(ancestor.getAncestors()!=null){
	    ancestor=ancestor.getAncestors().getBrowseNode()[0];
	}
	return ancestor.getName();
    }
    
    private NodeLookupResponseHolder retryRequetIfFailed(BrowseNodeRequestContainer reqCon, long lagTime){
	if(lagTime>20000)
	    return null;
	try{
	    Thread.sleep(2000);
	    return (NodeLookupResponseHolder) StubFactory.getStubInstance("BrowseNodeInfo")
		    .executeOperation(reqCon.bnodeLookup);
	    
	}catch(Exception e){
	    try {
		Thread.sleep(lagTime+=3000);
		return retryRequetIfFailed(reqCon, lagTime);
	    } catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	    }
	}
	return null;
    }

}
