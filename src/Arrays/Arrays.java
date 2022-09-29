package Arrays;

public class Arrays {

	public static void main(String[] args) {
		/*Arrays >> collections of similar data types
		 * Fixed size can't change during run time
		 */
		int [] a = new int[4];
		//{1,2,3,4,8};
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		System.out.println(a[2]);
		
		String[] name = new String[2];
		name[0] = "Vidya";
		name[1] = "Hello";
		
		System.out.println(name[1]+name[0]);
		
		int [] nums = new int[3];
		nums[1] = 30;
		nums[2] = 20;
		System.out.println(nums[0]);
		
		String[] drink = {"milk","tea","coffee","juice"};
		double size = drink.length;
		System.out.println(drink[2]+size);
		
		
	}

}
