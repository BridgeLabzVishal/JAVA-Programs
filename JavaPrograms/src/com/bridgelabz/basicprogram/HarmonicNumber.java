package com.bridgelabz.basicprogram;

/**
 * @Author : Vishal Yadav
 * @version : 1.0
 * @Date : 2019/11/15
 * 
 * @Purpose : Calculate Harmonic Number Prints the Nth harmonic number: 1/1 +
 *          1/2 + ... + 1/N.
 */
import com.bridgelabz.utility.InputUtility;

public class HarmonicNumber {
	/**
	 * Function harmonicNumber() to calculate sum of harmonic numbers
	 * 
	 * @param number
	 * @return double
	 */
	public static double harmonicNumber(int number) {
		int i;
		double sum = 0.0;
		// logic for generate harmonic numbers
		for (i = 1; i <= number; i++) {
			sum += 1.0 / i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// ask user to input the Nth number
		System.out.println("Enter a Nth number you want to print : ");
		int number = InputUtility.nextInteger();
		if (number > 0) {
			System.out.print(HarmonicNumber.harmonicNumber(number));
		} else {
			System.out.println("Nth number greater than zero");
		}
	}
}
