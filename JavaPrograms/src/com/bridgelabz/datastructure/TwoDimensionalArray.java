package com.bridgelabz.datastructure;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/11/23
 * @Purpose : To compute the 2D array and store elements into file.
 */
import com.bridgelabz.utility.InputUtility;
import com.bridgelabz.utility.Utility;

public class TwoDimensionalArray {
	/**
	 * Define the static twoDArray() to take the elements from user and store into
	 * file
	 * 
	 * @param array   ==> int
	 * @param rows    ==> int
	 * @param columns ==> int
	 * @return boolean
	 */
	public static boolean twoDArray(int[][] array, int rows, int columns) {

		int i, j;
		for (i = 0; i < rows; i++) {
			for (j = 0; j < columns; j++) {
				array[i][j] = InputUtility.nextInteger();
			}
		}
		for (i = 0; i < rows; i++) {
			for (j = 0; j < columns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		// write to file
		boolean status = Utility.writeArrayToFile(array, rows, columns, "f1.txt");
		return status;
	}

	public static void main(String[] args) {

		System.out.println("Enter a length of row : ");
		int rows = InputUtility.nextInteger();
		System.out.println("Enter a length of column : ");
		int columns = InputUtility.nextInteger();

		// Initializing 2D array
		int[][] array = new int[rows][columns];
		System.out.println("Enter array elements : ");
		System.out.println(twoDArray(array, rows, columns));
	}
}
