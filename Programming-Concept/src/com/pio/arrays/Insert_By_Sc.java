
// program of insert  element array  by using one scanner class 
package com.pio.arrays;

import java.util.Scanner;

public class Insert_By_Sc {

	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
	        int[] a= new int[7];
	         System.out.println(" Insert all element in 1 st array");
	           int i;
	         for ( i = 0; i < a.length; i++) 
	          {
				a[i]= sc.nextInt();
				 
			 }  
	         System.out.println(" The first Array element is:");
	         
	          for (int k = 0; k < a.length; k++) 
	          {
				
			
	           System.out.print(a[k]+" ");
	        
	          }
	          
	            System.out.println();
	          // 2Nd Array element insertion 
	             int [] b = new int[5];
	          
	          System.out.println(" Insert the 2 nd element  in aarays ");
	          
	             int j;
	             
	             for ( j = 0; j < b.length; j++) 
	             {
	        	  b[j] = sc.nextInt();
	        	  
	             } 
	        	   
	        	   
            
	             System.out.println("the Second Array element is:");
	             
	              
	             
	            for (int j2 = 0; j2 < b.length; j2++)
	            {
	            	System.out.print(b[j2]+" "); 
				}
	            

	}

}
