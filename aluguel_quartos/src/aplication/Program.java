package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rent exemplo = new Rent(); 
		exemplo.setEmail("benny@gmail.com");
		System.out.println(exemplo.getEmail());
		exemplo.setName("benny");
		System.out.println(exemplo.getName());
		
		
		
		System.out.print(" Hom many rooms will be rented ? ");
		int n = sc.nextInt();
		
		Rent[] vetor = new Rent[10]; // criação do vetor com 10 posições
		
		for (int i = 1; i < n+1; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.next();

			System.out.print("Room: ");
			int roomNamber = sc.nextInt();

			Rent rent = new Rent(name, email);   //[ Instanciando o objeto e recebendo como parâmetro as duas strings nome e email]
			vetor[roomNamber] = rent;      		 // a posição do vetor [roomNamber]  está recebendo   o objeto(nome, email)
		}
		System.out.println();
		
		System.out.println("Busy rooms :");
		for (int i = 0; i < 10; i++) {
			if(vetor[i] != null) {
			System.out.println(i+": "+vetor[i]);
			}
		}
		
		sc.close();
	}

}
