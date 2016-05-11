package com.vinay.corejava.threadsall;

public class ThreadDemo {
public static void main(String[] args) {
	MyThread t =new MyThread();
	t.start();
	
	//job of main thread..
			for (int i = 0; i < 5; i++) {
				System.out.println("Main thread");
			}
}
}
