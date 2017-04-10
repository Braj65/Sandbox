package designCache.lrupluslfu;

public class Client {
    
    public static void main(String[] args) {
	Client c=new Client();
	c.act();
    }
    
    public void act(){
	Segment s=new Segment(10, 0.5f);
	s.put(1, 10);
	s.put(2, 20);
	s.put(3, 30);
	s.put(4, 40);
	s.put(5, 50);
	s.put(6, 60);
	s.put(7, 70);
	s.put(8, 80);
	s.put(9, 90);
	s.put(10,100);
	s.get(1);
	s.get(1);
	s.get(1);
	s.get(2);
	s.get(3);
	s.get(4);
	s.get(5);
	s.get(2);
	s.get(3);
	s.findTop(5);
	
    }

}
