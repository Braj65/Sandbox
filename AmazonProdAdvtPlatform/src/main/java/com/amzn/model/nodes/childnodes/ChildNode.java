package com.amzn.model.nodes.childnodes;

import com.amzn.model.nodes.INode;
import com.amzn.model.nodes.nodeEntity.INodeStats;

public class ChildNode extends AbstractChildNode{
    
    public ChildNode(String nodeName, Long nodeId){
	super(nodeName, nodeId);
    }

    @Override
    public void interpretChild() {
	System.out.println(toString());
	notifyObserver(nodeStats);
    }
    
    public String toString(){
	return nodeStats.toString();
    }

    @Override
    public void notifyObserver(INodeStats stats) {
	observer.notifyObserver(stats);
    }

    @Override
    public void register(INode observer) {
	this.observer=observer.getObserver();
    }
}
