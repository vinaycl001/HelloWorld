package com.vinay.corejava.threadsall;
//Defining a thread
public class MyThread extends Thread{
	
	@Override
	public void run() {
		//job of thread..
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread");
		}
	}

}
