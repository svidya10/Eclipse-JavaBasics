package com.syntax.class7;

public class Hw3PrintEven {

	public static void main(String[] args) {
		// Print even numbers from 20 to 1 (2 ways)
		int a = 20;
		while (a>=1) {
			if(a%2==0) {
			System.out.println(a);
			}
			a--;
		}
		System.out.println("-------------------");
		
		int b = 20;
		while (b>=1) {
			System.out.println(b);
			b-=2;
		}
	}

}
