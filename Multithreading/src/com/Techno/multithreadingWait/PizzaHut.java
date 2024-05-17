package com.Techno.multithreadingWait;

public class PizzaHut extends Thread{
	
	Pizza pizza;
	
	public PizzaHut(Pizza p) {
		this.pizza=p;
	}
	
	@Override
	public void run() {
		pizza.MakePizza(10);
	}

}
