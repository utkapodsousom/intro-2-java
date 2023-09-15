package com.mycompany.chapter3;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_5 {

	public static void main(String[] args) {
		// find future dates
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter today's day: ");
		int today = scanner.nextInt();
		String todayName = "";

		switch (today) {
			case 0:
				todayName = "Monday";
				break;
			case 1:
				todayName = "Tuesday";
				break;
			case 2:
				todayName = "Wednesday";
				break;
			case 3:
				todayName = "Thursday";
				break;
			case 4:
				todayName = "Friday";
				break;
			case 5:
				todayName = "Saturday";
				break;
			case 6:
				todayName = "Sunday";
				break;
			default:
				System.out.println("invalid day number");
		}

		System.out.print("Enter the number of days elapsed since today: ");
		int elapsed = scanner.nextInt();
		String futureName = "";

		switch ((today + elapsed) % 7) {
			case 0:
				futureName = "Monday";
				break;
			case 1:
				futureName = "Tuesday";
				break;
			case 2:
				futureName = "Wednesday";
				break;
			case 3:
				futureName = "Thursday";
				break;
			case 4:
				futureName = "Friday";
				break;
			case 5:
				futureName = "Saturday";
				break;
			case 6:
				futureName = "Sunday";
				break;
			default:
				System.out.println("invalid day number");

		}

		System.out.println("Today is " + todayName + " and the future day is " + futureName);

		scanner.close();
	}
}
