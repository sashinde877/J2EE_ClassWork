package com.jspiders.multithreadingTask.resource;

public class Resource {
	int noOfBikes;

	public Resource(int noOfBikes) {
//		super();
		this.noOfBikes = noOfBikes;
	}
	public synchronized void orderBike(int n) {
//		System.out.println("");
		if(n > noOfBikes) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		noOfBikes -= n;
	}
	public synchronized void importBike(int n) {
		noOfBikes += n;
		this.notify();
	}
}
