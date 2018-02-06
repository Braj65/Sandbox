package com.amzn.model.nodesToBeCrawled.nodes.nodeEntity.ldapNodeEntity;

public class LdapNodeStats extends AbstractParentNodeStats{

    public LdapNodeStats(Builder builder) {
	super();
	this.nodeStats=builder.nodeStat;
	this.LdapFile=builder.LdapFile;
	this.status=builder.status;
    }

}
