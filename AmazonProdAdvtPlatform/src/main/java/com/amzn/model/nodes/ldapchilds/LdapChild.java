package com.amzn.model.nodes.ldapchilds;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.amzn.model.nodes.INode;
import com.amzn.model.nodes.childnodes.ChildNode;
import com.amzn.model.utility.LoadLeafChildren;

public class LdapChild extends AbstractLdapChild{

    private LoadLeafChildren loadLeafs;
    private boolean isCovered=false;
    
    public LdapChild(String ldapName, Boolean toBeCrawled) {
	super(ldapName, toBeCrawled);
	loadLeafs=new LoadLeafChildren();	
    }
    
    @Override
    public void loadChildren() {
	Map<String, Long> leafChildrens=loadLeafs.loadRequiredChildren(this.parentCategory);
	Set<String> leafNameSet=leafChildrens.keySet();
	Iterator<String> iter=leafNameSet.iterator();
	String leafChildName;
	while(iter.hasNext()){
	    leafChildName=iter.next();
	    INode leafNode=new ChildNode(leafChildName, leafChildrens.get(leafChildName));
	    children.put(leafNode, isCovered);
	}
    }

    @Override
    public void interpretChild() {
	Set<Entry<INode, Boolean>> entries=children.entrySet();
	INode leafNode=null;
	for(Entry entry:entries){
	    if(!(Boolean)entry.getValue()){
		isCovered=true;
		leafNode=(INode)entry.getKey();
		leafNode.register(this);
		children.put(leafNode, isCovered);
		leafNode.loadChildren();
		break;
	    }
	}
	leafNode.interpretChild();
    }

    @Override
    public void register(INode observer) {
	this.observer=observer;
    }
    
    public LoadLeafChildren getLeafChildrenSetter(){
	return loadLeafs;
    }

}
