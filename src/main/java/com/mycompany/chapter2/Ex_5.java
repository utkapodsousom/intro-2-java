package com.mycompany.chapter2;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_5 {

	public static void main(String[] args) {
		// calculate tips
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the subtotal and a gratuity rate: ");

		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();

		double gratuity = subtotal * gratuityRate / 100;
		double total = subtotal + gratuity;

		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

		input.close();
	}
}
