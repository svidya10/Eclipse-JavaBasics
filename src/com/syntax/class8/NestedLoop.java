package com.syntax.class8;

public class NestedLoop {

	public static void main(String[] args) {
		// multiplication table
		for(int i=1;i<=2;i++) {
			for (int j=1; j<=9; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println("..........................");
		}
		
		for (int i=10; i>=0; i-- ) {
		      if (i%2==0) {
		        System.out.println(i);
		      }
		    }

	}

}
