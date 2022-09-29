package groupproject1;

public class Task11Duplicate {

	public static void main(String[] args) {
		// Write a program to print out duplicate elements from
		// an Array of Strings?
		String[] arr = { "Apple", "Google", "Facebook", "Amazon", "Microsoft", "Amazon"};

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j])) {
					count++;	
				}
			}
			if (count > 0) {
				System.out.println("Duplicate String " + arr[i]);
			}
		}

	}

}
