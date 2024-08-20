package projects.conditionals;

import java.util.Scanner;

public class PlaneTicketCalculator {

	public static void main(String[] args) {

		// price per mile : 0.10$
		// age < 12 %50 discount
		// age < 24 %10 discount
		// age > 65 %20 discount
		// round trip %20 discount

		Scanner scan = new Scanner(System.in);

		int age, miles, trip;
		String name;
		double price, perMile = 0.10;
		boolean ageRange, tripType;

		System.out.println("Your Full Name : ");
		name = scan.nextLine();

		System.out.println("Your age : ");
		age = scan.nextInt();

		System.out.println("Miles to go : ");
		miles = scan.nextInt();

		System.out.println("1-Round Trip \t 2-One Way Flight");
		trip = scan.nextInt();

		ageRange = age > 0 || age < 120;
		tripType = trip == 1 || trip == 2;

		if (ageRange && tripType) {
			price = miles * perMile;

			if (age < 12) {
				price *= 0.5;
			} else if (age < 24) {
				price *= 0.9;
			} else if (age > 65) {
				price *= 0.8;
			}

			if (trip == 1) {
				price *= 0.8;
				price *= 2;
			}

			System.out.println("Hello " + name);
			System.out.println("Your flight ticket is " + price + "$");

		} else {
			System.out.println("Your age or trip type is Invalid!\nPlease Try Again!");
		}

		scan.close();

	}

}
