package com.sgs.concurrentcollection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();
		l.add("A");
		l.add("B");
		l.add("C");
		//Here this itrator is only open for [A,B,C] these object.
		Iterator<String> itr = l.iterator();
		l.add("D");// if add [D] object then new COWAL object is creted 
		//so  itrator is not  open(avliable) for read [D] object that why output is
		//[A,B,C]
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println(s);
			
		}
		System.out.println(l);
		// here All 4 object is add succesfully
	}
	  
	 

}
