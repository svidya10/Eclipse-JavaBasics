package StringClass;

public class Hw1Space {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. Write a program to get a new
		// String without any spaces.
		String s = "I am learning java";
		System.out.println(s);
		System.out.println(s.replaceAll(" ", ""));
	}

}
