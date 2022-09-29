package com.syntax.class8;

public class breakKeyword {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.println("Hi");
			if (i==3) {
				break;
			}
		}
		System.out.println("End");
	}

}
