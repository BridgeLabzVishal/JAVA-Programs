package com.bridgelabz.stockmanagement.controller;

/**
 * @Author : Vishal Yadav
 * @Version : 2.0
 * @Date : 2019/12/16
 */
import com.bridgelabz.stockmanagement.services.StockQueue;
import com.bridgelabz.utility.InputUtility;

public class StockQueueTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		StockQueue stockQueue = new StockQueue();
		int ch = 0;
		do {
			System.out.println("Enter your choice : ");
			System.out.println("1.Buyer Details ");
			System.out.println("2.Seller Details ");
			int choice = InputUtility.nextInteger();
			switch (choice) {
			case 1:
				stockQueue.buyDetails();
				break;

			case 2:
				stockQueue.sellDetails();
				break;

			default:
				System.out.println("Invalid Choice");
			}

		} while (ch < 2);
	}
}
