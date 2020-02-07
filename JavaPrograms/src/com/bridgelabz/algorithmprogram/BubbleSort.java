package com.bridgelabz.algorithmprogram;

/**
 * @Author   :  Vishal Yadav
 * @Version  :  1.0
 * @Date     :  2019/11/16
 * @Purpose   :  Reads in integers from array and prints them in sorted order using Bubble Sort
 */

import com.bridgelabz.utility.InputUtility;

public class BubbleSort {
	/**
	 * Define bubbleSort() function to sort the array
	 * 
	 * @param arr
	 * @param length
	 */
	public static void bubbleSort(int[] arr, int length) {
		int i, j, temp;
		for (i = 0; i < length; i++) {
			int flag = 0;
			for (j = 0; j < length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// swapping the two elements in array to sort the array
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		// printing the elements of array in sorted ordered
		for (i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// ask user to input the array length
		System.out.println("Enter a length of array : ");
		int length = InputUtility.nextInteger();

		// declaration of array
		int[] array = new int[length];
		System.out.println("Enter an elements of array : ");
		// Logic to store the elements in array
		for (int i = 0; i < length; i++) {
			array[i] = InputUtility.nextInteger();
		}
		bubbleSort(array, length);
	}
}
