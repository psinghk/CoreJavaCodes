package com.sgs.thread.pool;

public class ThreadGroupdemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 ThreadGroup  system1 = Thread.currentThread().getThreadGroup().getParent();
		 Thread [] t = new Thread[system1.activeCount()];
		 system1.enumerate(t);
		 for( Thread t1 :t)
		 {
			 System.out.println();
			 System.out.println(t1.getName()+"......"+t1.isDaemon());
		 }
	}

}
