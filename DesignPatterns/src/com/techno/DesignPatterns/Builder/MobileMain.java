package com.techno.DesignPatterns.Builder;

public class MobileMain {
	
       public static void main(String[] args) {
		Mobile mobile=new MobileBuilder().setMemory(365).setColor("black")
				.setPrice(25000).setCName("samsung").setFront_cam(23).setRam(6)
				.setScreen_size(23).setVersion(5).getMobile();	
		System.out.println(mobile);
	}
}


 
       
 