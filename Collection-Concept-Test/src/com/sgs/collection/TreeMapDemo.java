package com.sgs.collection;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tm = new TreeMap<>(new MycompratorMap());
		tm.put(102, "prabhat");
		tm.put(101, "Singh");
		tm.put(108, "prabhgovindat");
		System.out.println(tm);
		
//		tm.put("prabhat",90);
//		tm.put("gaurav",20);
//		tm.put("singh",40);
//		tm.put("govind",50);
//		System.out.println(tm);
		
		
		
		
	}

}
 class MycompratorMap implements Comparator<Object>{

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		Integer I1 = (Integer)arg0;
		Integer I2 = (Integer)arg1;
		return -I1.compareTo(I2);
//		String s1 = arg0.toString();
//		String s2 = arg1.toString();
//		return -s1.compareTo(s2);
	}
	 
 }
