package com.sgs.lock.demo;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 MyThread1 t1 = new MyThread1("First Thread");
		 MyThread1 t2 = new MyThread1("Second Thread");	
		 t1.start();
		 t2.start();
	}

}
 class MyThread1 extends Thread{
	  static  ReentrantLock l1 = new ReentrantLock();
	  
	  public MyThread1(String name) {
		// TODO Auto-generated constructor stub
		  super(name);
	}
	   public void run(){
		   
		   if(l1.tryLock()){
			  System.out.println(Thread.currentThread().getName()+""
			  		+ " got lock and perform safe opration"); 
			  try {
				  Thread.sleep(2000);
			  }
			 catch (InterruptedException e) {
				// TODO: handle exception
			}
			 l1.unlock();
		   }
		   else{
			   System.out.println(Thread.currentThread().getName()+
					   "  Unable to got lock Hence  perform alternative opration ");
		   }
	   }
 }
