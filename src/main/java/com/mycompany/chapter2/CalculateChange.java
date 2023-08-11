package com.mycompany.chapter2;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class CalculateChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount in integer, where last two digist represent cents, for example 1156: ");

		int amount = input.nextInt();

		int numberOfOneDollars = amount / 100;
		amount = amount % 100;

		int numberOfQuarters = amount / 25;
		amount = amount % 25;

		int numberOfDimes = amount / 10;
		amount = amount % 10;

		int numberOfNickels = amount / 5;
		amount = amount % 5;

		int numberOfPennies = amount;
		input.close();

		System.out.println("Your amount " + amount + " consists of:");
		System.out.println(" " + numberOfOneDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");
	}
}
