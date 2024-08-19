package projects.intro;

import java.util.Scanner;

public class CalculateGradeAverage {

	public static void main(String[] args) {

		/*
		 * Receive the scores of Math, Physics, Chemistry, Literature, History and Music classes from the user,
		 * calculate grade average and using the ternary operator ouput the grade passing status.
		 * Grade average above 60 is passed, otherwise failed.
		 */

		int math, phy, chem, lit, history, music, subject = 0;
		double average = 0;
		String status = "";

		Scanner scan = new Scanner(System.in);

		System.out.println("Score for Math: ");
		math = scan.nextInt();
		subject++;

		System.out.println("Score for Physics: ");
		phy = scan.nextInt();
		subject++;

		System.out.println("Score for Chemistry: ");
		chem = scan.nextInt();
		subject++;

		System.out.println("Score for Literature: ");
		lit = scan.nextInt();
		subject++;

		System.out.println("Score for History: ");
		history = scan.nextInt();
		subject++;

		System.out.println("Score for Music: ");
		music = scan.nextInt();
		subject++;

		average = (math + phy + chem + lit + history + music) / subject;
		status = (average >= 60) ? "PASSED" : "FAILED";

		System.out.println("Grade " + status + " with grade average of " + average);
		scan.close();

	}

}
