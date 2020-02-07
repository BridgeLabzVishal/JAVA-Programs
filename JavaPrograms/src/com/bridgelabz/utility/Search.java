package com.bridgelabz.utility;

/**
 * @Author   : Vishal Yadav
 * @Version  : 1.0
 * @Date     : 2019/11/19
 * Purpose  :  To create generic searching algorithm.
 */
import java.lang.Comparable;

public class Search<T> {
	/**
	 * Defines generic linearSearch() function to find element in array it extends
	 * the functionality of Comparable Interface.
	 * 
	 * @param <T>   --> generic data type
	 * @param array
	 * @param value --> element to find in an array
	 * @param low   --> lower index value of array
	 * @param high  --> higher index value of array
	 * @return int value
	 */
	public static <T extends Comparable<T>> int linearSearch(T[] array, T value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].compareTo(value) == 0)
				return i + 1;
		}
		return -1;
	}

	/**
	 * Defines generic binarySearch() function to find element in array it extends
	 * the functionality of Comparable Interface.
	 * 
	 * @param <T>   --> generic data type
	 * @param array
	 * @param value --> element to find in an array
	 * @param low   --> lower index value of array
	 * @param high  --> higher index value of array
	 * @return int value
	 */
	public static <T extends Comparable<T>> int binarySearch(T[] array, T value, int low, int high) {

		if (low < high) {
			// to find the mid index of array
			int mid = (low + high) / 2;
			// compares arr[mid] value to element which want to find in array
			if (array[mid].compareTo(value) == 0)
				return mid + 1;
			if (array[mid].compareTo(value) > 0)
				return binarySearch(array, value, low, mid - 1);
			if (array[mid].compareTo(value) < 0)
				return binarySearch(array, value, mid + 1, high);
		}
		return -1;
	}
}
