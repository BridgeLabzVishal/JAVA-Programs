package com.bridgelabz.logicalprogram;

/**
 * @Author    :  Vishal Yadav
 * @Version   :  1.0
 * @Date      :  2019/11/17
 * @Purpose    : To generate a coupon number
 */
import com.bridgelabz.utility.InputUtility;

/**
 * @Author   : Vishal Yadav
 * @Version  : 1.0
 * @Date     : 2019/11/17
 * @Purpose   : To generate Coupon Numbers using random numbers generation.
 */

import com.bridgelabz.utility.Utility;
import java.util.Random;

public class CouponNumber {
	/**
	 * Define function createRandomCode() to generate Coupon Numbers
	 * 
	 * @param length --> int
	 * @return code --> String
	 */
	public static String createRandomCode(int length) {
		char[] ch = "0123456789".toCharArray();
		StringBuilder stringBuilder = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			char c = ch[random.nextInt(ch.length)];
			stringBuilder.append(c);
		}
		String code = stringBuilder.toString();
		return code;
	}

	public static void main(String[] args) {
		// ask user input for length of Coupon Number
		System.out.println("Enter a length of Coupon Code : ");
		int length = InputUtility.nextInteger();
		System.out.println(CouponNumber.createRandomCode(length));
	}
}
