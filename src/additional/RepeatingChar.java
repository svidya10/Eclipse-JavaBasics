package additional;

import java.util.Scanner;

public class RepeatingChar {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter your phrase");
		String s =scan.nextLine();
		System.out.println("Please enter the Character you want to find the repetition");
		char c = scan.nextLine().charAt(0);
		
		System.out.println(findRepeatingCharacter(s, c));
	}
	public static int findRepeatingCharacter(String s,char c) {
		int count =0;
		for(int i=0;i<=s.length()-1;i++) {
			if(c==s.charAt(i)) {
				count++;
			}
		}
		return count;

	}

}
