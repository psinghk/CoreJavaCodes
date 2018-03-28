package com.sgs.core;

import java.lang.reflect.Method;

public class TestCheckJvm 
{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class c = Class.forName("com.sgs.core.TestCheckJvm");
		Method[] m = c.getDeclaredMethods();
		for(Method m1 :m){
			System.out.println(m1);
		}
		//Field f = c.getDeclaredField(name)
	}


}
