package projects.intro;

import java.util.Scanner;

public class CalculateVAT {

	/*
	 * Calculate the VAT included price and VAT amount of the money value receiving the pretax amount from the user
	 * Pretax value less than 1k, VAT amount = 1.8
	 * over 1k, vat = 0.8
	 */

	public static void main(String[] args) {
		double pretax, tax; 
		double taxedPrice, taxAmount;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Price before Tax: ");
		pretax = scan.nextDouble();
		
		tax = (pretax < 1000) ? 0.18 : 0.08;
		taxAmount = pretax * tax;
		taxedPrice = pretax + taxAmount;

		
		System.out.println("Amount before Tax: " + pretax);
		System.out.println("Additional Tax: " + taxAmount);
		System.out.println("Total: " + taxedPrice);
		
		scan.close();
	}

}
