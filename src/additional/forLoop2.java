package additional;

public class forLoop2 {

	public static void main(String[] args) {
		/* print 10 8 6 4 2 0
		for (int i=10; i!=-1; i-=2) {
			System.out.println(i);
		}*/
		System.out.println("**********************************");
		// 9 5 1
		for (int i =9; i>=1; i-=4) {
			
			System.out.println(i);
			
		}
		System.out.println("___________________________");
		//1 3 7 9
			for (int i=1; i<=9; i+=2) {
				//if(i==5) {
					//continue;
				//}
				if (i!=5)
				System.out.println(i);
		}
	}

}
