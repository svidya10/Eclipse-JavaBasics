package com.syntax.class3;

public class TemperatureCheck {

	public static void main(String[] args) {
		// Temperature check
		
		double temp = 55.55;
		int celcius = (int)temp;
		System.out.println(celcius);
		if (celcius<32)
			System.out.println("Water will freeze with temperature");
		else 
			System.out.println("Water will not freeze with temperature");
	}

}
