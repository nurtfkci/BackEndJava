package projects.loops;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int num = scan.nextInt();
		int arr[] = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.println("Please enter the " + (i + 1) + ".number: ");
			arr[i] = scan.nextInt();
		}

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < num; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Biggest Num: " + max);
		System.out.println("Lowest Num: " + min);
		scan.close();

	}

}
