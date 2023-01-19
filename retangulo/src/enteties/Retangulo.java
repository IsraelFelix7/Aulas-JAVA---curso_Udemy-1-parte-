package enteties;

public class Retangulo {
	
	// d = d = a 2 + b 2
	
	public double largura;
	public double altura;
	
	public double area() {
		return altura * largura;
		
	}
	public double perimetro() {
		return (altura * 2) + (2 * largura);
		
	}
	public double diagonal() {
		return Math.sqrt(Math.pow(altura, 2)+ Math.pow( largura , 2));
		
	}
	public String toString() {
		return " AREA: " 
			   + String.format(" %.2f %n",area())
			   +" PERÍMETRO: "
			   + String.format(" %.2f  %n",perimetro())
			   +" Diagonal: "
			   +String.format(" %.2f %n", diagonal());
	}

}
