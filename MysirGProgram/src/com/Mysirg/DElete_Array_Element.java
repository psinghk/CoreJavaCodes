
//Program to Delete an Element from an Array.
package com.Mysirg;

import java.util.Scanner;

public class DElete_Array_Element {

	public static void main(String[] args)  
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		 int size = sc.nextInt();
		 int [] a = new int[size];
		  int l = a.length;
		 System.out.println(" Entre the array element:");
		for (int i = 0; i < a.length; i++)
		
		{
		 a[i]= sc.nextInt();
			
		}
		 System.out.println("The array element before delatation is :");
		 for (int j = 0; j < a.length; j++) 
		 {
			 System.out.print(a[j]+" ");
		}
         System.out.println();
		 System.out.println("Enter the specified postion to delete the element");
		   int pos = sc.nextInt();
		 for (int k = pos-1; k<l-1; k++) 
		 
		 { 
		   a[k]=a[k+1];
		 
		  
		}
		  System.out.println("The Array element  after deletion"); 
		  
		 for (int p = 0; p < l-1; p++) 
		{
		
			 System.out.print(a[p]+" "); 
			 
		}
		 
		 
	}

}
