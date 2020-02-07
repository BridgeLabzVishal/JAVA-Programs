package com.bridgelabz.creational.prototype.services;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/08
 */
import java.util.ArrayList;
import java.util.List;
import com.bridgelabz.utility.InputUtility;

public class Services implements Cloneable {

	private List<String> employeeList = null;

	public Services() {
		employeeList = new ArrayList<String>();
	}

	public Services(List<String> list) {
		this.employeeList = list;
	}

	/**
	 * Define function to load data of employee
	 */
	public void loadData() {
		System.out.println("Enter the How many data you have");
		int number = InputUtility.nextInteger();
		while (number != 0) {
			System.out.println("Enter the Name of the Employee");
			employeeList.add(InputUtility.next());
			number--;
		}
	}

	public List<String> getEmpList() {
		return employeeList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String string : this.getEmpList()) {
			temp.add(string);
		}
		return new Services(temp);
	}
}
