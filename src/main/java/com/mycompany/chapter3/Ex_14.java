package com.mycompany.chapter3;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int coin = (int) (Math.round(Math.random()));

		System.out.print("Heads or tails?: ");
		String answer = input.nextLine();

		int answerNumber = 0;
		switch (answer.toLowerCase()) {
			case "heads" -> answerNumber = 0;
			case "tails" -> answerNumber = 1;
			default -> System.exit(1);
		}

		System.out.println("Your answer is " + (coin == answerNumber));

	}
}
