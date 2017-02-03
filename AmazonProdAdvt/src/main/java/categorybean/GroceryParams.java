package categorybean;

import java.util.ArrayList;

import com.amazon.prodbase.Categories;
public class GroceryParams implements Categories{
    
    public ArrayList<String> sortParams=null;
    public String srchIndexName="Grocery";
    public String fullName="Grocery&GourmetFoods";
    public void setSortParams(String nodeId){
	sortParams=new ArrayList<String>();
	sortParams.add("relevancerank");
	sortParams.add("popularityrank");
	sortParams.add("price");
	sortParams.add("-price");
	sortParams.add("reviewrank");
	sortParams.add("-release-date");	
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
