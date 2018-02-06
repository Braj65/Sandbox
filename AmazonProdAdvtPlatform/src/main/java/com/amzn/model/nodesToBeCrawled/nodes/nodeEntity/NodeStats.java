package com.amzn.model.nodesToBeCrawled.nodes.nodeEntity;

public class NodeStats extends AbstractNodeStats{

    protected NodeStats(Builder builder){
	super();
	this.nodeName=builder.nodeName;
	this.nodeId=builder.nodeId;
    }

    public String toString() {
	return new StringBuilder().append("Node Name-"+nodeName+" Node Id-"+nodeId).toString();
    }
}