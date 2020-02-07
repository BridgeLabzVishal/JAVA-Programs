package com.bridgelabz.datastructure;

/**
 * @Author   :  Vishal Yadav
 * @Version  :  1.0
 * @Date     :  2019/11/22
 * Purpose   :  Program which creates Banking Cash Counter where people come in to
  				deposit Cash and withdraw Cash. Have an input panel to add people 
  				to Queue to either deposit or withdraw money and dequeue the people
 */
import com.bridgelabz.utility.Queue;
import com.bridgelabz.utility.InputUtility;

public class Banking {
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		int balance = 1000;
		int ch = 0;
		// logic to deposit,withdraw and number of people in queue
		do {
			System.out.println("-----------------Banking Cash Counter------------------------");
			System.out.println("Enter a choice : ");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Number of people in Queue");
			System.out.println("4. Exit");
			int choice = InputUtility.nextInteger();
			switch (choice) {
			case 1:
				System.out.println("Enter the amount you want to deposit : ");
				int desposit = InputUtility.nextInteger();
				queue.enQueue(desposit);
				queue.display();
				break;

			case 2:
				System.out.println("Enter the amount you want to withdraw : ");
				int withdraw = InputUtility.nextInteger();
				if (balance >= withdraw) {
					balance = balance - withdraw;
					System.out.println("Your available amount is : ");
					queue.enQueue(balance);
					queue.display();
				} else
					System.out.println("Insufficient Balance");
				break;

			case 3:
				int number = queue.getSize();
				System.out.println("Number of people in Queue : " + number);
				System.out.println(queue.peek());
				break;

			case 4:
				System.exit(0);

			default:
				System.out.println("You entered wrong choice");
				break;
			}
		} while (ch < 5);
	}
}
