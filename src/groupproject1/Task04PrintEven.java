package groupproject1;

public class Task04PrintEven {

	public static void main(String[] args) {
		// Create a 2D array or integer type where you will store
		// odd and even numbers. Develop a program which will
		// identify/print the even numbers only.

		int[][] arr = { { 1, 12, 13, 15, 55 }, { 21, 21, 21, 21, 21 } };
		// System.out.println("Even numbers in the array are ");
		boolean even = false;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 == 0) {
					System.out.print(arr[i][j] + " ");
					even = true;
				}
			}

		}
		if (even != true) {
			System.out.println("There are no even numbers");
		}

	}

}
