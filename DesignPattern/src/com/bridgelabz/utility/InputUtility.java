package com.bridgelabz.utility;

/**
 * @Author   :  Vishal Yadav
 * @Version  :  1.0
 * @Date     :  2019/12/06
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

	public static String next() {
		return scanner.next();
	}

	public static long nextlong() {
		return scanner.nextLong();
	}
}
