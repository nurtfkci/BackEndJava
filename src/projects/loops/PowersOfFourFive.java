package projects.loops;

import java.util.Scanner;

public class PowersOfFourFive {
	
	public static void main(String[] args) {
		
		int num;
		int pow=1;
		int p=1;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		num = scan.nextInt();
		for(int i=1;i<=num; i++) {
			pow*=4;
			System.out.println(i + " power of 4 is  " + pow);
		}
		
		System.out.println();
		
		for(int i=1;i<=num; i++) {
			p*=5;
			System.out.println(i + " power of 5 is  " + p);
		}
		
		
		
		scan.close();
	}

}
