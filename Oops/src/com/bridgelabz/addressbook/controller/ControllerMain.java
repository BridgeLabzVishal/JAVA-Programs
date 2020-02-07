package com.bridgelabz.addressbook.controller;

/**
 *@Author   :  Vishal Yadav
 *@Version  :  1.0
 *@Date     :  2019/12/03
 *Purpose   :  To create address book for different users
 **/
import java.util.ArrayList;
import org.json.simple.JSONObject;
import com.bridgelabz.addressbook.services.AddressBookImplementation;
import com.bridgelabz.addressbook.services.IAddressBook;
import com.bridgelabz.utility.InputUtility;

public class ControllerMain {

	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		IAddressBook addressBook = new AddressBookImplementation();

		// creating a JSON object
		JSONObject arrayObject = new JSONObject();
		ArrayList<JSONObject> list = new ArrayList<JSONObject>();
		int ch = 0;
		do {
			System.out.println("*************************Address Book*************************");
			System.out.println("1. New ");
			System.out.println("2. Open ");
			System.out.println("3. Update ");
			System.out.println("4. Exit");

			int choice = InputUtility.nextInteger();
			switch (choice) {
			case 1:

				// for adding details
				list.add(addressBook.addPerson());
				arrayObject.put("Address Book", list);
				System.out.println("*********************File Name**************************");
				System.out.println("Enter a first name :");
				String firstName = InputUtility.next();
				System.out.println("Enter a last name :");
				String lastName = InputUtility.next();
				addressBook.writeToFile(firstName, lastName, arrayObject);
				break;

			case 2:
				// for reading a data from file
				addressBook.readFile();
				break;

			case 3:
				// for updating a details
				list.add(addressBook.update());
				arrayObject.put("Address Book", list);
				System.out.println("*********************File Name**************************");
				System.out.println("Enter a first name :");
				String first_name = InputUtility.next();
				System.out.println("Enter a last name :");
				String last_name = InputUtility.next();
				addressBook.writeToFile(first_name, last_name, arrayObject);
				break;

			case 4:
				System.out.println("Thank You");
				System.exit(0);

			default:
				System.out.println("you have enter a wrong choice");
				break;
			}

		} while (ch < 3);
	}
}
