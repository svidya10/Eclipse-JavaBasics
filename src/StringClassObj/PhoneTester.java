package StringClassObj;

public class PhoneTester {

	public static void main(String[] args) {
		/*
		 * if class who's object we are creating is present inside the same package, we
		 * don't need to import it
		 */

		Phone iphone = new Phone();
		iphone.make = "Apple";
		iphone.model = "Iphone 14 Pro Max";
		iphone.year = 2022;
		iphone.storage = 128;
		iphone.makeCall();

		// new Phone() => To create the Object
		Phone samsungPhone = new Phone();
		samsungPhone.model = "S22 Ultra";
		samsungPhone.make = "Samsung";
		samsungPhone.year = 2022;
		samsungPhone.makeCall();

	}

}
