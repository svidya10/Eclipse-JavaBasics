package com.syntax.class3;

import java.util.Scanner;

public class ScannerCW1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Age");
		int age = scan.nextInt();
		
		if (age>18)
		{
			System.out.println("Go to work");
		}
		else
		{
			System.out.println("Wait till you complete 18");
		}
		

	}

}
