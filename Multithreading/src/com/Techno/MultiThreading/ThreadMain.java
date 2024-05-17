package com.Techno.MultiThreading;

public class ThreadMain {
	public static void main(String[] args) {
		MyThread1 myThread1=new MyThread1();
		myThread1.setName("shubham");
		myThread1.setPriority(1);
		MyThread2 myThread2=new MyThread2();
		myThread2.setName("tanaya");
		myThread2.setPriority(2);
		
		
		//to getting name of my current thread
		Thread tr=Thread.currentThread();
		System.out.println(tr.getName());
	    
		myThread2.start();
		myThread1.start();
	}

}

