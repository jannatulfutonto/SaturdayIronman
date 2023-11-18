package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		int age = 23;                                                  //Variable
        int []ageIronMan = new int [] {25, 32, 37, 21, 27};            //Array 
       
        //Array index                  [0] [1] [2] [3] [4]
  
         
        System.out.println("Student Age : " + ageIronMan [4]);
        System.out.println("total : " + ageIronMan.length);
        
        String[] nameIronMan = new String[] {"Yusuf", "Abdullah", "Madan", "Jannatul", "Sumaia"} ;
        
        System.out.println("Student Name : " + nameIronMan[2]);
        System.out.println("Total Student Name: " + nameIronMan.length);
        
        //Multi-Dimentional Array
        int [][] ageIronMan2D = {{25, 32, 37, 21, 27},                 //[0][0] [0][1] [0][2] [0][3] [0][4]
        		                 {26, 30, 33, 28}};                    //[1][0] [1][1] [1][2] [1][3]
        
        System.out.println("Student Age 2D : " + ageIronMan2D [0][3] );
        
        // Hashmap store multiple data using key-value pair, Implementation of Map interface
        
        HashMap<String, Integer> Student = new HashMap<String, Integer>();
        
        Student.put("Yusuf", 28);
        Student.put("Abdullah", 32);
        Student.put("Madan", 37);
        Student.put("Jannatul", 21);
        Student.put("Sumaia", 27);
        Student.put("Saiful", 31);

        System.out.println("HashMap Student Age : " + Student.get("Madan"));
        
        HashMap<String, String> Capital = new  HashMap<String, String>();
        
        Capital.put("Bangladesh", "Dhaka");
        Capital.put("USA", "Washington");
        Capital.put("Canada", "Toronto");
        
        System.out.println("HashMap City : " + Capital.get("USA"));
        
        //Hashset store unordered collection containing unique value, Implementation of Set interface
        
        HashSet<String> car = new HashSet<String>();
        car.add("Audi");
        car.add("BMW");
        car.add("Tesla");
        car.add("Range Rover");
        System.out.println("Car : " + car);
        
        //HashTable store multiple data using key-value pair, No duplicate,
        //   also is synchronized (only one tread can be modified)
        
        Hashtable<String, String> Region = new Hashtable<String, String>();
        Region.put("BD", "Asia");
        Region.put("USA", "America");
        Region.put("CANADA", "America");
        System.out.println("Region : " + Region.get("BD"));


	}
	

}
