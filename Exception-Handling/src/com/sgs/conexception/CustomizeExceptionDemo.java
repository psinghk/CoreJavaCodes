package com.sgs.conexception;

import java.util.Scanner;

public class CustomizeExceptionDemo {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x =10;
		 System.out.println("Entre the Value:  of x ");
		  Scanner sc = new Scanner(System.in);
		  int x = sc.nextInt();
          if (x==10){
    	   System.out.println("hello prabhat Kumar");
       }
          else{
        	   throw new  ExceptionInfoDemo(" X value is more or less than 10");
          }
        	  
		 
	}

}
 class ExceptionInfoDemo extends RuntimeException{
	  public ExceptionInfoDemo( String s) {
		// TODO Auto-generated constructor stub
		   super(s);
	}
 }
