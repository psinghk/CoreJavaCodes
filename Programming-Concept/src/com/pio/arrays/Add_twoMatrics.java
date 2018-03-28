package com.pio.arrays;

import java.util.Scanner;

public class Add_twoMatrics {

	public static void main(String[] args) 
	{
		 int i,j;
		System.out.println("Entre the value of row and column:"); 
      Scanner sc  =new Scanner(System.in);
       int m = sc.nextInt();// the no row and no of column is must be same:
       int n =sc.nextInt();
       int [][] A= new int[m][n];
       int [][]B = new int[m][n];
       int [][]C = new int[m][n];
       //int size = A.length;
        System.out.println("Enter the no in first matrics:");
        
       for(  i = 0; i <m ; i++) 
      
		for ( j = 0; j < n; j++) 
		
			
			  A[i][j]=sc.nextInt();
			
		
      
		
		  System.out.println("Enter the no in second matrics:");
		
		
		  for ( i = 0; i <m ; i++) 
	       
			for ( j = 0;  j<n; j++) 
			
			
				  B[i][j]=sc.nextInt();
				
			
	       
		  
		  
		  for ( i = 0; i <m ; i++) 


			for ( j = 0;  j< n; j++) 


		     
		     C[i][j]=A[i][j] + B[i][j];// we add or subtract both only need to change the sign.
		    
		  System.out.println("The Addition of matrics:");
           
		 for ( i = 0; i < m; i++) 
		 {
		   for ( j = 0; j < n; j++) 
		  
			 System.out.print(C[i][j]+"\t");
			 System.out.println();
		
		   
		}
	
}
}