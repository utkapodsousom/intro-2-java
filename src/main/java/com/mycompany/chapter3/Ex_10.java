package com.mycompany.chapter3;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_10 {

	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);

		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}

		System.out.print("What is " + number1 + " - " + number2 + "? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();

		if (number1 - number2 == answer) {
			System.out.println("You are correct!");
			System.out.println("Round 2!");

			int number3 = (int) (Math.random() * 100);
			int number4 = (int) (Math.random() * 100);

			if (number3 < number4) {
				int temp = number3;
				number3 = number4;
				number4 = temp;
			}

			System.out.print("What is " + number3 + " - " + number4 + "? ");
			int answer2 = input.nextInt();

			if (number3 - number4 == answer2) {
				System.out.println("Correct!");
			} else {
				System.out.println("Incorrect :(");
			}

		} else {
			System.out.println("Your answer is wrong.");
			System.out.println(number1 + " - " + number2 + " must equal "
				+ (number1 - number2));
		}
		input.close();
	}

}
