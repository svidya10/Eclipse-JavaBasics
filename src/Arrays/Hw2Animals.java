package Arrays;

import java.util.Scanner;

public class Hw2Animals {

	public static void main(String[] args) {
		// 2. Create an array of animals and store 5 elements into it.
		// Using 2 different loops print all elements from the array.
		String[] animals = { "dog", "cat", "tiger", "lion", "deer" };
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
		System.out.println("**************************");
		for (String names : animals) {
			System.out.println(names);
		}
		
		 String[] arr = new String[8];
		    Scanner scan = new Scanner(System.in);
		    
		    for(int i=0;i<arr.length; i++) {
		      System.out.println("Please enter day "+(i+1)+" of the week");
		      arr[i] = scan.nextLine();
		      System.out.println(arr[i]);
		    }

	}

}
