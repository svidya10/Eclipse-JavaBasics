package com.syntax.class3;

import java.util.Scanner;

public class Hw5Temp {

	public static void main(String[] args) {
		/*Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ” 
	 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter city");
		String city = scan.next();
		System.out.println("Please enter temperature in Fahrenhiet");
		double f = scan.nextDouble();
		
		double celsius = (f-32)*5/9;
		
		System.out.println("Temperature of the city "+city+" is "+celsius);
	}

}
