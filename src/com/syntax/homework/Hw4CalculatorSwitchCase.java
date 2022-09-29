package com.syntax.homework;

import java.util.Scanner;

public class Hw4CalculatorSwitchCase {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user. Please
		 * complete this assignment in 2 ways: using if statement and switch case.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		double n1 = scan.nextInt();
		System.out.println("Enter the second number");
		double n2 = scan.nextInt();
		System.out.println("Enter the operator");
		char op = scan.next().charAt(0);
		double result;
		String answer;

		switch (op) {
		case '+':
			result = n1 + n2;
			break;

		case '-':
			result = n1 - n2;
			break;

		case '*':
			result = n1 * n2;
			break;

		case '/':
			result = n1 / n2;
			break;

		default:
			answer = "Invalid";
			result = 0;
			System.out.println("Your numbers are " + answer);
		}
		System.out.println("The " + op + " of two numbers " + n1 + " and " + n2 + " is " + result);

	}

}
