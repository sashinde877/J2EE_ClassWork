package com.jspiders.multithreading.threads;

public class Mythread1 extends Thread{
	@Override
	public void run() {
		for(int i =0; i<5; i++) {
		System.out.println("Thread name: " + this.getName());
		}
	}
}
