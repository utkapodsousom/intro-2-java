package com.mycompany.chapter3;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_8 {

	public static void main(String[] args) {
		// sort three integers
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();

		if (number1 > number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}

		if (number2 > number3) {
			int temp = number2;
			number2 = number3;
			number3 = temp;
		}

		if (number1 > number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}

		System.out.println("The sorted numbers are "
			+ number1 + " " + number2 + " " + number3);

		input.close();
	}
}
