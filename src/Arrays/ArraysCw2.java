package Arrays;

public class ArraysCw2 {

	public static void main(String[] args) {
		// Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
		String[] n1 = new String[3];
		n1[0] = "Mickey";
		n1[1] = "Mini";
		n1[2] = "Donald";
		System.out.println(n1[0]+" "+n1[1]+" "+n1[2]);
		
		String n2[] = {"Mickey","Mini","Donald"};
		System.out.println(n2[0]+" "+n2[1]+" "+n2[2]);

	}

}
