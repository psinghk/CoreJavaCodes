package com.sgs.concurrentcollection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyThreadDemo3 extends Thread

{
	static CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Child thread updating something in ");
		l.add("Prabhat");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		l.add("Govind");
		l.add("Singh");
		l.add("Gaurav");
		MyThreadDemo3 t = new MyThreadDemo3();
		t.start();
		Iterator<String> it = l.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println("Main thread itrate COWAL object--" + s);
			Thread.sleep(2000);
		}
		System.out.println(l);
	}

}
