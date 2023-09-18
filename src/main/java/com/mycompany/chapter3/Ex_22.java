package com.mycompany.chapter3;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_22 {

	// Geometry: point is a circle?
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double pointX = input.nextDouble();
		double pointY = input.nextDouble();

		if (Math.pow(Math.pow(pointX - 0, 2) + Math.pow(pointY - 0, 2), .5) <= 10) {
			System.out.println("Point (" + pointX + ", " + pointY + ")" + " is in the circle");
		} else {
			System.out.println("Point (" + pointX + ", " + pointY + ")" + " is not in the circle");
		}
	}
}
