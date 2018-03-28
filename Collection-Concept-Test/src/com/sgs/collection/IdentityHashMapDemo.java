package com.sgs.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HashMap<Integer, String> m = new HashMap<>();
		 Integer I1 = new Integer(10);
		 Integer I2 = new Integer(10);
		 m.put(I1, "Prabhat");
		 m.put(I2, "govind");
		 System.out.println(m);
		 System.out.println("------------");
		 IdentityHashMap<Integer, String> Im = new IdentityHashMap<>();
		 Im.put(I1, "prabhat");
		 Im.put(I2, "govind");
		 System.out.println(Im);
	}

}
