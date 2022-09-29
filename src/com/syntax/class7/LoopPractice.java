package com.syntax.class7;

public class LoopPractice {

	public static void main(String[] args) {
		// Print number from 100 to1
		int num = 100;
		while (num>=1) {
			System.out.print("num"+num);
			num--;
		}
		// Print even numbers from 20 to 100
		int a = 20;
		while (a<=100) {
			if (a%2==0) {
				System.out.println(a);
			}
			a++;			
		}
		//Print only odd numbers from 100 to 1 - MOD way
		int b = 100;
		while (b>=1) {
			if (b%2!=0) {
				System.out.println("B"+b);
			}
			b--;
			}
		//Print only odd numbers from 100 to 1 - (+1)
		int c = 99;
		while (c>=1) {
			System.out.println("C"+c);
			c-=2;
		}
		
	}

}
