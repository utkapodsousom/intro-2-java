package com.mycompany.chapter3;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount in double, for example 11.56: ");

		double amount = input.nextDouble();
		int remainingAmount = (int) (amount * 100);

		int numberOfOneDollars = remainingAmount / 100;
		String dollarName = numberOfOneDollars > 1 ? "dollars" : "dollar";
		remainingAmount = remainingAmount % 100;

		int numberOfQuarters = remainingAmount / 25;
		String quarterName = numberOfQuarters > 1 ? "quarters" : "quarter";
		remainingAmount = remainingAmount % 25;

		int numberOfDimes = remainingAmount / 10;
		String dimeName = numberOfDimes > 1 ? "dimes" : "dime";
		remainingAmount = remainingAmount % 10;

		int numberOfNickels = remainingAmount / 5;
		String nickelName = numberOfNickels > 1 ? "nickels" : "nickel";
		remainingAmount = remainingAmount % 5;

		int numberOfPennies = remainingAmount;
		String pennyName = remainingAmount > 1 ? "pennies" : "penny";
		input.close();

		System.out.println("Your amount " + amount + " consists of:");
		if (numberOfOneDollars > 0) {
			System.out.println(" " + numberOfOneDollars + " " + dollarName);
		}
		if (numberOfQuarters > 0) {
			System.out.println(" " + numberOfQuarters + " " + quarterName);
		}
		if (numberOfDimes > 0) {
			System.out.println(" " + numberOfDimes + " " + dimeName);
		}
		if (numberOfNickels > 0) {
			System.out.println(" " + numberOfNickels + " " + nickelName);
		}
		if (numberOfPennies > 0) {
			System.out.println(" " + numberOfPennies + " " + pennyName);
		}
	}
}
