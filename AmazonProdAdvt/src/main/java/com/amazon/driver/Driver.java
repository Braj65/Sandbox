package com.amazon.driver;

import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;

import com.amazon.elastic.indexing.AddDocs;
import com.amazon.elastic.indexing.Create;
import com.amazon.prodbase.Categories;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;

import categorybean.GroceryParams;
import categorybean.HealthPersonalParams;
import categorybean.VideoParams;

public class Driver {
    
    public Create c=null;
    public AddDocs doc=null;
    public HashMap<String, String> srchParams=null;
    public HashMap<String, ArrayList<String>> resMap=null;
    public Container con=null;
    public Categories cat=null;
    
    public String nodeLdap="/nodedetails/NodeLDAP.properties";
    public String actualNodes="/nodedetails/";
    public String physicalLoc="/src/main/resources";
    public String indexMetaFile="/indexmeta/LastIndexTypeMeta.properties";
    PropertiesConfiguration indexMeta=null;
    
    public String beanClasses=".src.main.java.CategoryBean.";
    public String s=System.getProperty("user.dir");
    
    
    public static void main(String[] args) {
	Driver driv=new Driver();
	driv.arrange();
//	driv.start();
    }
    
    public void arrange(){
	String temp="";
	String curr="";
	String catName=null;
	
	String nodeName=null;
	
	try{
	    HashMap<String, ArrayList<String>> map=new HashMap<String, ArrayList<String>>();
	    ArrayList<String> ids=null;
	    File ldap=new File(s+physicalLoc+nodeLdap);
	    PropertiesConfiguration ldapConf=new PropertiesConfiguration(ldap);
	    PropertiesConfiguration nodesConf=null;
	    indexMeta=new PropertiesConfiguration(s+physicalLoc+indexMetaFile);
//	    FileWriter fw = new FileWriter(s + physicalLoc + indexMetaFile, true);
	    Iterator<String> it=ldapConf.getKeys();
	    while(it.hasNext()){
		catName=it.next();
		curr=catName.substring(0, catName.indexOf(".")!=-1?catName.indexOf("."):catName.length());
		if(!temp.equals(curr)){
		    temp=curr;
		    if(!ldapConf.getBoolean(catName))
			continue;
		    nodesConf=new PropertiesConfiguration(s+physicalLoc+actualNodes+curr+".properties");
		    ids=new ArrayList<String>();
		}else{
		    if(!ldapConf.getBoolean(catName) || !ldapConf.getBoolean(temp))
			continue;
		    Iterator<String> nodes=nodesConf.getKeys();
		    while(nodes.hasNext()){
			nodeName=nodes.next();
//			System.out.println(nodeName);
			if(nodeName.substring(0, nodeName.lastIndexOf(".")).equals((catName))){
			    ids.add(nodeName+"="+nodesConf.getProperty(nodeName).toString());
			    map.put(temp, ids);
			}
		    }
		}
	    }
	    
	    c = new Create();
	    doc=new AddDocs(c);
	    con=new Container("ItemSearch");
	    srchParams=new HashMap<String, String>();
	    
	    Set<String> cls= map.keySet();
	    Iterator<String> clsIter=cls.iterator();
	    ArrayList<String> nodeCon=new ArrayList<String>();
	    String clsName="";
	    String indexname=createIndexName();
	    String suffTypeName="";
	    
	    String browseNodeid="";
	    String categoryName="";
	    while(clsIter.hasNext()){
		suffTypeName=createTypename();
		clsName=clsIter.next();
		cat=(Categories) Class.forName("categorybean."+clsName.substring(0, clsName.indexOf(" "))+"Params").newInstance();
		nodeCon=map.get(clsName);
		cat.setSortParams(nodeCon.get(0).substring(nodeCon.get(0).indexOf("=")+1));
		for(String i:nodeCon){
		    categoryName=i.substring(0, i.indexOf("="));
		    browseNodeid=i.substring(i.indexOf("=")+1, i.length());
		    getit(indexname, suffTypeName, cat, cat.getSrchIndex(), browseNodeid, categoryName);
		    for(ItemSearch srchReq: con.failedItems){
			    resMap=con.failedBatch(con.uniq, resMap, srchReq);
			    doc.changeType(cat.getFullName()+"_"+suffTypeName);
			    doc.prepareDoc(resMap, cat, indexMeta, categoryName);
			    c.createDiscItemsIndex(indexname, cat.getFullName());
			    doc.changeType(cat.getFullName());
			    doc.indexDiscItems(cat.getFullName()+"_"+suffTypeName);
			    doc.checkDiscItems();
			    doc.clearDiffCache();
			    resMap.clear();
			    srchParams.clear();
		    }
		    con.failedItems.clear();
		    
		}
		suffTypeName=cat.getFullName()+"_"+suffTypeName;
		indexMeta.clearProperty(cat.getFullName());
		indexMeta.save(s + physicalLoc + indexMetaFile);
		indexMeta.setProperty(cat.getFullName(), indexname+"/"+suffTypeName);
		indexMeta.save(s + physicalLoc + indexMetaFile);
	    }
	    
	}catch(Exception e){
	    e.printStackTrace();
	}
	
    }
    
    public String createIndexName(){
	DateFormat dateFormat=new SimpleDateFormat("dd_MM_yy");
	Date d=new Date();
	return "index_"+dateFormat.format(d);
    }
    
    public String createTypename(){
	DateFormat dateFormat=new SimpleDateFormat("HH_mm");
	Date d=new Date();
	return dateFormat.format(d);
    }
    

    public void start(){
	c = new Create();
	doc=new AddDocs(c);
	
	String indexname=null;
	String typeName=null;   	
   	
   	ArrayList<String> sortParams=new ArrayList<String>();   	
   	srchParams=new HashMap<String, String>();  	
   	
   	con=new Container("ItemSearch");
   	 
   	//games
   	indexname="index_19_01_2017";
   	typeName="type_23";
   	cat=new VideoParams();
//   	getit(indexname, typeName, cat, "VideoGames", "2591141031");
   	
   	//sauces
   	indexname="index_20_01_2017";
   	typeName="type_3";
   	cat=new GroceryParams();
//   	getit(indexname, typeName, cat, "Grocery", "4859497031");
   	//khakhra
   	indexname="index_20_01_2017";
   	typeName="khakhra_2";
//   	getit(indexname, typeName, cat, "Grocery","10671847031");
   	
   	//healthandpersonal
   	indexname="index_21_01_2017";
   	typeName="bathbombs_2";
   	cat=new HealthPersonalParams();
//   	getit(indexname, typeName, cat, "HealthPersonalCare", "1374278031");
   	//bathpearls_1
   	typeName="bathpearls_2";
//   	getit(indexname, typeName, cat, "HealthPersonalCare", "1374279031");
   	//Bubble Bath
   	typeName="bubblebath_2";
//   	getit(indexname, typeName, cat, "HealthPersonalCare", "1374280031");
   	//bathsalts
   	typeName="bathsalts_2";
//   	getit(indexname, typeName, cat, "HealthPersonalCare", "1374281031");
   	//bathoils
   	typeName="bathoils_2";
//   	getit(indexname, typeName, cat, "HealthPersonalCare", "1374282031");
   	//tubtea
   	typeName="tubtea_2";
//   	getit(indexname, typeName, cat, "HealthPersonalCare", "1374283031");
   	
   	//laptops
   	/*indexname="index_20_01_2017";
   	typeName="laptop_2";
   	cat=new ElectronicsParams();
   	getit(indexname, typeName, cat, "Electronics", "1375424031");*/
    }
    
    public void getit(String indexname, String typeName, Categories cat, String srchInd, String browsenodeId,
	    String categoryName){
	typeName=cat.getFullName()+"_"+typeName;
	c.createIndexMapping(indexname, typeName);
	
   	doc.indexName=indexname;
   	doc.typeName=typeName;
//   	cat.setSortParams();
   	srchParams.put("searchIndex", srchInd);
   	srchParams.put("browseNodeId", browsenodeId);
//   	VideoGamesParams vid=new VideoGamesParams();
   	resMap=con.getMap(cat.getsortParams(), srchParams);
//   	resMap=con.failedBatch(con.uniq, resMap, con.failedItems);
   	doc.prepareDoc(resMap, cat, indexMeta, categoryName);
   	c.createDiscItemsIndex(indexname, cat.getFullName());
   	doc.changeType(cat.getFullName());
   	doc.indexDiscItems(typeName);
   	doc.checkDiscItems();
   	doc.clearDiffCache();
   	resMap.clear();
   	srchParams.clear();
    }
}
