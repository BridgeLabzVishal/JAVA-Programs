package com.bridgelabz.algorithmprogram;

/**
 * @Author   :  Vishal Yadav
 * @Version  :  1.0
 * @Date     :  2019/11/16
 * Purpose   :  To check the number is palindrome or not
 */
import com.bridgelabz.utility.InputUtility;

public class Palindrome {
	/**
	 * Define palindrome() function of Static type to check the number is palindrome
	 * or not
	 * 
	 * @param number
	 * @return boolean
	 */
	public static boolean palindrome(int number) {
		int temp = number;
		int reverse = 0, remainder;

		while (temp != 0) {
			remainder = temp % 10;
			reverse = reverse * 10 + remainder;
			temp = temp / 10;
		}
		if (number == reverse) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// ask user to input the number
		System.out.println("Enter a number : ");
		int number = InputUtility.nextInteger();
		System.out.println(palindrome(number));
	}
}
