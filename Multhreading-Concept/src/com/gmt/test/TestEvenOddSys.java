package com.gmt.test;

public class TestEvenOddSys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		 PrintEvenOdd p1 = new PrintEvenOdd();
		 PrintEvenOdd p2 = new PrintEvenOdd();
		 
		 MyThreadEven mte = new MyThreadEven(p1);
		  MyThreadOdd mto = new MyThreadOdd(p2);
		  mte.start();
		  mto.start();
	}
}
 class MyThreadEven extends Thread{
	  
	 PrintEvenOdd evenOdd;
	  
	 
		public MyThreadEven(PrintEvenOdd evenOdd) {
		
		this.evenOdd = evenOdd;
	    }
         public void run() {
        	 evenOdd.displayEven();
        	 //System.out.println("Even ");
		
	    }
		
}
 
 class MyThreadOdd extends Thread{
	 PrintEvenOdd evenOdd;
	 
	 public MyThreadOdd(PrintEvenOdd evenOdd) {
			
			this.evenOdd = evenOdd;
		}
	 public void run() {
		 evenOdd.displayOdd();
		 //System.out.println( "Odd ");
			
	    }
 }
 
 
