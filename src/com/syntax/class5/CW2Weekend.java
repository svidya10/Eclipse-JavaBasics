package com.syntax.class5;

import java.util.Scanner;

public class CW2Weekend {

	public static void main(String[] args) {
		/*2. Write a program that will print whether it is a weekend or weekday. 
		 * If any day from 1-5 → output “It is a weekday”, 
		 * anyday from 6-7 → output “It is a weekend”, 
		 * any other day → output “Invalid day”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day number between 1 and 7");
		int day = scan.nextInt();
		
		if (day>=1 && day<=5)  {
			System.out.println("It is weekday");
		}
		else if (day>=6 && day<=7) {
			System.out.println("It is weekend");
		}
		else {
			System.out.println("Invalid day");
		}		
	}
}
