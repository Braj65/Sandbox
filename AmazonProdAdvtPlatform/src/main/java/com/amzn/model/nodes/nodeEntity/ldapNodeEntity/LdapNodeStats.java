package com.amzn.model.nodes.nodeEntity.ldapNodeEntity;

public class LdapNodeStats extends AbstractLdapNodeStats{

    public LdapNodeStats(Builder builder) {
	super();
	this.nodeStats=builder.nodeStat;
	this.LdapFile=builder.LdapFile;
	this.status=builder.status;
    }

}
