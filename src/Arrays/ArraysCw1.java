package Arrays;

public class ArraysCw1 {

	public static void main(String[] args) {
		// Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		char[] grade = new char[6];
		grade[0] = 'A';
		grade[1] = 'B';
		grade[2] = 'C';
		grade[3] = 'D';
		grade[4] = 'E';
		grade[5] = 'F';
		System.out.println(grade[0]+""+grade[1]+""+grade[2]+""+grade[3]+""+grade[4]+""+grade[5]);

		char g[] = {'A','B','C','D','E','F'};
		System.out.println(g[0]+""+g[1]+""+g[2]+""+g[3]+""+g[4]+""+g[5]);
	}

}
