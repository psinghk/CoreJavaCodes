// program for count the no of digit in enterd No;
package com.Mysirg;

import java.util.Scanner;

public class Test2 {
 
	public static void main(String[] args)
	{
		int count=0;int p;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  no");
		int n = sc.nextInt();
		 p =n;
		while(p>0)
		{
			p=p/10;
			count++;
		}
		System.out.println( "The total no of Digit in  "  +n+"   is:    "+count);
	}

}
