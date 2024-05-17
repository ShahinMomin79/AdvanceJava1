package com.techno.DesignPatterns;

public class SingletonEager {
	
	
	 private static SingletonEager eager=new SingletonEager();
	
         private SingletonEager() {
			System.out.println("constructor accessed");
		}
         
         public static SingletonEager getObject() {
        	 System.out.println("method acessed");
        	 return eager;
         }

}
