package com.bridgelabz.datastructure;

/**
 * @Author   :  Vishal Yadav
 * @Version  :  1.0
 * @Date     :  2019/11/23
 * @Purpose   :  Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. Store the 
 				prime numbers i n a 2D Array, the first dimension represents the range 0-100,100-200,
 				and so on. While the second dimension represents the prime numbers in that range.
 */
import com.bridgelabz.utility.Utility;

public class Prime2DArray {

	public static void main(String[] args) {

		int number = 1;
		// Initialization of array
		int[][] primeNumber = new int[10][100];
		// logic to check the number is prime or not
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (Utility.isPrime(number)) {
					primeNumber[i][j] = number;
				}
				number++;
			}
		}

		String prime = "";
		for (int j[] : primeNumber) {
			for (int i : j) {
				if (i != 0) {
					System.out.print(i + " ");
					prime = prime + i + " ";
				}
			}
			System.out.println();
		}
	}
}