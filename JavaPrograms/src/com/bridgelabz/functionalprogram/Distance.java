package com.bridgelabz.functionalprogram;

/**
 * @author    :  Vishal Yadav
 * @version   :  1.0
 * @date      :  2019/11/17
 * @Purpose    :  takes two integer x and y and prints the Euclidean distance from the point (x, y)
                 to the origin (0, 0). The formulae to calculate distance = sqrt(x*x + y*y). 
                 Use Math.power function . 
 */
import com.bridgelabz.utility.Utility;

public class Distance {
	/**
	 * define euclideanDistance() function to calculate euclidean distance between
	 * two points
	 * 
	 * @param x1 --> x-axis coordinate point
	 * @param y1 --> y-axis coordinate point
	 * @param x2 --> x-axis coordinate point
	 * @param y2 --> y-axis coordinate point
	 */
	public static void euclideanDistance(double x1, double y1, double x2, double y2) {
		// logic to calculate distance
		double x = x1 - x1;
		double y = y2 - y2;
		double d1 = Utility.power(x, 2);
		double d2 = Utility.power(y, 2);
		double distance = Math.sqrt(d1 + d2);
		System.out.println(distance);
	}

	public static void main(String[] args) {
		// takes user input x1,y1,x2,y2
		System.out.println("Enter 4 points to calculate distance (x1 y1 x2 y2) : ");
		double x1 = Utility.nextDouble();
		double y1 = Utility.nextDouble();
		double x2 = Utility.nextDouble();
		double y2 = Utility.nextDouble();
		euclideanDistance(x1, y1, x2, y2);
	}
}
