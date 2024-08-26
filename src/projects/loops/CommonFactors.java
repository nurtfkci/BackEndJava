package projects.loops;

import java.util.Scanner;

public class CommonFactors {

	public static void main(String[] args) {

		int num1, num2;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter two numbers: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();

		int min = (num1 > num2) ? num2 : num1;
		int highest = 1;

		for (int i = min; i > 0; i--) {

			if (num1 % i == 0 && num2 % i == 0) {
				highest = i;
				break;
			}

		}

		int lowest = (num1 * num2) / highest;

		System.out.println("Highest Common Factor: " + highest);
		System.out.println("Lowest Common Factor: " + lowest);

		scan.close();
	}

}
