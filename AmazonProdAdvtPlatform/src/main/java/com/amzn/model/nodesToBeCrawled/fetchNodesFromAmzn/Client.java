package com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNode_type0;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Children_type0;
import com.amzn.model.crawler.commpacks.response.NodeLookupResponseHolder;
import com.amzn.model.crawler.commpacks.response.ResponseHolder;
import com.amzn.model.crawler.stub.StubFactory;
import com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.browseNodes.BrowseNode;
import com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.request.BrowseNodeRequestContainer;
import com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.request.IBrowseNodes;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.RootNode;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity.INodeStats;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity.ldapNodeEntity.AbstractParentNodeStats;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.ILoadChildrenFromProp;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.LoadHighRoots;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.loaderFactory.LoaderFactory;

public class Client {
    
    public static void main(String[] args) {
	LoaderFactory factory=new LoaderFactory();
	ILoadChildrenFromProp rootProps=new LoadHighRoots("HighestRootNodeIds.properties");
	
	RootNode root=new RootNode("HighestRootNodeIds.properties");
	root.loadChildren();
	List<IBrowseNodes> highRootChilds=root.getFirstLevelChildren();
	INodeStats stats=null;
	ResponseHolder resp=null;
	BrowseNodeRequestContainer reqCon=new BrowseNodeRequestContainer();
	for(IBrowseNodes node:highRootChilds){
	    AbstractParentNodeStats parentNode=node.getParentNodeStats();
	    stats=parentNode.getNodeStats();
	    BrowseNode childNode=new BrowseNode(stats.getNodeId().toString(), reqCon);
	    
	    reqCon.bnodeLookupReq.addBrowseNodeId(stats.getNodeId().toString());
	    reqCon.bnodeLookupReq.addResponseGroup("BrowseNodeInfo");
	    reqCon.bnodeLookup.addRequest(reqCon.bnodeLookupReq);
	    reqCon.bnodeLookup.setAssociateTag("isnnfoiwnit0d-21");
	    try{
	    resp=StubFactory.getStubInstance("BrowseNodeInfo").executeOperation(reqCon.bnodeLookup);
	    }catch(Exception e){
		e.printStackTrace();
	    }
	    childNode.loadChildren(resp.convertToNodeLookupResp());
	}
    }
    public static void mainjam(String[] args) {
	LoaderFactory factory=new LoaderFactory();
	ILoadChildrenFromProp rootProps=new LoadHighRoots("HighestRootNodeIds.properties");
	
	RootNode root=new RootNode("HighestRootNodeIds.properties");
	root.loadChildren();
	List<IBrowseNodes> highRootChilds=root.getFirstLevelChildren();
	INodeStats stats=null;
	for(IBrowseNodes rootChild:highRootChilds){
	    AbstractParentNodeStats parentNode= rootChild.getParentNodeStats();
	    stats=parentNode.getNodeStats();
	    createRequest(stats);
	}	
    }
    
    public static void createRequest(INodeStats nodeStat){
	BrowseNodeRequestContainer reqCon=new BrowseNodeRequestContainer();
	reqCon.bnodeLookupReq.addBrowseNodeId(nodeStat.getNodeId().toString());
	reqCon.bnodeLookupReq.addResponseGroup("BrowseNodeInfo");
	reqCon.bnodeLookup.addRequest(reqCon.bnodeLookupReq);
	reqCon.bnodeLookup.setAssociateTag("isnnfoiwnit0d-21");
	ResponseHolder resp=null;
	try {
	    resp=StubFactory.getStubInstance("BrowseNodeInfo")
	    	.executeOperation(reqCon.bnodeLookup);
	} catch (RemoteException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	NodeLookupResponseHolder lookupResp=resp.convertToNodeLookupResp();
	Children_type0 children=lookupResp.getBrowseNodes()[0].getBrowseNode()[0].getChildren();
	crawlAllChildren(children);
    }
    
    public static void crawlAllChildren(Children_type0 children){
	BrowseNode_type0[] nodeArr=children.getBrowseNode();
	List<Children_type0> childList=new ArrayList<Children_type0>();
	BrowseNodeRequestContainer reqCon=new BrowseNodeRequestContainer();
	for(int i=0;i<nodeArr.length;i++){
	    reqCon.bnodeLookupReq.addBrowseNodeId(nodeArr[i].getBrowseNodeId());
	    reqCon.bnodeLookupReq.addResponseGroup("BrowseNodeInfo");
	    reqCon.bnodeLookup.addRequest(reqCon.bnodeLookupReq);
	    reqCon.bnodeLookup.setAssociateTag("isnnfoiwnit0d-21");
	    ResponseHolder resp=null;
	    try{
		resp=StubFactory.getStubInstance("BrowseNodeInfo")
			.executeOperation(reqCon.bnodeLookup);
	    }catch(RemoteException e){
		e.printStackTrace();
	    }
	}
    }
}
