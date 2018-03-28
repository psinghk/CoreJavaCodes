package com.sgs.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CursorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = new ArrayList<>();
		for (int i = 0; i < 10; i++) {

			l.add(i);

		}
		System.out.println("object is added");
		System.out.println(l);
		System.out.println("After getting one one by one: ");
		ListIterator<Integer> li = l.listIterator(l.size());
		// while (li.hasNext()) {
		// Integer i = (Integer) li.next();
		// System.out.print(i+" ");
		//
		// }

		// this is used for getting object in backward direction
		while (li.hasPrevious()) {
				//li.remove();
			Integer i = (Integer) li.previous();
			System.out.print(i + " ");

		}

	}

}
