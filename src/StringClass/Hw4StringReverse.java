package StringClass;

import java.util.Arrays;

public class Hw4StringReverse {

	public static void main(String[] args) {
		/*
		 * How would you reverse a String word by word? for example // input=>This is
		 * sentence i want to reverse // output=>sihT si ecnetnes i tnaw ot esrever
		 */
		String s = "This is the sentence I want to reverse";
		String[] split = s.split(" ");
		System.out.println(Arrays.toString(split));

		for (int i = 0; i < split.length; i++) {
			for (int j = split[i].length() - 1; j >= 0; j--) {
				System.out.print(split[i].charAt(j));
				
			}
			System.out.print(" ");
		}
	}
}
