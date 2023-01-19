package application;

import java.util.Scanner;

import entities.Aluno;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
	
		System.out.print(" Nome: ");
		//System.out.println(aluno.name);
		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble(); 
		aluno.nota2 = sc.nextDouble(); 
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf(" Nota final %.2f ", aluno.calcularNota());
		System.out.printf("%.2f", aluno.calcularNota());
		System.out.println(" ");
	
		sc.close();
	}

}
