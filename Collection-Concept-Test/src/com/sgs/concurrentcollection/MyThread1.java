package com.sgs.concurrentcollection;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MyThread1 extends Thread {

	static ConcurrentHashMap<Integer, String> l1 = new ConcurrentHashMap<>();

	public void run() {
		try {
			Thread.sleep(300);
		} catch (Exception e) {

			// TODO: handle exception
		}
		System.out.println("Child Thread update Something:");

		//l1.put(102, "d"); //if we add these key and value so itrator
		//cannot itrate this object due to hashcode of there object
		//because itarator cross this hashcode index and it is only farward direction cursor

		l1.put(109, "d");// here itrator itrate this object because cursoe cannot 
		//cross this object  index.
		System.out.println("child Thread Complete our job:");
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		l1.put(103, "a");
		l1.put(104, "b");
		l1.put(105, "c");
		// ConcurrentModificationExceptionOccoursDemo t = new
		// ConcurrentModificationExceptionOccoursDemo();
		MyThread1 t = new MyThread1();
		t.start();
		Set<Entry<Integer, String>> s = l1.entrySet();
		Iterator<Entry<Integer, String>> itr = s.iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> I = itr.next();
			System.out.println("Main Thread Itrating list object is:  " + I);
			Thread.sleep(2000);
		}
		System.out.println(l1);
	}
}
