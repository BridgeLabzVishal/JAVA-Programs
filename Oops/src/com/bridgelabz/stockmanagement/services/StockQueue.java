package com.bridgelabz.stockmanagement.services;

/**
 * @Author   :  Vishal Yadav
 * @Version  :  2.0
 * @Date     :  2019/12/17
 */
import java.util.Iterator;
import java.util.Set;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.bridgelabz.utility.Queue;
import com.bridgelabz.utility.Utility;

public class StockQueue<T> {
	private static final String PATH_BUYER = "/home/user/eclipse-workspace/Oops/src/com/bridgelabz/stockmanagement/repository/Buyer.json";
	private static final String PATH_SELLER = "/home/user/eclipse-workspace/Oops/src/com/bridgelabz/stockmanagement/repository/Seller.json";

	Queue<Object> queue = new Queue<Object>();
	JSONObject rootObject = new JSONObject();

	public void buyDetails() {
		rootObject = Utility.readDetails(PATH_BUYER);
		Set<?> key = rootObject.keySet();
		Iterator<?> iterator = key.iterator();

		while (iterator.hasNext()) {
			String string = (String) iterator.next();

			queue.enQueue(rootObject.get(string));
		}
		display();
	}

	public void display() {
		int size = queue.getSize();
		while (size > 0) {
			JSONArray array = (JSONArray) queue.deQueue();
			Iterator<?> iterator = array.iterator();
			while (iterator.hasNext()) {
				JSONObject innerObject = (JSONObject) iterator.next();
				System.out.println("*****************Details******************");
				System.out.println("Company_Name : " + innerObject.get("Company_Name"));
				System.out.println("Buyer_Name : " + innerObject.get("Buyer_Name"));
				System.out.println("Trade_Initated : " + innerObject.get("Trade_Initated "));
				System.out.println();
			}
			size--;
		}
		System.out.println("********************End********************");
	}

	public void sellDetails() {

		rootObject = Utility.readDetails(PATH_SELLER);
		Set<?> key = rootObject.keySet();
		Iterator<?> iterator = key.iterator();

		while (iterator.hasNext()) {
			String string = (String) iterator.next();

			queue.enQueue(rootObject.get(string));
		}
		display();
	}
}
