package projects.intro;

import java.util.Scanner;

public class CalculateCircle {

	/*
	 * Calculate the area and the perimeter of a cirlce with radius input from the user. 
	 * Area  : π * r * r;
	 * Perimeter : 2 * π * r;
	 * 
	 */

	public static void main(String[] args) {

		int r;
		double perimeter, area;
		double pi = 3.14;
		Scanner scan = new Scanner(System.in);

		System.out.println("Radius of Circle: ");
		r = scan.nextInt();

		perimeter = 2 * pi * r;
		area = pi * r * r;

		System.out.println("Area of Circle: " + area);
		System.out.println("Perimeter of Circle: " + perimeter);
		scan.close();

	}

}
