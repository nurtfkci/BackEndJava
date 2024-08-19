package projects.intro;

import java.util.Scanner;

public class CalculateBMI {

	/*
	 * Calculate Body Mass Index
	 * 
	 * (kg) / height(m) * height(m)
	 */

	public static void main(String[] args) {

		double height, weight, bmi;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter height in meters: ");
		height = scan.nextDouble();
		System.out.println("Enter weight in kilograms: ");
		weight = scan.nextDouble();

		bmi = weight / (height * height);
		// bmi = weight / Math.pow(height, 2);

		System.out.println("Body Mass Index: " + bmi);
		scan.close();

	}

}
