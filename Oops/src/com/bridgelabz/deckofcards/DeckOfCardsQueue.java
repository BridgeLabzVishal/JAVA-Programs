package com.bridgelabz.deckofcards;

/**
 *@Author   :  Vishal Yadav
 *@Version  :  1.0
 *@Date     :  2019/12/03
 *Purpose   :  Program to find deck of cards having suit ("Clubs","Diamonds", "Hearts", "Spades")
  			   & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace").
  			   To create a Player Object having Deck of Cards, and having ability to Sort by Rank 
  			   and maintain the cards in a Queue implemented using Linked List.Print the Player and 
  			   the Cards received by each Player.
 **/
import java.util.Random;
import com.bridgelabz.utility.Queue;

public class DeckOfCardsQueue {

	// creating object of Queue
	Queue<Player> playerQueue = new Queue<Player>();

	int[][] cardsArray = new int[4][13]; // 2D array

	public static void main(String[] args) {
		DeckOfCardsQueue deckOfCards = new DeckOfCardsQueue();
		deckOfCards.add();
		deckOfCards.dequeuePlayers();
	}

	public void add() {
		for (int i = 1; i <= 4; i++) {
			assignCards();
		}
	}

	/**
	 * define function to assign cards to players
	 * 
	 * @param playerNumber
	 */
	public void assignCards() {
		Player player = new Player();
		for (int i = 0; i < 9; i++) {
			shuffleCards(player);
		}
		player.enQueueCards();
		playerQueue.enQueue(player);
	}

	/**
	 * define function to shuffle cards of deck
	 * 
	 * @param playerNumber
	 */
	public void shuffleCards(Player player) {
		Random random = new Random();
		int suit = random.nextInt(4);
		int rank = random.nextInt(13);
		if (cardsArray[suit][rank] != 0) {
			shuffleCards(player);

		} else {
			player.addCard(suit, rank);
			cardsArray[suit][rank] = 1;
		}
	}

	/**
	 * define function to dequeue players from queue
	 */
	public void dequeuePlayers() {
		for (int i = 1; i <= 4; i++) {
			Player player = playerQueue.deQueue();
			System.out.println("Player " + i + "'s cards:");
			printPlayerCards(player);
			System.out.println();
		}
	}

	/**
	 * define function to print Player's cards
	 * 
	 * @param playerNumber
	 */
	public void printPlayerCards(Player player) {
		for (int i = 0; i < 9; i++) {
			Cards card = player.getCard();
			System.out.print(card.getSuit() + " ==> " + card.getRank() + "\t");
		}
		System.out.println("\n");
	}
}
