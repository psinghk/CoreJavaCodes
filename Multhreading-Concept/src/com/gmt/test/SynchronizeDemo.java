package com.gmt.test;

public class SynchronizeDemo 
   {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Display d = new Display();
		 //Display d1 = new Display();
		 Display d1 = new Display();
      MyTread3 m1 = new MyTread3(d,"prabhat");
      //MyTread3 m2 = new MyTread3(d,"govind");
       MyThread4 m2 = new MyThread4(d1, 24);
       m2.start();
       
       m1.start();
      
	}
  
}
class MyTread3 extends Thread
{
	Display d;
	String name;
	 public MyTread3(Display d, String name)
	 {
		 this.d=d;
		 this.name= name;
		 
		// TODO Auto-generated constructor stub
	 }
	  public void run() 
	  {
		  d.wishN(name);
		//System.out.println("Name of run excution");
		
	  }
}
 class MyThread4 extends Thread{
	  Display d; 
	 int age;
	  public MyThread4( Display d, int age) {
		
		  this.d = d;
		  this.age = age;
	}
	  
	  public void  run(){
		  d.wishA(age);
		  // System.out.println("Age of run excution ");
	  }
 }
