package com.amzn.model.nodes.childnodes;


public class ChildNode extends AbstractChildNode{
    
    public ChildNode(String nodeName, Long nodeId){
	super(nodeName, nodeId);
    }

    @Override
    public void interpretChild() {
	System.out.println(toString());
    }
    
    public String toString(){
	return nodeStats.toString();
    }
}
