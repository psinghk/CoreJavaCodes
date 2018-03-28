//Program to Reverse an Array.
package com.Mysirg;

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args)
	{
	  Scanner sc = new  Scanner(System.in);	
	    int [] A = new int[6];
	   //int [] B = new int[6];
	     int l = A.length;
	    for (int i = 0; i < A.length; i++) 
	    {
			System.out.println("Enter the no");
			A[i]= sc .nextInt();
			
	    	
		} int j;
		 System.out.println("The reverse element is:");
		 for ( j = l-1; j>=0; j--) 
		 {
			
			  System.out.print(A[j]+" ");
		}
		// System.out.print(" The revrese array element is "+A[j]+" ");
    }

}
