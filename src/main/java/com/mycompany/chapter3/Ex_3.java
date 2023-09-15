package com.mycompany.chapter3;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_3 {

	public static void main(String[] args) {
		// solve 2 x 2 linear equations
		// ax + by = e
		// cx + dy = f
		// x = (ed - bf) / (ad - bc)
		// y = (af - ec) / (ad - bc)  
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a, b, c, d, e, f: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double d = scanner.nextDouble();
		double e = scanner.nextDouble();
		double f = scanner.nextDouble();
		double corner = a * d - b * c;
		double x, y;

		if (corner == 0) {
			System.out.println("This equation has no solution");
		} else {
			x = (e * d - b * f) / corner;
			y = (a * f - e * c) / corner;

			System.out.println("x is " + x + " and y is " + y);

			scanner.close();
		}
	}
}
