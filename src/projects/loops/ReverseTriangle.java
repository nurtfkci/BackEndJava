package projects.loops;

import java.util.Scanner;

public class ReverseTriangle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = scan.nextInt();
		
		for(int i=num; i>=1;i--) {
			
			for(int k = 0; k < (i*2-1);k++ ) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		scan.close();
	}
}
