package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resources.Shop;

public class ShopMain {
	public static void main(String[] args) {
		Shop shop = new Shop(5);
		
		Customer c = new Customer(shop);
		Supplier s = new Supplier(shop);
		
		c.start();
		s.start();
	}
}
