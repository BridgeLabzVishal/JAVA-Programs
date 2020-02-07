package com.bridgelabz.functionalprogram;

/**
 * @author   :  Vishal Yadav
 * @version  :  1.0
 * @date     :  2019/11/17
 * Purpose   :  To find the roots of the equation a*x*x + b*x + c.
                Since the equation i s x*x, hence there are 2 roots. 
                The 2 roots of the equation can be found using a formula.
				delta = b*b - 4*a*c
				Root 1 of x = (-b + sqrt(delta))/(2*a)
				Root 2 of x = (-b - sqrt(delta))/(2*a)
 */
import com.bridgelabz.utility.*;

public class Quadratic {
	/**
	 * define function quadratic() to calculate roots of the equation
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void quadratic(int a, int b, int c) {
		// condition to check quadratic or not.
		if (a == 0) {
			System.out.println("Linear Equation");
		} else {
			double delta = Math.sqrt(Math.abs(b * b - 4 * a * c));
			// calculate root1
			double root1 = ((double) (-b) + delta) / (2 * a);
			// calculate root2
			double root2 = ((double) (-b) - delta) / (2 * a);
			System.out.println("Quadratic equation is : " + a + "x^2 + " + b + "x + " + c);
			System.out.println(root1);
			System.out.println(root2);
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter three number a,b,c : ");
		// takes three user input a,b and c
		int a = Utility.nextInteger();
		int b = Utility.nextInteger();
		int c = Utility.nextInteger();
		Quadratic.quadratic(a, b, c);
	}
}
