package StringClass;

public class Hw6Swap {

	public static void main(String[] args) {
		//How would you swap 2 strings without a temporary variable?
		String s1 = "Vidya";
		String s2 = "Srinivasan";
		
		System.out.println("Before swap s1 = "+s1);
		System.out.println("Before swap s2 = "+s2);
		
		s1 = s1+s2;
		s2 = s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println("---------------------------");
		System.out.println("After swap s1 = "+s1);
		System.out.println("After swap s2 = "+s2);

	}

}
