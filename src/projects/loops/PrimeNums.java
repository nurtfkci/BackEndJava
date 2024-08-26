package projects.loops;

import java.util.Scanner;

public class PrimeNums {

public static void main(String[] args) {
		
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		num = scan.nextInt();
		
		// 1 e ve kendisine 
		int prime=0;
		int i = 1;
		while(num>=i) {
			
			if(num%i==0) {
				prime++;
			}
			i++;
//			if(prime>2) {
//				break;
//			}
		}
		
		System.out.println("\n WHILE LOOP");
		
		if(prime>2) {
			System.out.println(num + " is not a prime number!");
		}else {
			System.out.println(num + " is a prime number!");
		}
		

		System.out.println("\n FOR LOOP");
		
		int tot=0;
		for(int k = 1; k<=num; k++) {
			if(num%k==0) {
				tot++;
			}
		}
		
		if(tot>2) {
			System.out.println(num + " is not a prime number!");
		}else {
			System.out.println(num + " is a prime number!");
		}
		
		scan.close();
		
	}

}
