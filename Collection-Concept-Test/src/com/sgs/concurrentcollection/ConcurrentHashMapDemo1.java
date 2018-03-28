package com.sgs.concurrentcollection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<>();
		m.put(109, "Pk");
		m.put(102, "GG");
		m.putIfAbsent(103, "Singh");
		System.out.println(m);
		System.out.println("---After replace,remove  method work:----");
		m.putIfAbsent(103, "Prabhat");
		m.remove(103, "Govind");// this remove method is not work
		m.remove(102, "GG");
		m.replace(103, "Singh", "Mukul");
		System.out.println(m);
	}

}
