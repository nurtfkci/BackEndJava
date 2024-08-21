package projects.arrays;

import java.util.Random;
import java.util.Scanner;

public class AverageOfElements {

	public static void main(String[] args) {

		int n;
		double total;
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		total = 0;

		System.out.println("Enter a number: ");
		n = scan.nextInt();
		int[] arr = new int[n];
		total = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = random.nextInt(100) + 1;
			total += arr[i];
		}

		System.out.print("Average of numbers: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println(" is " + (total / n));

		scan.close();

	}

}
