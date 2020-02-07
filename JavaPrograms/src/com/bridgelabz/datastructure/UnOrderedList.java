package com.bridgelabz.datastructure;

/**
 * @Author   :  Vishal Yadav
 * @Version  :  1.0
 * @Date     :  2019/11/22
 * Purpose   :  Read the Text from a file, split it into words and arrange it as Linked List.
				Take a user input to search a Word in the List. If the Word is not found then 
				add it to the list, and if it found then remove the word from the List. In the
				end save the list into a file.
 */
import java.io.FileWriter;
import java.io.IOException;
import com.bridgelabz.utility.InputUtility;
import com.bridgelabz.utility.LinkedList;
import com.bridgelabz.utility.Utility;

public class UnOrderedList {

	public static void main(String[] args) throws IOException {

		LinkedList<String> linkedList = new LinkedList<String>();
		System.out.println("Enter the word you want to search :");
		String item = InputUtility.nextLine();

		// read from file and assign into String s
		String string = Utility.readFromFile("C:\\Users\\Robih_Hood\\eclipse-workspace\\myProject\\message.txt");

		String[] words = string.split(" ");

		// adding in data into linkedlist
		for (String word : words)
			linkedList.add(word);

		// to write into file
		FileWriter fileWriter = new FileWriter("C:\\Users\\Robih_Hood\\eclipse-workspace\\myProject\\message.txt");

		// logic to search the word,remove and add
		if (linkedList.search(item) == true) {
			linkedList.removeItem(item);
		} else {
			linkedList.add(item);
		}
		linkedList.display();
		int size = linkedList.size();

		// System.out.println(size);
		for (int i = 0; i <= size; i++) {
			fileWriter.write(linkedList.pop(0) + " ");
		}
		fileWriter.close();
	}
}
