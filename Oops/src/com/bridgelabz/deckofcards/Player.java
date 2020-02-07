package com.bridgelabz.deckofcards;

/**
 *@Author   :  Vishal Yadav
 *@Version  :  1.0
 *@Date     :  2019/12/03
 **/
import com.bridgelabz.utility.Queue;

public class Player {

	// creating object of Queue of Cards type
	Queue<Cards> cardQueue = new Queue<Cards>();
	int[][] cardArray = new int[4][13]; // 2D array

	/**
	 * define function to add card in 2D array
	 * 
	 * @param suit
	 * @param rank
	 */
	public void addCard(int suit, int rank) {
		cardArray[suit][rank] = 1;
	}

	/**
	 * define function to get card from queue
	 * 
	 * @return
	 */
	public Cards getCard() {
		return cardQueue.deQueue();
	}

	/** Enqueues cards in ascending order **/
	public void enQueueCards() {
		for (int suit = 0; suit < 4; suit++) {
			for (int rank = 0; rank < 13; rank++) {
				if (cardArray[suit][rank] == 1)
					cardQueue.enQueue(new Cards(suit, rank));
			}
		}
	}
}
