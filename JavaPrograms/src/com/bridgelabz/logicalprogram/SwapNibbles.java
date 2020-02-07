package com.bridgelabz.logicalprogram;

/**
 * @Author   :  Vishal Yadav
 * @Version  :  1.0
 * @Date     :  2019/11/16
 * @Purpose   :  to read an integer as an Input, convert to Binary using toBinary
				function and perform the following functions.
				i. Swap nibbles and find the new number.
				ii. Find the resultant number is the number is a power of 2.
				For example 100 i s to be represented as  01100100 i n a byte 
				(or 8 bits). The two nibbles are (0110) and (0100). If we swap
				the two nibbles, we get 01000110 which is 70 in decimal.
 */
import com.bridgelabz.utility.InputUtility;

public class SwapNibbles {
	/**
	 * define static function swapNibble() to swap the nibbles
	 * 
	 * @param number -->number to convert into binary
	 * @return integer value
	 */
	public static int swapNibble(int number) {
		return ((number & 0x0F) << 4 | (number & 0xF0) >> 4);
	}

	public static void main(String[] args) {
		// ask user to input the number
		System.out.println("Enter a number : ");
		int number = InputUtility.nextInteger();
		System.out.println(swapNibble(number));
	}
}
