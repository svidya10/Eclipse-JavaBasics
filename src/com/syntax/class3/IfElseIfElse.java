package com.syntax.class3;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String abc = s.nextLine();
		System.out.println(abc);
		String r = s.nextLine();
		System.out.println(r);
		char xyz = abc.charAt(0);
		
		String phone = "Nokia";

		if (phone.equals("iPhone"))
			System.out.println("iPhone");
		else if (phone.equals("Samsung"))
			System.out.println("Samsung");
		else if (phone.equals("Motorola"))
			System.out.println("Motorola");
		else
			System.out.println("unknown phone");

		System.out.println("Out of the loop");

	}

}
