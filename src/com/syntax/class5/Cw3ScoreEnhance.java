package com.syntax.class5;

import java.util.Scanner;

public class Cw3ScoreEnhance {

	public static void main(String[] args) {
		/*Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter quiz score");
		int quiz = scan.nextInt();
		System.out.println("Enter midterm score");
		int midTerm = scan.nextInt();
		System.out.println("Enter final score");
		int finalScore = scan.nextInt();
		
		int average = (quiz+midTerm+finalScore)/3;
		String grade=null;
		
		if (average>=90 && average<=100) {
			grade = "Grade A";
		}
		else if (average>=70 && average<90) {
			grade = "Grade B";
		}
		else if (average>=50 && average<70) {
			grade = "Grade C";
		}
		else if (average<50 && average>0) {
			grade = "Grade F";
		}
		else {
			System.out.println("Invalid");
		}
		System.out.println(grade);	

	}

}
