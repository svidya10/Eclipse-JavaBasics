package com.syntax.class3;
import java.util.Scanner;
public class Hw1gpa {
	public static void main(String[] args) {
		/*Write a program to store a boolean value of whether user has diploma or not. 
		 * If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree. 
		 * Then if user has a degree program should check a gpa score. If gpa score is higher or equals to 3.5 → 
		 * output should say “You are eligible for scholarship”, otherwise → “You should have studied harder” .
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you have a diploma - true or false");
		boolean diploma = scan.nextBoolean();
		
		if (diploma) 
		{
			System.out.println("Congratulations");
			System.out.println("Please enter your GPA");
			double gpa = scan.nextDouble();
			if (gpa>=3.5) 
				System.out.println("You are eligible for scholarship");
			    else 
				System.out.println("You have to study harder");			      
		}
		else
			System.out.println("Suggest to get a degree");
	}			
}
