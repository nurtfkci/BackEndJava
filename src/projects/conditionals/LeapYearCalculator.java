package projects.conditionals;

import java.util.Scanner;

public class LeapYearCalculator {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a year: ");
		int year = scan.nextInt();
		
		if(year%4!=0) {
			System.out.println( year + " not leap");
		}
		else if(year%100==0 && year%400!=0) {
			System.out.println(year +" not leap");
		}else {
			System.out.println( year + " leap");
		}
		
		scan.close();
	}

}
