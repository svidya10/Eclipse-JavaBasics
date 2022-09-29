package StringTasks;

import java.util.Arrays;

public class Hw3Sunday {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday → yadnuS).
		String s = "Srinivasan";
		for(int i=s.length()-1;i>=0; i--) {
			System.out.print(s.charAt(i));
		}
		
		char[] cArr = s.toCharArray();
		for(int i=cArr.length-1; i>=0;i--) {
			System.out.print(cArr[i]);
		}
		
		/*
		char[] charArr = s.toCharArray();
		System.out.println(Arrays.toString(charArr));
		System.out.println(charArr);
		
		int n = s.indexOf("a",7);
		System.out.println(n);
	*/
	}

}
