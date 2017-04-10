package designCache.cacehtoDisk;

public class Client {
    
    public static void main(String[] args) {
	Client c=new Client();
	c.act();
    }
    
    public void act(){
	LFULinkList l=new LFULinkList(3, 0.25f);
	l.set(1, 10);
	l.set(2, 20);
	l.set(2, 20);
	l.set(3, 30);
	l.get(1);
	l.get(2);
	l.get(3);
	l.get(1);
	l.get(2);
	l.get(3);
	l.set(4, 40);
	l.set(1, 10);
	l.persistAll();
    }

}