package com.bridgelabz.logicalprogram;

/**
 * @Author    :  Vishal Yadav
 * @Version   :  1.0
 * @Date      :  2019/11/17
 * Purpose    :  Simulates a gambler who start with $stake and place fair $1 bets until he/she 
                 goes broke (i.e. has no money) or reach $goal. Keeps track of the number of
                 times he/she wins and the number of bets he/she makes. Print Number of Wins
                 and Percentage of Win and Loss.
 */
import com.bridgelabz.utility.InputUtility;

public class Gambler {
	/**
	 * Define gamblingGame() function to calculate the number of wins and percentage
	 * of win and loss
	 * 
	 * @param stake  -->int
	 * @param goal   -->int
	 * @param trails -->int
	 */
	public static void gamblingGame(int stake, int goal, int trails) {
		int cash;
		int bets = 0;
		int wins = 0;
		for (int i = 0; i < trails; i++) {
			cash = stake;
			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() > 0.5) {
					cash++;
				} else {
					cash--;
				}
			}
			if (cash == goal) {
				wins++;
			}
		}

		// Calculating percentage of wins and average of bets
		System.out.println("Percentage of game wins : " + 100.0 * wins / trails);
		System.out.println("Average of bets : " + 1.0 * bets / trails);
	}

	public static void main(String[] args) {
		System.out.println("Enter Stake value :");
		int stake = InputUtility.nextInteger();
		System.out.println("Enter Goal value :");
		int goal = InputUtility.nextInteger();
		System.out.println("Enter number of trails : ");
		int trails = InputUtility.nextInteger();
		Gambler.gamblingGame(stake, goal, trails);
	}
}
