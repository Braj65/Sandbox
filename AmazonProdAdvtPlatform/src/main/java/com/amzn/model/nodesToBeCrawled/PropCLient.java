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
	PropCLient cl = new PropCLient();
	cl.doIt();
    }

    public void doIt() {
	PropertiesConfiguration prop = null;
	try {
	    prop = new PropertiesConfiguration(
		    new File(Property.getChildNodePath() + "Grocery & Gourmet Foods.properties"));
	    // prop=new PropertiesConfiguration();
	    PropertiesConfigurationLayout layout = prop.getLayout();
	    prop.clear();
	    String value = "Jam=Jammy";
	    value += "\n" + "Kram=Krammy";
	    String[] fullPropVals = value.split("\\n");
	    String[] onePropAndVal = fullPropVals[0].split("=");
	    prop.setProperty(onePropAndVal[0], onePropAndVal[1]);
	    layout.setComment(onePropAndVal[0], "Comment1");
	    for (int i = 1; i < fullPropVals.length; i++) {
		onePropAndVal = fullPropVals[i].split("=");
		prop.setProperty(onePropAndVal[0], onePropAndVal[1]);
	    }
	    prop.save();
	} catch (ConfigurationException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

}
