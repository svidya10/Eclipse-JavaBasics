package com.syntax.class3;

import java.util.Scanner;

public class Hw2Mortgage {

	public static void main(String[] args) {
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price.
		 * First, program should check if rate is higher than 4.5 user will not buy a
		 * house, otherwise user will consider buying. Once user decides to buy a house,
		 * if price of the house is larger than 200000 than user will take a loan,
		 * otherwise user will pay cash
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter mortgage rate");
		double mRate = scan.nextDouble();

		if (mRate > 4.5)
			System.out.println("User will not buy a house");
		else {
			System.out.println("User will consider buying");

			System.out.println("Please enter mortgage price");
			double mPrice = scan.nextDouble();
			if (mPrice > 200000)
				System.out.println("User will take a loan");
			else
				System.out.println("User will pay cash");
		}
	}
}
