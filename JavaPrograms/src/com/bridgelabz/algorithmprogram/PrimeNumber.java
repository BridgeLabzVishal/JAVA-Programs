package com.bridgelabz.algorithmprogram;

import com.bridgelabz.utility.InputUtility;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/11/16 Purpose : To find the Prime Numbers From given range.
 */

public class PrimeNumber {

	/**
	 * Define a function primeNumber() to find the prime number
	 * 
	 * @param last
	 * @return String
	 */
	public static String primeNumber(int last) {
		int i;
		int j;

		String primeNumbers = "";
		// logic to find prime numbers
		for (i = 0; i <= last; i++) {
			int count = 0;
			for (j = i + 1; j >= 1; j--) {
				if (i % j == 0) {
					count = count + 1;
				}
			}
			if (count == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}
		return primeNumbers;
	}

	public static void main(String[] args) {

		// ask user to input last number
		System.out.println("Enter the last number : ");
		int last = InputUtility.nextInteger();
		System.out.println(PrimeNumber.primeNumber(last));
	}
}
