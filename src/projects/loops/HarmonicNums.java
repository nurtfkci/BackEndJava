package projects.loops;

import java.util.Scanner;

public class HarmonicNums {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		double h = scan.nextDouble();
		double num = h;
		double harmonic = 0.0;

		while (num > 0) {
			harmonic += (1 / num);
			num--;
		}

		System.out.println("Average of Harmonic Number Series: " + harmonic);
		scan.close();

	}

}
