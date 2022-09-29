package Arrays;

public class Hw4LargestNum {

	public static void main(String[] args) {
		// 4. From an array of integer elements find the largest number.
		int[] n = { 499, 2098, 55, 890, 56, 76 };
		int large = n[0];
		for (int i = 1; i < n.length; i++) {
			if (n[i] > large) {
				large = n[i];
			}
		}
		System.out.println("Largest number is : " + large);
		System.out.println("*****************************");
		int enhancedLarge=n[0];
		for(int store:n) {
			if(store>enhancedLarge) {
				enhancedLarge=store;
			}
		}
		System.out.println(enhancedLarge);
	}
}
