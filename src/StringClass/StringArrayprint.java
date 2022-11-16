package StringClass;

import java.util.Scanner;

public class StringArrayprint {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String[] user = new String[5];

		for (int i = 0; i < user.length; i++) {
			System.out.print("In:");
			user[i] = inp.nextLine();
			System.out.println(user[i]);
		}

		for (int i = 0; i < user.length; i++) {
			System.out.println(user[i].substring(0, 3));
		}

	}

}
