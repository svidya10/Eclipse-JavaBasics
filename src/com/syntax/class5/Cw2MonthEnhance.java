package com.syntax.class5;

import java.util.Scanner;

public class Cw2MonthEnhance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your birth month");
		String month = scan.next();
		String season;
				
		if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			season="Spring";
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
				|| month.equalsIgnoreCase("August")) {
			season = "Summer";
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				|| month.equalsIgnoreCase("November")) {
			season = "Fall";
		} else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")
				|| month.equalsIgnoreCase("Feburary")) {
			season = "Winter";
		}
		else {
			System.out.println("Invalid month");
			season="Invalid";
		}
		System.out.println(season);
	}

}
