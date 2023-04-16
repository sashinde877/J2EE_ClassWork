package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resources.Account;

public class ThreadMain {
	public static void main(String[] args) {
//		Mythread1 m = new Mythread1();
//		m.setName("Thread-1");
//		m.setPriority(9);
//		MyThread2 m1 = new MyThread2();
//		Thread t = new Thread(m1);
//		t.setName("Thread-2");
//		t.setPriority(10);
//		m.start();
//		t.start();
//		MyThread3 m3 = new MyThread3();
//		m3.start();
		Account ac = new Account(10000);
		Person1 p1 = new Person1(ac);
		Person2 p2 = new Person2(ac);
		p1.start();
		p2.start();
	}
}
