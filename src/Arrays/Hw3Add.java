package Arrays;

public class Hw3Add {

	public static void main(String[] args) {
		// 3. Create an array on integers and calculate the sum of all elements in an
		// array
		int[] nums = { 10, 30, 45, 50, 5 };
		int add = nums[0] + nums[1] + nums[2] + nums[3] + nums[4];
		System.out.println(add);
		System.out.println("*********************");

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
		System.out.println("***************************");
		
		sum = 0;
		for(int cal:nums) {
			sum+=cal;
		}
		System.out.println(sum);
	}

}
