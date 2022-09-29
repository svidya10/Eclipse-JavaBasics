package groupproject1;

public class Task07PrimeNumber {

	public static void main(String[] args) {
		// given number is prime or not
		int n = 21;
		
		if (n == 1)
			System.out.println("Neither prime nor composite");
		else {
			boolean prime = true;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					System.out.println(n + " is Not Prime");
					prime = false;
					break;
				}
			}

			if (prime)
				System.out.println(n+ " is Prime");
		}
	}

}
