package com.bridgelabz.utility;

/**
 * @Author   :  Vishal Yadav
 * @Version  :  1.0
 * @Date     :  2019/12/06
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utility {

	private static BufferedReader bufferedReader = null;

	/**
	 * to read the data from file using buffered reader
	 * 
	 * @param filename
	 * @return String
	 */
	public static String readFromFile(String filename) {
		try {
			bufferedReader = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		StringBuilder sb = new StringBuilder();
		try {

			String line;
			while ((line = bufferedReader.readLine()) != null)
				sb.append(line);
		} catch (IOException e) {
			System.out.println("Empty file " + e.getMessage());
		} finally {
			try {

				bufferedReader.close();
			} catch (IOException e) {
				System.out.println(e.getStackTrace());
			}
		}
		return sb.toString();
	}

	/**
	 * to sort the elements of the array using bubble sort technique
	 * 
	 * @param array
	 * @param length
	 * @return array
	 */
	public static int[] bubbleSort(int[] array, int length) {
		// Logic to sort the array
		int i, j, temp;
		for (i = 0; i < length; i++) {
			int flag = 0;
			for (j = 0; j < length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					// swapping the two elements in array to sort the array
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		for (i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
		return array;
	}
}