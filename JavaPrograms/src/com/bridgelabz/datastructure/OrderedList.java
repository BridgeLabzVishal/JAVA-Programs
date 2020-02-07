package com.bridgelabz.datastructure;

/**
 * @Author   :  Vishal Yadav
 * @Version  :  1.0
 * @Date     :  2019/11/22
 * Purpose   :  Read a List of Numbers from a file and arrange it ascending Order in a
       			Linked List. Take user input for a number, if found then pop the number 
       			out of the list else insert the number in appropriate position.
 */
import java.io.FileWriter;
import java.io.IOException;
import com.bridgelabz.utility.LinkedList;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.InputUtility;

public class OrderedList {
	public static void main(String[] args) throws IOException {

		// object of LinkedList class
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println("Enter the number you want to search :");
		Integer item = InputUtility.nextInteger();

		// logic to read elements from file and store in string
		String string = Utility.readFromFile("order.txt");
		String[] strArray = string.split(" ");
		int size = strArray.length;
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = Integer.parseInt(strArray[i]);
		}
		// sorting the array
		int[] sortedArray = Utility.bubbleSort(array, size);

		// adding in data into linkedlist
		for (Integer number : sortedArray) {
			list.add(number);
		}

		// write into file
		FileWriter fileWriter = new FileWriter("order.txt");
		// logic to search the item into the file
		if (list.search(item) == true) {
			list.removeItem(item); // removing the item if its already in file
		} else {
			list.add(item); // adding the item into file
		}
		list.display();
		int length = list.size();
		for (int i = 0; i <= length; i++) {
			fileWriter.write(list.pop(0) + " ");
		}
		fileWriter.close();
	}
}
