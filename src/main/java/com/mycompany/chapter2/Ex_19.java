package com.mycompany.chapter2;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_19 {

	public static void main(String[] args) {
		// area of a triangle
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double x3 = scanner.nextDouble();
		double y3 = scanner.nextDouble();

		double sideA = Math.pow(
			Math.pow((x2 - x1), 2)
			+ Math.pow((y2 - y1), 2), .5);

		double sideB = Math.pow(
			Math.pow((x2 - x3), 2)
			+ Math.pow((y2 - y3), 2), .5);

		double sideC = Math.pow(
			Math.pow((x3 - x1), 2)
			+ Math.pow((y3 - y1), 2), .5);

		double sides = (sideA + sideB + sideC) / 2;
		double area = Math.pow(
			sides * (sides - sideA)
			* (sides - sideB)
			* (sides - sideC), .5);

		System.out.println("The area of the triangle is " + area);

		scanner.close();
	}
}
