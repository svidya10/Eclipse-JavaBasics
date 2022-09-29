package com.syntax.loopsHw;

public class NestedTime2loops {

	public static void main(String[] args) {
		// Nested loop for time 00:00 with two loops

		for (int h = 0; h <= 23; h++) {

			for (int m = 0; m <= 59; m++) {

				if (m >= 0 && m <= 9) {
					if (h >= 0 && h <= 9) {
						System.out.println("0" + h + ":" + "0" + m);
					} else {
						System.out.println(h + ":" + "0" + m);
					}
				} else if (h >= 0 && h <= 9) {
					System.out.println("0" + h + ":" + m);
				} else
					System.out.println(h + ":" + m);
			}
		}
	}
}
