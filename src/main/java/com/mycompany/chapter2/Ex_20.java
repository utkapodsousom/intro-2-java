package com.mycompany.chapter2;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_20 {

	public static void main(String[] args) {
		// calculate interest
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");

		double balance = scanner.nextDouble();
		double interestRate = scanner.nextDouble();

		double interest = balance * (interestRate / 1200);

		System.out.println("The interest is " + interest);

		scanner.close();
	}
}
