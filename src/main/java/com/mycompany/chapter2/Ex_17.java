package com.mycompany.chapter2;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_17 {

	public static void main(String[] args) {
		// wind-chill temperature
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");

		double temp = scanner.nextDouble();

		System.out.print("Enter the wind speed (>= 2) in mile per hour: ");

		double mph = scanner.nextDouble();
		double wctemp = 35.74 + 0.6215 * temp - 35.75 * Math.pow(mph, .16) + .4275 * temp * Math.pow(mph, .16);

		System.out.println("The wind chill index is " + wctemp);

		scanner.close();
	}
}
