package com.sgs.concurrentcollection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class MyThread4 extends Thread {

	static CopyOnWriteArraySet<String> s = new CopyOnWriteArraySet<>();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Child thread updating something in COWASET object ");
		s.add("Prabhat");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		s.add("Govind");
		s.add("Singh");
		s.add("Gaurav");
		MyThread4 t = new MyThread4();
		t.start();
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println("Main thread itrate COWASet object--" + s);
			Thread.sleep(2000);
		}
		System.out.println(s);
	}
	
	

}
