package groupproject1;

import java.util.Scanner;

public class Task01SumIntScanner {

	public static void main(String[] args) {
		/* Using Scanner create an array of integer values. After
			the array is created, calculate the sum of all stored
			elements in that array. 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide number of elements");
		int length = scan.nextInt();
		String[] arr11 = new String[] {};
		int[] arr = new int[length];
		
		for (int i=0; i<length; i++) {
			System.out.println("Please enter your "+i+"th element");
			arr[i]=scan.nextInt();
		}
		int sum = 0;
		for(int i=0; i<length; i++) {
			sum+= arr[i];
		}
		System.out.println("The sum of integers in Array is "+sum);		
	}

}
