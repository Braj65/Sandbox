package com.amazon.browsenodes;

import java.io.File;
import java.util.Iterator;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.PropertiesConfigurationLayout;

public class Client {
    
    public static void main(String[] args) throws Exception {
//	String compTimeFileLoc="/nodedetails/HighestRootNodeIds.properties";
	String parentNodes="/nodedetails/HighestRootNodeIds.properties";
//	String leafNodeIds="/nodedetails/Grocery & Gourmet Foods.properties";
//	String leafNodeIds="/nodedetails/Clothing & Accessories.properties";
	String leafNodeIds="/nodedetails/Video Games.properties";	
	String physicalLoc="/src/main/resources";
	Client c=new Client();
	NodeContainer nc=new NodeContainer("BrowseNodeLookup", leafNodeIds);
//	System.out.println(c.getClass().getProtectionDomain().getCodeSource().getLocation().getFile());
	String s=System.getProperty("user.dir");
	File f=new File(s+physicalLoc+parentNodes);
	PropertiesConfiguration conf=new PropertiesConfiguration(f);
	
//	PropertiesConfiguration leafConf=new PropertiesConfiguration(new File(s+physicalLoc+leafNodeIds));
	/*PropertiesConfiguration leafConf=null;
	PropertiesConfigurationLayout layout=null;*/
	
	Iterator<String> x=conf.getKeys();
	while(x.hasNext()){
	      String nodeName=x.next();
	      nc.createNodeReq(conf.getProperty(nodeName).toString()).batch(nodeName);
//	      layout.setComment(leafConf., comment);
	      
	}
	
	
    }

}
