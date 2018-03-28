package com.sgs.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList l = new ArrayList();
		l.ensureCapacity(30);
		 l.add("pk");
		 l.add("sl");
		 l.add("p");
		 l.add("a");
		 l.add("s");
		 l.add("d");
		 l.add("f");
		 l.add("g");
		 l.add("h");
		 l.add("j");
		 l.add("k");
		 l.add(null);
		 System.out.println("The size of arrayList is... ");
		  System.out.println(l.size());
		  //l.clear();
		  System.out.println(l);
		 //System.out.println(" get objects is:   "+l.get(6));
		 //System.out.println(l.remove(6)); 
		 
		 //System.out.println(l.addAll(l));
		 System.out.println(l);
		 System.out.println(l.size());
		 
		 
		 System.out.println("-----LinkedList concept------------");
		 LinkedList lk = new LinkedList(l);
		 //LinkedList lk1 = new LinkedList();
		 //HashSet lk = new HashSet<>();
		 lk.add("pr");
		 lk.add(null);
		 lk.add("pr");
		 lk.add("pr");
		 lk.add("pr");
		 lk.add("pr");
		 System.out.println(lk.size());
		 System.out.println(lk);
		 //ArrayList l1 = new ArrayList(lk);
		 //System.out.println(l1);
		 ArrayList al = new ArrayList();
		 
		 System.out.println("---------------");
		 System.out.println(al.size());
		 
		 
		 System.out.println("-----vector concept--------");
		 
		  Vector v = new Vector();
		  System.out.println(v.capacity());
	}

}
