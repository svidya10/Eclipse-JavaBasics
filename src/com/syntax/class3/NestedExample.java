package com.syntax.class3;

public class NestedExample {
	public static void main (String[] args) {
		
		double money = 10000;
		String season = "Spring";
		
		if (season.equals("Spring")) 
		{
		
			if(money>30000) 
			{
				System.out.println("Lets go vacation");
			}
			else 
			{ 
				System.out.println("Save more");
			}
	
		}
		else {
			System.out.println("Not right season");
	}
	}
}
