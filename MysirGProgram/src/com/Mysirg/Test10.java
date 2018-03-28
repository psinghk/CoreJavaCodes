
//Program to find Min element in an Array.
package com.Mysirg;

public class Test10 {

	public static void main(String[] args) {
  int min;
   
   int [] A={45,564,45,89,5,7,4585};
    min = A[0];		
       for (int i = 1; i < A.length; i++) 
		{
		
		if(min > A[i])
			
		
			
			 min = A[i];
			
		}
      System.out.println(" The min mum Element is :"+min);
	}

	}

