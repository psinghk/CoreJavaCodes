package com.pio.basics;

import java.util.Scanner;

public class PalidromNoCheck {
	public static void main(String[] args) {
	      Scanner s = new Scanner(System.in);
	       System.out.print("Enter the number to check palidrom 1 : ");
	       int input = s.nextInt();
	       int result = reverse(input);
	       if(input==result)
	       {
	    	   System.out.println("The number is palidrom " );
	       }
	       else{
	    	   
	       System.out.println("The  number is not palidrom " );
	       }
	   }

	   public static int reverse(int n) {
	       int result = 0;
	       int rem;
	       while (n > 0) {
	           rem = n % 10;
	           n = n / 10;
	           result = result * 10 + rem;
	       }
	       return result;
	   }
}

