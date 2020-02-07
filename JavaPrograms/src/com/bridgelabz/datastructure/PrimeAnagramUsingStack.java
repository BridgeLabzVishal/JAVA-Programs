package com.bridgelabz.datastructure;

/**
 * @Author   :  Vishal Yadav
 * @Version  :  1.0
 * @Date     :  2019/11/24
 * Purpose   :  To check the Prime Numbers that are Anagram in the Range of 0 - 1000 in a
  				Stack using the Linked List and Print the Anagrams in the Reverse order.
 */
import com.bridgelabz.utility.Stack;
import com.bridgelabz.utility.Utility;

public class PrimeAnagramUsingStack {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();

		// logic to push the prime number into stack
		for (int i = 2; i <= 1000; i++) {
			if (Utility.isPrime(i)) {
				stack.push(i);
			}
		}

		// logic to store prime numbers from stack to array
		int size = stack.size();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = stack.pop();
		}

		// logic to check prime numbers are anagram or not
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (Utility.isAnagram(array[i], array[j]) && array[i] != 0 && array[j] != 0) {
					System.out.println(array[i] + " " + array[j]);
				}
			}
		}
	}
}
