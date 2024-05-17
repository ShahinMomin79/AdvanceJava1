package com.Techno.multithreadingWait;

public class Pizza {
	int no_of_pizzas;//10

	 public synchronized void Order(int orderedPizzas) {
		 System.out.println("ordered"+orderedPizzas+"pizzas");
		 if(orderedPizzas>no_of_pizzas) {
			 System.out.println("we are preparing your pizzas so plz wait.....");
			 try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 }
		 no_of_pizzas-=orderedPizzas;
		 System.out.println(orderedPizzas+" ordered pizzas sucessfully");
	 }
	 
	 public synchronized void MakePizza(int madePizza) {
		 System.out.println(madePizza+" Pizzas are done");
		 no_of_pizzas+=madePizza;
		 this.notify();
	 }
}
