package categorybean;

import java.util.ArrayList;

import com.amazon.prodbase.Categories;


public class ElectronicsParams implements Categories{
    
    public ArrayList<String> sortParams=null;
    public String srchIndexName="Computers";
    public String fullName="Electronics";
    
    public void setSortParams(String nodeId){
	sortParams=new ArrayList<String>();
	sortParams.add("relevancerank");
	sortParams.add("salesrank");
	sortParams.add("price");
	sortParams.add("-price");
	sortParams.add("reviewrank");
	sortParams.add("reviewrank_authority");
	sortParams.add("date-desc-rank");
    }
    
    public ArrayList<String> getsortParams(){
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
}
