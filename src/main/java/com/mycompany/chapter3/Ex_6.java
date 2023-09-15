package com.mycompany.chapter3;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_6 {

	public static void main(String[] args) {
		// health application: BMI
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in kilograms: ");
		int weight = input.nextInt();

		System.out.print("Enter height in centimeters: ");
		int height = input.nextInt();
		double heightInMeters = height / 100.0;

		input.close();

		double bmi = weight / (heightInMeters * heightInMeters);

		System.out.println("BMI is " + bmi);
		if (bmi < 18.5) {
			System.out.println("Underweight");
		} else if (bmi < 25) {
			System.out.println("Normal");
		} else if (bmi < 30) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obese");
		}

	}

}
