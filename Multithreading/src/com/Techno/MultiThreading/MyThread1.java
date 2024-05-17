package com.Techno.MultiThreading;

public class MyThread1 extends Thread {
	
	@Override
	public synchronized void run() {
		System.out.println("thread1"+this.getName());
		System.out.println("prio 1"+this.getPriority());
		
		for (int i = 1; i<=10; i++) {
			System.out.println("thread1 i:"+i);
		}
	}
	

}


