package designCache.lrucache;

import java.util.HashMap;

public class LRU {
	
	Node head;
	Node tail;
	int N;
	int Max;
	HashMap<Integer, Node> mMap;
	
	public static void main(String[] args) {
		LRU lru=new LRU(3);
		lru.set(1, 10);
		lru.set(2, 12);
		lru.set(3, 14);
		lru.get(2);
		lru.get(1);
		lru.set(4, 16);
	}
	
	public LRU(int capacity){
		head=null;
		tail=null;
		Max=capacity;
		N=0;
		mMap=new HashMap<Integer, Node>();
	}
	
	public int get(int key){
		if(N==0)
			return -1;
		
		if(mMap.containsKey(key)){
			Node node=mMap.get(key);
			if(key==head.key)
				return node.val;
			
			if(tail.key==key)
				tail=tail.prev;
			
			Node temp=node.prev;
			temp.next=node.next;
			temp=node.next;
			if(temp!=null)
				temp.prev=node.prev;
			
			node.next=head;
			head.prev=node;
			node.prev=null;
			head=node;
			
			return node.val;
		}
		return -1;
	}
	
	public void set(int key, int val){
		if(mMap.containsKey(key)){
			Node node=mMap.get(key);
			Node temp;
			
			if(node.key==head.key){
				node.val=val;
				return;
			}
			
			if(tail.key==key)
				tail=tail.prev;
			
			temp=node.prev;
			temp.next=node.next;
			temp=node.next;
			if(temp!=null)
				temp.prev=node.prev;
			
			node.next=head;
			head.prev=node;
			node.prev=null;
			head=node;
			node.val=val;
			
			return;
		}
		
		if(N==Max){
			if(tail!=null){
				mMap.remove(tail.key);
				tail=tail.prev;
				
				if(tail!=null){
					tail.next.prev=null;
					tail.next=null;
				}
				N--;
			}
		}
		
		Node node=new Node(key, val);
		node.next=head;
		if(head!=null)
			head.prev=node;
		
		head=node;
		N++;
		if(N==1)
			tail=head;
		
		mMap.put(key, node);
	}
	
	class Node{
		int key;
		int val;
		Node prev, next;
		public Node(int key, int val){
			this.key=key;
			this.val=val;
		}
	}

}
