package com.amzn.model.nodesToBeCrawled;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.PropertiesConfigurationLayout;

import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.constants.Property;

public class PropCLient {
    
    public static void main(String[] args) {
	PropCLient cl=new PropCLient();
	cl.doIt();
    }
    
    public void doIt(){
	PropertiesConfiguration prop=null;
	try {
	    /*prop=new PropertiesConfiguration(
	    	new File(Property.getChildNodePath()+"Grocery & Gourmet Foods.properties"));*/
	    prop=new PropertiesConfiguration();
	   /* PropertiesConfigurationLayout layout= prop.getLayout();*/
	PropertiesConfigurationLayout layout= prop.getLayout();
//	prop.clear();
	layout.setGlobalSeparator("-");
	prop.load(new File(Property.getChildNodePath()+"Grocery & Gourmet Foods.properties"));
	System.out.println(prop.getFileName());
	} catch (ConfigurationException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
    

}
