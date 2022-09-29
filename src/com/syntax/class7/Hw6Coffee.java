package com.syntax.class7;

import java.util.Scanner;

public class Hw6Coffee {

	public static void main(String[] args) {
		/*Declare a variable to store a price for a coffee. Ask the user to pay for a coffee. 
		 * Keep asking to pay for coffee until the user enters the EXACT amount . 
		 * If the user gives more than coffee price --> ask them to give less, 
		 * if the user gives less money then ask to give more. Once user give EXACT amount print “Please enjoy your coffee
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		double price = 4.99;
		double yourPrice;
		
		do {
			System.out.println("Please enter your price for coffee");
			yourPrice = scan.nextDouble();
			if (price>yourPrice) {
				System.out.println("Please give more");
				
			}
			else if (price<yourPrice) {
				System.out.println("Please give less");
				
			}
			else
				System.out.println("Please enjoy your coffee");
		}while(price!=yourPrice);
		
	}

}
