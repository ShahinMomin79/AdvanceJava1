package com.techno.DesignPatterns;

public class SingletonLazyMain {
	
	public static void main(String[] args) {
		SingletonLazy obj=SingletonLazy.getObject();
		
		SingletonLazy obj1=SingletonLazy.getObject();
		SingletonLazy obj2=SingletonLazy.getObject();
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
	}

}
