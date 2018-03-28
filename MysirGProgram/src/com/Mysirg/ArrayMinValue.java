//Program to find Min element in an Array.
package com.Mysirg;

import java.util.Scanner;

public class ArrayMinValue {

	public static void main(String[] args) {
   int Min;
   
      Scanner sc = new Scanner(System.in);
       int []A = new int[5];
       
		for (int i = 0; i < A.length; i++) 
		
		{
		  System.out.println("Entre the no");
		   A[i]= sc.nextInt();
		   
			
		}
		  Min = A[0];
		  for (int j = 1; j < A.length; j++) 
		  {
			if(Min > A[j] ){
				Min = A[j];
				
			}
			
			  
			  
		  }
             System.out.println(" The  min  Value  in  Array is   : "+ Min);
		
		
	}

}
