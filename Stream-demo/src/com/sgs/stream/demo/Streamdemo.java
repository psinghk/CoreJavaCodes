package com.sgs.stream.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streamdemo {
	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(30);
		System.out.println(l);
		System.out.println(" Logical concept below :");

		// without functional interface(until 1.7 v) Example 1

		//		List<Integer> l3 = new ArrayList<>();
		//		 for (Integer i :l) {
		//			 if(i%2==0)
		//				 l3.add(i);
		//			}
		//		 System.out.println(l3);

		// without functional interface(until 1.7 v) Example 2

		List<Integer> l4 = new ArrayList<>();
		for (Integer i :l) {

			l4.add(i*2);
		}
		System.out.println(l4);


		// with functional interface

		// Example 1

		//		List<Integer> l2 = l.stream().filter(I -> I%2==0).collect(Collectors.toList());
		//		System.out.println("Even Number IS  :");
		//        System.out.println(l2);

		// Example 2	

		/*List<Integer> l1 = l.stream().map(I -> I * 2).collect(Collectors.toList());
		System.out.println(l);*/

	}
}