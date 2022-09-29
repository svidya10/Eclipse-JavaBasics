package additional;

public class Prime {

	public static void main(String[] args) {
		int givenNumber=3;
        boolean isPrime=true;
        if(givenNumber>1) {
            for(int i=2; i<givenNumber; i++) {
                if (givenNumber%i==0) {
                    isPrime=false;
                }
            }
        }else {
            isPrime=false;
        }
        System.out.println("Is "+givenNumber+" is prime :"+isPrime);

	}

}
