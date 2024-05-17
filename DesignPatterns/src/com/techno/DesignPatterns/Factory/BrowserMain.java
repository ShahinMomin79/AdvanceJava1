package com.techno.DesignPatterns.Factory;

import java.util.Scanner;

public class BrowserMain {
	
	private static Browser browser;
	
	public static void main(String[] args) {
		try {
		 Factory().start();}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static Browser Factory() {
		System.out.println("Enter one number\n"+"1.chrome"+"\n2.edge"+"\n3.Firefox"+"\n4.Brave");
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		
		switch (choice) {
		case 1:browser=new Chrome();
		        return browser;
			
			
		case 2:browser=new Edge();
		      return browser;
		
		
		case 3:browser=new Firefox();
		return browser;
		
	
		case 4:browser=new Brave();
		return browser;
		
		

		default:System.out.println("invalid choice");
		 return null;
		        
		}
		
	}

}
