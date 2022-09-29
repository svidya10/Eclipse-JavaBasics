package com.syntax.class7;

public class Hw4PrintOdd {

	public static void main(String[] args) {
		// Print odd numbers between 20 and 50 (2 ways)
		int a = 20;
		while (a<=50) {
			if (a%2!=0) {
				System.out.println(a);
			}
			a++;
		}
		System.out.println("------------------");
		
		int b = 21;
		while (b<=50) {
			System.out.println(b);
			b+=2;
		}

	}

}
