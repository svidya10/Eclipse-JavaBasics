package com.syntax.homework;

import java.util.Scanner;

public class Hw2Grades {

	public static void main(String[] args) {
		/*Allow user to enter grade (A, B, or C etc...) and 
		 * then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, 
		 * any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user 
		 * with explanation. 
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your grade");
		char grade = scan.next().charAt(0);
		String performance;
		
			switch (grade) {
				case 'A':
				performance = "Excellent";
				break;
				 
				case'B':
				performance = "Good";
				break;
				
				case 'C':
				performance = "Average";
				break;
				
				case 'D':
				performance = "Bad";
				
				default:
				performance ="Not Acceptable";
					
			}
			System.out.println(grade +"-"+performance);
		
	}

}
