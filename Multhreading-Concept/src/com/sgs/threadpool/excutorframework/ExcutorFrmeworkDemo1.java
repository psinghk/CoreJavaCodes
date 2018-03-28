package com.sgs.threadpool.excutorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcutorFrmeworkDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Printjob[] jobs = { new Printjob("Prabhat"),
		 new Printjob("Singh"),
		 new Printjob("gov"),
		 new Printjob("Ravi"),
		 new Printjob("gaurav"),
		 new Printjob("attra"),
		 new Printjob("PK"),
		 new Printjob("PKG"),
		              };
		 
		 ExecutorService service  = Executors.newFixedThreadPool(6);
		 for(Printjob job : jobs){
		 service.submit(job);
		 }
		 service.shutdown();
	}
	

}
 class Printjob implements Runnable{

	 String name;
	 public Printjob(String name) {
		 this.name = name;
		// TODO Auto-generated constructor stub
	}
	  
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println( name+"---Job started by Thread:  "+Thread.currentThread().getName());
		try {
			 Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println(name+"---Job completed by  Thread: "+Thread.currentThread().getName());
	}
	 
 }
