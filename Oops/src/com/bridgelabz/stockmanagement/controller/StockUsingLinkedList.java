package com.bridgelabz.stockmanagement.controller;

/**
 * @Author : Vishal Yadav
 * @Version : 2.0
 * @Date : 2019/12/16
 */
import com.bridgelabz.stockmanagement.services.StockLinkedList;
import com.bridgelabz.utility.InputUtility;

public class StockUsingLinkedList {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		StockLinkedList stock = new StockLinkedList();

		int ch = 0;
		do {
			System.out.println("Enter your choice : ");
			System.out.println("1.Add ");
			System.out.println("2.Remove ");
			System.out.println("3.Display ");
			System.out.println("4.Exit ");
			int choice = InputUtility.nextInteger();
			switch (choice) {
			case 1:
				stock.add();
				break;

			case 2:
				stock.remove();
				break;

			case 3:
				stock.display();
				break;

			case 4:
				System.exit(0);

			default:
				System.out.println("Invalid Choice");
			}

		} while (ch < 4);
	}
}
