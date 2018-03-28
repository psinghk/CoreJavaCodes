package coms.sgs.programconcept.test;

import java.util.Scanner;

public class SumNoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("Entre The No to Sum of The Digit: ");
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 
		 int result =0;
		 
		  for (int i = 0; i <=n; i++) {
			 result = result+i;
		}
		   System.out.println("Sum of no b/w 1 to " +n+ " is   " + result);
	}

}
