package com.bridgelabz.basicprogram;

/**
 * @Author  :  Vishal Yadav
 * @Version :  1.0
 * @Date    :  2019/11/15
 * @Purpose  : Determine if it is a Leap Year or Not 
 **/

import com.bridgelabz.utility.InputUtility;
import com.bridgelabz.utility.Utility;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter a year : ");
		int year = InputUtility.nextInteger();
		/**
		 * Utility.countDigits() --> calling function countDigits()
		 * 
		 * @param year
		 */
		if (Utility.countDigits(year) == 4) {
			/**
			 * Function for calling isLleapYear()
			 * 
			 * @param -->year it will give boolean values i.e true or false
			 */
			System.out.println(Utility.isleapYear(year));
		} else
			System.out.println("Invalid year,Enter only 4 digit number.");
	}
}
