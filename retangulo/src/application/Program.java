package application;
import java.util.Scanner;
import java.util.Locale;


import enteties.Retangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println(" entre com a largura e altura do retangulo: ");
	    retangulo.largura = sc.nextDouble();
	    retangulo.altura = sc.nextDouble();
	    
	    System.out.println(retangulo);
	    sc.close();
	  }

}