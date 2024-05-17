package com.Techno.MultiThreading;

public class StopThread extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			System.out.println(i);
			if(i==5) {
				this.stop();
			}
			
		}
	}
    
	public static void main(String[] args) {
		StopThread stopThread=new StopThread();
		stopThread.start();
	}
}
