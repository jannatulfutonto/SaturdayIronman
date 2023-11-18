package com.upskill.assignment_2;

public class Assignment_2_D {
	/* 4.  Write a for loop upto 500 which will increase the value double every time. */

	public static void main(String[] args) {
		double value = 1.0;
		
		for (int i = 1; i <=500; i++) {
			System.out.println("Iteration " + i + ": " + value);
			value *=2; 
		}

	}

}
