package com.sgs.stu;

public class Student 
{
	 private int age;
	 private String name;
	 
	 public Student()
	 {
		 System.out.println("obj is created:");
	 }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//	public static void main(String[] args) 
//	{
//		Student s = new Student();
//		s.age=34;
//		System.out.println(s.age);
//		s.setAge(45);
//		System.out.println(s.getAge());
		
	}

 
