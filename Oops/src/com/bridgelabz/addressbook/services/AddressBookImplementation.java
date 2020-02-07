package com.bridgelabz.addressbook.services;

/**
 *@Author   :  Vishal Yadav
 *@Version  :  1.0
 *@Date     :  2019/12/03
 **/
import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.bridgelabz.addressbook.model.Person;
import com.bridgelabz.utility.InputUtility;
import com.bridgelabz.utility.Utility;

public class AddressBookImplementation implements IAddressBook {
	private static final String PATH = "/home/user/eclipse-workspace/Oops/src/com/bridgelabz/addressbook/repository/";

	Person person = new Person();

	@SuppressWarnings("unchecked")
	/**
	 * define function to add person details
	 * 
	 * @return JSONObject
	 */
	public JSONObject addPerson() {
		JSONObject jsonObject = new JSONObject();

		System.out.println("Enter person Information\n");

		System.out.println("Enter the First name:");
		person.setFirst_name(InputUtility.next());
		jsonObject.put("first_name", person.getFirst_name());

		System.out.println("Enter the LastName:");
		person.setLast_name(InputUtility.next());
		jsonObject.put("last_name", person.getLast_name());

		System.out.println("Enter Phone Number:");
		person.setPhone_number(InputUtility.nextlong());
		jsonObject.put("Phone_number", person.getPhone_number());

		System.out.println("Enter City:");
		person.setCity(InputUtility.next());
		jsonObject.put("City", person.getCity());

		System.out.println("Enter State:");
		person.setState(InputUtility.next());
		jsonObject.put("State", person.getState());

		System.out.println("Enter Address : ");
		person.setAddress(InputUtility.next());
		jsonObject.put("Address", person.getAddress());

		System.out.println("Enter ZIP/PIN Code:");
		person.setZip(InputUtility.nextInteger());
		jsonObject.put("Zip", person.getZip());

		return jsonObject;
	}

	/**
	 * define function to read data from file
	 */
	public void readFile() {
		System.out.println("Enter a first name : ");
		String first_name = InputUtility.next();
		System.out.println("Enter a last name : ");
		String last_name = InputUtility.next();

		String string = Utility.readFromFile(PATH + first_name + "_" + last_name + ".json");
		JSONParser parser = new JSONParser();

		JSONObject objectFile = null;
		try {
			objectFile = (JSONObject) parser.parse(string);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(objectFile.toJSONString());
	}

	@SuppressWarnings("unchecked")
	/**
	 * define function to update details in address book
	 * 
	 * @return JSONObject
	 */
	public JSONObject update() {
		JSONObject object = new JSONObject();
		System.out.println("Enter a first name : ");
		String first_name = InputUtility.next();
		System.out.println("Enter a last name : ");
		String last_name = InputUtility.next();
		String stringFile = Utility.readFromFile(PATH + first_name + "_" + last_name + ".json");
		JSONParser parser = new JSONParser();
		JSONObject objectFile = null;
		try {
			objectFile = (JSONObject) parser.parse(stringFile);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		JSONArray arrayItems = (JSONArray) objectFile.get("Address Book");
		Iterator<?> iterator = arrayItems.iterator();
		while (iterator.hasNext()) {
			JSONObject jsonObject = (JSONObject) iterator.next();
			if (jsonObject.get("first_name").equals(first_name) && jsonObject.get("last_name").equals(last_name)) {
				object.put("first_name", person.getFirst_name());

				object.put("last_name", person.getLast_name());

				System.out.println("Enter Phone Number:");
				person.setPhone_number(InputUtility.nextlong());
				object.put("Phone_number", person.getPhone_number());

				System.out.println("Enter City:");
				person.setCity(InputUtility.next());
				object.put("City", person.getCity());

				System.out.println("Enter State:");
				person.setState(InputUtility.next());
				object.put("State", person.getState());

				System.out.println("Enter Address : ");
				person.setAddress(InputUtility.next());
				object.put("Address", person.getAddress());

				System.out.println("Enter ZIP/PIN Code:");
				person.setZip(InputUtility.nextInteger());
				object.put("Zip", person.getZip());
			}
		}
		return object;
	}

	@SuppressWarnings("resource")
	/**
	 * define function to write data into file
	 * 
	 * @param firstName   --> String
	 * @param lastName    --> String
	 * @param arrayObject
	 */
	public void writeToFile(String firstName, String lastName, JSONObject arrayObject) {
		File file = null;
		try {
			file = new File(PATH + firstName + "_" + lastName + ".json");
			if (!file.exists())
				file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(arrayObject.toString());
			fileWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
