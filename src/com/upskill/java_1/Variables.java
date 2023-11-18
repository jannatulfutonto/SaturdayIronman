package com.upskill.java_1;

public class Variables {

	// Variables in Java 
	
	//Instance OR global Variable - Variable declared in class level, outside method
	
	//Local variable - variables declared in methods
	
	//Static variable - variables belong to class and don't required creating object
	
	//Method parameter - variables used as method parameter
	
	public String country = "USA";
	
	public static String region = "North America";
	
	public static void main(String[] args) {
		
		String city = "New York";
		
		String police = "NYPD";
		
		System.out.println(city);
		System.out.println(region);
		System.out.println(police);
		nj();
		pa();
		Variables obj = new Variables();
		System.out.println(obj.country);
		
	}
	
	public static void nj() {
		
		String city = "Bloomfield";
				
		String police = "BDP";
		
		System.out.println(city);
		System.out.println(region);
	}
	
	public static void pa() {
		
		String city = "Phili";
		
		String police = "PPD";
		
		System.out.println(city);
		System.out.println(region);
	}
}
