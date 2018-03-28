//Program to find Second Max element in an Array.
package com.Mysirg;

import java.util.Scanner;

public class SecondMaxArray {

	public static void main(String[] args)
	{ int max,Smax;
	 
		 Scanner sc = new Scanner(System.in);
		 
		  int [] A = new int[5];
		   for (int i = 0; i < A.length; i++) 
		   
		   {
			 System.out.println("Entre No");
			  A[i] = sc.nextInt();
			  
			   
			   
		   }
             max = A[0];
             Smax =0;
             for (int j = 1; j < A.length; j++) 
             
             {
				if(max < A[j]) {
					Smax = max;
					max = A[j];
					
					
				}
				else if(Smax <A[j]){
					Smax =A[j];
					
				}
			}
		   System.out.println("The Second max No is :"+Smax); 
	}

}
