package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("linhas: ");
		int l = sc.nextInt();
		System.out.print("colunas: ");
		int c = sc.nextInt();
	
		int[][] matrix = new int[l][c];
		
		System.out.println("digite as linhas e colunas da matrix: ");
		for(int i =0; i<l; i++) {
			for(int j = 0; j<c; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
int x = sc.nextInt();
		
		for (int i=0; i<matrix.length; i++) {
			
			for (int j=0; j<matrix[i].length; j++) {
				
				if (matrix[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + matrix[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matrix[i-1][j]);
					}
					if (j < matrix[i].length-1) {
						System.out.println("Right: " + matrix[i][j+1]);
					}
					if (i < matrix.length-1) {
						System.out.println("Down: " + matrix[i+1][j]);
					}
				}
			}
		}
		
		
		
		
		
		System.out.println();
		System.out.println("------------Programa finalizado ----------");
		
		sc.close();
	}

}
