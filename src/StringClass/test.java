package StringClass;

public class Test {

	//static String surround (String s, String search_term){
	void a() {
	    String s = ("abcaydajak");
	    s = s.replaceAll("[a]", "()");
	    System.out.println(s);
	  }
		//test case below (dont change):
		public static void main(String[] args){
			Test obj = new Test();
			obj.a();
			/*
			 * System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
			 * System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
			 */		}

}
