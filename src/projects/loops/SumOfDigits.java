package projects.loops;

import java.util.Scanner;

public class SumOfDigits {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int num = scan.nextInt();
		
		int sum=0;
		int temp = num; 
		
		while(temp != 0 ) {
			sum+= temp%10;
			temp/=10;
		}
		
		System.out.println(sum);

		scan.close();
	}

}
