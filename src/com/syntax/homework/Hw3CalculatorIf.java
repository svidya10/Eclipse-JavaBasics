package com.syntax.homework;

import java.util.Scanner;

public class Hw3CalculatorIf {

	public static void main(String[] args) {
		/*Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
		 *  Based on operator provide the result to user.
		 *  Please complete this assignment in 2 ways: using if statement and switch case.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first number");
		double n1 = scan.nextDouble();
		System.out.println("Enter your second number");
		double n2 = scan.nextDouble();
		System.out.println("Enter your operator");
		String op = scan.next();
		double result=0;
		String invalid;
		
		if (op.equals("+")) {
			result = n1+n2;
		}
		else if (op.equals("-")) {
			result = n1-n2;
		}
		else if (op.equals("*")) {
			result = n1*n1;
		}
		else if (op.equals("/")) {
			result = n1/n2;
			if (n2<=0) 
				System.out.println("Cannot perform division: denominator <= 0 ");
			}	 
		else {
			invalid = "Invalid number or Operator";
			System.out.println(invalid);
		}
		System.out.println("The result of two numbers "+n1+" and "+n2+" after "+op+" is "+result);
	}

}
