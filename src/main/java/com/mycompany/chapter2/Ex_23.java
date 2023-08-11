package com.mycompany.chapter2;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_23 {

	public static void main(String[] args) {
		// cost of driving
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the driving distance: ");
		double distance = scanner.nextDouble();

		System.out.print("Enter miles per gallon: ");
		double mpg = scanner.nextDouble();

		System.out.print("Enter price per gallon: ");
		double price = scanner.nextDouble();

		double cod = distance / mpg * price;

		System.out.println("The cost of driving is $" + (int) (cod * 100) / 100.0);

		scanner.close();
	}
}
