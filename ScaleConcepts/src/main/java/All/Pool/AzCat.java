package All.Pool;

public class AzCat {
    
    public String text=null;
    
    public void setDocumentText(String text){
	this.text=text;
    }
    public void reset(){
	text="";
    }
    
    public void setCurrentComponentinfo(Object o){
	
    }
    
    public AzCat getView(String subCatId){
	return new AzCat();
    }
    
    public void restoreClassLoaderUnlockCas(){
	
    }



}
