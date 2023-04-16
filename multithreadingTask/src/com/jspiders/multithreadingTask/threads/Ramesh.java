package com.jspiders.multithreadingTask.threads;

import com.jspiders.multithreadingTask.resource.BikeResource;

public class Ramesh extends Thread{
	BikeResource b;
	public Ramesh(BikeResource b) {
		this.b = b;
	}
	@Override
	public void run() {
		synchronized (b.bikeKey) {
			System.out.println(this.getName() + "Bike Key is Locked " + b.bikeKey);
			synchronized (b.bike) {
				System.out.println(this.getName() + "Bike is Locked " + b.bike);
			}
			System.out.println(this.getName() + "Bike is released " + b.bike);
		}
		System.out.println(this.getName() + "Bike key is released " + b.bikeKey);
	}
}
