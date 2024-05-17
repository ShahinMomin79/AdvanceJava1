package com.Techno.MultithreadingDemo;

public class Wife extends Thread {
	
	Account a;
	
	public Wife(Account obj) {
	
		this.a=obj;
		
	}

	  @Override
	public void run() {
		a.Deposit(500);
		a.Withdrawn(5000);
	}

}
