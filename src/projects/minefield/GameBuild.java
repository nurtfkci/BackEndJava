package projects.minefield;

import java.util.Random;
import java.util.Scanner;

public class GameBuild {
	
	int rowNumber,colNumber,size;
	int[][] board;
	int[][] maps;
	boolean game=true;
	
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	
	GameBuild(int rowNumber,int colNumber){
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		this.board = new int[rowNumber][colNumber];
		this.maps = new int[rowNumber][colNumber];
		this.size=rowNumber*colNumber;
	}
	
	
	public void run() {
		minePlanter();
		System.out.println("Game Has Started!");
		printGame(this.maps);
	}
	
	public void minePlanter() {
		int genRow;
		int genCol;
		int count=0;
		while(count!=(size/4)) {
			genRow = random.nextInt(rowNumber);			
			genCol = random.nextInt(rowNumber);
			if(maps[genRow][genCol] != -1) {
				maps[genRow][genCol]=-1;
				count++;
			}

		}
		
	}
	
	
	public void printGame(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]>=0)
					System.out.print(" ");
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
