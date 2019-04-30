package day11_logical_nestedif;

import java.util.Scanner;
public class LoginTest {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in); 
	
	System.out.println("Enter your username:");
	String username = scan.next();
	
	System.out.println("Enter password:");
	String password = scan.next();
	//username = cybertek12@gmail.com
	//passwodrd = WoddenSpoone123 
	String validUsername ="cybertek@gmail.com";
	String validPassword ="WoodenSpoon123";
	if (username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
		System.out.println("Login Successful, Welcome!");
	}else if (!username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)){
		System.out.println("Invalid Username and Invalid Passvword");
	}else if (username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
		System.out.println("Invalid Pssword");
	}else if (!username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
		System.out.println("Invalid Username");
	
	
	}
		
		
	}
	
	
	
		
	}


