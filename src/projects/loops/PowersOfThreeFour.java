package projects.loops;

import java.util.Scanner;

public class PowersOfThreeFour {

	public static void main(String[] args) {

		int num;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		num = scan.nextInt();

		System.out.println("Numbers divisible by 3 and 4");
		for (int i = 1; i <= num; i++) {

			if (i % 3 == 0 && i % 4 == 0) {
				System.out.print(i + "\t");
			}

		}
		scan.close();

	}
}
