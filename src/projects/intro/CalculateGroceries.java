package projects.intro;

import java.util.Scanner;

public class CalculateGroceries {

	/*
	 * Calculate the total of a grocery shopping of 5 items with different weights.
	 * 
	 * Fruits ve price per kg 
	 * 
	 * Peach : 2,14  Apple : 3,67  Tomatoes : 1,11  Banana: 0,95  Eggplant : 5,00
	 * 
	 */

	public static void main(String[] args) {

		double apple = 3.67, banana = 0.95, peach = 2.14, eggplant = 5.00, tomatoes = 1.11;
		double kg;
		double total = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Kg of Apples: ");
		kg = scan.nextDouble();
		total += (apple * kg);

		System.out.println("Kg of Banana: ");
		kg = scan.nextDouble();
		total += (banana * kg);

		System.out.println("Kg of Peaches: ");
		kg = scan.nextDouble();
		total += (peach * kg);

		System.out.println("Kg of Eggplant: ");
		kg = scan.nextDouble();
		total += (eggplant * kg);

		System.out.println("Kg of Tomatoes: ");
		kg = scan.nextDouble();
		total += (tomatoes * kg);

		System.out.println("Total Amount: " + total + "$");
		scan.close();
	}

}
