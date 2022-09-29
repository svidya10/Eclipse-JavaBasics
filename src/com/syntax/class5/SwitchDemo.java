package com.syntax.class5;

public class SwitchDemo {

	public static void main(String[] args) {
		//Limitation of the switch case:
        //switch case can not use logical operators
        //switch case can not use relational operators
		// matching cases must of same data types as a variable
        //no duplicate cases in switch
		//cannot work with boolean values
		
		char choice = 'Z';
		String ans;
		
		switch(choice) {
		case 'Y':
			ans = "Yes";
			break;
		case 'N':
			ans = "No";
			break;
		case 'M':
			ans = "Maybe";
			break;
		default:
			System.out.println("Invalid");
			ans = "Unknown";
		}
		System.out.println(ans);
	}
}
