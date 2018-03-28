package com.sgs.thread.pool;

public class ThreadgroupDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //System.out.println(Thread.currentThread().getThreadGroup().getName());
       System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
	}

}
