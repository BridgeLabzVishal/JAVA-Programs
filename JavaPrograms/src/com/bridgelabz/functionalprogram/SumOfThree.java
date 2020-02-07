package com.bridgelabz.functionalprogram;

/**
 * @author   :  Vishal Yadav
 * @version  :  1.0
 * @date     :  2019/11/17
 * @Purpose   :  A program with cubic running time. Read in N integers and counts the
                number of triples that sum to exactly 0.
                Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
 */
import com.bridgelabz.utility.Utility;

public class SumOfThree {
	/**
	 * define findTriplets() function to check triplets in array.
	 * 
	 * @param array --> int
	 */
	private static void findTriplets(int[] array) {
		boolean flag = false;
		for (int i = 0; i < array.length - 2; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				for (int k = j + 1; k < array.length; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						System.out.print(array[i]);
						System.out.print(" ");
						System.out.print(array[j]);
						System.out.print(" ");
						System.out.print(array[k]);
						System.out.print("\n");
						flag = true;
					}
				}
			}
		}
		// conditon to check its triplet or not
		if (flag == false) {
			System.out.println(" not exist ");
		}
	}

	public static void main(String[] args) {

		// takes user input
		System.out.println("Enter the length of an array : ");
		int length = Utility.nextInteger();
		int[] arr = new int[length];
		System.out.println("Enter a values in an array : ");
		// logic to store elements in array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Utility.nextInteger();
		}
		findTriplets(arr);
	}
}
