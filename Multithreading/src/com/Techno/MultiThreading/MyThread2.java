package com.Techno.MultiThreading;

public class MyThread2 extends Thread{

	@Override
	public synchronized void run() {
	System.out.println("threead2"+this.getName());
	System.out.println("prio2"+this.getPriority());
	   for (int i = 10; i>=1; i--) {
		System.out.println("thread2 i:"+i);
	}
		
	}
	
}

