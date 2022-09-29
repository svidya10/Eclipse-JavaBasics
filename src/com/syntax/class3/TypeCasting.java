package com.syntax.class3;

public class TypeCasting {

	public static void main(String[] args) {
		// Forced conversion - type casting - convert one data type to another
		/* byte = 8bits
		 * short = 16 bits
		 * int = 32 bits
		 * long = 64 bits
		 * 
		 * float = 7 decimal places
		 * double = 15 decimal places
		 * 
		 * char = '';
		 * boolean - true or false
		 * 
		 * String = keywords, space, starting with number , special character except $ and _
		 */
		int n1 = (int) 10.5;
		System.out.println(n1);
		// large value to fit in smaller box - error
		byte b1 = 127;
		short b2 = 3333;
		int  b3 =45454545;
		long b4 = 4545455;
		float b5 = 23273282;
		double b6 = 232434434;
		byte small = (byte) b2;
		System.out.println(small);
		byte big = (byte) b2;
		System.out.println(big);
		char a = (char) 67;
		System.out.println(a);
		
		

	}

}
