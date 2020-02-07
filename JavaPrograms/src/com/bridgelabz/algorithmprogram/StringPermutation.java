package com.bridgelabz.algorithmprogram;

/**
 * @Author   :  Vishal Yadav
 * @Version  :  1.0
 * @Date     :  2019/11/16
 * Purpose   :  to find permutation of a string
 */
import com.bridgelabz.utility.InputUtility;

public class StringPermutation {
	/**
	 * Define permute() function to find out the permutations of string
	 * 
	 * @param string --> String
	 * @param left   --> int
	 * @param right  --> int
	 */
	public static void permute(String string, int left, int right) {
		// Logic to find permutation of string
		if (left == right) {
			System.out.println(string);
		} else {
			for (int i = left; i <= right; i++) {
				string = swap(string, left, i);
				permute(string, left + 1, right); // recursion calling a permute() function
				string = swap(string, left, i);
			}
		}
	}

	/**
	 * Define swap() function to swap the String
	 * 
	 * @param string -->String
	 * @param i      --> starting index
	 * @param j      --> end index
	 * @return String value
	 */
	private static String swap(String string, int i, int j) {
		char temp;
		char[] array = string.toCharArray();
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		return String.valueOf(array);
	}

	public static void main(String[] args) {
		// ask user to input string
		System.out.println("Enter a string for permutation : ");
		String string = InputUtility.nextLine();
		int length = string.length() - 1;
		StringPermutation.permute(string, 0, length);
	}
}
