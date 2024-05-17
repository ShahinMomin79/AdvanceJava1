package com.techno.DesignPatterns;

public class SingletonEagerMain {
	
	public static void main(String[] args) {
		SingletonEager eager=SingletonEager.getObject();
		SingletonEager eager1=SingletonEager.getObject();
		SingletonEager eager2=SingletonEager.getObject();
		System.out.println(eager);
		System.out.println(eager1);
		System.out.println(eager2);
	}

}
//cn met met met add add add
