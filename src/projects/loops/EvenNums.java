package projects.loops;

import java.util.Scanner;

public class EvenNums {
	
	public static void main(String[] args) {
		
		int num,total=0;
		Scanner scan = new Scanner(System.in);

	
		System.out.println("Please enter a number: ");
		num = scan.nextInt();
		
		for(int i =0; i<=num; i++) {
			if(i%2==0) {
				total+=i;
			}
			continue;
		}
		
		System.out.println("Total of Even Numbers: " + total);
		
		scan.close();
	}

}
