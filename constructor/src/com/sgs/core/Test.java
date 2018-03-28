package com.sgs.core;

public class Test 
{
	public static void main(String[] args) 
	{
		c a = new c();
		a.m1();
		
	}

}
class p{
	int x =100;
	
	
}
class c extends p
{
	int y = 200;

 public void m1()
 {
	 System.out.println(this.y);
	 System.out.println(super.x);
	 
 }
}

