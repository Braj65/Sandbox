package com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.browseNodes;

import java.util.ArrayList;
import java.util.List;

import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNode_type0;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Children_type0;
import com.amzn.model.crawler.commpacks.response.IResponseHolder;
import com.amzn.model.crawler.commpacks.response.NodeLookupResponseHolder;
import com.amzn.model.crawler.stub.StubFactory;
import com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.request.BrowseNodeRequestContainer;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity.INodeStats;

public class NodesAndTheirParentsList {
    
    private List<NodesAndTheirParentsList> children;
    private String nodeId;
    private String nodeName;
    private NodeLookupResponseHolder responseHolder;
//    private IResponseHolder responseHolder;
    private BrowseNodeRequestContainer reqCon;
    private LeafNodes leafNodeOperations;
    
    public NodesAndTheirParentsList(BrowseNode_type0 node, BrowseNodeRequestContainer req){
	nodeId=node.getBrowseNodeId();
	nodeName=node.getName();
	leafNodeOperations=new LeafNodes(nodeName);
	reqCon=req;
    }
    
    public NodesAndTheirParentsList(INodeStats nodeStats, BrowseNodeRequestContainer req){
	nodeId=nodeStats.getNodeId().toString();
	nodeName=nodeStats.getNodeName();
	reqCon=req;
    }
    
    public void initializeChildrenBucket(){
	children=new ArrayList<NodesAndTheirParentsList>();
    }
    
    public void addChild(NodesAndTheirParentsList node){
	children.add(node);
    }
    
    public void loadChildren(NodeLookupResponseHolder resp){
	responseHolder=resp;
	BrowseNode_type0[] nodeArr=getChildren();
	createChildren(nodeArr);
    }
    
    public Children_type0 ifChildrenPresent(){
	return responseHolder.getLookupResp().getBrowseNodes()[0].getBrowseNode()[0].getChildren();
    }
    
    public BrowseNode_type0[] getChildren(){
	if(ifChildrenPresent()!=null)
	    return ifChildrenPresent().getBrowseNode();
	return null;
    }
    
    public void createChildren(BrowseNode_type0[] children){
	if(children==null)
	    return;	//create leaf child here use the ancestor, nodeid and ancestor-1 to save the property
	this.initializeChildrenBucket();
	for(BrowseNode_type0 child:children){
	    NodesAndTheirParentsList currNode=new NodesAndTheirParentsList(child, reqCon);
	    this.children.add(currNode);
	    reqCon=new BrowseNodeRequestContainer();//clone it with clear props
	    reqCon.bnodeLookupReq.addBrowseNodeId(child.getBrowseNodeId());//you can reduce these lines
	    reqCon.bnodeLookupReq.addResponseGroup("BrowseNodeInfo");
	    reqCon.bnodeLookup.setShared(reqCon.bnodeLookupReq);
	    reqCon.bnodeLookup.setAssociateTag("isnnfoiwnit0d-21");
	    try{
	    responseHolder=(NodeLookupResponseHolder) StubFactory.getStubInstance("BrowseNodeInfo")
		    .executeOperation(reqCon.bnodeLookup);
	    flushFullHeir();
	    }catch(Exception e){
		e.printStackTrace();
	    }
	    currNode.loadChildren(responseHolder);
	}
    }
    
    public void flushFullHeir(){
	String nodeId=responseHolder.getLookupResp().getBrowseNodes()[0].getBrowseNode()[0].getBrowseNodeId();
	String ancestorName=getFullAncestor(responseHolder.getLookupResp().getBrowseNodes()[0].getBrowseNode()[0]);
	leafNodeOperations.writeToPropertyFile(nodeId, ancestorName);	
    }
    
    public String getFullAncestor(BrowseNode_type0 bnode){
	String leafNodeName=bnode.getName();
	
	while(bnode.getAncestors()!=null){
	    bnode=bnode.getAncestors().getBrowseNode()[0];
	    leafNodeName=bnode.getName()+"."+leafNodeName;
	}
	return leafNodeName;
    }
    
    public String getParentNodeId(){
	return responseHolder.getParentNodeId();
    }

}
