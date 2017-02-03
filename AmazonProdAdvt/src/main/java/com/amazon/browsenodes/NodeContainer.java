package com.amazon.browsenodes;

import java.util.ArrayList;

import com.amazon.driver.AbstractDriver;
import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookupRequest;
import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookupResponse;
import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNode_type0;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Children_type0;

public class NodeContainer extends AbstractDriver{
    
    BrowseNodeLookupRequest bnodeReq=null;
    BrowseNodeLookupRequest[] bnodeReqArr=new BrowseNodeLookupRequest[5];
    BrowseNodeLookupResponse resp=null;
    Children_type0 children=null;
    LeafNodes leafNodes=null;
    com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookup browseNodeLookup44 =null;
    String browseNodeName=null;
    
    
    public NodeContainer(String operation, String propPath){
	super(operation);
	leafNodes=new LeafNodes(propPath);
    }
    
    public NodeContainer createNodeReq(String parentNodeId){
	bnodeReq=new BrowseNodeLookupRequest();
	bnodeReq.addBrowseNodeId(parentNodeId);
	bnodeReq.addResponseGroup("BrowseNodeInfo");
	bnodeReqArr[0]=bnodeReq;	
	return this;
    }
    
    public void batch(String nodeName){
	String category="";
	browseNodeName=nodeName;
	try{
	    browseNodeLookup44 = (com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookup) getTestObject(com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookup.class);
	    browseNodeLookup44.setRequest(bnodeReqArr);
	    browseNodeLookup44.setAssociateTag("isnnfoiwnit0d-21");
	    resp=stub.browseNodeLookup(browseNodeLookup44);
//	    category=resp.getBrowseNodes()[0].getBrowseNode()[0].getAncestors().getBrowseNode()[0].getName();
	    Children_type0 children=resp.getBrowseNodes()[0].getBrowseNode()[0].getChildren();
	    getAll(children);
	    
//	    leafNodes.layout.setComment("", comment);
//	    leafNodes.saveProperty(nodeName);
	}catch(Exception e){
	    e.printStackTrace();
	}
    }
    
    
    public void getAll(Children_type0 children){
	BrowseNode_type0[] nodeArr= children.getBrowseNode();
	ArrayList<Children_type0> childList=new ArrayList<Children_type0>();
	String commentKey=null;
	for(int i=0;i<nodeArr.length;i++){
	    try{
		bnodeReq.setBrowseNodeId(null);
		bnodeReq.setResponseGroup(null);
		bnodeReq.addBrowseNodeId(nodeArr[i].getBrowseNodeId());
		bnodeReq.addResponseGroup("BrowseNodeInfo");
		bnodeReqArr[0]=bnodeReq;
		browseNodeLookup44 = (com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookup) getTestObject(com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookup.class);
		browseNodeLookup44.setRequest(bnodeReqArr);
		browseNodeLookup44.setAssociateTag("isnnfoiwnit0d-21");
		Thread.sleep(2000);
		resp=stub.browseNodeLookup(browseNodeLookup44);
		children=resp.getBrowseNodes()[0].getBrowseNode()[0].getChildren();
		if(children==null){
		    commentKey=flushFullHeir(resp, commentKey);
		    if(commentKey.contains(browseNodeName)){
			leafNodes.layout.setComment(commentKey, commentKey.substring(0, commentKey.lastIndexOf(".")));
			leafNodes.saveProperty();
		    }else
			commentKey=null;
		    
		}else{
		    childList.add(children);
		}
	    }catch(Exception e){
		e.printStackTrace();
	    }
	}
	
	for(int j=0;j<childList.size();j++){
	    getAll(childList.get(j));
	}
    }
    
    
    /*public String getAll(Children_type0 children){
	String commentKey=null;
	String altCommentKey=null;
	if(children==null){
	    return "";
	}else{
	    BrowseNode_type0[] nodeArr= children.getBrowseNode();
	    for(BrowseNode_type0 x:nodeArr){
		try{
		    bnodeReq.setBrowseNodeId(null);
		    bnodeReq.setResponseGroup(null);
		    bnodeReq.addBrowseNodeId(x.getBrowseNodeId());
		    bnodeReq.addResponseGroup("BrowseNodeInfo");
		    bnodeReqArr[0]=bnodeReq;
		    browseNodeLookup44 = (com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookup) getTestObject(com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookup.class);
		    browseNodeLookup44.setRequest(bnodeReqArr);
		    browseNodeLookup44.setAssociateTag("isnnfoiwnit0d-21");
		    Thread.sleep(2000);
		    resp=stub.browseNodeLookup(browseNodeLookup44);		    
		}
		catch(Exception e){
		    e.printStackTrace();
		}		
		children=resp.getBrowseNodes()[0].getBrowseNode()[0].getChildren();
		if(children==null){
		    commentKey=flushFullHeir(resp, commentKey);
		}else{
		    altCommentKey=getAll(children);
		    if(altCommentKey!=null){
			try{
				leafNodes.layout.setComment(altCommentKey, altCommentKey.substring(0, altCommentKey.lastIndexOf(".")));
				leafNodes.saveProperty();
			    }catch(Exception e){
				e.printStackTrace();
			    }
		    }		    
		}
		
	    }
	    if(commentKey!=null){
		try{
			leafNodes.layout.setComment(commentKey, commentKey.substring(0, commentKey.lastIndexOf(".")));
			leafNodes.saveProperty();
		    }catch(Exception e){
			e.printStackTrace();
		    }
	    }
	    return commentKey;
	}
    }*/
    
    public String flushFullHeir(BrowseNodeLookupResponse resp, String commentKey){
	String nodeId=resp.getBrowseNodes()[0].getBrowseNode()[0].getBrowseNodeId();
	String ancestorsName=fetchAncestors(resp.getBrowseNodes()[0].getBrowseNode()[0]);
	if(commentKey==null)
	    commentKey=ancestorsName;
	leafNodes.addProperty(ancestorsName, nodeId);
	return commentKey;
    }
    
    public String fetchAncestors(BrowseNode_type0 bnode){
	String leafNodeName=bnode.getName();
	
	while(bnode.getAncestors()!=null){
	    bnode=bnode.getAncestors().getBrowseNode()[0];
	    leafNodeName=bnode.getName()+"."+leafNodeName;
	}
//	leafNodeName=bnode.getName()+"."+leafNodeName;
	return leafNodeName;	
    }
    
    public static void main(String[] args){
	NodeContainer nc=new NodeContainer("BrowseNodeLookup", "");
	nc.createNodeReq("1571272031");
	nc.batch("Cloths");
    }

}
