package StringClass;

public class Hw2AlphaNumeric {

	public static void main(String[] args) {
		// Create a String that should be combination of letters, numbers and special
		// characters.
		// Find out how many Alphanumeric(abd AZ 284) characters are there in the
		// String.
		String s = "ABCDEFG 12345 @#$%^& lmnopqrst";
		String aN = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(aN);
		System.out.println(aN.length());

	}

}
