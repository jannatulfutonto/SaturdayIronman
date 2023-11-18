package com.upskill.assignment_2;

public class Assignment_2_J {
	/*Write a Java program to convert temperature from Fahrenheit to Celsius degree. */

	
	//(32°F − 32) × 5/9 = 0°C
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter tempreture in Fahrenheit: ");
		double fahrenheit = Scanner.nextDouble();
		
		double celsius = (5.0 / 9.0) * (fahrenheit - 32);
		
		System.out.println("Temperature in Celsius: " + celsius);
		

	}

}
