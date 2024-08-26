package projects.loops;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		int balance = 1000;
		int amount, action;

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Trex Banking!");
		System.out.println("Current Balance: " + balance + "$");

		boolean notLeft = true;
		while (notLeft) {
			System.out.println("1- Deposit Money");
			System.out.println("2- Withdraw Money");
			System.out.println("3- Check Balance");
			System.out.println("4- End Session");
			System.out.println("*- Choose an Action to continue: ");

			action = scan.nextInt();

			System.out.println("\n\n\n");

			switch (action) {
			case 1:
				System.out.println("Amount to Deposit: ");
				amount = scan.nextInt();
				if (amount < 0 || amount > 10000) {
					System.out.println("Unacceptable Amount!");
				} else {
					balance += amount;
					System.out.println("Your new balance: " + balance + "$\n\n");
				}
				break;
			case 2:
				System.out.println("Amount to Withdraw: ");
				amount = scan.nextInt();
				if (amount > balance) {
					System.out.println("Can not withdraw amount more than balance!");
				} else if (amount < 0 || amount > 10000) {
					System.out.println("Amount is not supported!");
				} else {
					balance -= amount;
					System.out.println("Your new balance: " + balance + "$\n\n");
				}
				break;
			case 3:
				System.out.println("Current Balance: " + balance + "$");
				break;
			case 4:
				notLeft = false;
				System.out.println("Thank you for choosing Trex Banking! Come back again!");
				break;
			default:
				System.out.println("Action is not supported!");
			}
		}

		scan.close();

	}

	
}
