package projects.conditionals;

import java.util.Scanner;

public class SortNumbers {


	public static void main(String[] args) {
		
		int num1,num2,num3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter three numbers: ");
		num1= scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		boolean isnum1 = num1 > num2 && num1 > num3;
		boolean isnum2 = num2 > num1 && num2 > num3;
		
		
		if(isnum1) {
			if(num2>num3) {
				System.out.println(num1 + " " + num2 + " " + num3);
			}else {
				System.out.println(num1 + " " + num3 + " " + num2);

			}
		}else if(isnum2) {
			if(num1>num3) {
				System.out.println(num2 + " " + num1 + " " + num3);
			}else {
				System.out.println(num2 + " " + num3 + " " + num1);

			}
		}else {
			if(num1>num2) {
				System.out.println(num3 + " " + num1 + " " + num2);
			}else {
				System.out.println(num3 + " " + num2 + " " + num1);

			}
		}
		
		scan.close();
		
	}
	
}
