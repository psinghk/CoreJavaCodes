package com.string;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the valid int string ");
		 //String s= sc.nextLine();
		 int i =sc.nextInt();
		  //int i = Integer.valueOf(s);
		 String s = Integer.toString(i);
		  System.out.println("The int value is  "+s);		
		 

	}

}
