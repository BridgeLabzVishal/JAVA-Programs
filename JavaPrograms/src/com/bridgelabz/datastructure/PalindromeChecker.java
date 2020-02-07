package com.bridgelabz.datastructure;

/**
 * @Author   :  Vishal Yadav
 * @Version  :  1.0
 * @Date     :  2019/11/23
 * Purpose   :  A palindrome is a string that reads the same forward and backward, for example:
  				radar, toot, and madam using Deque data type. We would like to construct an 
  				algorithm to input a string of characters and check whether it is a palindrome.
 */

import com.bridgelabz.utility.Deque;
import com.bridgelabz.utility.InputUtility;

public class PalindromeChecker {
	/**
	 * define function isPalindrome() to check string is palindrome or not
	 * 
	 * @param string
	 */
	public static boolean isPalindrome(String string) {
		Deque<Character> deque = new Deque<Character>();

		// logic to check string is palindrome or not
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			deque.addFront(ch);
		}

		String reverse = "";
		for (int i = 0; i < string.length(); i++) {
			reverse = reverse + deque.removeFront();
		}

		if (reverse.equals(string)) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter a String : ");
		String string = InputUtility.nextLine();

		if (isPalindrome(string)) {
			System.out.println("String is palindrome.");
		} else
			System.out.println("String is not palindrome.");
	}
}
