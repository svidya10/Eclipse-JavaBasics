package StringClass;

import java.util.Scanner;

public class test {

		  public static void main(String[] args) {
			  Scanner inp = new Scanner(System.in);
			    System.out.print("In:");
			    String word = inp.nextLine();
			    
			    for(int i =0; i<word.length(); i++) {
				    	
			    	char s = word.charAt(i);
			    	System.out.print(s+" ");
			    	//System.out.print(" ");
			    }
			    

	}
}
