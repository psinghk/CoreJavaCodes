package com.sgs.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriortyQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>(new CompratorDemo());
		System.out.println(pq.peek());
		//System.out.println(pq.element());
		for (int i = 1; i <= 10; i++) {
			pq.offer(i);
		}
		System.out.println(pq);
		
		System.out.println(pq.poll()+"  --:  "+"Head of queue element:");
		System.out.println("-----After pull method calling :------");
		System.out.println(pq);
		
	}

}
 class CompratorDemo implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		 Integer I1 = (Integer)o1;
		 Integer I2 = (Integer)o2;
		return -I1.compareTo(I2);
	}
	 
	 
 }
