package entities;

public class Pessoas {
	
	private double altura;
	private int idade;
	private String nome;
	
	public Pessoas(double altura, int idade, String nome) {
		
		this.altura = altura;
		this.idade = idade;
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	

}
