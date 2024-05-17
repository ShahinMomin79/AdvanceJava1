package com.Techno.multithreadingWait;

public class PizzaMain {
	
	public static void main(String[] args) {
		Pizza pizza=new Pizza();
		
		Friends friends=new Friends(pizza);
		PizzaHut hut=new PizzaHut(pizza);
		friends.start();
		hut.start();
	}

}



