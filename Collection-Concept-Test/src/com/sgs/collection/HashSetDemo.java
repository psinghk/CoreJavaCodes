package com.sgs.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //HashSet<String> h= new HashSet<>();
		
		LinkedHashSet<Object> h = new LinkedHashSet<>();
		 //TreeSet<Object> h = new TreeSet<>();
		 h.add("A");
		 h.add("B");
		 h.add("C");
		 h.add(null);
		 //h.add("A");
		 System.out.println(h);
		 System.out.println(h.size());
	}

	public HashSetDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
