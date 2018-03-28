package com.Mysirg;

import java.util.Scanner;

public class Second_Min_element {

	public static void main(String[] args)
	{
		 int min;
		  int smin;

    Scanner sc = new Scanner(System.in);
     int [] A = new int [5];
     
       for (int i = 0; i < A.length; i++) 
       {
		 System.out.println("Eneter the no ");
		  A[i] = sc .nextInt();
		  
	  }
         min = A[0]; 
         smin = 0;
         
         
        for (int j = 1; j < A.length; j++) 
        {
		   if (min > A[j])
		   {
			    smin =min;
			    min = A[j];
			   
		   } else if(smin > A[j]){
			   smin = A[j];
			   
			   
		   }
        	
        	
		} 
         System.out.println(" the second min no is :"+smin);
                   
        
	}

}
