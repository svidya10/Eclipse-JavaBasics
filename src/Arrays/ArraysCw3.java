package Arrays;

public class ArraysCw3 {

	public static void main(String[] args) {
		// Create an array of words: Java, Saturday, day, coding, is. 
		//Print the following sentence using elements of array: “Saturday is Java coding Day”.
		String[] w = new String[5];
		w[0]= "Java";
		w[1] = "Saturday";
		w[2] = "day";
		w[3] = "coding";
		w[4] = "is";
		System.out.println(w[1]+" "+w[4]+" "+w[0]+" "+w[3]+" "+w[2]);
	}

}
