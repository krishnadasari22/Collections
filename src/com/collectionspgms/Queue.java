package com.collectionspgms;

import java.util.*;

public class Queue {
	public static void main(String[] args) {
		PriorityQueue<Integer> q=new PriorityQueue<>();
		q.add(1276);
		q.add(190);
		q.add(908);
		q.add(87);
		System.out.println(q);
		Iterator i=q.iterator();
		while(i.hasNext())
		System.out.println(i.next());
		q.remove();
		System.out.println(q.remove(q));
	}

}
