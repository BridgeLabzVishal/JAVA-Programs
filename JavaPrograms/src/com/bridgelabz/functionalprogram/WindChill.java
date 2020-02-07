package com.bridgelabz.functionalprogram;

/**
 * @author : Vishal Yadav
 * @version : 1.0
 * @date    : 2019/111/17
 * @Purpose :  takes two arguments temperature and windSpeed and prints the wind chill.
                Use Math.pow(a, b) to compute ab. Given the temperature(in Fahrenheit) 
                and the wind speed(in miles per hour),calculate the effective temperature 
                (the wind chill) to be:
                effective temperature = 35.74 + 0.6215 x temperature + (0.4275 x temperature - 35.75) x wnidspeed ^ 0.16 
 */
import com.bridgelabz.utility.Utility;

public class WindChill {
	/**
	 * Define function windChill() to calculate effective temperature
	 * 
	 * @param temperature -->double
	 * @param windSpeed   --> double
	 * @return
	 */
	private static double windChill(double temperature, double windSpeed) {
		if ((temperature > 50) && (windSpeed > 120 || windSpeed < 3)) {
			return -1;
		} else {
			// calculate effective temperature
			double effect = 35.74 + 0.6215 * temperature
					+ (0.4275 * temperature - 35.75) * Utility.power(windSpeed, 0.16);
			return effect;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the temperature(Fahrenheit) and wind speed(in miles per hour) : ");
		double temperature = Utility.nextDouble();
		double windSpeed = Utility.nextDouble();
		System.out.println(windChill(temperature, windSpeed));
	}
}
