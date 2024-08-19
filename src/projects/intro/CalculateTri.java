package projects.intro;

import java.util.Scanner;

public class CalculateTri {

	/*
	 * Calculate the area of a triangle getting 3 sides from the user. Perimeter of
	 * a triangle = 2𝑢
	 * 
	 * 𝑢 = (a+b+c) / 2
	 * 
	 * area * area = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
	 */

	public static void main(String[] args) {

		int a, b, c;
		boolean A, B, C, tri;
		double u;
		double area;
		String areaTri;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the three sides of the triangle: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		A = (b + c > a);
		B = (a + c > b);
		C = (a + b > c);

		u = (a + b + c) / 2;
		area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

		tri = (A & B & C) ? true : false;

		areaTri = tri ? "Area of your triangle is " + area : "The sides do not make a triangle!";
		System.out.println(areaTri);
		scan.close();

	}

}
