package com.amzn.model.nodes.childnodes;

import com.amzn.model.nodes.INode;
import com.amzn.model.nodes.nodeEntity.AbstractNodeStats;
import com.amzn.model.nodes.nodeEntity.INodeStats;

public abstract class AbstractChildNode implements INode{
    protected INodeStats nodeStats;
    protected INode observer;
    
    public AbstractChildNode(String childNodeName, Long nodeId){
	AbstractNodeStats.Builder builder=new AbstractNodeStats.Builder();
	nodeStats=builder
		.setNodeName(childNodeName)
		.setNodeId(nodeId).build();
	builder=null;
    }
    
    @Override
    public void loadChildren() {
	
    }
}
