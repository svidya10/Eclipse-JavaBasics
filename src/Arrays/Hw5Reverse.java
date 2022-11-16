package Arrays;

public class Hw5Reverse {

	public static void main(String[] args) {
		/*
		 * // 5. Create an array to store char values and then print those in reverse
		 * order char[] letters = { 'a', 'b', 'c', 'd', 'e' }; for (int i =
		 * letters.length - 1; i >= 0; i--) { System.out.println(letters[i]); }
		 */
		String s = "hello";
		String rev="";
		for(int i=s.length()-1;i<=0;i--) {
		rev = rev+s.charAt(i);
			
		}
		System.out.println(rev);
	}

}
