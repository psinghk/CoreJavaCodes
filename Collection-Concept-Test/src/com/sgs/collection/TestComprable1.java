package com.sgs.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TestComprable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 TreeSet<Object>t = new TreeSet<>( new MyComprator2() );
		 t.add(new StringBuffer("prabhatKr"));
		 t.add(new StringBuffer("prabhatKrSingh"));
		 t.add("pkr");
		 t.add("ksingh");
		 System.out.println(t);
	}

}
 class MyComprator2 implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub4
		 String s1 = o1.toString();
		 String s2 = o2.toString();
		 int l1 = s1.length();
		 int l2 = s2.length();
		  if(l1<l2)
			  return 1;
		  else if (l1>l2) {
			return -1;
		}else
		return - s1.compareTo(s2);
	}
	 
 }

