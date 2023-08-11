package com.mycompany.chapter2;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_16 {

	public static void main(String[] args) {
		// area of a hexagon
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the length of the side: ");
		double side = input.nextDouble();
		double area = (3 * Math.pow(3, .5) / 2) * Math.pow(side, 2);

		System.out.println("The area of the hexagon is " + area);

		input.close();
	}
}
