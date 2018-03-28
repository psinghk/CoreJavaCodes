package com.sgs.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSizeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<Integer > l = new ArrayList<>();
		 l.add(10);
		 l.add(10);
		 l.add(10);
		 l.add(2, 30);
		 l.add(50);
		 System.out.println(l);
		 System.out.println(l.size());
		 List<Integer> sl = Collections.synchronizedList(l);
		 //System.out.println(sl);
		 
		 MyThread t1 = new MyThread();
		 //MyThread t2 = new MyThread(sl);
		 t1.start();
		 //t2.start();
   }

}
class MyThread extends Thread{
	/*List<Integer> sl;
	ArrayList<Integer> l;
	
	
	
	 public MyThread(List<Integer> sl) {
		
		this.sl = sl;
	}*/



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		 
	}
}
