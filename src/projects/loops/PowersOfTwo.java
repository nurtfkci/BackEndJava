package projects.loops;

import java.util.Scanner;

public class PowersOfTwo {
	
	public static void main(String[] args) {
		
		int num,pow=1;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		num = scan.nextInt();
		for(int i=1;i<=num; i++) {
			pow*=2;
			System.out.println(i + " power of 2 is  " + pow);
		}
		scan.close();
	}

}
