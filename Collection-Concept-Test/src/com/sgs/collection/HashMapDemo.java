package com.sgs.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedHashMap<Integer, String> m = new LinkedHashMap<>();
		HashMap<Integer, String> m = new HashMap<>();
		m.put(105, "sriyansh");
		m.put(101, "prabhat");
		m.put(202, "govind");
		m.put(103, "Uttkarsh");
		m.put(104, "Aiyansh");
		//m.put(null, "zshish");
		// Object o = m.put(101, "singh");
		// System.out.println(o);
		System.out.println(m);
		// Object o = m.get(101);
		// System.out.println(o);
		Set<Integer> s = m.keySet();
		System.out.println(s);
		Collection<String> c = m.values();
		System.out.println(c);
		Set<Entry<Integer, String>> s1 = m.entrySet();
		System.out.println(s1);
		Iterator<Entry<Integer, String>> itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr.next();
			System.out.println(entry.getKey() + "-------" + entry.getValue());
			if (entry.getValue().equals("prabhat")) {
				entry.setValue("CL Verma");
			}
		}
		System.out.println("After Setting values if prabhat is exting:");
		System.out.println(m);

	}

}
