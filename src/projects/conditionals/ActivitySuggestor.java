package projects.conditionals;

import java.util.Scanner;

public class ActivitySuggestor {

	public static void main(String[] args) {

		double celcius;
		String activity;
		boolean heat;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the temperature in celcius: ");
		celcius = scan.nextDouble();

		heat = celcius >= -5 && celcius <= 30;

		if (heat) {
			if (celcius < 5) {
				activity = "SKI";
			} else if (celcius < 15) {
				activity = "CINEMA";
			} else if (celcius < 25) {
				activity = "PICNIC";
			} else {
				activity = "SWIMMING";
			}

		}else {
			System.out.println("Please try again with valid degrees!");
			activity=" ";
		}
		
		System.out.println("Our activity suggestion for you is " + activity + "!");
		scan.close();

	}
}
