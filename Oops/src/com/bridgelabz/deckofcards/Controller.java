package com.bridgelabz.deckofcards;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/12/03
 * @Purpose : Program to find deck of cards having suit ("Clubs","Diamonds",
 *          "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8", "9",
 *          "10","Jack", "Queen", "King", "Ace"). Shuffle the cards using Random
 *          method and then distribute 9 Cards to 4 Players and Print the Cards
 *          the received by the 4 Players using 2D Array
 **/
public class Controller {

	public static void main(String[] args) {

		// object initialization
		DeckOfCards deckOfCards = new DeckOfCards();
		int playerNumber;
		for (playerNumber = 1; playerNumber <= 4; playerNumber++) {
			deckOfCards.assignCards(playerNumber);
			System.out.println("Player " + playerNumber + "'s cards:");
			deckOfCards.print(playerNumber);
		}
	}
}
