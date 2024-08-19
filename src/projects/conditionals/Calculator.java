package projects.conditionals;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		double num1,num2,res=0;
		char operator;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Number 1: ");
		num1=scan.nextDouble();
		System.out.println("Number 2: ");
		num2=scan.nextDouble();
		System.out.println("Operation: + - / % *");
		operator = scan.next().charAt(0);
		
		switch(operator) {
		case '+' :
			res= num1+num2;
			break;
		case '-':
			res= num1-num2;
			break;
		case '/' :
			res= num1/num2;
			break;
		case '%':
			res= num1%num2;
			break;
		case '*':
			res= num1*num2;
			break;
		}
		
		System.out.println("Result of " + num1 + operator + num2 + " = " + res);
		scan.close();
		
	}
	
	

}
