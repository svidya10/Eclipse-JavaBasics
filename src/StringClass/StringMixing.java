package StringClass;

import java.util.Arrays;

public class StringMixing {

	static String mixString(String s1, String s2) {
		String s = "";
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				s = s + s1.charAt(i) + s2.charAt(i);
			}
		}
		return s;
	}

	public static void main(String[] args) {
		String firstValue = mixString("12345", "abcde");
		System.out.println(firstValue);
		String secondValue = mixString("howdy", "hello");
		System.out.println(secondValue);
	}
}
