package com.syntax.class7;

import java.util.Scanner;

public class SecretNumber {

	public static void main(String[] args) {
		//Create a secret number and let user guess the secret number 
		//once user guessed your secret number--> program says you won!
		
		Scanner scan = new Scanner(System.in);
		int secret = 5;
		int userNo;
		
		do {
			System.out.println("Guess a secret number between 1 and 10");
			userNo = scan.nextInt();
			if(secret!=userNo) {
				System.out.println("Guess again!");
			}
		}while(secret!=userNo);
		System.out.println("You won!");
	}

}
