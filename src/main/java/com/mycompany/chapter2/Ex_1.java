package com.mycompany.chapter2;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_1 {

	public static void main(String[] args) {
		// convert celsius to fahrenheit
		Scanner input = new Scanner(System.in);

		System.out.print("Enter temperature in Celsius: ");

		double temperatureInCelsius = input.nextDouble();
		double temperatureInFahrenheit = (9 / 5.0) * temperatureInCelsius + 32;

		System.out.println(temperatureInCelsius + " Celsius is " + temperatureInFahrenheit + " Fahrenheit");

		input.close();
	}
}
