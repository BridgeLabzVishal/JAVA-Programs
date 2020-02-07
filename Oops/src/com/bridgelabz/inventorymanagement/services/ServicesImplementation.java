package com.bridgelabz.inventorymanagement.services;

/**
 *@Author   :  Vishal Yadav
 *@Version  :  1.0
 *@Date     :  2019/11/30
 *@Purpose   :  To maintain the Inventory Data System 
 **/
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.bridgelabz.utility.InputUtility;
import com.bridgelabz.utility.Utility;

public class ServicesImplementation implements IServices {
	private static final String PATH = "/home/user/eclipse-workspace/Oops/src/com/bridgelabz/inventorymanagement/repository/Inventory.json";
	JSONObject rootObject = new JSONObject();

	@SuppressWarnings("unchecked")
	/**
	 * Define function to add details in the Inventory Data System
	 * 
	 * @return JSONObject
	 */
	public JSONObject addDetails() {
		JSONObject object = new JSONObject();

		System.out.print("Enter a name : ");
		String name = InputUtility.next();
		InputUtility.nextLine();

		System.out.print("Enter a price : ");
		double price = InputUtility.nextDouble();

		System.out.print("Enter a weight(in kg) :");
		double weight = InputUtility.nextDouble();

		object.put("Name", name);
		object.put("Price", price);
		object.put("Weight", weight);

		return object;
	}

	/**
	 * Define function to read the data from Inventory Data System
	 */
	public void readFile() {
		String string = Utility.readFromFile(PATH);
		JSONParser parser = new JSONParser();
		JSONObject objectFile = null;
		try {
			objectFile = (JSONObject) parser.parse(string);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.printf("Rice Details %s", objectFile.get("Rice"));
		System.out.println();
		System.out.printf("Pulses Details %s", objectFile.get("Pulses"));
		System.out.println();
		System.out.printf("Wheats Details %s", objectFile.get("Wheats"));
		System.out.println();
	}

	/**
	 * define function to calculate the total weight of items in Inventory Data
	 * System
	 * 
	 * @return double
	 */
	public double totalWeight() {
		double totalWeight = 0;
		// reading a data from file
		String stringFile = Utility.readFromFile(PATH);
		JSONParser parser = new JSONParser();
		JSONObject objectFile = null;
		try {
			objectFile = (JSONObject) parser.parse(stringFile);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		JSONObject riceObject = (JSONObject) objectFile.get("Rice");
		double riceWeight = (double) riceObject.get("Weight");

		JSONObject pulsesObject = (JSONObject) objectFile.get("Pulses");
		double pulsesWeight = (double) pulsesObject.get("Weight");

		JSONObject wheatsObject = (JSONObject) objectFile.get("Wheats");
		double wheatsWeight = (double) wheatsObject.get("Weight");

		totalWeight = riceWeight + pulsesWeight + wheatsWeight;
		return totalWeight;
	}

	/**
	 * define function to calculate the total price of items
	 * 
	 * @return double
	 */
	public double totalPrice() {
		double totalPrice = 0;
		String stringFile = Utility.readFromFile(PATH);
		JSONParser parser = new JSONParser();
		JSONObject objectFile = null;
		try {
			objectFile = (JSONObject) parser.parse(stringFile);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		JSONObject riceObject = (JSONObject) objectFile.get("Rice");
		double ricePrice = (double) riceObject.get("Price");
		double riceWeight = (double) riceObject.get("Weight");

		JSONObject pulsesObject = (JSONObject) objectFile.get("Pulses");
		double pulsesPrice = (double) pulsesObject.get("Price");
		double pulsesWeight = (double) pulsesObject.get("Weight");

		JSONObject wheatsObject = (JSONObject) objectFile.get("Wheats");
		double wheatsPrice = (double) wheatsObject.get("Price");
		double wheatsWeight = (double) wheatsObject.get("Weight");

		totalPrice = (ricePrice * riceWeight) + (pulsesPrice * pulsesWeight) + (wheatsPrice * wheatsWeight);
		return totalPrice;
	}

	/**
	 * define function to fetch the price of item
	 * 
	 * @param item ==>String
	 * @return double
	 */
	public double price(String item) {

		String itemRice = "Rice";
		int rice = itemRice.compareToIgnoreCase(item);
		String itemWheats = "Wheats";
		int wheats = itemWheats.compareToIgnoreCase(item);
		String itemPulses = "Pulses";
		int pulses = itemPulses.compareToIgnoreCase(item);

		String stringFile = Utility.readFromFile(PATH);
		JSONParser parser = new JSONParser();
		JSONObject objectFile = null;
		try {
			objectFile = (JSONObject) parser.parse(stringFile);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		double itemPrice = 0;
		if (rice == 0) {
			JSONObject itemObject = (JSONObject) objectFile.get("Rice");
			itemPrice = (double) itemObject.get("Price");
			return itemPrice;
		}
		if (pulses == 0) {
			JSONObject itemObject = (JSONObject) objectFile.get("Pulses");
			itemPrice = (double) itemObject.get("Price");
			return itemPrice;
		}
		if (wheats == 0) {
			JSONObject itemObject = (JSONObject) objectFile.get("Wheats");
			itemPrice = (double) itemObject.get("Price");
			return itemPrice;
		}
		return 0;
	}

	public void remove() {
		rootObject = Utility.readDetails(PATH);
		System.out.println("Enter a name : ");
		String name = InputUtility.next();
		if (rootObject.containsKey(name)) {
			rootObject.remove(name);
		}
		Utility.writeToFile(rootObject, PATH);
	}
}
