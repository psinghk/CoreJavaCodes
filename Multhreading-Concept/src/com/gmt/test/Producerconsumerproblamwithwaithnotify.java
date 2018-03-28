package com.gmt.test;

import java.util.PriorityQueue;
import java.util.Queue;


public class Producerconsumerproblamwithwaithnotify {

	public static void main(String[] args) 
	{
		 Queue  pQueue = new PriorityQueue<>();
		 Myconsumer1 mc =  new Myconsumer1(pQueue);
		 Myproducer1 mp = new Myproducer1(pQueue);
		 
		 mc.start();
		 mp.start();

	}

 }
 
class Myproducer1 extends Thread{
	 private Queue pQueue;
	  public Myproducer1(Queue pQueue) 
	  {
		  this.pQueue = pQueue;
      }
		public void run() 
		
		{ 
			System.out.println("producer run method");
		
			//synchronized(pQueue){
			for(int i =0 ;i<=10;i++){
				pQueue.offer(i);
				//System.out.println("Produce:  "+ i);
				//System.out.println("element  "+ pQueue);
				pQueue.notify();
			}
			System.out.println(pQueue);
			
			//System.out.println("element  "+ pQueue.poll());
			
			}
		}
	
	
//}
  class Myconsumer1 extends Thread
  {
	 private Queue pQueue;
	 public Myconsumer1(Queue pQueue) 
	 {
		  this.pQueue = pQueue;
		
	  }
	 
	  
	  public void run()
	  {
		  System.out.println("consumer run method");
		  synchronized(pQueue)
		  {
			  
			  if(pQueue.isEmpty())
				  try{
				  pQueue.wait();
				  //Thread.sleep(10000);
			  
			     }
			  catch(InterruptedException ex){}
			  else{
			  //for(int i =0;i<=10;i++){
			  System.out.println("consume  "+pQueue.poll());

		  //}
		  }
	    }
	  }
  }
  
