package com.sgs.collection;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class TestCompratorDemo {
	public static void main(String[] args) {
		MyComprator1 m = new MyComprator1();
		// Not customization sorting will done by comprable interface
		Set<Integer> s = new TreeSet(m);
		s.add(5);
		s.add(8);
		s.add(38);
		s.add(28);
		s.add(18);
		System.out.println(s);

	}

}



 class MyComprator1 implements Comparator<Object> {

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub

		Integer I1 = (Integer) obj1;
		Integer I2 = (Integer) obj2;
		// if (I1 < I2) {
		// return 1;
		// } else if (I1 > I2) {
		// return -1;
		//
		// } else {
		// return 0;
		// }

		// Or
 
		return -I1.compareTo(I2);

	}

}

