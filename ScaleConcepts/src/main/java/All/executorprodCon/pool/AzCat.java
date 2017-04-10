package All.executorprodCon.pool;

public class AzCat {
    
    String text=null;
    
    public void setDocText(String text){
	this.text=text;
    }
    
    public String getText(){
	return text;
    }
    
    public void reset(){
	text=null;
    }

}
