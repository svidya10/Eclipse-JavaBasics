package groupproject1;

public class Task05SumOddEven {

	public static void main(String[] args) {
		// . Create a 2D array of integers. Develop a program
		//which will calculate the sum of even and odd numbers
		//for that array
		int[][] arr = {
				{1,2,3,4,5},
				{11,12,13,14,15}
		};
		int sumE= 0;
		int sumO =0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length; j++) {
				if (arr[i][j]%2==0) {
					sumE = sumE+arr[i][j];	
				}
				 if (arr[i][j]%2!=0){
					sumO = sumO+arr[i][j];
				}
			}
		}
		System.out.println("Sum of all Even numbers in array "+sumE);
		System.out.println("Summ of all Odd numbers in array "+sumO);
		
	}

}
