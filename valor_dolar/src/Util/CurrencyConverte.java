package Util;

public class CurrencyConverte {
		
	public static  double iof;
	
	public static double precoCompra(double quantDolar, double precoDolar){
		 		
		double valorFinal = quantDolar * precoDolar;	
		iof = (valorFinal/100)*6;
		return valorFinal + iof;
	
	}
	
	
}
