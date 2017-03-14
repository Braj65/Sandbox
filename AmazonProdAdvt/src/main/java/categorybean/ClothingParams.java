package categorybean;

import java.util.ArrayList;

import com.amazon.driver.Container;
import com.amazon.prodbase.Categories;

public class ClothingParams implements Categories{

    public ArrayList<String> sortParams=null;
    public String srchIndexName="Apparel";
    public String fullName="Clothing&Accessories";
    @Override
    public void setSortParams(String nodeId) {
	try {
	    Thread.sleep(2000);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	getSortParams(nodeId);
	/*sortParams=new ArrayList<String>();
	sortParams.add("relevancerank");
	sortParams.add("popularityrank");
	sortParams.add("price");
	sortParams.add("-price");
	sortParams.add("reviewrank");
	sortParams.add("-release-date");*/	
    }

    @Override
    public ArrayList<String> getsortParams() {
	return sortParams;
    }

    @Override
    public String getSrchIndex() {
	return srchIndexName;
    }
    
    @Override
    public String getFullName() {
	return fullName;
    }
    
    public void getSortParams(String browseNodeId){
	Container con=new Container("ItemSearch");
	String resp=con.getSortingParams(srchIndexName, browseNodeId);
	resp=resp.substring(resp.indexOf("'"), resp.lastIndexOf("'")+1);
	String[] sortParamsArr=resp.split(",");
	sortParams=new ArrayList<String>();
	for(String x: sortParamsArr){
	    sortParams.add(x.substring(x.indexOf("'")+1, x.lastIndexOf("'")));
	}
    }

}
