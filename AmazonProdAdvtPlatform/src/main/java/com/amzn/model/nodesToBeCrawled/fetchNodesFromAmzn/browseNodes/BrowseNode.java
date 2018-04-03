package com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.browseNodes;

import java.util.ArrayList;
import java.util.List;

import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNode_type0;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Children_type0;
import com.amzn.model.crawler.commpacks.response.NodeLookupResponseHolder;
import com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.request.BrowseNodeRequestContainer;

public class BrowseNode {
    
    private List<BrowseNode> children;
    private String nodeId;
    private NodeLookupResponseHolder responseHolder;
    private BrowseNodeRequestContainer reqCon;
    
    private Children_type0 ifChildrenPresent;
    
    public BrowseNode(String id, BrowseNodeRequestContainer req){
	nodeId=id;
	reqCon=req;
    }
    
    public void initializeChildrenBucket(){
	children=new ArrayList<BrowseNode>();
    }
    
    public void addChild(BrowseNode node){
	children.add(node);
    }
    
    public void loadChildren(NodeLookupResponseHolder resp){
	responseHolder=resp;
	BrowseNode_type0[] nodeArr=ifChildrenPresent().getChildren();
	createChildren(nodeArr);
    }
    
    public BrowseNode ifChildrenPresent(){
	ifChildrenPresent=responseHolder.getLookupResp().getBrowseNodes()[0].getBrowseNode()[0].getChildren();
	return this;
    }
    
    public BrowseNode_type0[] getChildren(){
	if(ifChildrenPresent!=null)
	    return ifChildrenPresent.getBrowseNode();
	return null;
    }
    
    public void createChildren(BrowseNode_type0[] children){
	if(children==null)
	    return;
	this.initializeChildrenBucket();
	for(BrowseNode_type0 child:children){
	    BrowseNode currNode=new BrowseNode(child.getBrowseNodeId(), reqCon);
	    this.children.add(currNode);
	    reqCon.bnodeLookupReq.addBrowseNodeId(child.getBrowseNodeId());
	    reqCon.bnodeLookupReq.addResponseGroup("BrowseNodeInfo");
	    reqCon
	    
	    currNode.loadChildren(resp);
	}
    }
    
    public String getParentNodeId(){
	return responseHolder.getLookupResp().getBrowseNodes()[0].getBrowseNode()[0]
		.getAncestors().getBrowseNode()[0].getBrowseNodeId();
    }

}
