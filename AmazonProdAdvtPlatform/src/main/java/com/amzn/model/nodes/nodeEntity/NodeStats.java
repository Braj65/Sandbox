package com.amzn.model.nodes.nodeEntity;

public class NodeStats extends AbstractNodeStats{

    protected NodeStats(Builder builder){
	super();
	this.nodeName=builder.nodeName;
	this.nodeId=builder.nodeId;
    }

    public String toString() {
	StringBuilder str=new StringBuilder();
	str.append("Node Name-"+nodeName+" Node Id-"+nodeId);
	return str.toString();
    }


    
}
