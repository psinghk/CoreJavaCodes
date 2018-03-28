package com.gmt.test;

public class MyThreadJoinDemo1 {
	public static void main(String[] args)  throws InterruptedException
	{
		
		 MyThread2.mt = Thread.currentThread();
		 
		// ODO Auto-generated method stub
      MyThread2 t = new MyThread2();
      t.start();
     
      //System.out.println("excuting first:");
      //t.join();
      for (int i = 0; i < 5; i++) {
		System.out.println("main thread:");
		 Thread.sleep(2000);
	}
		 
		 
		 
	}

}
 class MyThread2 extends Thread{
   static  Thread mt;
	 public void run() 
	  
	 {
		  System.out.println("get child chance:");
		 try {
			 mt.join();
			
		} catch (InterruptedException ie) {
			// TODO: handle exception
		}
		 
		  System.out.println("get first chance");
		
		  for (int i = 0; i <5; i++) 
		  {
			  System.out.println("Child thread:");
			
		}
		  
			
		}
	}

	
 


