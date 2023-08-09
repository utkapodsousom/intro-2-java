package com.mycompany.chapter2;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_6 {

	public static void main(String[] args) {
		// sum the digits in an integer
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 1000: ");

		int number = input.nextInt();

		int ones = number % 10;
		int tens = number / 10 % 10;
		int hundreds = number / 100 % 10;
		int thousands = number / 1000;

		int sum = ones + tens + hundreds + thousands;

		System.out.println("The sum of the digist is " + sum);

		input.close();
	}
}
