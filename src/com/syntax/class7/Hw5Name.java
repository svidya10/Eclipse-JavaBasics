package com.syntax.class7;

import java.util.Scanner;

public class Hw5Name {

	public static void main(String[] args) {
		// Prompt the user to ask the name 3 times and print "Good afternoon +name...
		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {
			System.out.println("Please enter your name");
			String name = scan.nextLine();
			System.out.println("Good Afternoon " + name);
		}

	}

}
