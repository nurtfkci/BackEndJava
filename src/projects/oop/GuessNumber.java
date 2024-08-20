package projects.oop;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		int guess, answer, tries, maxtries;
		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		int[] wrong = new int[5];
		answer = random.nextInt(100) + 1;

		boolean isAnswer = true;
		maxtries = 6;
		tries = 1;

		System.out.println(answer);

		while (isAnswer) {

			System.out.println("Guess Number: ");

			guess = scan.nextInt();
			if (guess < 0 || guess > 100) {
				System.out.println("Please try again with numbers in boundaries!");
				continue;
			} else if (guess == answer) {

				isAnswer = false;
				System.out.println("You have guessed the number correctly with " + tries + " tries!");
				System.out.println("Number was " + answer + " and your guess was " + guess + "!");
			}else if(guess > answer) {
				System.out.println(guess + " is bigger than answer!");
			}else if(guess<answer) {
				System.out.println(guess + " is lesser than answer!");
			}

			if (tries >= maxtries) {
				System.out.println("You could not guess right!");
				System.out.println("Answer was " + answer);
				System.out.print("Your guesses: ");
				for(int i: wrong) {
					System.out.print( i + "  ");
				}
				break;
			} else {
				wrong[tries-1] = guess;
				tries++;
			}

		}

		scan.close();
	}

}
