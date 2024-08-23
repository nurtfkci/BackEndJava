package projects.loops;

import java.util.Scanner;

public class UntilOdd {

	public static void main(String[] args) {
		int num, total = 0;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Please enter a number: ");
			num = scan.nextInt();

			if (num % 4 == 0) {
				total += num;
				System.out.println("Total: " + total);
			} else if (num % 2 != 0) {
				System.out.println("Try Even Numbers!");
				break;
			}

		} while (num % 2 == 0);

		scan.close();

	}

}
