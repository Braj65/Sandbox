package designCache.lfucache;

public class Client {
    
    public static void main(String[] args) {
	Client c=new Client();
	c.lfuDlist();
	
	LFU l=new LFU(3, 0.75f);
	l.put(1, 10);
	l.put(2, 20);
	l.put(3, 30);
	l.get(1);
	l.get(2);
	l.get(3);
	l.get(1);
	l.get(2);
	l.remove(2);
	l.put(5, 50);
	l.get(3);
	l.get(1);
	l.get(2);
	l.get(3);
	l.put(4, 40);	
    }
    
    public void lfuDlist(){
	LFUdLinkList l=new LFUdLinkList(3, 0.75f);
	l.put(1, 10);
	l.put(2, 20);
	l.put(3, 30);
	l.get(1);
	l.get(2);
	l.get(3);
	l.get(1);
	l.get(2);
	l.remove(2);
	l.put(5, 50);
	l.get(3);
	l.get(1);
	l.get(2);
	l.get(3);
	l.put(4, 40);
    }

}
