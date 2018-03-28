package com.pio.StaticInterface;

public class Person implements Identifiable {

	String userId;
	String name;

	public Person(String userId, String name) {

		this.userId = userId;
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Person person1  = new Person("pa123", "Prabhat");
		 System.out.println("userId : "+person1.getUserId()+" ->  " +" "+Identifiable.validateuserById(person1.getUserId()));
		 
		 
		 Person person2  = new Person("prabhat123", "Prabhat");
		 System.out.println("userId : "+person2.getUserId()+" ->  " +" "+Identifiable.validateuserById(person2.getUserId()));
	}

	@Override
	public String toString() {
		return "Person [userId=" + userId + ", name=" + name + "]";
	}
	
	

}
