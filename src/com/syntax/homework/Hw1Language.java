package com.syntax.homework;

import java.util.Scanner;

public class Hw1Language {

	public static void main(String[] args) {
		/*Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter you country name");
		String country = scan.nextLine();
		String language;
		
		if (country.equalsIgnoreCase("United States")) {
			language ="English";
		}
		else if (country.equalsIgnoreCase("India")) {
			language="Hindi";
		}
		else if (country.equalsIgnoreCase("Mexico")) {
			language= "Spanish";
		}
		else {
			language = "Unknown";
		}
		System.out.println("The language spoken in "+country+" is "+language);
	}

}
