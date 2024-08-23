package projects.loops;

import java.util.Scanner;

public class Combination {

	static int factorial(int num) {

		for (int i = num - 1; i >= 1; i--) {

			num *= i;
		}
		return num;

	}

	static double combination(int n, int r) {

		return factorial(n) / (factorial(r) * factorial(n - r));
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please the numbers for combination: ");
		int n = scan.nextInt();
		int r = scan.nextInt();

		System.out.println("Combination of n with r : ");
		System.out.println(combination(n, r));

		scan.close();
	}

}
