package Oops;

public class Hw1Phone {
	/*Create a Class “Phone”. 
	 * Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.
	 * 
	 */
	String name;
	int model;
	int price;
	String camera;

	String videoCall (String n) {
		System.out.println("Can perform video calling with voice assist using"+name+" "+model);
		System.out.println(n);
		return n;
	}
	void takePhoto () {
		System.out.println("Taking Photo is easy with "+name+" "+camera);
	}
public static void main(String[] args) {
	Hw1Phone iPhone = new Hw1Phone();
	iPhone.name = "iPhone 14";
	iPhone.model= 1400;
	iPhone.price = 1800;
	iPhone.camera = "25X";
			
	String s = iPhone.videoCall("Call");
	iPhone.takePhoto();
	
	
}
	
}
