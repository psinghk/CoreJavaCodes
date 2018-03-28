package com.sgs.concurrentcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
    //ArrayList<String> l = new ArrayList<>();---(1)
		// Here if u use Normal ArryaList object so we will not get
		//UnsupportedOperationException because this AL support remove opration
		 
	CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();
	//Here if u use COWArryaList object so we will get
	//UnsupportedOperationException because this COWArraylist not support remove opration
		 l.add("A");
		 l.add("B");
		 l.add("c");
		 l.add("D");
		 System.out.println(l);
		  Iterator<String> itr = l.iterator();
		  while (itr.hasNext()) {
			String s = (String) itr.next();
			if(s.equals("D")){
				itr.remove();
			}
		}
		  System.out.println("--After Removing D ----- ");
		  System.out.println(l);
	}

}
