package com.bridgelabz.creational.prototype.controller;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/08
 * @Purpose : Prototype design pattern program 
 */
import java.util.List;
import com.bridgelabz.creational.prototype.services.Services;
import com.bridgelabz.utility.InputUtility;

public class Controller {

	public static void main(String[] args) throws CloneNotSupportedException {

		Services employee = new Services();
		employee.loadData();

		Services empsNew = (Services) employee.clone();
		Services empsNew1 = (Services) employee.clone();

		List<String> list = empsNew.getEmpList();

		System.out.println("Enter the choice ");
		System.out.println("1. Add Data");
		System.out.println("2. Remove");
		System.out.println("3. Exit");

		int choice = InputUtility.nextInteger();
		System.out.println("Enter the How many Data you have");
		int number = InputUtility.nextInteger();
		List<String> list1 = empsNew1.getEmpList();

		while (number != 0) {
			switch (choice) {
			case 1:
				System.out.println("Enter the Name of the Employee to add ");
				list.add(InputUtility.next());
				number--;
				break;

			case 2:
				System.out.println("Enter the Name of the Employee to remove");
				list.remove(InputUtility.next());
				number--;
				break;

			case 3:
				System.out.println("ThankYou!!!");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid");
				break;
			}
		}
		System.out.println("emps List: " + employee.getEmpList());
		System.out.println("empsNew List: " + list);
		System.out.println("empsNew1 List: " + list1);
	}
}
