package com.sgs.lang;

public class Student 
{


	public String toString() 
	{
		return "name";

	}
	public static void main(String[] args) 
	{

		/*Integer i = new Integer(30);
		//String s = new String("prabhat");
	   Object o = new Student();
		 String s =i.toString();*/

		Student s = new Student();
		String s1 =s.toString();
		System.out.println(s.getClass());



	}

	/*@Override
	public String toString() {
		return "Student [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}*/

}
