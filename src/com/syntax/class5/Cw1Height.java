package com.syntax.class5;

import java.util.Scanner;

public class Cw1Height {

	public static void main(String[] args) {

		float f1 = 5.3f;
		double f2 = 5.3;
		
		System.out.println("f1:"+ f1);
		System.out.println("f2:"+ f2);
		
		if (f1 == f2) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}
		
		float f = 75.0f;
		double d = 75.0;
		int i = 75;

		if (f == d) {
			if (f == i) {
				System.out.println("f, d and i are equal");
			} else {
				System.out.println("f, d are equal but i is not equal");
			}

		} else {
			System.out.println("f and d are not equal");
		}

		/*
		 * 1. Prompt the user to enter person heights in inches. Person should be
		 * classified as one of the following: • short (under 60 inch) • medium(between
		 * 60 -72 inch) • tall (over 72 inch)
		 */
		/*
		 * int ii = 78; double d = 78.0; float f = 78.0f;
		 * 
		 * if (d==f) { System.out.println("E"); } else System.out.println("unknown");
		 * 
		 * /* Scanner scan = new Scanner(System.in);
		 * System.out.println("Enter your height in inches"); double h =
		 * scan.nextDouble();
		 * 
		 * if (h < 60) { System.out.println("Short"); } else if (h >= 60 && h <= 72) {
		 * System.out.println("Medium"); } else { System.out.println("Tall"); }
		 */
	}

}
