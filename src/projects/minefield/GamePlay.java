package projects.minefield;

import java.util.Scanner;

public class GamePlay {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int row,col;
		
		System.out.println("Welcome to MineField!");
		System.out.println("Enter dimensions for the board : ");
		row = scan.nextInt();
		col = scan.nextInt();
		
		GameBuild mine = new GameBuild(row,col);
		mine.run();
		
		scan.close();
		
	}

}
