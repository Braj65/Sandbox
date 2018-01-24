package com.amzn.model.nodes;

public class NodeStats {
    private String nodeName, nodeId, LdapFile, status;

    public NodeStats(String nodeName, String nodeId, String LdapFile, String status) {
	this.nodeName = nodeName;
	this.nodeId = nodeId;
	this.LdapFile = LdapFile;
	this.status = status;
    }

    public String toString() {
	StringBuilder str=new StringBuilder();
	str.append("Node Name-"+nodeName+" Node Id-"+nodeId+" LdapFile-"+LdapFile+" Status-"+status);
	return str.toString();
    }

    public String getNodeName() {
        return nodeName;
    }

    public String getNodeId() {
        return nodeId;
    }

    public String getLdapFile() {
        return LdapFile;
    }

    public String getStatus() {
        return status;
    }
    
    static class Builder{
	private String nodeName, nodeId, LdapFile, status;

	public Builder setNodeName(String nodeName) {
	    this.nodeName = nodeName;
	    return this;
	}

	public Builder setNodeId(String nodeId) {
	    this.nodeId = nodeId;
	    return this;
	}

	public Builder setLdapFile(String ldapFile) {
	    LdapFile = ldapFile;
	    return this;
	}

	public Builder setStatus(String status) {
	    this.status = status;
	    return this;
	}
	
	
    }
    
    class NodeStatsNull extends NodeStats{

	public NodeStatsNull(String nodeName, String nodeId, String LdapFile, String status) {
	    super(nodeName, nodeId, LdapFile, status);
	    
	}
	
    }
    
}
