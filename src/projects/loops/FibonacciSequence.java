package projects.loops;

import java.util.Scanner;

public class FibonacciSequence {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int n = scan.nextInt();

        int first = 0, second = 1;
        
        System.out.print("Fibonacci Serisi: " + first + " " + second + " ");

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
		
        }
		
		scan.close();
	}

}
