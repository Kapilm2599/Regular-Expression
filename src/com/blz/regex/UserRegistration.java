package com.blz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public boolean userName(String regex, String input) {
		return Pattern.compile(regex).matcher(input).matches();
	}

	public static void main(String[] args) {
		System.out.println("welcome to User Registration program");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Name: ");
		String firstName = "[A-Z]{1}[a-z]{2,}";
		String input = scanner.next(); 
		
		System.out.println("Enter Last Name: ");
		String lastName = "[A-z]{1}[a-z]{2,}";
		String inputLastName = scanner.next();
		
		System.out.println("Enter Email Id: ");
		//String emailId = "[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})";
		String emailId = "[a-zA-z0-9][a-zA-z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-z]+)+"; 
		String inputEmailId = scanner.next();
		
		System.out.println("Enter Mobile Number: ");
		String mobileNumber = "(91)(-)[6-9]{1}[0-9]{9}";
		String inputmobileNumber = scanner.next();
		
		System.out.println("Enter Password");
		//String Password = "[A-za-z0-9]{8}$";
		//String Password = "((?=.*[A-Z]).{8,})";
		//String Password = "((?=.*[A-Z])(?=.*[0-9]).{8,})";
		String Password = "((?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&*_]).{8,})";
		String inputPassword = scanner.next();
		
		UserRegistration userRegistration = new UserRegistration();
		System.out.println(userRegistration.userName(firstName, input));
		System.out.println(userRegistration.userName(lastName, inputLastName));
		System.out.println(userRegistration.userName(emailId, inputEmailId));
		System.out.println(userRegistration.userName(mobileNumber, inputmobileNumber));
		System.out.println(userRegistration.userName(Password, inputPassword));

	}

}
