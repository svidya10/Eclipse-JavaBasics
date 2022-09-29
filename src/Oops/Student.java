package Oops;

public class Student {

	// public static void main(String[] args) {
		String name;
		String id;
		int age;
		double weight;
		char gender;

	void study() {
		System.out.println("Student is studying");
	}
	void lazy() {
		System.out.println("Lazy student");
	}
	
	void prepare() {
		System.out.println("Prepare for exams");
	}
	
	public static void main (String[] args) {
		Student s = new Student();
		//System.out.println(s.name);
		s.prepare();
		s.study();
		
	}


}
