package com.upskill.assignment_2;

public class Assignment_2_E {
/*Write a program in Java to display the multiplication table of (eight)8. */

	public static void main(String[] args) {
		
		int number = 8;

        System.out.println("Multiplication Table for " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
	
	{ int number = 12;
		
		 System.out.println("Maultiplication Table for " + number + ":");
		for (int i = 1; i <= 10; i++) {
			int result = 0;
			System.out.println(number + " * " + i + " = " + result);
		}
	}
}
