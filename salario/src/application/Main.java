package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Salario;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Salario salario = new Salario();
		
		System.out.print(" Nome: ");
		salario.name = sc.nextLine();
		System.out.print(" Gross salary: ");
		salario.grossSalary = sc.nextDouble();
		System.out.print(" Tax: ");
		salario.tax = sc.nextDouble();
		
		System.out.printf(" Employee: %s, $ %.2f %n", salario.name, salario.netSalary());
		System.out.print("  which  percentage to increase  salary ? ");
		salario.increaseSalary(sc.nextDouble());
		System.out.printf(" Updated data: %s, $ %.2f ", salario.name, salario.porcentage);
		
		sc.close();
	}

}
