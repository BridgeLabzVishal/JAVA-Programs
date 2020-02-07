package com.bridgelabz.junit;

/**
 * @Author   :  Vishal Yadav
 * @Version  :  1.0
 * @Date     :  2019/11/17
 * @Purpose   : takes the temperature in fahrenheit as input and output the temperature in Celsius or 
                viceversa using the formula
				Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
				Fahrenheit to Celsius: (°F − 32) x 5/9 = °C
 */
import com.bridgelabz.utility.InputUtility;

public class TemperatureConversion {
	static double celsius;
	static double fahrenheit;

	/**
	 * define tempConversion() function to calculate the temperature in celsius or
	 * vice versa
	 * 
	 * @param choice
	 */
	public static void temperatureConversion(int choice) {

		switch (choice) {
		case 1:
			System.out.println("Enter a temperature in Celsius : ");
			celsius = InputUtility.nextDouble();
			// formula to calculate fahrenheit
			fahrenheit = (celsius * 9 / 5) + 32;
			System.out.println("Celsius temperature is : " + fahrenheit);
			break; // to break the condition

		case 2:
			System.out.println("Enter a temperature in Fahrenheit : ");
			fahrenheit = InputUtility.nextDouble();
			// formula to calculate fahrenheit
			celsius = (fahrenheit - 32) * 5 / 9;
			System.out.println("Celsius temperature is : " + celsius);
			break;
		}
	}

	public static void main(String[] args) {
		// ask user to choose one option
		System.out.println("Choose one option");
		System.out.println("1.Conversion Celsius to Fahrenheit");
		System.out.println("2.Conversion Fahrenheit to Celsius");
		int choice = InputUtility.nextInteger();
		TemperatureConversion.temperatureConversion(choice);
	}
}
