package com.bridgelabz.logicalprogram;

/**
 * @Author    :  Vishal Yadav
 * @Version   :  1.0
 * @Date      :  2019/11/17
 * @Purpose    :  To find out the binary of decimal number.
 */
import com.bridgelabz.utility.InputUtility;

public class ToBinary {
	/**
	 * Define static toBinary() function to find the binary of number
	 * 
	 * @param number
	 */
	public static void toBinary(int number) {
		int[] binary = new int[20];
		int index = 0;
		// logic to find binary
		while (number > 0) {
			binary[index++] = number % 2;
			number = number / 2;
		}
		// logic to print the binary number of decimal
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

	public static void main(String[] args) {

		// ask user to input the decimal number
		System.out.println("Enter a number : ");
		int number = InputUtility.nextInteger();
		System.out.println("Binary of " + number + " :");
		ToBinary.toBinary(number);
	}
}