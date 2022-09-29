package com.syntax.class7;

public class Loops {

	public static void main(String[] args) {

		int time = 0;
		/*
		 * 
		 * for (int i = 0; i <= 12; i++) { //time++; System.out.println("Good Morning");
		 * }
		 */

		while (time < 6) {
			time += 1;
			System.out.println("GM");
		}
		int b = 10;
		while (b >= 1) {
			System.out.print(b--);
		}

		// print all numbers from 50 to 20
		int a = 50;

		while (a >= 20) {
			System.out.println(a--);
		}

		// print all even numbers from 1 to 20
		int c = 1;

		while (c <= 20 ) {
			//if (c % 2 == 0) {
				System.out.print(c + " ");
				
			//}
			c++;
		}
	}

}
