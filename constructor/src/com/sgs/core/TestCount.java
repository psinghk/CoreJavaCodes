package com.sgs.core;

public class TestCount 
{
	static int count=0;
	{
		count++; 
	}

	public TestCount() 
	{
		System.out.println("Hello:");
		// TODO Auto-generated constructor stub
	}

	//	public TestCount(int a){
	//		
	//	}
	//	public TestCount(String s) {
	//		
	//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestCount t1 = new TestCount();
		//t1.TestCount();
		//TestCount t2 = new TestCount(10);
		//TestCount t3 = new TestCount("prabhat");

		System.out.println("The total no of  object creation is :"+count);
	}

}
