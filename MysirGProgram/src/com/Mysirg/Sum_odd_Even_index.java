
//Program to add Odd index and Even index elements in Array.
package com.Mysirg;

import java.util.Scanner;

public class Sum_odd_Even_index {

	public static void main(String[] args) 
	{ int esum=0;
	 int osum =0;
	 
		 
      Scanner sc = new Scanner(System.in);
       int[] A  = new int[6];
       
         for (int i = 0; i < A.length; i++) 
         
         {
		
        	   System.out.println("Enter the no ");
        	    A[i]= sc.nextInt();
        	    
		}
         
         for (int j = 0; j < A.length; j++) 
         {
		    if(j%2==0){
		    	 esum = esum+A[j];
		    	 
		    	
		    }else{
		    	osum =osum +A[j];
		    	
		    }
		  System.out.println(" the esum of :"+esum);
		  System.out.println(" the osum of :"+osum);
        	 
		}

	}

}
