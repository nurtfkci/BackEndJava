package projects.loops;

import java.util.Scanner;

public class FactorialNums {

	static int factorialNum(int n) {

		for (int i = n - 1; i >= 1; i--) {

			n *= i;
		}

		return n;

	}

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		num = scan.nextInt();

		System.out.println("Factorial of Number " + num + " is " + factorialNum(num));
		scan.close();
	}

}
