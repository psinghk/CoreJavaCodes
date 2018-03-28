package Coding.com;


public class Person {
	private int age;
	
   public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		if(age<18 || age>60){
			throw new RuntimeException(" This is a Invalid age");
		}
		this.age = age;
	}


  
}
	

	


