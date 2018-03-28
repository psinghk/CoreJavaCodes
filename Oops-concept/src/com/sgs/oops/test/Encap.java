package com.sgs.oops.test;

public class Encap {

	private int a =10;
	 private int b =20;
	 
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Encap [a=" + a + ", b=" + b + "]";
	}
 
	 
}


	