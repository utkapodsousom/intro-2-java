package com.mycompany.chapter2;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_13 {

	public static void main(String[] args) {
		// compound value
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		double ANNUAL_INTEREST_RATE = 0.05;
		double monthlyInterestRate = ANNUAL_INTEREST_RATE / 12;
		double monthlySavingAmount = input.nextDouble();
		// first month
		double savings = monthlySavingAmount * (1 + monthlyInterestRate);
		// second month
		savings = (monthlySavingAmount + savings) * (1 + monthlyInterestRate);
		// third month
		savings = (monthlySavingAmount + savings) * (1 + monthlyInterestRate);
		// fourth month
		savings = (monthlySavingAmount + savings) * (1 + monthlyInterestRate);
		// fifth month
		savings = (monthlySavingAmount + savings) * (1 + monthlyInterestRate);
		// sixth month
		savings = (monthlySavingAmount + savings) * (1 + monthlyInterestRate);

		System.out.println("After the sixth month, the account value is $" + savings);

		input.close();

	}
}
