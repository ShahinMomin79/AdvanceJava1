package com.Techno.MultithreadingDemo;

public class ThreadMain {
	
	public static void main(String[] args) {
		Account account=new Account(10000);
	
		Husband husband=new Husband(account);
		Wife wife=new Wife(account);
		husband.start();
		wife.start();
	}

}

//calculate slots ---24 hr
//a = [1 ,3, ,7];
//b=[2 ,4, 8];
//slot 1-2  3-4  7-8
//rem-- 2-3 4-7
//output c=[2,4]
//		d=[3,7]
