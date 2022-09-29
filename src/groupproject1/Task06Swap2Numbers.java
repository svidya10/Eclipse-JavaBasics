package groupproject1;

public class Task06Swap2Numbers {

	public static void main(String[] args) {
		//  Write a program to swap 2 numbers without a temporary variable
		int x = 10;
		int y = 5;
		System.out.println("Value of x before swap = "+x);
		System.out.println("Value of y before swap = "+y);
		//To swap
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("Value of x after swap  = "+x);
		System.out.println("Value of y after swap  = "+y);

	}

}
