package projects.methods;

import java.util.Scanner;

public class PalindromicNums {


	public static void main(String[] args) {

		int palindromNum;
		Scanner scan = new Scanner(System.in);

		System.out.println("Palindromic Number: ");
		palindromNum = scan.nextInt();

		if (isPalindrom(palindromNum)) {
			System.out.println(palindromNum + " is Palindromic!");
		} else {
			System.out.println(palindromNum + " is NOT Palindromic!");
		}

		scan.close();
	}

	static boolean isPalindrom(int palindromNum) {

		if (reverseNum(palindromNum) == palindromNum) {
			return true;
		}
		return false;
	}

	static double reverseNum(int temp) {
		int reverse = 0;
		int digit;

		while (temp != 0) {

			digit = temp % 10;
			reverse = reverse * 10 + digit;
			temp /= 10;

		}

		return reverse;
	}

}
