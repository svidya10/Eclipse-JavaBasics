package Arrays;

public class Hw1Cars {

	public static void main(String[] args) {
		// 1. Create an array of cars and store 6 elements into it.
		// Using 2 different loops print all values from the array.
		String[] cars = { "BMW", "Benz", "Honda", "Acura", "Toyota", "Audi" };
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("*****************************************");
		for (String brand : cars) {
			System.out.println(brand);
		}

	}

}
