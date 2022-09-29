package com.syntax.class5;

public class SwitchCase {

	public static void main(String[] args) {
		
	 int day=1;
	 String name=null;
	 
	 switch (day) {
	 case 1:	
		 name = "Monday";
		 //break;
	 case 2:	
		 name = "Tuesday";
		 //break;
	 case 3:
		 name="Wednesday";
		 //break;
	 case 4:
		 name="Thursday";
		 //break;
	 case 5:
		 name ="Friday";
		 //break;
	 case 6:
		 name = "Saturday";
	 case 7:
		 name= "Sunday";
	
	 default: 
	    System.out.println("Please enter a valid day number(1-7)");
	}
	 System.out.println(name);
}

}
