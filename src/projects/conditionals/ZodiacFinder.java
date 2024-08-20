package projects.conditionals;

import java.util.Scanner;

public class ZodiacFinder {

	
	public static void main(String[] args) {
		
		String month, horoscope="";
		int day;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your birth month and day: ");
		month = scan.next();
		day = scan.nextInt();
		boolean isDay = day>0 && day<=31;
		
		
		if(isDay) {
			if(month.equals("January")) {
				if(day<22) {
					horoscope="Capricorn";
				}else {
					horoscope="Aquarius";
				}
			}
			
			if(month.equals("February")) {
				if(day<20) {
					horoscope="Aquarius";
				}else {
					horoscope="Pisces";
				}
			}
			
			if(month.equals("March")) {
				if(day<21) {
					horoscope="Pisces";
				}else {
					horoscope="Aries";
				}
			}
			
			if(month.equals("April")) {
				if(day<21) {
					horoscope="Aries";
				}else {
					horoscope="Taurus";
				}
			}
			
			if(month.equals("May")) {
				if(day<22) {
					horoscope="Taurus";
				}else {
					horoscope="Gemini";
				}
			}
			
			if(month.equals("June")) {
				if(day<23) {
					horoscope="Gemini";
				}else {
					horoscope="Cancer";
				}
			}	
			
			if(month.equals("July")) {
				if(day<23) {
					horoscope="Cancer";
				}else {
					horoscope="Leo";
				}
			}
			
			if(month.equals("August")) {
				if(day<23) {
					horoscope="Leo";
				}else {
					horoscope="Virgo";
				}
			}
			
			if(month.equals("September")) {
				if(day<23) {
					horoscope="Virgo";
				}else {
					horoscope="Libra";
				}
			}
			
			if(month.equals("October")) {
				if(day<22) {
					horoscope="Libra";
				}else {
					horoscope="Capricorn";
				}
			}
		}
		
		System.out.println("Your horoscope is " + horoscope);
		
		scan.close();
		
	}

}
