package com.amazon.loadLDAP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.PropertiesConfigurationLayout;

public class Client {
    
    public static void main(String[] args) throws Exception {
	String groceryNodes="/nodedetails/Grocery&Gourmet.properties";
	String clothNodes="/nodedetails/Clothing&Accessories.properties";
	String nodeLdap="/nodedetails/NodeLDAP.properties";
	String physicalLoc="/src/main/resources";
	String s=System.getProperty("user.dir");
	
	File grocFile=new File(s+physicalLoc+groceryNodes);
	File clothFile=new File(s+physicalLoc+clothNodes);
	File ldapFile=new File(s+physicalLoc+nodeLdap);
	
	BufferedReader bfr=new BufferedReader(new FileReader(grocFile));
	
	PropertiesConfiguration ldapConf=new PropertiesConfiguration(ldapFile);
	PropertiesConfigurationLayout ldapLay=ldapConf.getLayout();
	
	String curLine=null;
	int count=1;
	
	Set<String> nameSet=new HashSet<String>();
	String temp=null;
	while((curLine=bfr.readLine())!=null){
	    if(curLine.startsWith("#")){
		if(count==1){
		    ldapConf.setProperty(curLine.substring(2, curLine.indexOf(".")), true);
		    ++count;
		}else{
		    curLine=curLine.substring(2);
		    if(temp==null)
			temp=curLine;
		    else{
			if(curLine.contains(temp) && !temp.contains(curLine)){
			    nameSet.add(temp);
			}else if(!curLine.contains(temp) && temp.contains(curLine)){
			    nameSet.remove(temp);
			    nameSet.add(curLine);
			    temp=curLine;
			}else if(!curLine.contains(temp) && !temp.contains(curLine)){
			    nameSet.add(curLine);
			    nameSet.add(temp);
			    temp=curLine;
			}
		    }
		}		
	    }
	}
	
	Iterator<String> x=nameSet.iterator();
	while(x.hasNext()){
	    ldapConf.setProperty(x.next(), true);
	}
	
	FileWriter fw=new FileWriter(ldapFile);
	ldapConf.save(fw);
	
	/*PropertiesConfiguration grocProp=new PropertiesConfiguration(grocFile);
	PropertiesConfiguration clothProp=new PropertiesConfiguration(clothFile);
	
	PropertiesConfigurationLayout lay=grocProp.getLayout();
	Iterator<String> x=grocProp.getKeys("#");		

	while(x.hasNext()){
	    System.out.println(x.next());
	}*/
    }	

}
