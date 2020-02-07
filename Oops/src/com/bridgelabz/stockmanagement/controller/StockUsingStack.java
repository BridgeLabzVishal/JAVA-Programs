package com.bridgelabz.stockmanagement.controller;

/**
 * @Author : Vishal Yadav
 * @Version : 2.0
 * @Date : 2019/12/16
 */
import com.bridgelabz.stockmanagement.services.StockStack;
import com.bridgelabz.utility.InputUtility;

public class StockUsingStack {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		StockStack stockStack = new StockStack();

		int ch = 0;
		do {
			System.out.println("Enter your choice : ");
			System.out.println("1.Buyer Details ");
			System.out.println("2.Seller Details ");
			int choice = InputUtility.nextInteger();
			switch (choice) {
			case 1:
				stockStack.buy();
				break;
			case 2:
				stockStack.sell();
				break;
			default:
				System.out.println("Invalid Choice");
			}

		} while (ch < 2);
	}
}
