package com.bridgelabz.inventorymanagement.services;

import org.json.simple.JSONObject;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/01
 */
public interface IServices {
	public JSONObject addDetails();

	public void readFile();

	public double totalWeight();

	public double totalPrice();

	public double price(String item);

	public void remove();
}
