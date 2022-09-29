package Arrays;

public class TwoDStringPrinting {

	public static void main(String[] args) {
		// Create a 2D array (longer way)where you will store the following values: 
		//Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print following String:
		//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		
		String[][] n = new String[2][4];
		n[0][0] = "Mr";
		n[0][1] = "Mrs";
		n[0][2] = "Ms";
		n[0][3] = "Miss";
		
		n[1][0] = "Smith";
		n[1][1] = "Jordan";
		n[1][2] = "Jackson";
		n[1][3] = "Obama";
		
		System.out.println(n[0][1]+" "+n[1][0]+"\n"+n[0][0]+" "+n[1][3]+"\n"+n[0][2]+" "+n[1][2]+"\n"+n[0][3]+" "+n[1][2]);
		
		String[][] name = {{"Mr","Mrs","Ms","Miss"},
						   {"Smith","Jordan","Jackson","Obama"}};
		
		System.out.println(name[1][0]);
		

	}

}


