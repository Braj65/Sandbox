package com.amzn.model.nodes;

import java.util.ArrayList;
import java.util.List;

import com.amzn.model.constants.Property;
import com.amzn.model.nodes.nodeEntity.INodeStats;
import com.amzn.model.utility.LoadHighRoots;

public class RootNode implements INode{
    
    private List<INode> highRootChilds;
    private LoadHighRoots highRootLoader;
    
    public RootNode(){
	highRootChilds=new ArrayList<INode>();
	highRootLoader=new LoadHighRoots();
    }
    
    @Override
    public void loadChildren(){
	highRootLoader.createChildObjectsFromChildFile(highRootChilds, Property.Value.ROOT_CATEGORIES.getString());
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
