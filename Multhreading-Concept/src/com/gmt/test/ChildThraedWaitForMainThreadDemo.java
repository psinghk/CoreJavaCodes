package com.gmt.test;

public class ChildThraedWaitForMainThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyThreadDemo.mt = Thread.currentThread();
        MyThreadDemo t = new MyThreadDemo();
        t.start();
		 
         for (int i = 0; i < 10; i++) {
			System.out.println("Hello Prabhat by Main");
		}
	}

}
 class MyThreadDemo extends Thread{
	  
	  static Thread mt ;
	  @Override
	public void run() {
		// TODO Auto-generated method stub
		  try{
			  mt.join();
			}
		  catch(InterruptedException e ){}
		   for (int i = 0; i < 10; i++) {
			System.out.println("Hello Govind by  child");
		}
		 
	}
 }
