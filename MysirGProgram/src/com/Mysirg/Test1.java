// program for calculate x power of y is:
package com.Mysirg;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
  int r = 1;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of x");
		int x = sc.nextInt();
		Scanner sc1= new Scanner(System.in);
		System.out.println("enter the no of y");
		int y = sc1.nextInt();
		
		for (int i = 1; i <=y; i++) {
			 
			 r= r*x;
			
		}
		
		System.out.println("The sum of  :"+ r);
		
		

	}

}
