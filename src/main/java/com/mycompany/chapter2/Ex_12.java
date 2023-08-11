package com.mycompany.chapter2;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter speed and acceleration: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		double minLength = (speed * speed) / (2 * acceleration);

		System.out.println("The minimum runway length for this airplane is " + minLength);

		input.close();
	}
}
