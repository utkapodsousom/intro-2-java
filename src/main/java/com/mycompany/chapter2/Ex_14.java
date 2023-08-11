package com.mycompany.chapter2;

import java.util.Scanner;

/**
 *
 * @author ootka
 */
public class Ex_14 {

	// computing BMI
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double POUND_TO_KILO_RATIO = .45359237;
		double INCH_TO_METER_RATIO = 0.0254;

		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();

		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();

		double weightInKilos = weight * POUND_TO_KILO_RATIO;
		double heightInMeters = height * INCH_TO_METER_RATIO;
		double BMI = weightInKilos / (heightInMeters * heightInMeters);

		System.out.println("BMI is " + BMI);

		input.close();
	}
}
