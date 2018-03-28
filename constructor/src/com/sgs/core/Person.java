// It is also known as Constructor Channing 

package com.sgs.core;

public abstract class Person 
{
	String name;
	int age;
	
	public Person(String name , int age) 
	{
		this.name = name;
		this.age = age;
		System.out.println("abstract....class...constructor:");

	}

}
class Teacher extends Person
{

	int rollno;
	public Teacher(String name , int age , int rollno) 
	{

		super(name, age);
		this.rollno = rollno;
		System.out.println("child.....class....constructor:");
	}
	@Override
	public String toString() {	
		// TODO Auto-generated method stub
		return name+"==="+age+"===="+rollno;
	}



}
