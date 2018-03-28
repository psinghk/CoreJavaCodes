package com.sgs.conexception;

public class TestExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println(" method return is :"+m1());
	}
	 static String m1(){
		 try{
			 int i =10/0;
		 }
		 catch( ArithmeticException ae){
			 return "catch";
		 }
		 finally{
			 return "finally";
		 }
			 
		 
	 }

}
