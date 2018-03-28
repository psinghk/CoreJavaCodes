package com.gmt.test.dedlockcheck;

public class DedlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Dedlock1 d1 = new Dedlock1();
		 //d1.start();
		 d1.m1();
	}

}
 class Dedlock1 extends Thread{
	 A a = new A();
	 B  b = new B();
	 
	  public void m1()
	  {
		   this.start();
		  a.d1(b);
		  
		  
	  }
	   public void run(){
		   b.d2(a);
	   }
	 
 }

class A{
	 public synchronized void d1(B b)
	 {
		 System.out.println("Thread 1 start ecution of d1 :");

		 try{
			 Thread.sleep(10000);
			 
		 } catch(InterruptedException Ie){}
		 
		 b.last();
	 }
	 public void last()
	 {
System.out.println(" A class last method is call:");
		 
	 }
}
 class B {
	 public synchronized void d2(A a){
		 System.out.println("Thread 2 start ecution of d2 :");
		 try{
			 Thread.sleep(10000);
			 
		 } catch(InterruptedException Ie){}
		 a.last();
	 }
	 public synchronized void last()
	 {
	
		 System.out.println(" B class last method is call:");
	 }
	 
 }
