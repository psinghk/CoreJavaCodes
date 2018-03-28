package coms.sgs.programPattern.test;

import java.util.Scanner;

public class PatternDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter The rows to print pattern:");
		 int rows = sc.nextInt();
		 for (int i = 1; i <=rows; i++) 
		 {
			 for (int j = 1; j <=i; j++) 
			 {
			    if(j%2==0){
			    	System.out.print("0");
			    }
			    else
			    	System.out.print("1");
			 }
			 System.out.println();
			
		}

	}

}
