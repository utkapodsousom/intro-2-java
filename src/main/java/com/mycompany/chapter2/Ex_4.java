package com.mycompany.chapter2;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_4 {

	public static void main(String[] args) {
		// convert pounds in kilograms
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number in pounds: ");

		double pounds = input.nextDouble();
		double kilos = pounds * .454;

		System.out.println(pounds + " pounds is " + kilos + " kilograms");

		input.close();
	}
}
