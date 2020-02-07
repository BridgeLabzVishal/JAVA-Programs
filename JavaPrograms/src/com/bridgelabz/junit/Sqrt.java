package com.bridgelabz.junit;

/**
 * @author    :  Vishal Yadav
 * @version   :  1.0
 * @date      :  2019/11/17
 * @Purpose    :  to compute the square root of a nonnegative number c
                 given in the input using Newton's method:
				 - replace t with the average of c/t and t
				 - repeat until desired accuracy reached using condition Math.abs(t - c/t) > epsilon*t
 */
import com.bridgelabz.utility.InputUtility;

public class Sqrt {
	/**
	 * define sqrt() function to calculate square root of number
	 * 
	 * @param number
	 * @return double
	 */
	public static double sqrt(double number) {
		// condition to check number is negative or non negative
		if (number > 0) {
			// logic to calculate square root
			double num = number;
			double epsilon = 1e-15;
			while (Math.abs(num - number / num) > epsilon * num) {
				num = (number / num + num) / 2;
			}
			return num;
		} else if (number < 0) {
			return number;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter non-negative number : ");
		double number = InputUtility.nextDouble();
		System.out.println(sqrt(number));
	}
}
