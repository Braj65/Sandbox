package com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled;

import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.RootNode;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.ILoadChildrenFromProp;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.LoadHighRoots;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.LoadLdapChildren;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.LoadLeafChildren;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.loaderFactory.LoaderFactory;

public class Client {
    
    public static void main(String[] args) {
	LoaderFactory factory=new LoaderFactory();
	ILoadChildrenFromProp rootProp=new LoadHighRoots("HighestRootNodeIds.properties");
	
	ILoadChildrenFromProp ldapVGamesProp=new LoadLdapChildren("VideoGamesLDAP.properties");
	ILoadChildrenFromProp ldapGroceryProp=new LoadLdapChildren("GroceryAndGourmetFoodsLDAP.properties");
	
	ILoadChildrenFromProp leafGroceryProp=new LoadLeafChildren("Grocery & Gourmet Foods.properties");
	ILoadChildrenFromProp leafVGamesProp=new LoadLeafChildren("Video Games.properties");
	
	RootNode node=new RootNode("HighestRootNodeIds.properties");
	node.loadChildren();
	node.interpretChild();
    }
}
