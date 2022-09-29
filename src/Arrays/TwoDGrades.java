package Arrays;

public class TwoDGrades {

	public static void main(String[] args) {
		// Create a 2D array(shorter way) in which first array will consist of 4 names
		// and second array will contain grades.
		// Then your program should print name of the students that has A and B grade
		String[][] arr = { { "Yusuf", "Hamza", "Adam", "John" }, { "A", "B", "C", "D" } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		System.out.println("************************");
		
		for (String[] row:arr) {
			for(String col:row) {
				System.out.println(col);
			}
			
		}
		
	}

}
