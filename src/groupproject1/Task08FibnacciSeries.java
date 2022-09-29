package groupproject1;

public class Task08FibnacciSeries {

	public static void main(String[] args) {
		// Fibonacci series >> First number 0 and second number 1 => 0+1 = 1
		// first number+second number = sum; next sum = previous number + next number
		// 0,1,1,2,3,5
		 int range = 10;
		    int firstNum = 0;
		    int secNum = 1;
		    int sum=0;
		    
		    System.out.print(firstNum+" ");
		    System.out.print(secNum+" ");
		    
		    for(int i=1; i<range; i++)
		    {
			    sum = firstNum + secNum;
			    firstNum=secNum;
			    secNum=sum;
			    System.out.print(sum+" ");  
		    
			}

	}

}
