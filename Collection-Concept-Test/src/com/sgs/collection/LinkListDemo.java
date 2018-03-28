package com.sgs.collection;

import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       	  
		 LinkedList<Object> l = new LinkedList<>();
		  l.add("A");
		  l.add("B");
		  l.add("C");
		  l.add(null);
		   
		  l.addFirst("Prabhat");
		  //l.removeLast();
		  Object o = l.getLast();
		  System.out.println(o);
		  System.out.print(l+" ");	 
		 
	}

}
