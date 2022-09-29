package StringClass;

public class Hw5Palindrome {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not? aba=> true Abbc =>false
		String s = "abaajkjaaba";
		StringBuilder rev = new StringBuilder(s);
		rev.reverse();
		String str = rev.toString();

		if (str.equals(s)) {
			System.out.println("String is a palindrome");
		} else {
			System.out.println("String not a palindrome");
		}
	}
}
