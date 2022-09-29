package com.syntax.class5;

import java.util.Scanner;

public class Cw10Food {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your country");
		String country = scan.nextLine();
		String food;
		
		switch(country) {
		case "United States":
			food = "Burger";
			break;
		case "India":
			food = "Rice";
			break;
		default:
			food = "Unknown";
			System.out.println("Invalid country");
		}
		System.out.println(food);
	}

}
