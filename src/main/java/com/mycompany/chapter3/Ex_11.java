package com.mycompany.chapter3;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_11 {

	public static void main(String[] args) {
		System.out.print("Enter the month and the year: ");
		Scanner input = new Scanner(System.in);
		int monthNumber = input.nextInt();
		int year = input.nextInt();
		System.out.println(getMonthName(monthNumber) + " " + year + " has " + getNumberOfDaysInMonth(year, monthNumber) + " days");
	}

	public static String getMonthName(int month) {
		String monthName = "";
		switch (month) {
			case 1:
				monthName = "January";
				break;
			case 2:
				monthName = "February";
				break;
			case 3:
				monthName = "March";
				break;
			case 4:
				monthName = "April";
				break;
			case 5:
				monthName = "May";
				break;
			case 6:
				monthName = "June";
				break;
			case 7:
				monthName = "July";
				break;
			case 8:
				monthName = "August";
				break;
			case 9:
				monthName = "September";
				break;
			case 10:
				monthName = "October";
				break;
			case 11:
				monthName = "November";
				break;
			case 12:
				monthName = "December";
		}

		return monthName;
	}

	public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		}

		if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}

		if (month == 2) {
			return isLeapYear(year) ? 29 : 28;
		}

		return 0;
	}

	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

}
