package com.techno.DesignPatterns;

public class SingletonLazy {
	
	private static SingletonLazy lazy;//address
	
	private SingletonLazy() {
	       System.out.println("constuctor accessed");
	}
	
	public static SingletonLazy getObject() {
		System.out.println("method accessed");
		if (lazy==null) {
			lazy =new SingletonLazy();
		}
		return lazy;
		
	}

}

