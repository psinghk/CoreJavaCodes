//Program to add an Element in Array at specified location.
package com.Mysirg;

import java.util.Scanner;

public class Insert_Array_el {

	public static void main(String[] args) 
	{
		 
		 int l,pos;
		  int Ie,size;
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of Array");
		  size = sc.nextInt();
		  
		 int []a= new int[size];
		   l = a.length;
		   System.out.println(" Insert  array element");
		  for (int i = 0; i < l-1; i++) 
		  {
			 a[i] = sc.nextInt();
		  }
          System.out.println(" Enter the specified location");
           pos = sc.nextInt();
          
           System.out.println("Enter the element which you want to insert");
	
	      Ie = sc.nextInt();
	      for (int j =l-1; j>pos-1; j--) 
	      {
			a[j]= a[j-1];
		  }
	      a[pos-1]= Ie;
	       int k;
	       
	
	      for ( k = 0; k < l; k++)
	      {
			System.out.print(a[k]+" ");
		  }
	      
	
        }
	}     
	            
	           
	          
	          
	      
