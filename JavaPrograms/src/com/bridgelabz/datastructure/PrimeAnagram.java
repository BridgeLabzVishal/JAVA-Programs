package com.bridgelabz.datastructure;

/**
 * @Author    :  Vishal Yadav
 * @Version   :  1.0
 * @Date      :  2019/11/24
 * @Purpose    :  Find the Prime Number and store only the numbers in that range that are Anagrams.
  				 For e.g. 17 and 71 are both Prime and Anagrams in the 0 to 1000 range.
 */
import com.bridgelabz.utility.Utility;

public class PrimeAnagram {

	public static void main(String[] args) {

		// initialization of array
		int array[] = new int[1000];
		int number = 2;
		for (int i = 0; i < array.length; i++) {
			if (Utility.isPrime(number)) {

				array[i] = number;
			}
			number++;
		}
		System.out.println("Numbers that are prime and anagram : ");
		int[] first = new int[array.length];

		// logic to check prime numbers are anagram or not
		for (int k = 0; k < array.length; k++) {
			for (int j = k + 1; j < array.length; j++) {
				if (Utility.isAnagram(array[k], array[j]) && (array[k] != 0 && array[j] != 0)) {
					System.out.println(array[k] + " " + array[j]);
					first[k] = array[k];
				}
			}
		}
		System.out.println("****************************2D Array*********************************************");
		int x = 0;
		int[][] f1 = new int[10][100];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				f1[i][j] = first[x];
				x++;
				if (f1[i][j] != 0)
					System.out.print(f1[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
