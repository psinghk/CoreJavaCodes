package com.sgs.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyThreadArrayslistDemo extends Thread {

	
  static ArrayList<Integer > l1 = new ArrayList<>();
	 static List<Integer> sl = Collections.synchronizedList(l1);
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lllllll");
		MyThreadArrayslistDemo ald = new MyThreadArrayslistDemo();
		ald.start();
		
		/*for (Object object : l1) {
			System.out.println(object);
		}*/
		
		sl.add(10);
		sl.add(90);
		 Iterator<Integer> itr =sl.iterator();
		 
		while (itr.hasNext()){
			
			 Integer l2 = itr.next();
			 System.out.println(l2);
			 System.out.println("kkkk");
		}
		//l1.add(10);
		//l1.add(90);

	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 8; i++) {
			sl.add(i*10*2);
			
		}
		 System.out.println(sl);
	}

}
