package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resources.Resource;

public class Thread2 extends Thread{
	Resource r;
	public Thread2(Resource r) {
		this.r = r;
	}
	@Override
	public void run() {
		synchronized (r.s1) {
			System.out.println(this.getName() + " Resource is locked " + r.s1);
			synchronized (r.s) {
				System.out.println(this.getName() + " Resource is locked " + r.s);
			}
			System.out.println(this.getName() + " Resource is released " + r.s);
		}
		System.out.println(this.getName() + " Resource is released " + r.s1);
	}
}
