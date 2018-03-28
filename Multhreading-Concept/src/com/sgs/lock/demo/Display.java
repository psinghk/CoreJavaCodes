package com.sgs.lock.demo;

import java.util.concurrent.locks.ReentrantLock;

public class Display {

	
		// TODO Auto-generated method stub
      ReentrantLock  l = new ReentrantLock();
         
		
		      public void wish(String name)
		      {
				 l.lock();
				  for (int i = 1; i <=3; i++) 
				  {
					
					  System.out.print("Good Morning:  ");
					  try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO: handle exception
					}
					 System.out.println(name);
					  
				  }
				  l.unlock();
			 }
	} 
	
	

