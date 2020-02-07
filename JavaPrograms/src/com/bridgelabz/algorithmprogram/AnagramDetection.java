package com.bridgelabz.algorithmprogram;

/**
 * @Author    :  Vishal Yadav
 * @Version   :  1.0
 * @Date      :  2019/11/16
 * @Purpose    :  String is an anagram of another if the second is simply a rearrangement
            	 of the first. For example, 'heart' and 'earth' are anagrams.
 */

import java.util.Arrays;
import com.bridgelabz.utility.InputUtility;

public class AnagramDetection {
	/**
	 * Defines isAnagram() function to check string is Anagram or not
	 * 
	 * @param str1
	 * @param str2
	 * @return boolean value
	 */
	public static boolean isAnagram(String str1, String str2) {
		// to replace space between string
		String string1 = str1.replaceAll("\\s", "");
		String string2 = str2.replaceAll("\\s", "");
		boolean status = true;
		// logic to check Anagram or not
		if (string1.length() != string2.length()) // Compare s1 length with s2 length
		{
			status = false;
		} else {
			char[] arr1 = string1.toLowerCase().toCharArray();
			char[] arr2 = string2.toLowerCase().toCharArray();
			// sort the arr1 and arr2
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			// check sorted array is equal or not
			status = Arrays.equals(arr1, arr2);
		}
		if (status) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// ask user to input as string
		System.out.println("Enter a string : ");
		String string1 = InputUtility.nextLine();
		// ask user to input as string
		System.out.println("Enter a string to find out : ");
		String string2 = InputUtility.nextLine();

		System.out.println(AnagramDetection.isAnagram(string1, string2));
	}
}
