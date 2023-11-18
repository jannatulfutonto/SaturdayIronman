package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	private String name = "Upskill";
	private int ssn = 466485;
	private String username = "jannatulfutotno";
	
	//Setter Method -name                                 //set the data, Write
	public void setName(String value) {
		name = value;
	}
	//Getter Method - name                                //get the data, Read
	public String getName(){
		return name;
	}
	
	//ssn - Setter Method
	public void setSSN(int value) {
		ssn = value;
	}
	
	
	//username - Getter Method 
	public String getUsername() {
		return username;
	}
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Jannatl");
		System.out.println(obj.getName());
		obj.setSSN(466485);
		System.out.println(obj.getUsername());
		

	}

}
