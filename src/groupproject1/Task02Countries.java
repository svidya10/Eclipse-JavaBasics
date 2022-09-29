package groupproject1;

import java.util.Scanner;

public class Task02Countries {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of countries. When an array is created,
		 * retrieve all values from it and while retrieving those values print capital
		 * for each country. (use 2 different loops).
		 */
		Scanner scan = new Scanner(System.in);
		String[] countries = new String[] { "United States", "India", "Canada", "United Kingdom" };
		String[] capitals = new String[] { "Washington DC", "New Delhi", "Ottawa", "London" };
		int size=0;

		do {
			System.out.println("Please enter your number of countries between 1-4 to process");
			size = scan.nextInt();

			if (size > (countries.length - 1)) {
				System.out.println("Please give a valid size");
			}
		} while (size > (countries.length - 1));
		
		String[] countryInput = new String[size];
		scan.nextLine();

		System.out.println(
				"Please enter your country name from the list\n 1. United States \n 2. India \n 3. Canada \n 4. United Kingdom");
		for (int i = 0; i < size; i++) {
			countryInput[i] = scan.nextLine();
		}

		for (int i = 0; i < size; i++) {
			boolean countryPresent = false;
			for (int j = 0; j < countries.length; j++) {
				if (countryInput[i].equalsIgnoreCase(countries[j])) {
					System.out.println("Capital city of " + countryInput[i] + " is " + capitals[j]);
					countryPresent = true;
					break;
				}
			}
			if (countryPresent == false) {
				System.out.println("Entered country " + countryInput[i] + " is not present");
			}

		}
	}

}
