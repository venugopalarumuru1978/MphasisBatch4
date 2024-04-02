package com.ds.predefined;

import java.util.*;

public class QueueExMain {

	public static void main(String[] args) {
		Queue<Integer>  q = new PriorityQueue<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		System.out.println(q);
		
		q.poll();
		System.out.println(q);
		
		q.poll();
		System.out.println(q);
		
		q.poll();
		System.out.println(q);
		
		q.poll();
		System.out.println(q);
		
		q.poll();
		System.out.println(q);
	}

}
