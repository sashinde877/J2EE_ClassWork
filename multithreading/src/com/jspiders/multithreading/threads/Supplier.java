package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resources.Shop;

public class Supplier extends Thread{
	Shop shop;
	public Supplier(Shop sc) {
		this.shop = sc;
	}
	@Override
	public void run() {
		shop.restockProduct(20);
	}
}
