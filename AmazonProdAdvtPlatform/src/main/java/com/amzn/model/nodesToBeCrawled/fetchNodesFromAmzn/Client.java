package com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn;

import java.util.List;

import com.amzn.model.crawler.commpacks.response.IResponseHolder;
import com.amzn.model.crawler.commpacks.response.NodeLookupResponseHolder;
import com.amzn.model.crawler.stub.StubFactory;
import com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.browseNodes.CategoryNode;
import com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.browseNodes.NodesAndTheirParentsList;
import com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.request.BrowseNodeRequestContainer;
import com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.request.IBrowseNodes;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.RootNode;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity.INodeStats;
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
	BrowseNodeRequestContainer reqCon=new BrowseNodeRequestContainer();
	NodesAndTheirParentsList childNode = null;
	for(IBrowseNodes node:highRootChilds){
	    stats=node.getParentNodeStats().getNodeStats();
	    
	    CategoryNode catNode=new CategoryNode(stats.getNodeName())
		    .persistExistingPropertyFileToDb();
//	    catNode.loadPropertyFile().persistExistingPropertyFileToDb();
	    
	    childNode=new NodesAndTheirParentsList(reqCon, catNode);
	    	    
	    reqCon.addBrowseNodeId(stats.getNodeId().toString()).setShared();
	    try{
	    resp=StubFactory.getStubInstance("BrowseNodeInfo").executeOperation(reqCon.bnodeLookup);
	    }catch(Exception e){
		e.printStackTrace();
		continue;
	    }
	    childNode.loadChildren((NodeLookupResponseHolder)resp);
	}
    }
}
