package com.bridgelabz.junit;

/**
  * @Author  :  Vishal Yadav
  * @Date    :  2019/16/11
  * @Version :  1.0
  * @Purpose : Calculate the minimum number of Notes as well as the Notes to be returned by the Vending
  * 		   Machine as a Change taking array for Notes and NoteCounter using Recursion Calculating 
  			   number of minimum Notes Return by Vending machine
**/
import com.bridgelabz.utility.*;

public class VendingMachine {
	// Static Variables i for indexing the array and total for calculating the total
	// Notes
	static int i = 0;
	static int[] notes = new int[] { 1000, 500, 100, 50, 10, 5, 2, 1 };
	static int[] noteCounter = new int[8];

	/**
	 * Function for Calculating the notes.
	 * 
	 * @param amount
	 * @return amount
	 */
	public static int calculate(int amount) {
		if (amount == 0) {
			return -1;
		} else {
			while (amount >= notes[i]) {
				noteCounter[i] = amount / notes[i];
				amount = amount - (noteCounter[i] * notes[i]);
			}
			i++;
			return calculate(amount);
		}
	}

	/**
	 * Function for displaying the mininum notes and Notes that taken out from
	 * Vending Machine.
	 */
	public static void display() {
		int total = 0;
		// logic for Calculating The notes
		for (i = 0; i < noteCounter.length; i++) {
			if (noteCounter[i] != 0) {
				total = total + noteCounter[i];
				System.out.println(notes[i] + " --> " + noteCounter[i]);
			}
		}
		System.out.println("Minimum notes --> " + total);
	}

	public static void main(String[] args) {
		System.out.println("Enter the amount : ");
		int amount = InputUtility.nextInteger();
		VendingMachine.calculate(amount);
		VendingMachine.display();
	}
}
