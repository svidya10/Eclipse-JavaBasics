package StringTasks;

public class Hw2MiddleCharc {

	public static void main(String[] args) {
		/*
		 * Create a String and if the String is not empty perform the following: if the
		 * String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the String.
		 */
		String s = "Objects";
		int i = 0;
		if (!s.isEmpty()) {
			if ((s.length() % 2 != 0) && s.length() >= 3) {
				i = (s.length() / 2);
				System.out.println(s.charAt(i));
			}

			else {
				System.out.println("Please enter valid text");
			}
		}

	}

}
