package groupproject1;

public class Task03ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{10,20,30,40,50}, {100,200,300,400,500}};
		int sum=0;
		
		for(int i=0;i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				sum+= arr[i][j];
			}
		}
		System.out.println("Sum of all numbers in array are "+sum);

	}

}
