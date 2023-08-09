package com.mycompany.chapter2;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_10 {

	public static void main(String[] args) {
		// calculate energy
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of water in kilograms: ");

		double water = input.nextDouble();

		System.out.print("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();

		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		double energy = water * (finalTemperature - initialTemperature) * 4184;

		System.out.println("The energy needed is " + energy);

		input.close();
	}
}
