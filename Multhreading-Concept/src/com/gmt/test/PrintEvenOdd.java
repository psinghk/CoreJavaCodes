package com.gmt.test;

import java.util.concurrent.locks.ReentrantLock;

public class PrintEvenOdd {

	ReentrantLock l = new ReentrantLock();
	public synchronized void displayOdd(){
		//l.lock();
		try{
			for (int i = 1; i <=10; i++) {
				if(i%2!=0){
					System.out.println("Odd is  "+i);
					Thread.sleep(10000);
				}
			}l.unlock();
		}catch(InterruptedException e){}
		//l.unlock();
	}
	
	public synchronized void displayEven() {
		//l.lock();
		try{
			for (int i = 1; i <=10; i++) {
				if(i%2==0){
					System.out.println("Even is   "+i);
					Thread.sleep(10000);
				}
			}
		
		}catch(InterruptedException e1){}
		
		//l.unlock();
	}
}
