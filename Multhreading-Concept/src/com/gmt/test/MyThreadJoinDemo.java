package com.gmt.test;



public class MyThreadJoinDemo {

	public static void main(String[] args)  throws InterruptedException
	{
		
		// ODO Auto-generated method stub
      MyThread1 t = new MyThread1();
      t.start();
      System.out.println("main thread chance:");
      //t.join();
      //t.stop();
      //t.suspend();
      //t.resume();
      
      for (int i = 0; i < 5; i++) {
		System.out.println("main thread:");
	}
		 
		 
		 
	}

}
 class MyThread1 extends Thread{
	 public void run() {
		  System.out.println("child thread chance");
		
		  for (int i = 0; i <5; i++) 
		  {
			  System.out.println("Child thread:");
			
		  }
		  
			
		}
	}

	
 
