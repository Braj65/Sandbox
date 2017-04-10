package All.blockQueueProdCon.Pool;

public class AzCat {
    
    String text=null;
    
    public void setDocumentText(String t){
	text=t;
    }
    
    public String getText(){
	return this.text;
    }
    
    public void reset(){
	text=null;
    }

}
