package com.bridgelabz.inventorymanagement.controller;

/**
 *@Author   :  Vishal Yadav
 *@Version  :  1.0
 *@Date     :  2019/11/30
 *@Purpose  :  To create a JSON file having Inventory Details for Rice, Pulses 
 			   and Wheat with properties name, weight, price per kg.
 */
import org.json.simple.JSONObject;
import com.bridgelabz.inventorymanagement.services.IServices;
import com.bridgelabz.inventorymanagement.services.ServicesImplementation;
import com.bridgelabz.utility.InputUtility;
import com.bridgelabz.utility.Utility;

public class Controller {
	private static final String PATH = "/home/user/eclipse-workspace/Oops/src/com/bridgelabz/inventorymanagement/repository/Inventory.json";

	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();
		IServices services = new ServicesImplementation();
		int ch = 0;
		do {
			System.out.println("*************************Inventory Data*************************");
			System.out.println("1. Add Details");
			System.out.println("2. View Deatils");
			System.out.println("3. Total Weight");
			System.out.println("4. Price(per kg)");
			System.out.println("5. Total Price");
			System.out.println("6. Remove");
			System.out.println("7. Exit");

			int choice = InputUtility.nextInteger();
			switch (choice) {
			case 1:
				System.out.println("Choose any one : ");
				System.out.println("1.Add rice ");
				System.out.println("2.Add pulses ");
				System.out.println("3.Add wheats ");
				int choice1 = InputUtility.nextInteger();
				jsonObject = Utility.readDetails(PATH);
				switch (choice1) {
				case 1:
					System.out.println("Enter a details of Rice");
					jsonObject.put("Rice", services.addDetails());
					Utility.writeToFile(jsonObject, PATH);
					break;
				case 2:
					System.out.println("Enter a details of Pulses");
					jsonObject.put("Pulses", services.addDetails());
					Utility.writeToFile(jsonObject, PATH);
					break;
				case 3:
					System.out.println("Enter a details of Wheats");
					jsonObject.put("Wheats", services.addDetails());
					Utility.writeToFile(jsonObject, PATH);
					break;
				default:
					System.out.println("You entered wrong choice");
					break;
				}
				break;
			case 2:
				services.readFile();
				break;
			case 3:
				System.out.println("Total Weight of Rice,Pulses and Wheats : " + services.totalWeight());
				break;
			case 4:
				System.out.println("Enter the item name : ");
				String item = InputUtility.next();
				System.out.println(item + " is " + services.price(item) + " Rs per kg.");
				break;
			case 5:
				System.out.println("Total Price of Rice,Pulses and Wheats : " + services.totalPrice());
				break;
			case 6:
				services.remove();
				break;
			case 7:
				System.out.println("Thank You");
				System.exit(0);

			default:
				System.out.println("You entered wrong choice");
				break;
			}
		} while (ch < 7);
	}
}
