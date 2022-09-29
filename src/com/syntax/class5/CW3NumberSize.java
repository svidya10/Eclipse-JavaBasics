package com.syntax.class5;

import java.util.Scanner;

public class CW3NumberSize {

	public static void main(String[] args) {
		/*3. Ask user to enter a number and then define if number is small, medium or large
		 * Small number is value between 1 and 10
		 * Medium number is value between 11 and 100
		 * Large number is value between 101 and 1000
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 1000");
		double num = scan.nextDouble();
		
		if (num>=1 && num<=10) {
			System.out.println("Small");
		}
		else if (num>=11 && num<=100) {
			System.out.println("Medium");
		}
		else if (num>=101 && num<=1000){
			System.out.println("Large");
		}
		else
			System.out.println("Number out of range");

	}

}
