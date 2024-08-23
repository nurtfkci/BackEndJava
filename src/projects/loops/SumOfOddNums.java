package projects.loops;

import java.util.Scanner;

public class SumOfOddNums {

	/*
	 * Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri
	 * kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı
	 * yazıyoruz.
	 * 
	 * Ödev Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri
	 * kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp
	 * ekrana basan programı yazıyoruz.
	 */
	public static void main(String[] args) {
		
		int num,total=0;
		Scanner scan = new Scanner(System.in);
		
		
		do {
		System.out.println("Please enter a number: ");
		num = scan.nextInt();
		
		if(num%2!=0) {
			total+=num;
		}
		
		
		}while(num>0);
		
		System.out.println("Total of Odd Numbers: " + total);
		scan.close();
	}


}
