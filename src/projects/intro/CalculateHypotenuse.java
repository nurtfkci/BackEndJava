package projects.intro;

import java.util.Scanner;

public class CalculateHypotenuse {

	/*
	 * Calculate hypotenuse, getting the legs of a triangle from the user
	 */

	public static void main(String[] args) {
		
		int a, b;
		double c;
		boolean A, B, C;
		String tri;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the two legs of the triangle: ");
		a = scan.nextInt();
		b = scan.nextInt();
		
		c = Math.sqrt((a*a) + (b*b));
		
		A = (b+c > a);
		B = (a+c > b);
		C = (a+b > c);
		
		double hypotenuse = (A&B&C)? c :0;
		tri = hypotenuse == 0 ? "Your angles do NOT make A Triangle": "A Triangle with " + a + " and " + b + " sides, hypotenuse is : " + hypotenuse;
		System.out.println(tri);

		scan.close();
	}

}
