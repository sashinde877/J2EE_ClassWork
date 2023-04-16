package com.jspiders.multithreadingTask.threads;

import com.jspiders.multithreadingTask.resource.BikeResource;

public class Suresh extends Thread{
	BikeResource b;
	public Suresh(BikeResource b) {
		this.b = b;
	}
	@Override
	public void run() {
		synchronized (b.bike) {
			System.out.println(this.getName() + "Bike is Locked " + b.bike);
			synchronized (b.bikeKey) {
				System.out.println(this.getName() + "Bike Key is Locked " + b.bikeKey);
			}
			System.out.println(this.getName() + "Bike Key is released " + b.bikeKey);
		}
		System.out.println(this.getName() + "Bike is released " + b.bike);
	}
}
