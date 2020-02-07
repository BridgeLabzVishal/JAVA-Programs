package com.bridgelabz.algorithmprogram;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/11/16 Purpose : Read the strings from array and prints them in
 *       sorted order using insertion sort.
 */
public class InsertionSort {
	/**
	 * Define static function sort() to sort the strings in sorted array
	 * 
	 * @param arr--> String
	 * @param length
	 * @return String []
	 */
	public static String[] sort(String[] array, int length) {
		String temp = "";
		// Logic to sort the strings in array
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				// logic to ignore case
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					// swapping the strings
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		// String array to store strings
		String[] array = { "Vishal", "Alice", "Amit", "Vikas", "Neha", "Durga" };
		/**
		 * calling sort() function to sort the strings in array. pass the sorted array
		 * in sortArray of string type
		 * 
		 * @param arr
		 * @param arr.length
		 */
		String[] sortArray = sort(array, array.length);
		// for each loop to print sorted array
		for (String s : sortArray) {
			System.out.println(s);
		}
	}
}
