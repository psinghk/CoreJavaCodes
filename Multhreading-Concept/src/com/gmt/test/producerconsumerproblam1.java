
//
//BlockingQueue amazingly simplifies implementation of Producer-Consumer design pattern by providing outofbox support of blocking on put() and take(). 
//Developer doesn't need to write confusing and critical piece of wait-notify code to implement communication. 
//BlockingQuue is an interface and Java 5 provides different implantation like ArrayBlockingQueue and LinkedBlockingQueue , 
//both implement FIFO order or elements, while ArrayLinkedQueue is bounded in nature LinkedBlockingQueue is optionally bounded. 
//here is a complete code example of Producer Consumer pattern with BlockingQueue. Compare it with classic wait notify code, 
//its much simpler and easy to understand.


//put(E e): This method is used to insert elements to the queue. If the queue is full, it waits for the space to be available.
//E take(): This method retrieves and remove the element from the head of the queue. If queue is empty it waits for the element to be available.

package com.gmt.test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class producerconsumerproblam1 
{
	public static void main(String args[]){
		  
	     //Creating shared object
	     BlockingQueue sharedQueue = new LinkedBlockingQueue();
	 
	     //Creating Producer and Consumer Thread
	      MyProducer pThread = new MyProducer(sharedQueue);
	      MyConsumer cThread = new MyConsumer(sharedQueue);
 	     
	       pThread.start();
	       cThread.start();
	      
//	     Thread prodThread = new Thread(new Producer(sharedQueue));
//	     Thread consThread = new Thread(new Consumer(sharedQueue));

	     //Starting producer and Consumer thread
//	     prodThread.start();
//	     consThread.start();
	    }
	 
	}

	//Producer Class in java
	class MyProducer extends Thread{

	    private final BlockingQueue sharedQueue;

	    public MyProducer(BlockingQueue sharedQueue) {
	        this.sharedQueue = sharedQueue;
	    }

	    @Override
	    public void run() {
	        for(int i=0; i<10; i++){
	            try {
	                System.out.println("Produced: " + i);
	                sharedQueue.put(i);
	               
	            } catch (InterruptedException ex) {
	                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
	            }
	        }
	    }

	}

	//Consumer Class in Java
	class MyConsumer extends Thread{

	    private final BlockingQueue sharedQueue;

	    public MyConsumer (BlockingQueue sharedQueue) {
	        this.sharedQueue = sharedQueue;
	    }
	  
	    @Override
	    public void run() {
	        while(true){
	            try {
	                System.out.println("Consumed: "+ sharedQueue.take());
	            } catch (InterruptedException ex) {
	                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
	            }
	        }
	    }

}
