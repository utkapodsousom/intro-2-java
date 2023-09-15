package com.mycompany.chapter3;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("(0-single filer, 1-married jointly or "
			+ "qualifying widow(er), 2-married separately, 3-head of "
			+ "household) Enter the filing status: ");

		int status = input.nextInt();

		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();

		double tax = 0;

		// for single filers
		if (status == 0) {
			if (income <= 8350) {
				tax = income * .10;
			} else if (income <= 33950) {
				tax = 8350 * .10 + (income - 8350) * .15;
			} else if (income <= 82250) {
				tax = 8350 * .10 + (33950 - 8350) * .15 + (income - 33950) * .25;
			} else if (income <= 171550) {
				tax = 8350 * .10 + (33950 - 8350) * .15 + (82250 - 33950) * 0.25 + (income - 82250) * .28;
			} else if (income <= 372950) {
				tax = 8350 * .10 + (33950 - 8350) * .15 + (82250 - 33950) * .25 + (171550 - 82250) * .28 + (income - 171550) * 0.33;
			} else {
				tax = 8350 * .10 + (33950 - 8350) * .15 + (82250 - 33950) * .25 + (171550 - 82250) * .28 + (372950 - 171550) * .33 + (income - 372950) * 0.35;
			}

		}
		else if (status == 0) {
			if (income <= 16700) {
				tax = income * .10;
			} else if (income <= 67900) {
				tax = 16700 * .10 + (income - 16700) * .15;
			} else if (income <= 137050) {
				tax = 16700 * .10 + (67900 - 16700) * .15 + (income - 67900) * .25; 
			} else if (income <= 208850) {
				tax = 16700 * .10 + (67900 - 16700) * .15 + (137050 - 67900) * .25 + (income - 137050) * .28;
			} else if (income <= 372950) {
				tax = 16700 * .10 + (67900 - 16700) * .15 + (137050 - 67900) * .25 + (208850 - 137050) * .28 + (372950 - 208850) * .33 + (income - 372950) * .35;
			}
		} 
	}
}
