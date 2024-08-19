package projects.intro;

import java.util.Scanner;

public class CalculateCircleSegment {

	/*
	 * Calculate the area of a circle with radius and angle input from the user.
	 * 
	 * Area of a segment of a circle : (𝜋 * (r*r) * 𝛼) / 360
	 */

	public static void main(String[] args) {

		int r, alpha;
		double area;
		double pi = 3.14;
		Scanner scan = new Scanner(System.in);

		System.out.println("Radius of Circle Segment: ");
		r = scan.nextInt();
		System.out.println("Angle of Circle Segment: ");
		alpha = scan.nextInt();

		area = (pi * (r * r) * alpha) / 360;

		System.out.println("Area of Circle Segment: " + area);
		scan.close();

	}

}
