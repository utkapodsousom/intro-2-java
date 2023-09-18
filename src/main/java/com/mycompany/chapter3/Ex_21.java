package com.mycompany.chapter3;

/**
 *
 * @author ootka
 */
import java.io.IOException;
import java.util.Scanner;

public class Ex_21 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: (e.g., 2012): ");
		int year = input.nextInt();

		System.out.print("Enter month: 1-12: ");
		int month = input.nextInt();

		System.out.print("Enter the day of the month: 1-31: ");
		int day = input.nextInt();

		if (month == 1) {
			month = 13;
			year -= 1;
		} else if (month == 2) {
			month = 14;
			year -= 1;
		}

		int centuryYear = year % 100;
		int dow = day + ((26 * (month + 1)) / 10);
		dow += centuryYear + (centuryYear / 4) + ((year / 100) / 4) + 5 * (year / 100);
		dow %= 7;

		String dowName = "";
		switch (dow) {
			case 0:
				dowName = "Saturday";
				break;
			case 1:
				dowName = "Sunday";
				break;
			case 2:
				dowName = "Monday";
				break;
			case 3:
				dowName = "Tuesday";
				break;
			case 4:
				dowName = "Wednesday";
				break;
			case 5:
				dowName = "Thursday";
				break;
			case 6:
				dowName = "Friday";
				break;
			default:
				System.out.println("Invalid day of week number");
		}

		input.close();
		System.out.println("Day of the week is " + dowName);
	}
}
