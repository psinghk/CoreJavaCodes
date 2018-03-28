//Program to find Max element in an Array.
package com.Mysirg;

import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) 
	
	{  int i,max;
	   
	
	
		  Scanner sc = new Scanner(System.in);
		  
		  int [] A = new int[5];
		  for ( i = 0; i < A.length; i++) 
		  
		  {
			System.out.println("Enter No in Array");
			 A[i]= sc.nextInt();
			
		  }
		     max = A[0];
		   for (int j = 1; j < A.length; j++) 
		   {
			   
		       if(max < A[j])
		       {
		    	  max = A[j];
		    	   
		       }
			   
		}
		   System.out.println("The max value in arrays is:  "+ max);    
     
	}

}
