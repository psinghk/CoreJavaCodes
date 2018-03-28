//Addition of left and right half of an Array Elements
package com.Mysirg;

import java.util.Scanner;

public class AddFHalf_SHalf {

	public static void main(String[] args) 
	{ 
		 int LHalfSum =0;
		 int RHalfSum=0;
		 
	 Scanner sc = new Scanner(System.in);
	  int [] A = new int[7];
	   int n = A.length;
	   for (int i = 0; i < A.length; i++) 
	   
	   {
		  System.out.println("Entre th No");
		   A[i]= sc.nextInt();
		   
		
	  }
	    for (int j = 0; j < n; j++) 
	    { 
	    	if (j <=n/2){
	    	 
			LHalfSum = LHalfSum+A[j];
	    	}
	      else{
	    	   RHalfSum =  RHalfSum +A[j];
	      }
	    	  
		}
	   /*for (int k = 3; k < 6; k++) 
	   {
		SSum +=A[k];
	   }*/
          System.out.println("The R_Sum Half is :"+RHalfSum);
           System.out.println("The L_Sum Half is :"+LHalfSum);
	}

}
