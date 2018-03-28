package com.sgs.collection;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WeakHashMap<Object, Object> m = new WeakHashMap<>();
		HashMap<Object,Object> m = new HashMap<>();
		m.put(101, "prabhat");
		m.put(109, "singh");
		Temp t = new Temp();
		m.put(t, "govind");
		t=null;
		System.gc();
		Thread.sleep(4000);
		System.out.println(m);
		
	}

}
 class Temp {

	@Override
	public String toString() {
		return "temp";
	}
	 @Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Finalize method ic called:");
	}
	 
 }
