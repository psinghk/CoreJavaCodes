// not complete
package com.pio.arrays;

import java.util.Scanner;

public class Delete_Dupl_Ele 
{

	public static  void main(String[]args) {
		
		   Scanner sc = new Scanner(System.in) ;
		   System.out.println("Entre the size  of array :");
		   int size = sc.nextInt();
		   int [] A = new int [size];
		    
		     
		      System.out.println("The size of Array before delete:  "+size);
		      System.out.println("Enter the element inside Array");
		    for (int i = 0; i < size; i++) 
		    {
		    	 System.out.println("Entre No:");
		    	A[i] =sc.nextInt();
				
			}
		    for (int i = 0; i < size; i++) 
		    {
				 for (int j = i+1; j < size; j++) 
				 {
					if(A[i]==A[j])
					{
					   for (int k = j; k < size-1; k++) 
					   {
					     A[k]=A[k+1];
						 
					    
					   }
					   
						
						
					}
					 
					 
				}
		    	
	}
		     System.out.println("The element after delete duplicate");
		      for (int p = 0; p <size-1; p++) 
		      
		      {
				 System.out.print(A[p]+" ");
		    	  
			}
		            
			}


}