package com.sgs.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraysListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList lk = new LinkedList();
		 //LinkedList lk1 = new LinkedList();
		 //HashSet lk = new HashSet<>();
		 lk.add("pr");
		 lk.add(null);
		 lk.add("pr");
		 lk.add("pr");
		 lk.add("pr");
		 
		 for (Object object : lk) {
			
			 {
				 System.out.println(object);
			 }
		}
		List<String> list = new ArrayList<String>(lk);
		list.add("Prabhat");
//		list.add("Prabhat");
//		list.add("Prabhat");
//		list.add("Prabhat");
//		list.add("Prabhat");
//		list.add("Prabhat");
//		list.add("Prabhat");
//		list.add("Prabhat");
//		list.add("Prabhat");
//		list.add("Prabhat");
		 list.add("Prabhat");
		 list.add("Prabhat");
		System.out.println(list);
	}
	

}
