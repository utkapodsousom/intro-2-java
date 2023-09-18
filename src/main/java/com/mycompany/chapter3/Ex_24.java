package com.mycompany.chapter3;

/**
 *
 * @author ootka
 */
public class Ex_24 {

	public static void main(String[] args) {
		int NUMBER_OF_CARDS = 52;

		int number = (int) (Math.random() * NUMBER_OF_CARDS);
		int rankNumber = number % 13;
		int suitNumber = number % 4;

		String rank = "";
		String suit = "";

		switch (rankNumber) {
			case 0:
				rank = "Ace";
				break;
			case 10:
				rank = "Jack";
				break;
			case 11:
				rank = "Queen";
				break;
			case 12:
				rank = "King";
				break;
			default:
				rank = number % 13 + 1 + "";	
		}

		switch (suitNumber) {
			case 0:
				suit = "Clubs";
				break;
			case 1:
				suit = "Diamonds";
				break;
			case 2:
				suit = "Hearts";
				break;
			case 3:
				suit = "Spades";
				break;
			default:
				System.err.println("Invalid suit number");
		}

		System.out.println("The card you picked is " + rank + " of " + suit);
	}
}
