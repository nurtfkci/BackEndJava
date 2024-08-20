package projects.conditionals;

import java.util.Scanner;

public class ChineseZodiacFinder {

	public static void main(String[] args) {
		
		int year,rem;
		String horoscope;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your birth year: ");
		
		year = scan.nextInt();
		
		rem = year%12;
		
		switch(rem) {
		
		case 0:
			horoscope = "Monkey";
			break;
		case 1:
			horoscope = "Rooster";
			break;
		case 2:
			horoscope = "Dog";
			break;
		case 3:
			horoscope = "Pig";
			break;
		case 4:
			horoscope = "Rat";
			break;
		case 5:
			horoscope = "Ox";
			break;
		case 6:
			horoscope = "Tiger";
			break;
		case 7:
			horoscope = "Rabbit";
			break;
		case 8:
			horoscope = "Dragon";
			break;
		case 9:
			horoscope = "Snake";
			break;
		case 10:
			horoscope = "Horse";
			break;
		case 11:
			horoscope = "Goat";
			break;
			default :
				horoscope="";
		}
		
		System.out.println("Your chinese horoscope is " + horoscope);
		
		scan.close();
		
	}
}
