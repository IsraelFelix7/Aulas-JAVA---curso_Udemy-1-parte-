package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar ? ");
		int n = sc.nextInt();
		int[] vectP = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vectP[i] = sc.nextInt();
		}

		System.out.println("Números negativos :" );

		for (int i = 0; i < n; i++) {
			if (vectP[i] < 0) {
				System.out.println( vectP[i]);	
			}
		
		}
		
		sc.close();
	}
}