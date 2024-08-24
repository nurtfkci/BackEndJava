package projects.loops;

import java.util.Scanner;

public class PowerCalculator {

	static int power(int a, int b) {
		
		int j = 1;
		for(int i=1;i <= b;i++) {
		 j*=a;
		}
		
		return j;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number to be powered: ");
		int num = scan.nextInt();
		
		System.out.println("Please enter a number of power: ");
		int pow = scan.nextInt();
		
		System.out.println(pow+" power of " + num + " is " + power(num,pow));

		scan.close();
		
		
	}

}
