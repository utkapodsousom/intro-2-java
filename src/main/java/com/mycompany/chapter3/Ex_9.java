package com.mycompany.chapter3;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_9 {

	public static void main(String[] args) {
		// check ISBN-10
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String firstNine = scanner.nextLine();

		String checksum = calculateChecksum(firstNine);

		System.out.println("The ISBN-10 number is " + firstNine + checksum);
	}

	public static String calculateChecksum(String input) {
		int sum = 0;
		for (int i = input.length() - 1; i >= 0; i--) {
			sum += Character.getNumericValue(input.charAt(i)) * (i + 1);
		}

		return sum % 11 == 10 ? "X" : String.valueOf(sum % 11);
	}

}
