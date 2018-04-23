package com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn;

import java.util.List;

import com.amzn.model.crawler.commpacks.response.IResponseHolder;
import com.amzn.model.crawler.commpacks.response.NodeLookupResponseHolder;
import com.amzn.model.crawler.stub.StubFactory;
import com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.browseNodes.LeafNodes;
import com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.browseNodes.NodesAndTheirParentsList;
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
	IResponseHolder resp=null;
	BrowseNodeRequestContainer reqCon;
	NodesAndTheirParentsList childNode = null;
	for(IBrowseNodes node:highRootChilds){
	    stats=node.getParentNodeStats().getNodeStats();	    
	    reqCon=new BrowseNodeRequestContainer();
	    childNode=new NodesAndTheirParentsList(stats, reqCon);
	    
	    LeafNodes leaf=new LeafNodes(stats.getNodeName());
	    leaf.loadPropertyFile().persistExistingPropertyFileToDb();
	    leaf=null;
	    
	    reqCon.bnodeLookupReq.addBrowseNodeId(stats.getNodeId().toString());
	    reqCon.bnodeLookupReq.addResponseGroup("BrowseNodeInfo");
	    reqCon.bnodeLookup.setShared(reqCon.bnodeLookupReq);
	    reqCon.bnodeLookup.setAssociateTag("isnnfoiwnit0d-21");
	    try{
	    resp=StubFactory.getStubInstance("BrowseNodeInfo").executeOperation(reqCon.bnodeLookup);
	    }catch(Exception e){
		e.printStackTrace();
	    }
	    childNode.loadChildren((NodeLookupResponseHolder)resp);
	}
    }
}
