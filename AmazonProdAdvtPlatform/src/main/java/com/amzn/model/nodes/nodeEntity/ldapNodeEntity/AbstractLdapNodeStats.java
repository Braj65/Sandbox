package com.amzn.model.nodes.nodeEntity.ldapNodeEntity;

import com.amzn.model.nodes.nodeEntity.INodeStats;

public abstract class AbstractLdapNodeStats {
    
    protected INodeStats nodeStats;
    protected String LdapFile, status;
    
    public static AbstractLdapNodeStats getNullLdapNode(){
	return new AbstractLdapNodeStats.LdapNullNode();
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
	
	public AbstractLdapNodeStats build(){
	    return new LdapNodeStats(this);
	}
    }
    
    public static class LdapNullNode extends AbstractLdapNodeStats{
	public String toString(){
	    return new StringBuilder().append(nodeStats.toString()+" ldapFile-"+LdapFile+" Status-"+status)
		    .toString();
	}
    }

}
