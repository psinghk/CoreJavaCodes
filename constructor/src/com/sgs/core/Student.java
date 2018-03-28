package com.sgs.core;

public class Student 


{
	String name;
	public Student(String name) 
	{
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	public static void main(String[] args) {

		Student s = new Student("prabhat");
		System.out.println(s);

	}

}
