package com.bridgelabz.addressbook.services;

/**
 *@Author   :  Vishal Yadav
 *@Version  :  1.0
 *@Date     :  2019/12/03
 **/
import org.json.simple.JSONObject;

public interface IAddressBook {
	public JSONObject addPerson();

	public void readFile();

	public JSONObject update();

	public void writeToFile(String firstName, String lastName, JSONObject arrayObject);

}
