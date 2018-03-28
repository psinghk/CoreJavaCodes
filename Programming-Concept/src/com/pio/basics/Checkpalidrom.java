package com.pio.basics;

import java.util.Scanner;

public class Checkpalidrom {

	
		 public static void main(String[] args) {
		      Scanner s = new Scanner(System.in);
		       System.out.print("Enter the number to check palidrom : ");
		       int input = s.nextInt();
		       int re = input;
		       int result=0;
		       int rem;
		       while(re>0)
		       {
		    	   rem=re%10;
		    	  
		    	   re=re/10;
		    	   result=result*10+rem;
		    	  
		    	   
		    			   
		       }
		       if(re==result)
		    	   
		       {	
		    	   System.out.println("the entered no is palidrom");
		       }
		       else{

		    	   System.out.println("the entered no is not palidrom");
		       }
}
}
