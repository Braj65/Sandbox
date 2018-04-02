package com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes;

import java.util.ArrayList;
import java.util.List;

import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity.INodeStats;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.ILoadChildrenFromProp;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.loaderFactory.LoaderFactory;

public class RootNode implements INode{
    
    private List<INode> highRootChilds;
    private ILoadChildrenFromProp highRootLoader;
    
    public RootNode(String fileName){
	highRootChilds=new ArrayList<INode>();
	highRootLoader=LoaderFactory.getPropLoader(fileName);
    }
    
    @Override    
    public void loadChildren(){
	highRootLoader.createChildObjectsFromChildFile(highRootChilds);
    }

    @Override
    public void interpretChild() {
	for(int i=0;i<highRootChilds.size();i++){
	    highRootChilds.get(i).register(this);
	    highRootChilds.get(i).loadChildren();
	    highRootChilds.get(i).interpretChild();
	    highRootChilds.set(i, null);
	}
	
    }

    @Override
    public void register(INode observer) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void notifyObserver(INodeStats nodeStats) {
	System.out.println(nodeStats.toString());	
    }    
}
