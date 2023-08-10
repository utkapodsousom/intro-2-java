package com.mycompany.chapter2;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of years: ");
		int years = input.nextInt();
		int POPULATION = 312_032_486;

		int nextPopulation = POPULATION
			+ ((365 * 24 * 3600) / 7
			- (365 * 24 * 3600) / 13
			+ (365 * 24 * 3600) / 45) * years;

		System.out.println("The population in " + years + " years is " + nextPopulation);

		input.close();
	}
}
