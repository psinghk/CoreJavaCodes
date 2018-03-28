//Program to find Addition of elements of an Array.
package com.pio.arrays;

import java.util.Scanner;

public class AdditionOfAyEle {

	public static void main(String[] args) {
 int sum = 0;
 
       Scanner sc = new Scanner(System.in);
        int [] A = new int[5];
         for (int i = 0; i < A.length; i++) 
         {
			 System.out.println("Enter the no ");
			  A[i] = sc.nextInt();
		}
    	  for (int j = 0; j < A.length; j++) 
    	   {
    		  
			sum = sum +A[j];
    		   }
    		   
			   
        System.out.println(" The sum of array no is :"+sum);
       
	}

}
