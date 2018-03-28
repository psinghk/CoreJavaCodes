//Write a program to calculate sum of the digits of a given number
package com.Mysirg;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
      
		int sum=0;int a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  no");
		int n = sc.nextInt();
		 
		while(n>0)
		{ 
			a=n%10;
		  sum = sum+a;
			n=n/10;
			
		}
		System.out.println(" The sum of Digit is:"+sum);
		
		
	}

}
