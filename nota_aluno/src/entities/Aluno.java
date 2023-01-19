package entities;

public class Aluno {
	
	public String name;
	public double nota1, nota2, nota3 ;
	public double notaFinal;
	
	public double calcularNota() {
		notaFinal = (nota1 + nota2 + nota3)/3;
		if(notaFinal>7.0) {
			System.out.println("PASSADO");
		
		} else { System.out.println("REPROVADO");
				
		}
		return notaFinal;
		
	}
		
			
	}


