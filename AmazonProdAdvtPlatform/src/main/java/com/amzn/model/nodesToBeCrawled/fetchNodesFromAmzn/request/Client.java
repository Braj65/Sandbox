package com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.request;

import java.util.List;

import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.RootNode;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity.INodeStats;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity.ldapNodeEntity.AbstractParentNodeStats;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.ILoadChildrenFromProp;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.LoadHighRoots;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.LoadLdapChildren;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.loaderFactory.LoaderFactory;

public class Client {
    public static void main(String[] args) {
	LoaderFactory factory=new LoaderFactory();
	ILoadChildrenFromProp rootProps=new LoadHighRoots("HighestRootNodeIds.properties");
	
	RootNode root=new RootNode("HighestRootNodeIds.properties");
	root.loadChildren();
	List<IBrowseNodes> highRootChilds=root.getFirstLevelChildren();
	for(IBrowseNodes rootChild:highRootChilds){
	    AbstractParentNodeStats parentNode= rootChild.getParentNodeStats();
	    INodeStats stats=parentNode.getNodeStats();
	}
	
	BrowseNodeRequestContainer reqCon=new BrowseNodeRequestContainer();
    }

}
