package projects.loops;

import java.util.Scanner;

public class PerfectNums {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int total = 0;
		System.out.println("Please enter a number: ");
		int num = scan.nextInt();

		for (int i = num - 1; i >= 1; i--) {
			if (num % i == 0) {
				total += i;
			}
		}

		if (total == num) {
			System.out.println(num + " is a Perfect Number!");
		} else {
			System.out.println(num + " is NOT a Perfect Number!");
		}

		scan.close();

	}
}
