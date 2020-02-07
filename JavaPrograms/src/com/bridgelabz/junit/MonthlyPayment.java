package com.bridgelabz.junit;

/**
 * @Author    :  Vishal Yadav
 * @Version   :  1.0
 * @Date      :  2019/111/17
 * @Purpose    :  calculates the monthly payments takes three user input principal ,years and rate.
 */
import com.bridgelabz.utility.InputUtility;
import com.bridgelabz.utility.Utility;

public class MonthlyPayment {
	/**
	 * defines calculateInterest() function to calculate the interest.
	 * 
	 * @param principal -->int
	 * @param year      --> int
	 * @param rate      --> int
	 */
	public static void calculateInterest(double principal, double year, double rate) {
		double princi = 12 * year;
		double r = rate / (12 * 100);
		// calculate monthly interest
		double payment = (principal * r) / (1 - Utility.power(1 + r, -princi));
		// calculate total interest
		double interest = (payment * princi) - principal;

		System.out.println("Monthly interest --> " + payment);
		System.out.println("Total interest --> " + interest);
	}

	public static void main(String[] args) {
		System.out.println("Enter the principal :");
		double principal = InputUtility.nextDouble();
		System.out.println("Enter the years :");
		double year = InputUtility.nextDouble();
		System.out.println("Enter the rate :");
		double rate = InputUtility.nextDouble();

		MonthlyPayment.calculateInterest(principal, year, rate);
	}
}
