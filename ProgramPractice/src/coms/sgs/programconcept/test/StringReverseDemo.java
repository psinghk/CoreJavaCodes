package coms.sgs.programconcept.test;

import java.util.Scanner;

public class StringReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String for Reverse:");
		String eString = sc.nextLine();
		int length = eString.length();
		 for (int i =length-1; i>=0; i--) {
			reverse = reverse + eString.charAt(i);
		}
		 System.out.println("revesre string is := "+reverse);
//		  int a =8;
//		  String d ="pk";
//        System.out.println(d+a);
	}

}
