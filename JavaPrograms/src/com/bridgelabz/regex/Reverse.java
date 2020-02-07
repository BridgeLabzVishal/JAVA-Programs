package com.bridgelabz.regex;

/**
 * @Author    :  Vishal Yadav
 * @Version   :  1.0
 * @Date      :  2019/11/20
 * @Purpose   :  to reverse the individual words in the string
 */
import com.bridgelabz.utility.InputUtility;
import com.bridgelabz.utility.Utility;

public class Reverse {
	/**
	 * define function reverseWords() to reverse string
	 * 
	 * @param string
	 * @return String
	 */
	public static String reverseWords(String string) {
		String reversed = "";
		// logic to reverse
		String[] word = string.split("\\s");
		for (String w : word) {
			StringBuilder stringBuilder = new StringBuilder(w);
			stringBuilder.reverse();
			reversed += stringBuilder.toString() + " ";
		}
		return reversed;
	}

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		String string = InputUtility.nextLine();
		String retString = Reverse.reverseWords(string);

		if (Utility.writeToFile(retString, "message.txt"))
			System.out.println("successful written");
		else
			System.out.println("not done");
		System.out.println(Utility.readFromFile("message.txt"));
	}
}
