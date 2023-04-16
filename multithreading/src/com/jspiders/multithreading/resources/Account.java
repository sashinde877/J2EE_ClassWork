package com.jspiders.multithreading.resources;

public class Account {
	int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}
	public void currentBal() {
		System.out.println("Current Balance: " + balance);
	}
	public synchronized void depositMoney(int a) {
//		System.out.println("");
		balance +=a;
		System.out.println("Money Deposited...");
		currentBal();
	}
	public synchronized void withdrawMoney(int a) {
		if(balance > a) {
			balance -= a;
			System.out.println("Money Withdraw...");
			currentBal();
		}
		else {
			System.out.println("balance is too low ....");
			currentBal();
		}
	}
}
