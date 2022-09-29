package com.syntax.class7;

public class ForOddEven {

	public static void main(String[] args) {
		// from the range of 1 to 50. find the sum of all even and odd numbers
		int sumEven = 0;
		int sumOdd = 0;
		for (int i=1; i<=50; i++) {
			if(i%2==0) {
				sumEven += i;
			}
			else {
				sumOdd += i;
			}
		}
		System.out.println("Sum of all even numbers from 1 to 50 "+sumEven);
		System.out.println("Sum of all odd numbers from 1 to 50 "+sumOdd);
	}

}
