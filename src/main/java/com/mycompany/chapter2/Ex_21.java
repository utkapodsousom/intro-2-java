package com.mycompany.chapter2;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_21 {

	public static void main(String[] args) {
		// calculate future investment value
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter investment amount: ");
		double amount = scanner.nextDouble();

		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = scanner.nextDouble();

		System.out.print("Enter number of years: ");
		int years = scanner.nextInt();

		double monthlyInterestRate = annualInterestRate / 1200;

		double fiv = amount * Math.pow(1 + monthlyInterestRate, years * 12);

		System.out.println("Future value is $" + fiv);

		scanner.close();
	}
}
