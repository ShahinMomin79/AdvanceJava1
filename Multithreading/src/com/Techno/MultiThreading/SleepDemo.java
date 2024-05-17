package com.Techno.MultiThreading;

public class SleepDemo extends Thread {
      
	@Override
	public void run() {
		for (int i = 0; i <=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		SleepDemo demo=new SleepDemo();
		demo.start();
	}
}


//string ="magic of sleep";
//start run wait stop