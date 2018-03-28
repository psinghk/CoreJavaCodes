package com.sgs.lock.demo;

public class ReentrantDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 Display d =  new Display();
		 MyThread t1 = new MyThread("Prabhat", d);
		 MyThread t2 = new MyThread("Govind", d);
		 MyThread t3 = new MyThread("Singh", d);
		  t1.start();
		  t2.start();
		  t3.start();
		  
	}

}
 class MyThread extends Thread{
	
	 String name;
	 Display d;
	  public MyThread( String name , Display d) {
		// TODO Auto-generated constructor stub
		   this.name = name;
		   this.d = d;
	}
	 
	 public void run() {
		d.wish(name);
	}
 }
