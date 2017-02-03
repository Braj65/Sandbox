package categorybean;

import java.util.ArrayList;

import com.amazon.prodbase.Categories;

public class VideoGamesParams implements Categories{
    
    public ArrayList<String> sortParams=null;
    public String srchIndexName="VideoGames";
    public String fullName="Games";
    public void setSortParams(String nodeId){
	sortParams=new ArrayList<String>();
	sortParams.add("price");
	sortParams.add("-price");
	sortParams.add("reviewrank");
	sortParams.add("reviewrank_authority");
	sortParams.add("-releasedate");	
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
