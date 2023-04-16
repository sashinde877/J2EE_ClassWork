package com.jspiders.multithreading.threads;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0; i<5; i++) {
		System.out.println("Thread name: " + Thread.currentThread().getName() );
		}
	}

}
