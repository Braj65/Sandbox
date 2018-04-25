package com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.browseNodes;

import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNode_type0;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Children_type0;
import com.amzn.model.crawler.commpacks.response.IResponseHolder;
import com.amzn.model.crawler.commpacks.response.ItemSearchResponseHolder;
import com.amzn.model.crawler.commpacks.response.NodeLookupResponseHolder;
import com.amzn.model.crawler.stub.StubFactory;
import com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.request.BrowseNodeRequestContainer;

public class NodesAndTheirParentsList {
    
    private NodeLookupResponseHolder responseHolder;
    private BrowseNodeRequestContainer reqCon;
    private CategoryNode leafNodeOperations;
    
    public NodesAndTheirParentsList(BrowseNodeRequestContainer req, CategoryNode catNode){
	reqCon=req;
	leafNodeOperations=catNode;
    }
    
    @Deprecated
    public CategoryNode initializeLeafNode(){
	return new CategoryNode(
		getRootAncestor(responseHolder.getFirstChild()))
		.loadPropertyFile();
    }
    
    public void loadChildren(NodeLookupResponseHolder resp){
	if(resp==null)
	    throw new RuntimeException("Response has been received null");
	responseHolder=resp;
	BrowseNode_type0[] nodeArr=getChildren();
	createChildren(nodeArr);
    }
    
    public Children_type0 ifChildrenPresent(){
	return responseHolder.getFirstChild().getChildren();
    }
    
    public BrowseNode_type0[] getChildren(){
	if(ifChildrenPresent()!=null)
	    return ifChildrenPresent().getBrowseNode();
	return null;
    }
    
    public void createChildren(BrowseNode_type0[] children){
	if(children==null){
	    flushFullHeir();	//create leaf child here use the ancestor, nodeid and ancestor-1 to save the property
	    return;
	}
	for(BrowseNode_type0 child:children){
	    /*NodesAndTheirParentsList currNode=new NodesAndTheirParentsList(reqCon);
	    reqCon=new BrowseNodeRequestContainer();//clone it with clear props
*/	    reqCon.addBrowseNodeId(child.getBrowseNodeId()).setShared();
	    
	    responseHolder=retryRequetIfFailed(reqCon,5000);
	    this.loadChildren(responseHolder);
		
	}
	String ancestorName=getFullAncestor();
	String parentName=ancestorName.substring(0, ancestorName.lastIndexOf("."));
//	CategoryNode leafNodeOperations=initializeLeafNode();
	leafNodeOperations.writeToPropertyFile(LeafNodesFactory.getValue(parentName), parentName)
		.savePropertyFile();
	LeafNodesFactory.clearKey(parentName);
    }
    
    public void flushFullHeir(){
	String nodeId=responseHolder.getFirstChild().getBrowseNodeId();
	String ancestorName=getFullAncestor();
	LeafNodesFactory.addToRepo(ancestorName.substring(0, ancestorName.lastIndexOf("."))
		, ancestorName+"="+nodeId);	
    }
    
    public String getFullAncestor(){
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
    
    public NodeLookupResponseHolder retryRequetIfFailed(BrowseNodeRequestContainer reqCon, long lagTime){
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
