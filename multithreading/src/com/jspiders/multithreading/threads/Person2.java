package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resources.Account;

public class Person2 extends Thread{
	Account ac;
	public Person2(Account ac) {
		this.ac = ac;
	}
	public void run() {
	ac.depositMoney(3000);
	ac.withdrawMoney(1500);
	}
}
