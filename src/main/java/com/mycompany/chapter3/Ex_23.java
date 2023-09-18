package com.mycompany.chapter3;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_23 {
	// Geometry: point in a rectangle?
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");

		double pointX = input.nextDouble();
		double pointY = input.nextDouble();

		if (Math.abs(pointX) <= 5 || Math.abs(pointY) <= 2.5) {
			System.out.println("Point (" + pointX + ", " + pointY + ")" + " is in the rectangle");
		} else {
			System.out.println("Point (" + pointX + ", " + pointY + ")" + " is not in the rectangle");
		}
	}
}
