package com.bridgelabz.utility;

/**
 * @Author   :  Vishal Yadav
 * @Version  :  1.0
 * @Date     :  2019/11/22
 */
import java.util.Scanner;

public class InputUtility {
	private static final Scanner scanner = new Scanner(System.in);

	public static int nextInteger() {
		return scanner.nextInt();
	}

	public static double nextDouble() {
		return scanner.nextDouble();
	}

	public static float nextFloat() {
		return scanner.nextFloat();
	}

	public static String nextLine() {
		return scanner.nextLine();
	}
}
