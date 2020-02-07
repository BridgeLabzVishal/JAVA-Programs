package com.bridgelabz.datastructure;

/**
 * @Author   :  Vishal Yadav
 * @Version  :  1.0
 * @Date     :  2019/11/24
 * Purpose   :  To check the Prime Numbers that are Anagram in the Range of 0 - 1000 
 				in a Queue using the Linked List and Print the Anagrams from the Queue.
 */
import com.bridgelabz.utility.Queue;
import com.bridgelabz.utility.Utility;

public class PrimeAnagramUsingQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();

		// Logic to check the number is prime or not
		for (int i = 2; i <= 1000; i++) {
			if (Utility.isPrime(i)) {
				queue.enQueue(i);
			}
		}
		int size = queue.getSize();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = queue.deQueue();
		}

		// Logic to check the prime numbers are anagram and store in queue
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (Utility.isAnagram(array[i], array[j]) && array[i] != 0 && array[j] != 0) {
					queue.enQueue(array[i]);
					queue.enQueue(array[j]);
				}
			}
		}
		queue.display();
	}
}
