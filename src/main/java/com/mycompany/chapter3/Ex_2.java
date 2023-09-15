package com.mycompany.chapter3;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_2 {

	public static void main(String[] args) {
		// add three numbers
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		int number3 = (int) (Math.random() * 10);

		Scanner scanner = new Scanner(System.in);

		System.out.print("What is the sum of numbers " + number1 + " " + number2 + " and " + number3 + "? ");
		int answer = scanner.nextInt();

		boolean result = (number1 + number2 + number3) == answer;

		System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + result);

		scanner.close();

	}
}
