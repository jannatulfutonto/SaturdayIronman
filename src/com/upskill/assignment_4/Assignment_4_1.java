package com.upskill.assignment_4;

public class Assignment_4_1 {
	/* Write a user program using encapsulation that contains the username, 
	   password, email, first and last names of a user of our application. 
	   Display the user information in console output?
	 */

	public static void main(String[] args) {
		
		    private String username = "jannat";
		    private String password = "job";
		    private String email = "jannat@upskill.com";
		    private String first_name = "Jannatul";
		    private String last_name = "Futonto";
		    
		    void display() {
		    	System.out.println("Username: " + username);
		    	System.out.println("Password: " + password);
		    	System.out.println("Email: " + email);
		    	System.out.println("First name: " + first_name);
		    	System.out.println("Last name: " + last_name);
		    }

		    public User(String username, String password, String email, String firstName, String lastName) {
		        this.username = username;
		        this.password = password;
		        this.email = email;
		        this.firstName = firstName;
		        this.lastName = lastName;
		    }
	}
	
	    public class Problem7 {
	    	
	    	public static void main(String[] args) {
	    		

		    public String getUsername() {
		        return username;
		    }

		    public String getPassword() {
		        return password;
		    }

		    public String getEmail() {
		        return email;
		    }

		    public String getFirstName() {
		        return firstName;
		    }

		    public String getLastName() {
		        return lastName;
		    }

		    // Display user information
		    public void displayUserInfo() {
		        System.out.println("Username: " + username);
		        System.out.println("Password: " + password); // Note: It's not recommended to display the password in a real application.
		        System.out.println("Email: " + email);
		        System.out.println("First Name: " + firstName);
		        System.out.println("Last Name: " + lastName);
		    }

		    public static void main(String[] args) {
		        // Create a new user
		        User user = new User("john_doe", "password123", "john.doe@example.com", "John", "Doe");

		        // Display user information
		        user.displayUserInfo();
		    }
		}


	}

}
