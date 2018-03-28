package com.gmt.test;



public class MyThreadYeildDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		 MyThread t = new MyThread();
		 t.start();
		// MyThread t2 = new MyThread();
		 //t2.start();
		 //t.join();
		 t.interrupt();
		 for (int i = 0; i < 5; i++) {
			  System.out.println("Main Thread:");
			
		}
	}

}
 
 class MyThread extends Thread{
	 
	 public void run()  
	 {
		 
			//Thread.yield();
			try{
				for (int i = 0; i < 5; i++){
					 System.out.println("Child Thread:");
					   //Thread.yield();
			           Thread.sleep(2000);
				}
			}
			catch(InterruptedException e){}
			 System.out.println(" Thread got interpted:");
		}
		 
	 }
 
