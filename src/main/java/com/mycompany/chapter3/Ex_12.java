package com.mycompany.chapter3;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a three-digit number: ");
		int tdn = input.nextInt();
		if (tdn % 10 == tdn / 100) {
			System.out.println(tdn + " is a palindrome");
		} else {
			System.out.println(tdn + " is not a palindrome");
		}
	}
}
