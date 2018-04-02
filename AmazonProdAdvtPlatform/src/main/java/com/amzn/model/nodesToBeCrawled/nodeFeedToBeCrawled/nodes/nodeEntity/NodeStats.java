package com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity;

public class NodeStats extends AbstractNodeStats{

    protected NodeStats(Builder builder){
	super();
	this.nodeName=builder.nodeName;
	this.nodeId=builder.nodeId;
	this.srchIndex=builder.srchIndex;
    }

    public String toString() {
	return new StringBuilder().append("Node Name-"+nodeName+" Node Id-"+nodeId).toString();
    }
}