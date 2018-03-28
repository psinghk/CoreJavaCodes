package coms.sgs.string.program.test;

import java.util.Scanner;

public class ReverseStringUsingItratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the string for reverse:");
		 String s = sc.nextLine();
		 int length = s.length();
		 //char[] c = s.toCharArray();
		  String reverse = " ";
		 for (int i = length-1; i>=0; i--) 
		 {
			reverse = reverse+ s.charAt(i);  
			 
		 }
		  System.out.println(reverse);
		  
		 
	}

}
