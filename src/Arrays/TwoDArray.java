package Arrays;

public class TwoDArray {

	public static void main(String[] args) {

		int[][] twoD = new int[3][4];
		// first row
		twoD[0][0] = 10;
		twoD[0][1] = 20;
		twoD[0][2] = 30;
		twoD[0][3] = 40;
		// second row
		twoD[1][0] = 100;
		twoD[1][1] = 200;
		twoD[1][2] = 300;
		twoD[1][3] = 400;
		// third row
		twoD[2][0] = 1;
		twoD[2][1] = 2;
		twoD[2][2] = 3;
		twoD[2][3] = 4;
		
		for(int i=0; i<twoD.length; i++) {
			for(int j=0; j<twoD[i].length;j++) {
				System.out.println(twoD[i][j]);				
			}
		}
		System.out.println("***********************************");

		for (int[] row : twoD) {
			for (int value : row) {

				System.out.println(value);
			}
		}

	}

}
