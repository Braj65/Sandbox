package com.amzn.model.nodes.nodeEntity.ldapNodeEntity;

import com.amzn.model.nodes.nodeEntity.INodeStats;

public abstract class AbstractParentNodeStats {
    
    protected INodeStats nodeStats;
    protected String LdapFile, status;
    
    public static AbstractParentNodeStats getNullLdapNode(){
	return new AbstractParentNodeStats.LdapNullNode();
    }
    
    public INodeStats getNodeStats() {
	return nodeStats;
    }
    
    public String getLdapFile() {
	return LdapFile;
    }

    public String getStatus() {
	return status;
    }
    
    public static class Builder{
	protected String LdapFile, status;
	protected INodeStats nodeStat;
	
	public Builder setNodeStats(INodeStats nodeStat) {
	    this.nodeStat=nodeStat;
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
	
	public AbstractParentNodeStats build(){
	    return new LdapNodeStats(this);
	}
    }
    
    public static class LdapNullNode extends AbstractParentNodeStats{
	public String toString(){
	    return new StringBuilder().append(nodeStats.toString()+" ldapFile-"+LdapFile+" Status-"+status)
		    .toString();
	}
    }

}
