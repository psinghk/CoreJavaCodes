package com.sgs.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v = new Vector<>();
		System.out.println("Default Capcity of vector is = " + v.capacity());
		// ArrayList<String> a = new ArrayList<>();
		// System.out.println(a.size());
		for (int i = 0; i < 10; i++) {
			v.addElement(i);

		}
		System.out.println(v);
		Enumeration<Integer> e = v.elements();
		System.out.println("After Retriving");
		while (e.hasMoreElements()) {
			Integer integer = (Integer) e.nextElement();
			System.out.print(integer + " ");
		}

	}

}
