package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resources.Resource;

public class DeadLockMain {
	public static void main(String[] args) {
		Resource r = new Resource();
		Thread1 t = new Thread1(r);
		t.setName("T1");
		Thread2 t1 = new Thread2(r);
		t1.setName("T2");
		t.start();
		t1.start();
	}
	
}
