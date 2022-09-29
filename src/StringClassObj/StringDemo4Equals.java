package StringClassObj;

public class StringDemo4Equals {

	public static void main(String[] args) {
		// Str1 = Str2 >> compares address numbers not the value. Will compare memory addresses
		// Str1.equals(str2) >> compares values inside
		   String str="Shah";
	        String str2="Shah";
	        String str3=new String("Shah");

	        if(str.equals("shah")) {
	            System.out.println("I found it");
	        }
	        /*
	         * equals checks if two Strings are exactly the same with exact same case
	         * equalsIgnoreCase checks if two Strings are exactly the same but does not care about the
	         * case of letters
	         */ 
	        if(str.equalsIgnoreCase("shah")) {
	            System.out.println("I found it with equalsIgnoreCase");
	        }
	}

}
