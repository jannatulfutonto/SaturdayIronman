package com.upskill.java_6;

public class MultiThreading {
	/* Multithreading is a java feature that allows concurrent execution of two or more parts of a program.
	 
	 Threads can be created by using two mechanism :
	 
	 1. Extending the thread class
	 2.Implementing the Runnable interface */

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i <n; i++){
			MultiThreadingThread obj = new MultiThreadingThread();
			obj.start();
			
			Thread obj2 = new Thread(new MultithreadingRunnable());
			obj2.start();
		}

	}

}
