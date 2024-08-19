package projects.intro;

import java.util.Scanner;

public class CalculateTaxiMeter {

	/*
	 * Calculate the total for a taximeter, base is 10 dollars and price per miles
	 * is 2.20 Total less than 20, pay 20
	 */

	public static void main(String[] args) {

		double miles, pricePer = 2.20;
		double total, base=10;

		Scanner scan = new Scanner(System.in);

		System.out.println("Total miles: ");
		miles = scan.nextDouble();

		total = (miles * pricePer);
		total += base;

		total = (total > 20) ? total : 20;

		System.out.println("Total pay: " + total + "$");
		scan.close();

	}

}
