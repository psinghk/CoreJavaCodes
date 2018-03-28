package com.Mysirg;

import java.util.Scanner;

public class Test13 {
       

	public static void main(String[] args) 
	{  
		 
		 
		 int Osum = 0;
		 
		 int Esum = 0;
	    Scanner sc = new Scanner(System.in);
	     int [] A= new int[10];
	     
	     for (int j = 0; j <A.length ; j++) 
	     
	     {
	    	 System.out.println("Enter the no to store in array");
	    	 

         A[j]=sc.nextInt();
	         
			  if(A[j]%2==0)
			  {
				 Esum = Esum + A[j];
				
			  }
			  else 
			  
			  {
				  Osum = Osum+A[j];
				  
			  }
			  
			   	 
	     }
	     
	            //System.out.println(" The enter no is =  "+A[j]);
	     
	            
	    	     System.out.println("The sum of Even = :"+ Esum);
			     System.out.println("The sum of Odd is = :"+Osum);
	    }

	}


