package aplication;

/* Esse programa pergunta o preço do dolar e quantos 
 dolares vc vai querer e acrescenta uma taxa de 6% ao valor final */

import java.util.Locale;
import java.util.Scanner;

import Util.CurrencyConverte;

public class Program {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	System.out.print("What is the dolar price ? ");
	double precoReais = input.nextDouble();
	
	System.out.print("Hom many dollars will bought ? ");
	double quantDolarr = input.nextDouble();
	
	System.out.print("Amount to be  paid in reais = " + CurrencyConverte.precoCompra(quantDolarr, precoReais));
	
	input.close();
	}

}
