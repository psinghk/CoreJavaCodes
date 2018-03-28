package com.gmt.test;

public class Display {
	// public void wish( String name)// for multiple thread call
	// samalteneously if all thread have same priority
	// ReentrantLock l = new ReentrantLock();
	public  synchronized void wishA(int age)
	// this method here at a time one only
	// threads are allowed to ecxute this method
	// because this syn... method

	{
		// l.lock();
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Your Age is:   " + age);
				Thread.sleep(2000);
				// System.out.println(name);
			}
		}

		catch (InterruptedException ie) {
		}
		// l.unlock();
	}

	public  synchronized void wishN(String name)
	// this method here at a time one only
	// threads are allowed to ecxute this method
	// because this syn... method

	{
		// l.lock();
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Good morning:   " + name);
				Thread.sleep(2000);
				// System.out.println(name);
			}
		} catch (InterruptedException ie) {
		}
		// l.unlock();
	}

}
