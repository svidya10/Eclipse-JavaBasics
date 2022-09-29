package StringClass;

import java.util.Arrays;

public class Hw3Sentences {

	public static void main(String[] args) {
		/*
		 * You have a String a=”Is it saturday? Is it raining? Do we have a Java Class
		 * today?” How would you find out how many sentences are in that String?
		 */
		String s = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] sen = s.split("[?]");
		System.out.println(Arrays.toString(sen));
		System.out.println("There are " + sen.length + " sentences in this String. And they are:");
		for (int i = 0; i < sen.length; i++) {
			System.out.println(i + 1 + ". " + sen[i].trim());
		}
	}

}
