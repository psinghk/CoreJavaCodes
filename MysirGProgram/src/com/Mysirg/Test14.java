// program for print Array element
package com.Mysirg;

import java.util.Scanner;

public class Test14 {
  
   
	public static void main(String[] args) {
		int i;
		 Scanner sc = new Scanner(System.in);
		
		 int [] A = new int[5];
		 
		 for ( i = 0; i < A.length; i++) {
			 System.out.println("entre no"); 
			 A [i] = sc.nextInt();
		
			
		 }  
		 for (int j = 0; j < A.length; j++) {
			 System.out.println("the no is :"+A[j]+" ");
		}
	}

}
