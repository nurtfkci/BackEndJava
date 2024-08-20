package projects.oop;

import java.util.Scanner;

public class PalindromicWords {

	static boolean isPalindrom(String pal) {

		String rev = reverseWord(pal);

		if (pal.equalsIgnoreCase(rev)) {
			return true;
		}
		return false;

	}

	static String reverseWord(String word) {

		String rev = "";
		char r;

		for (int i = word.length() - 1; i >= 0; i--) {
			r = word.charAt(i);
			rev += r;
		}

		return rev;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = scan.next();

		System.out.println("Your word is palindrom: " + isPalindrom(word));

		scan.close();
	}

}
