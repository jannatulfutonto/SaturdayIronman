package com.upskill.assignment_2;

public class Assignment_2_F {
	/*6. Write a java program to find the prime number from 1 to 100 and print them. 
	 */

	public static void main(String[] args) {
		System.out.println("Prime numbers between 1 and 100;");
		
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.println(i + " ");
			}
		}

	}


     public static boolean isPrime(int num) {
    	 if (num <= 1) {
    		return false; 
    	 }
       if (num == 2) {
    	   return true;
       }
     if (num % 2 == 0) {
    	 return false;
     }  
     
     int sqrt = (int) Math.sqrt(num);
     for (int i =3; i <= sqrt; i += 2) {
    	 if (num % i == 0) {
    		 return false;
    	 }
     }
     
     return true;
     }
     
}  