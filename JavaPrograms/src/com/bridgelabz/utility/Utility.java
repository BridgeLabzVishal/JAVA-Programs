package com.bridgelabz.utility;

/**
 * @Author   :  Vishal Yadav
 * @Version  :  1.0
 * @Date     :  2019/11/22
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.bridgelabz.regex.UserDetails;

public class Utility {

	private static BufferedReader bufferedReader;

	/**
	 * writing the data in the file
	 * 
	 * @param data     ==> String
	 * @param filename ==> String
	 * @return boolean
	 */
	public static boolean writeToFile(String data, String filename) {
		File file = new File(filename);
		BufferedWriter bufferedWriter = null;
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(new File(filename)));
			bufferedWriter.write(data);
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	/**
	 * writing the data in the file
	 * 
	 * @param array
	 * @param rows
	 * @param column
	 * @param filename
	 * @return boolean
	 */
	public static boolean writeArrayToFile(int[][] array, int rows, int column, String filename) {
		File file = new File(filename);
		if (!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter(file);

		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				printWriter.write(array[i][j] + " ");
			}
			printWriter.println();
		}
		printWriter.close();
		return true;
	}

	/**
	 * to read the data from the file
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
	 * to count the digits in a number
	 * 
	 * @param number
	 * @return int
	 */
	public static int countDigits(int number) {
		int count = 0;
		while (number != 0) {
			number = number / 10;
			++count;
		}
		return count;
	}

	/**
	 * to check the year is leap year or not
	 * 
	 * @param year
	 * @return boolean
	 */
	public static boolean isleapYear(int year) {
		if ((year % 4 == 0) || ((year % 400 == 0) && (year % 100 != 0))) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * to calculate the power of the number
	 * 
	 * @param number  ==> double
	 * @param number2 ==> double
	 * @return double
	 */
	public static double power(double number, double number2) {
		double power = Math.pow(number, number2);
		return power;
	}

	/**
	 * to sort the elements of the array using bubble sort technique
	 * 
	 * @param array
	 * @param length
	 * @return int[]
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

	private final static String REGEX_NAME = "<<name>>";

	private final static String REGEX_FULLNAME = "<<full name>> ";

	private final static String REGEX_MOBILE_NO = "xxxxxxxxxx";

	private final static String REGEX_DATE = "26/11/2019";

	/**
	 * to get the formatted date
	 * 
	 * @param date
	 * @return String
	 */
	public static String getFormatedDate(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(date);
	}

	/**
	 * to convert into the string
	 * 
	 * @param userDetails ==> userdetails
	 * @param filename    ==> String
	 * @return String
	 */
	public static String convertString(UserDetails userDetails, String filename) {
		Pattern pattern = Pattern.compile(REGEX_NAME);
		Matcher match = pattern.matcher(filename);
		filename = match.replaceAll(userDetails.getFirst_name());

		pattern = Pattern.compile(REGEX_FULLNAME);
		match = pattern.matcher(filename);
		filename = match.replaceAll(userDetails.getFirst_name() + " " + userDetails.getLast_name());

		pattern = Pattern.compile(REGEX_MOBILE_NO);
		match = pattern.matcher(filename);
		filename = match.replaceAll(userDetails.getMobile_no());

		pattern = Pattern.compile(REGEX_DATE);
		match = pattern.matcher(filename);
		filename = match.replaceAll(userDetails.getDate());

		return filename;
	}

	/**
	 * to check the number is prime or not
	 * 
	 * @param number
	 * @return boolean
	 */
	public static boolean isPrime(int number) {
		boolean flag = true;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	/**
	 * define isAnagram() to check the two number is anagram or not
	 * 
	 * @param number1
	 * @param number2
	 * @return boolean
	 */
	public static boolean isAnagram(int number1, int number2) {
		int length1 = countDigits(number1);
		int length2 = countDigits(number2);
		if (length1 != length2) {
			return false;
		}
		int i = 0;
		int j = 0;
		int[] num1 = new int[length1];
		int[] num2 = new int[length2];
		while (number1 != 0) {
			int rem = number1 % 10;
			num1[i] = rem;
			number1 = number1 / 10;
			i++;
		}
		while (number2 != 0) {
			int rem = number2 % 10;
			num2[j] = rem;
			number2 = number2 / 10;
			j++;
		}
		Arrays.sort(num1);
		Arrays.sort(num2);

		if (Arrays.equals(num1, num2))
			return true;
		else
			return false;
	}

	/**
	 * define function to count the factorial value of number
	 * 
	 * @param number
	 * @return int
	 */
	public static int factorial(int number) {
		int factorial = 1;
		if (number == 0)
			return 0;
		else {
			while (number > 1) {
				factorial = factorial * number;
				number--;
			}
			return factorial;
		}
	}
}
