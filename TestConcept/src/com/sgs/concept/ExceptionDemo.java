package com.sgs.concept;

public class ExceptionDemo {
	
	// static  ArithmeticException e;
	// In this case NPException.
	static  ArithmeticException e = new ArithmeticException();
	// In this case AException
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throw e;
	}

}
