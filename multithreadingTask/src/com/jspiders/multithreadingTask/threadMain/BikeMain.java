package com.jspiders.multithreadingTask.threadMain;

import com.jspiders.multithreadingTask.resource.BikeResource;
import com.jspiders.multithreadingTask.threads.Ramesh;
import com.jspiders.multithreadingTask.threads.Suresh;

public class BikeMain {
	public static void main(String[] args) {
		BikeResource b = new BikeResource();
		
		Suresh s = new Suresh(b);
		s.setName("Suresh");
		Ramesh r = new Ramesh(b);
		r.setName("Ramesh");
		s.start();
		r.start();
	}
}
