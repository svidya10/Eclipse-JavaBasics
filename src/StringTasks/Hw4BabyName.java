package StringTasks;

import java.util.Scanner;

public class Hw4BabyName {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people's first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby: Example Output: Mom’s
		 * first name? Mary Dad’s first name? Daniel Boy or Girl? boy Suggested baby
		 * name: DANRY
		 * 
		 * Example Output: Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl?
		 * girl Suggested baby name: MAIEL
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter Dad's name");
		String dad = scan.nextLine();
		System.out.println("Please enter Mom's name");
		String mom = scan.nextLine();
		System.out.println("Are expecting a boy or a girl");
		String baby = scan.nextLine();
		String dName;
		String mName;

		if (baby.equalsIgnoreCase("boy")) {
			dName = dad.substring(0, (dad.length() + 1) / 2);
			mName = mom.substring(mom.length() / 2);
			System.out.println(dName.concat(mName).toUpperCase());
		} else if (baby.equalsIgnoreCase("girl")) {
			mName = mom.substring(0, (mom.length() + 1) / 2);
			dName = dad.substring(dad.length() / 2);
			System.out.println(mName.concat(dName).toUpperCase());
		} else {
			System.out.println("Invalid Input for baby");
		}
	}
}
