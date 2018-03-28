package com.sgs.oops.test;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		 
		 P p = new P();
		 p.m1();
		 C c = new C();
		 c.m1();
		  //int x= c.a;
		  //System.out.println(x);
		 //c.m2();
		 P p1 = new C();
         p1.m1();
          
		  
	}
}	
	 class P
	 {
		  int a = 10;
		  
		 public  void m1() {
			 System.out.println("parent method is called:");
			 //System.out.println("city is NewDelhi:");
			
		}
	 }
	  class C extends P{
		  
		  public   void m1() {
			 System.out.println("child method is called:");
		}
	  }


