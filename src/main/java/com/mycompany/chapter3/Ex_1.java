package com.mycompany.chapter3;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_1 {

	public static void main(String[] args) {
		// solve quadratic equations
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		double discriminant = b * b - 4 * a * c;
		double r1 = (-1 * b + Math.pow(discriminant, .5)) / (2 * a);
		double r2 = (-1 * b - Math.pow(discriminant, .5)) / (2 * a);

		if (discriminant > 0) {
			System.out.println("The equation has two roots " + r1 + " and " + r2);
		} else if (discriminant == 0) {
			System.out.println("The equation has one root " + r1);
		} else {
			System.out.println("The equation has no real roots");
		}

		scanner.close();
	}
}
