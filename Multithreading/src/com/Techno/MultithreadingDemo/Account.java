package com.Techno.MultithreadingDemo;

public class Account {
	double bank_balance;
	
	public Account(double balance) {
		this.bank_balance=balance;
	}
	
	public double checkBalance() {
		return this.bank_balance;
	}
	
	public synchronized void Deposit(double money) {
		System.out.println("deposited :"+money);
		this.bank_balance+=money;
		System.out.println("amount :"+this.checkBalance());
		
	}
	public synchronized void Withdrawn(double money) {
		System.out.println("withdrawn :"+money);
		this.bank_balance-=money;
		System.out.println("amount :"+this.checkBalance());
	}

}
