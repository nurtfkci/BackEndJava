package projects.arrays;

import java.util.Random;
import java.util.Scanner;

public class HarmonicElements {
	
	public static void main(String[] args) {
		
		int n;
		double total;
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Please enter a number: ");
		n = scan.nextInt();
		total=0.0;
		
		double[] arr = new double[n];
		
		for(int i=0; i<n;i++) {
			arr[i]=(int) random.nextInt(10)+1;
			total +=(double) (1 / arr[i]);
		}
		
		System.out.println(total);
		
		System.out.println("Harmonic Average of numbers ");
		
		for(double i : arr) {
			System.out.print(i +  " ");
		}
		System.out.println(" is " + (n/total));
		scan.close();
		
		
		
	}

}
