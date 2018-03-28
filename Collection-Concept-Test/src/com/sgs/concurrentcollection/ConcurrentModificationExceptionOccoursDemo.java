package com.sgs.concurrentcollection;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionOccoursDemo extends Thread {

	static ArrayList<Object> l = new ArrayList<>();

	// Even we get synchronized version of list but we also
	// throw concurrentmodifocation exception .

	static List<Object> l1 = Collections.synchronizedList(l);

	public void run() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {

			// TODO: handle exception
		}
		System.out.println("Child Thread update Something:");
		l1.add("d");
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		l1.add("a");
		l1.add("b");
		l1.add("c");
		System.out.println(l);
		ConcurrentModificationExceptionOccoursDemo t = new ConcurrentModificationExceptionOccoursDemo();
		t.start();
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println("Main Thread Itrating list object is:  " + s);
			Thread.sleep(5000);
		}
		System.out.println(l);
	}
}
