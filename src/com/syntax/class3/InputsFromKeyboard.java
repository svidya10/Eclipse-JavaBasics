package com.syntax.class3;

import java.util.Scanner;

public class InputsFromKeyboard {

	public static void main(String[] args) {
		// Scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your First name");
		String fName = scan.next();
		System.out.println("Your first name is "+fName);
		System.out.println("Enter your Last name");
		String lName = scan.next();
		System.out.println("Your last name is "+lName);
		System.out.println("Enter your age");
		int age = scan.nextInt();
		System.out.println("Your age is "+age);
		
		System.out.println("Enter your Address");
		String address = scan.nextLine();
		//address = address+=scan.nextLine();
		System.out.println("Your address is "+address);
	}
}
