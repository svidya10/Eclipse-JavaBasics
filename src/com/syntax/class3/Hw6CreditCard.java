package com.syntax.class3;

import java.util.Scanner;

public class Hw6CreditCard {

	public static void main(String[] args) {
		/*Create a Java program that will ask if user has a credit card or not. 
		 * If you user does not have a credit card then offer them. 
		 * If they do have one ask what is balance on the card? 
		 * If balance of the card is larger than 1000, tell them to pay off immediately, 
		 * otherwise you can tell them that they can spend more.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you have a Credit card? - true or false ");
		boolean cc = scan.nextBoolean();
		if (cc) {
			System.out.println("What is the balance on the card");
			double amount = scan.nextDouble();
		     if (amount>1000)
		    	 System.out.println("Pay off immediately");
		     else
		    	 System.out.println("Spend more");  
		}
		else
			System.out.println("We offer a credit card");
		     
	}

}