package com.pio.basics;

public class SwapTwoNumber {

	
	public static void main(String[] args) {
		 
		int a=170;
		int b=30;
		 
		System.out.println("Before Swapping");
		System.out.println("Value of a is :" + a);
		System.out.println("Value of b is :" +b); 
		 
		a=a+b;
		b=a-b;
		a=a-b;
		 
		System.out.println("After Swapping");
		System.out.println("Value of a is :" + a);
		System.out.println("Value of b is :" +b);
		 
		}
}
