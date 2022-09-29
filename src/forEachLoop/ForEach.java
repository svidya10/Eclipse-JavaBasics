package forEachLoop;

public class ForEach {

	public static void main(String[] args) {
		// For each can be used only with Arrays and collections
		//for each/enhanced for loop/ advanced for loop
		String[] ice = {"vanila","mango","coffee"};
		for( String flavor :ice) {
			System.out.println(flavor);
			System.out.println(ice.length);
			System.out.println(flavor.length());
		}

	}

}
