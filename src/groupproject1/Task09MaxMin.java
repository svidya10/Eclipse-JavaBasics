package groupproject1;

public class Task09MaxMin {

	public static void main(String[] args) {
		//  Maximum and minimum number in the array?
		int[] arr = {12,12,-2,1,7,8,9,-10};
	
		int max =arr[0];
		int min =arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			else if (arr[i]<min) {
				min= arr[i];
			}
		}
		System.out.println("Max number is "+max+" and min number is "+min);

	}

}
