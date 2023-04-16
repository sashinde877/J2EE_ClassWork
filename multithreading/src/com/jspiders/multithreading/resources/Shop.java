package com.jspiders.multithreading.resources;

public class Shop {
	int availableProduct;
	public Shop(int ap) {
		this.availableProduct = ap;
	}
	
	public synchronized void orderProduct(int noOfProduct) {
		System.out.println("Purchesing products : " + noOfProduct);
		if(availableProduct < noOfProduct) {
			System.out.println("Products not available please wait.....");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		availableProduct -=noOfProduct;
		System.out.println(noOfProduct +" are purchesed....");
		System.out.println("Now Available Products are " + availableProduct);
	}
	
	public synchronized void restockProduct(int noOfProduct) {
		System.out.println(noOfProduct + " Products are added...");
		availableProduct += noOfProduct;
		this.notify();
		
	}
}
