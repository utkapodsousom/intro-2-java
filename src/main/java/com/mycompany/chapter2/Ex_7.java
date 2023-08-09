package com.mycompany.chapter2;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_7 {

	public static void main(String[] args) {
		// find the number of years
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of minutes: ");

		long minutes = input.nextLong();
		long totalDays = minutes / 60 / 24;
		long remainingDays = totalDays % 365;
		long totalYears = totalDays / 365;

		System.out.println(minutes + " minutes is approximately " + totalYears + " years and " + remainingDays + " days");

		input.close();
	}
}
