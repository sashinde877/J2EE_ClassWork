package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resources.Shop;

public class Customer extends Thread{
	Shop shop;
	 public Customer(Shop sc) {
		 this.shop = sc;
	 }
	 
	 @Override
	public void run() {
		 shop.orderProduct(10);
	}
}
