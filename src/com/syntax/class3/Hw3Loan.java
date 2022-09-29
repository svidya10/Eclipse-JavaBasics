package com.syntax.class3;

import java.util.Scanner;

public class Hw3Loan {

	public static void main(String[] args) {
		/*You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		 * If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the loan amount needed");
		long loan = scan.nextLong();
		
		if (loan<=200000)
			System.out.println("Lend money");
		else
			System.out.println("Reject client");
	}

}
