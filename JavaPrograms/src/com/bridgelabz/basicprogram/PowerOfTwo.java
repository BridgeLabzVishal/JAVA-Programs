package com.bridgelabz.basicprogram;

/**
 * @author : Vishal Yadav
 * @version : 1.0
 * @date : 2019/11/15
 */

import com.bridgelabz.utility.InputUtility;
import com.bridgelabz.utility.Utility;

public class PowerOfTwo {
	/**
	 * Function power() to calculate power of 2.
	 * 
	 * @param number
	 * @return sum
	 */
	public static int power(int number) {
		int sum = 0;
		// logic to calculate the sum
		if (number >= 0 && number < 31) {
			for (int i = 1; i <= number; i++) {
				sum = (int) (Utility.power(2, i));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		int number = InputUtility.nextInteger();
		int year = power(number);
		// function for counting a digits
		if (Utility.countDigits(year) == 4) {
			System.out.println("Year is : " + year);
			System.out.println(Utility.isleapYear(year));
		} else
			System.out.println("Invalid year,Enter only 4 digit number.");
	}
}
