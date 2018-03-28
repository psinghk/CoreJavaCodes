package com.gmt.test;

public class MyQueue 
{
	private int content;
	private boolean available = false;

	public synchronized int get()
	{
		
		while(available==false){
			try {
				 wait();
				
			    } 
			 catch (InterruptedException ex) 
			 {
				ex.printStackTrace();
			 }
			
		}
		available=false;
		notifyAll();
		return content;
 }
	

	 public synchronized void put( int value)
	 {
		 while(available==true){
				try {
					 wait();
					
				    } 
				 catch (InterruptedException ex) 
				 {
					ex.printStackTrace();
				 }
				
			}
		    content = value;
			available=true;
			notifyAll();
			
		 
	 }

}
