package designCache.mrucache;

import java.util.HashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MRU {

    Node head;
    Node tail;
    int Max;
    int N;
    HashMap<Integer, Node> mMap = null;
    ReadWriteLock lock = new ReentrantReadWriteLock();

    public static void main(String[] args) {
	MRU mru = new MRU(3);
	mru.set(1, 10);
	mru.set(2, 20);
	mru.set(3, 30);
	mru.get(2);
	mru.get(1);
	mru.set(4, 16);
	mru.set(2, 44);
    }

    public MRU(int capa) {
	head = null;
	tail = null;
	Max = capa;
	N = 0;
	mMap = new HashMap<Integer, Node>();
    }

    public int get(int key) {
	try {
	    lock.readLock().lock();
	    if (N == 0)
		return -1;

	    if (mMap.containsKey(key)) {
		Node node = mMap.get(key);
		if (key == tail.key)
		    return node.val;

		if (head.key == key) {
		    head = head.next;
		    head.prev = null;
		    tail.next = node;
		    node.prev = tail;
		    node.next = null;
		    tail = node;
		    return node.val;
		}

		Node temp = node.prev;
		temp.next = node.next;
		temp = node.next;
		if (temp != null)
		    temp.prev = node.prev;

		node.next = null;
		tail.next = node;
		node.prev = tail;
		tail = node;

		return node.val;
	    }
	    return -1;
	} finally {
	    lock.readLock().unlock();
	}

    }

    public void set(int key, int val) {
	try {
	    lock.writeLock().lock();
	    if (mMap.containsKey(key)) {
		Node node = mMap.get(key);

		if (node.key == tail.key) {
		    node.val = val;
		    return;
		}

		if (head.key == key) {
		    head = head.next;
		    head.prev = null;
		    tail.next = node;
		    node.prev = tail;
		    node.next = null;
		    tail = node;
		    return;
		}

		Node temp = node.prev;
		temp.next = node.next;
		temp = node.next;
		if (temp != null)
		    temp.prev = node.prev;

		node.next = null;
		node.prev = tail;
		tail.next = node;
		tail = node;
		node.val = val;
		return;
	    }

	    if (N == Max) {
		if (head != null) {
		    mMap.remove(head.key);
		    head = head.next;

		    if (head != null) {
			head.prev = null;
		    }
		    N--;
		}

	    }
	    Node node = new Node(key, val);
	    node.prev = tail;
	    if (tail != null)
		tail.next = node;

	    tail = node;
	    N++;
	    if (N == 1)
		head = tail;

	    mMap.put(key, node);
	} finally {
	    lock.writeLock().unlock();
	}
    }

    class Node {
	Node prev, next;
	int key;
	int val;

	public Node(int k, int v) {
	    key = k;
	    val = v;
	}
    }

}
