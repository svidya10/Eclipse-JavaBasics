package com.syntax.class3;

public class NestedIfCondition {

	public static void main(String[] args) {
		int time = 6;
		String day = "Sunday";

		if (day.equals("Monday")) {
			if (time > 7) {
				System.out.println("Go to Office");
			}
		} else {
			System.out.println("Stay home");
		}

	}

}
