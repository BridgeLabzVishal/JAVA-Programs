package com.bridgelabz.basicprogram;

import com.bridgelabz.utility.InputUtility;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/11/15
 * 
 *       Purpose : To compute prime factorization of N using brute force. Import
 *       utility package here to use predefined class Utility.
 */

public class PrimeFactorization {
	/**
	 * Define static primeFactor() function to calculate prime factorization
	 * 
	 * @param number
	 */
	public static void primeFactor(int number) {

		// logic to calculate prime factorization
		for (int i = 2; i * i <= number; i++) {
			while (number % i == 0) {
				System.out.print(i + " ");
				number = number / i;
			}
		}
		if (number > 1) {
			System.out.println(number);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a number for Prime Factorization : ");
		int number = InputUtility.nextInteger();
		PrimeFactorization.primeFactor(number);
	}
}
