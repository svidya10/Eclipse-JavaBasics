package com.syntax.class3;

import java.util.Scanner;

public class Hw7Salary {

	public static void main(String[] args) {
		/*Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not. 
		 * Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your worked years");
		int years = scan.nextInt();
	
		if (years>=5) {
			System.out.println("You are eligible for bonus");
			System.out.println("Annual Salary");
			double salary = scan.nextDouble();
		     if (salary>50000)
		    	 System.out.println("Your bonus is 5000");
		     else
		    	 System.out.println("Your bonus is 3000");  
		}
		else
			System.out.println("You are no eligible for bonus");
		     
	}

}
