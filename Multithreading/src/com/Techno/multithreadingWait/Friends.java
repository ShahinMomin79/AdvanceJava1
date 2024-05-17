package com.Techno.multithreadingWait;

public class Friends extends Thread{
Pizza pizza;
	
	 public Friends(Pizza p) {
		this.pizza=p;
	}
	 
	 @Override
		public void run() {
			pizza.Order(5);
		}
}
