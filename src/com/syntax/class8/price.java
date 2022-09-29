package com.syntax.class8;

import java.util.Scanner;

public class price {

	public static void main(String[] args) {
		/*
		 * Task 2: Write a program to ask a user to enter item they want to buy and the
		 * price of that item. Every time user enters money, accumulate the amount and
		 * tell the user how much is left to pay off. If user give more money program
		 * should return a change. Whenever user done with payments program should say
		 * "Thank you for shopping!"
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the item you want to buy");
		String item = scan.nextLine();
		System.out.println("Enter the total price you want to pay");
		double total = scan.nextDouble();
		
		double store=0.0;

		do {
			System.out.println("Enter the price you are paying now");
			double pay = scan.nextDouble();
			store +=pay;
			double balance;

			if (store >= total) {
				balance = store - total;
				System.out.println("Please collect your balance " + balance);
				break;
			}				
			else if (store < total) {
				balance = total - store;
				System.out.println("Please pay the remaining amount " + balance);
			}

		} while (total != store);
		System.out.println("Thank you for shopping!");
	}
}
