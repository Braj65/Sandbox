package com.amzn.model.nodesToBeCrawled.nodes.nodeEntity;

public abstract class AbstractNodeStats implements INodeStats {
    protected String nodeName;
    protected Long nodeId;

    public static INodeStats getNullNode() {
	return new AbstractNodeStats.NullNode();
    }

    public String getNodeName() {
	return nodeName;
    }

    public Long getNodeId() {
	return nodeId;
    }

    public static class Builder {
	protected String nodeName;
	protected Long nodeId;

	public Builder setNodeName(String nodeName) {
	    this.nodeName = nodeName;
	    return this;
	}

	public Builder setNodeId(Long nodeId) {
	    this.nodeId = nodeId;
	    return this;
	}

	public INodeStats build() {
	    return new NodeStats(this);
	}

    }

    static class NullNode extends AbstractNodeStats {
	public String toString() {
	    return new StringBuilder().append("Node Name-" + nodeName + " Node Id-" + nodeId).toString();
	}
    }
}
