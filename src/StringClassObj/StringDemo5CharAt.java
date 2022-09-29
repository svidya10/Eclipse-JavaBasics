package StringClassObj;

public class StringDemo5CharAt {

	public static void main(String[] args) {

		String str = "I love java programming";
		/*
		 * charAt returns us the character at a specific index
		 */
		System.out.println(str.charAt(3));

		for (int i = 0; i < str.length(); i++) {
			// print only the characters not spaces
			if (!(str.charAt(i) == ' ')) {
				System.out.println(str.charAt(i));
			}

		}

	}
}
