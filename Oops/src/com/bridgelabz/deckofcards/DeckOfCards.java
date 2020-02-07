package com.bridgelabz.deckofcards;

/**
 *@Author   :  Vishal Yadav
 *@Version  :  1.0
 *@Date     :  2019/12/03
 **/
import java.util.Random;

public class DeckOfCards {
	int[][] cardsArray = new int[4][13];

	/**
	 * define function to assign cards to players
	 * 
	 * @param playerNumber
	 */
	public void assignCards(int playerNumber) {
		for (int i = 0; i < 9; i++) {
			shuffleCards(playerNumber);
		}
	}

	/**
	 * define function to shuffle cards of deck
	 * 
	 * @param playerNumber
	 */
	public void shuffleCards(int playerNumber) {
		Random random = new Random();
		int suit = random.nextInt(4);
		int rank = random.nextInt(13);
		if (cardsArray[suit][rank] != 0)
			shuffleCards(playerNumber);
		else
			cardsArray[suit][rank] = playerNumber;
	}

	/**
	 * define function to print the 2D array
	 * 
	 * @param playerNumber
	 */
	public void print(int playerNumber) {
		for (int suit = 0; suit < 4; suit++) {
			for (int rank = 0; rank < 13; rank++) {
				if (cardsArray[suit][rank] == playerNumber) {
					System.out.print(getSuit(suit) + " ==> " + getRank(rank) + "\t");
				}
			}
		}
		System.out.println("\n");
	}

	/**
	 * define function to get card number from deck
	 * 
	 * @param rank
	 * @return String
	 */
	public String getRank(int rank) {
		switch (rank) {
		case 0:
			return ("2");
		case 1:
			return ("3");
		case 2:
			return ("4");
		case 3:
			return ("5");
		case 4:
			return ("6");
		case 5:
			return ("7");
		case 6:
			return ("8");
		case 7:
			return ("9");
		case 8:
			return ("10");
		case 9:
			return ("Jack");
		case 10:
			return ("Queen");
		case 11:
			return ("King");
		case 12:
			return ("Ace");
		default:
			return ("Invalid");

		}

	}

	/**
	 * define function to get particular suit from deck
	 * 
	 * @param suit
	 * @return String
	 */
	public String getSuit(int suit) {
		switch (suit) {
		case 0:
			return "Clubs";

		case 1:
			return "Diamonds";

		case 2:
			return "Hearts";

		case 3:
			return "Spades";

		default:
			return "Invalid";
		}
	}
}
