package projects.conditionals;

import java.util.Scanner;

public class StatusOfClass {

	public static void main(String[] args) {

		int math, phy, chem, lit, music, subject = 0;
		double average = 0;
		String status = "";

		Scanner scan = new Scanner(System.in);

		System.out.println("Score for Math: ");
		math = scan.nextInt();
		subject++;
		average+=math;

		System.out.println("Score for Physics: ");
		phy = scan.nextInt();
		subject++;
		average+=phy;


		System.out.println("Score for Chemistry: ");
		chem = scan.nextInt();
		subject++;
		average+=chem;


		System.out.println("Score for Literature: ");
		lit = scan.nextInt();
		subject++;
		average+=lit;



		System.out.println("Score for Music: ");
		music = scan.nextInt();
		subject++;
		average+=music;

		
		if(math<0 || math>100) {
			subject--;
			average-=math;
		}
		if(phy<0 || phy>100) {
			subject--;
			average-=phy;

		}
		if(chem<0 || chem>100) {
			subject--;
			average-=chem;

		}
		if(lit<0 || lit>100) {
			subject--;
			average-=lit;

		}
		if(music<0 || music>100) {
			subject--;
			average-=music;

		}
		
		average /= subject;
		status = (average >= 60) ? "PASSED" : "FAILED";


		System.out.println("Grade " + status + " with grade average of " + average);
		scan.close();
		
		
		
	}

}
