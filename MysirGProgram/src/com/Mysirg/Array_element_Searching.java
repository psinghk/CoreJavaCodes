//Program to add Odd index and Even index elements in Array.
package com.Mysirg;

import java.util.Scanner;

public class Array_element_Searching {

	public static void main(String[] args) 
	{  int flag=0;
		Scanner sc = new Scanner(System.in);
		 int [] A = new int [7];
		  for (int i = 0; i < A.length; i++) 
		  
		  {
			   System.out.println(" The Entre No");
			   A[i] = sc.nextInt(); 
			   
			
		  }
		   Scanner sc1 =new Scanner(System.in);
		    System.out.println("Enter the item for search");
		     int item = sc1.nextInt();
		     
		   for (int j = 0; j < A.length; j++) 
		    {
			  if(item==A[j]){
				    flag=1;
				   System.out.println("Element are found at  index:"+j);
			  }
             			
		    }
		  if (flag==0){
			  System.out.println("Element are not found");
		  }
      
	}

}
