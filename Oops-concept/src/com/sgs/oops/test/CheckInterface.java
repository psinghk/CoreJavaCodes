package com.sgs.oops.test;



public class CheckInterface implements Test1, MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new CheckInterface();
		// TO find the class of an object we call getclass().*
		 Class c = t.getClass();
		  System.out.println(c);
		   int p = t.x;
		System.out.println("value of x  :"+p);
		t.d();
		
	}

	@Override
	public void d1() {
		// TODO Auto-generated method stub
		System.out.println("Child Interface Called:");
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("Parent Interface Called:");
	}

}  
	   

