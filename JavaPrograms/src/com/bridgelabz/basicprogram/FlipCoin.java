package com.bridgelabz.basicprogram;

import com.bridgelabz.utility.InputUtility;

/**
 * @author : Vishal Yadav
 * @date : 2019/11/15
 * @version : 1.0 Purpose : To flip coin and calculate the percentage of heads
 *          and tails as outcome using Random Number.
 **/

public class FlipCoin {
	/**
	 * Define static Function flipCoin() for calculating the percentage of heads and
	 * tails.
	 * 
	 * @param noOfTimes
	 */
	public static void flipCoin(int noOfTimes) {
		int countHead = 0, countTail = 0;
		float percentHead, percentTail;
		for (int i = 0; i < noOfTimes; i++) {
			if (Math.random() < 0.5) {
				System.out.println("Head");
				countHead++;
			} else {
				System.out.println("Tail");
				countTail++;
			}
		}
		// calculate Heads Percentage
		percentHead = (countHead * 100) / noOfTimes;
		// calculate Tails Percentage
		percentTail = (countTail * 100) / noOfTimes;
		System.out.println("Percentage of Tail=" + percentTail + "\nPercentage of Head=" + percentHead);
	}

	public static void main(String[] args) {
		// ask user to input the number of times to flip coin
		System.out.println("Enter a number of times to flip a coin :");
		int noOfTimes = InputUtility.nextInteger();
		FlipCoin.flipCoin(noOfTimes);
	}
}
