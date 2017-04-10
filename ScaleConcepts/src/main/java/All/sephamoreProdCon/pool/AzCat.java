package All.sephamoreProdCon.pool;

public class AzCat {
    
    public String text=null;
    
    public void setDocText(String t){
	this.text=t;
    }
    
    public String getDocText(){
	return this.text;
    }
    
    public void reset(){
	this.text=null;
    }

}
