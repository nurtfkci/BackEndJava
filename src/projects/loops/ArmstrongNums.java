package projects.loops;

import java.util.Scanner;

public class ArmstrongNums {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int armstrong = scan.nextInt();

		int tempDigit = armstrong;
		int digits = 0;
		int sum = 0;

		while (tempDigit > 0) {
			tempDigit /= 10;
			digits++;
		}

		int temp = armstrong;

		while (temp > 0) {
			int digit = temp % 10;
			int pow = 1;

			for (int i = 0; i < digits; i++) {
				pow *= digit;
			}
			sum += pow;
			temp /= 10;

		}

		if (sum == armstrong) {
			System.out.println(sum + " is an Armstrong Number!");
		} else {
			System.out.println(sum + " is not an Armstrong Number!");

		}
		scan.close();
		
	}

}
