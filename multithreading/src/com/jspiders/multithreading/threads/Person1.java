package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resources.Account;

public class Person1 extends Thread{
	Account ac;
	public Person1(Account ac) {
		this.ac = ac;
	}
	public void run() {
	ac.depositMoney(5000);
	ac.withdrawMoney(3000);
	}
}
