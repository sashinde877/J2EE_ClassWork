package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resources.Resource;

public class Thread1 extends Thread{
	Resource r;
	public Thread1(Resource r) {
		this.r = r;
	}
	@Override
	public void run() {
		synchronized (r.s) {
			System.out.println(this.getName() + " Resource is locked " + r.s);
			synchronized (r.s1) {
				System.out.println(this.getName() + " Resource is locked " + r.s1);
			}
			System.out.println(this.getName() + " Resource is released " + r.s1);
		}
		System.out.println(this.getName() + " Resource is released " + r.s);
	}
}
