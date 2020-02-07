package com.bridgelabz.junit;

/**
 * @Author   : Vishal Yadav
 * @Version  : 1.0 
 * @Date     : 2019/11/17
 * @Purpose   : takes a date as input and prints the day of the week that date falls on. 
               program should take three arguments: month, day, and year. Output print 0 
               for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following 
               formulas, for the Gregorian calendar:
               y0 = y − (14 − m ) / 12
			   x = y0 + y0 /4 − y0 /100 + y0 /400
			   m0 = m + 12 × ((14 − m ) / 12) − 2
			   d0 = ( d + x + 31 x m0 / 12) mod 7
 */
import com.bridgelabz.utility.InputUtility;

public class DayOfWeek {
	/**
	 * define function dayOfWeek() to calculate the day of the week.
	 * 
	 * @param month
	 * @param date
	 * @param year
	 */
	public static void dayOfWeek(int month, int date, int year) {
		int year1 = year - (14 - month) / 12;
		int x = year1 + year1 / 4 - year1 / 100 + year1 / 400;
		int month1 = month + 12 * ((14 - month) / 12) - 2;
		int d1 = (date + x + 31 * month1 / 12) % 7;
		switch (d1) {
		case 0:
			System.out.println("Sunday");
			break;

		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");
			break;
		}
	}

	public static void main(String[] args) {
		// ak user to input month,date and year
		System.out.println("Enter the date(mm dd yyyy) : ");
		int month = InputUtility.nextInteger();
		int day = InputUtility.nextInteger();
		int year = InputUtility.nextInteger();
		dayOfWeek(month, day, year);
	}
}
