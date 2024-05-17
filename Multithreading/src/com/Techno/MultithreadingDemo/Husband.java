package com.Techno.MultithreadingDemo;

public class Husband extends Thread {
	
	Account a;

	public Husband(Account obj) {
		this.a=obj;
	}
	
	  @Override
	public void run() {
		a.Deposit(5000);
		a.Withdrawn(200);
	}
	   
}
