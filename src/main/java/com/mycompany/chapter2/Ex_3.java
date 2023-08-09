package com.mycompany.chapter2;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_3 {

	public static void main(String[] args) {
		// convert feet into meters
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a value for feet: ");

		double feet = input.nextDouble();
		double meters = feet * .305;

		System.out.println(feet + " feet is " + meters + " meters");

		input.close();
	}
}
